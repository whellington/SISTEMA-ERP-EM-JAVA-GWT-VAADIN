package dc.controller.geral.pessoal;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.Component;

import dc.control.enums.FormaPagamentoEn;
import dc.control.enums.LancamentoComissao;
import dc.control.enums.SimNaoEn;
import dc.control.enums.VendedorAtendente;
import dc.control.util.ClassUtils;
import dc.controller.contabilidade.planoconta.PlanoContaListController;
import dc.controller.financeiro.ContaCaixaListController;
import dc.controller.geral.diverso.SetorListController;
import dc.controller.geral.outro.SindicatoListController;
import dc.entidade.geral.diverso.UfEntity;
import dc.entidade.geral.pessoal.ColaboradorEntity;
import dc.servicos.dao.contabilidade.PlanoContaDAO;
import dc.servicos.dao.financeiro.ContaCaixaDAO;
import dc.servicos.dao.financeiro.SindicatoDAO;
import dc.servicos.dao.geral.NivelFormacaoDAO;
import dc.servicos.dao.geral.UfDAO;
import dc.servicos.dao.geral.diverso.SetorDAO;
import dc.servicos.dao.geral.pessoal.CargoDAO;
import dc.servicos.dao.geral.pessoal.ColaboradorDAO;
import dc.servicos.dao.geral.pessoal.PessoaDAO;
import dc.servicos.dao.geral.pessoal.SituacaoColaboradorDAO;
import dc.servicos.dao.geral.pessoal.TipoColaboradorDAO;
import dc.visao.framework.DCFieldGroup;
import dc.visao.framework.geral.CRUDFormController;
import dc.visao.geral.pessoal.ColaboradorFormView;

@Controller
@Scope("prototype")
public class ColaboradorFormController extends
		CRUDFormController<ColaboradorEntity> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * @Autowired private MainController mainController;
	 */

	private ColaboradorFormView subView;

	private ColaboradorEntity currentBean;

	@Autowired
	private ColaboradorDAO colaboradorDAO;

	@Autowired
	private PessoaDAO pessoaDAO;

	@Autowired
	private TipoColaboradorDAO tipoColaboradorDAO;

	@Autowired
	private SituacaoColaboradorDAO situacaoColaboradorDAO;

	@Autowired
	private SindicatoDAO sindicatoDAO;

	@Autowired
	private NivelFormacaoDAO nivelFormacaoDAO;

	@Autowired
	private CargoDAO cargoDAO;

	@Autowired
	private SetorDAO setorDAO;

	@Autowired
	private UfDAO ufDAO;

	@Autowired
	private PlanoContaDAO planoContaDAO;

	@Autowired
	private ContaCaixaDAO contaCaixaDAO;

	@Override
	protected boolean validaSalvar() {
		try {
			// Commit tenta transferir os dados do View para a entidade , levando em conta os critérios de validação.
			fieldGroup.commit();
		    return true;
		} catch (FieldGroup.CommitException ce) {
		    return false;
		}
	}

	@Override
	protected void criarNovoBean() {
		try {
			this.currentBean = new ColaboradorEntity();
			fieldGroup.setItemDataSource(this.currentBean);
		} catch (Exception e) {
			e.printStackTrace();

			mensagemErro(e.getMessage());
		}
	}

	@Override
	protected void initSubView() {
		try {
			this.subView = new ColaboradorFormView(this);
			
            this.fieldGroup = new DCFieldGroup<>(ColaboradorEntity.class);
			
			// Mapeia os campos
			
			fieldGroup.bind(this.subView.getPdfDataCadastro(),"dataCadastro");
			fieldGroup.bind(this.subView.getPdfDataTransferencia(),"dataTransferencia");
			fieldGroup.bind(this.subView.getTfMatricula(), "matricula");
			
			fieldGroup.bind(this.subView.getMocPessoa(), "pessoa");
			fieldGroup.bind(this.subView.getMocNivelFormacao(), "nivelFormacao");
			fieldGroup.bind(this.subView.getMocTipoColaborador(), "tipoColaborador");
			fieldGroup.bind(this.subView.getMocCargo(), "cargo");
			fieldGroup.bind(this.subView.getMocSituacaoColaborador(), "situacaoColaborador");
			fieldGroup.bind(this.subView.getMocSetor(), "setor");
			fieldGroup.bind(this.subView.getMocContaCaixa(), "contaCaixa");
			
			this.subView.getMocPessoa().configuraCombo(
					"nome", PessoaListController.class, this.pessoaDAO, this.getMainController());
			this.subView.getMocNivelFormacao().configuraCombo(
					"nome", NivelFormacaoListController.class, this.nivelFormacaoDAO, this.getMainController());
			this.subView.getMocTipoColaborador().configuraCombo(
					"nome", TipoColaboradorListController.class, this.tipoColaboradorDAO, this.getMainController());
			this.subView.getMocCargo().configuraCombo(
					"nome", CargoListController.class, this.cargoDAO, this.getMainController());
			this.subView.getMocSituacaoColaborador().configuraCombo(
					"nome", SituacaoColaboradorListController.class, this.situacaoColaboradorDAO, this.getMainController());
			this.subView.getMocSindicato().configuraCombo(
					"nome", SindicatoListController.class, this.sindicatoDAO, this.getMainController());
			this.subView.getMocSetor().configuraCombo(
					"nome", SetorListController.class, this.setorDAO, this.getMainController());
			this.subView.getMocPlanoConta().configuraCombo(
					"nome", PlanoContaListController.class, this.planoContaDAO, this.getMainController());
			this.subView.getMocContaCaixa().configuraCombo(
					"nome", ContaCaixaListController.class, this.contaCaixaDAO, this.getMainController());


			comboDescontoPlanoSaude();
			comboFormaPagamento();
			comboOptante();
			comboSaiRais();
			comboPriorizarPgto();
			comboComissaoOver();
			comboVendedorAtendente();
			comboLancamentoComissao();
			carregarUf();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void carregar(Serializable id) {
		try {
			this.currentBean = this.colaboradorDAO.find(id);
			
			fieldGroup.setItemDataSource(this.currentBean);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void actionSalvar() {
		try {
			this.colaboradorDAO.saveOrUpdate(this.currentBean);

			notifiyFrameworkSaveOK(this.currentBean);
		} catch (Exception e) {
			e.printStackTrace();

			mensagemErro(e.getMessage());
		}
	}

	@Override
	protected String getNome() {
		return "Colaborador";
	}

	@Override
	protected void remover(List<Serializable> ids) {
		try {
			this.colaboradorDAO.deleteAllByIds(ids);

			mensagemRemovidoOK();
		} catch (Exception e) {
			e.printStackTrace();

			mensagemErro(e.getMessage());
		}
	}

	@Override
	protected void removerEmCascata(List<Serializable> ids) {
		
		try {
		} catch (Exception e) {
			e.printStackTrace();

			mensagemErro(e.getMessage());
		}

	}

	@Override
	public String getViewIdentifier() {
		// TODO Auto-generated method stub
		return ClassUtils.getUrl(this);
	}

	@Override
	public boolean isFullSized() {
		return true;
	}

	@Override
	protected Component getSubView() {
		return subView;
	}

	/**
	 * COMBOS
	 */

	public void comboDescontoPlanoSaude() {
		for (SimNaoEn en : SimNaoEn.values()) {
			this.subView.getCbDescontoPlanoSaude().addItem(en);
		}
	}

	public void comboSaiRais() {
		for (SimNaoEn en : SimNaoEn.values()) {
			this.subView.getCbSaiRais().addItem(en);
		}
	}

	public void comboOptante() {
		for (SimNaoEn en : SimNaoEn.values()) {
			this.subView.getCbOptante().addItem(en);
		}
	}

	public void comboFormaPagamento() {
		for (FormaPagamentoEn en : FormaPagamentoEn.values()) {
			this.subView.getCbFormaPagamento().addItem(en);
		}
	}

	public void comboPriorizarPgto() {
		for (SimNaoEn en : SimNaoEn.values()) {
			this.subView.getCbPriorizarPgto().addItem(en);
		}
	}

	public void comboComissaoOver() {
		for (SimNaoEn en : SimNaoEn.values()) {
			this.subView.getCbComissaoOver().addItem(en);
		}
	}
	
	public void comboVendedorAtendente() {
		for(VendedorAtendente en : VendedorAtendente.values()) {
			this.subView.getCbPgtoComissao().addItem(en);
		}
	}
	
	public void comboLancamentoComissao() {
		for(LancamentoComissao en : LancamentoComissao.values()) {
			this.subView.getCbLctoComissao().addItem(en);
		}
	}

	@Override
	public ColaboradorEntity getModelBean() {
		// TODO Auto-generated method stub
		return currentBean;
	}
	
	public void carregarUf() {
		try {
			List<UfEntity> auxLista = this.ufDAO.listaTodos();

			BeanItemContainer<UfEntity> bic = new BeanItemContainer<UfEntity>(
					UfEntity.class, auxLista);

			this.subView.getMocUf().setContainerDataSource(bic);
			this.subView.getMocUf().setItemCaptionPropertyId("nome");
		} catch (Exception e) {
			e.printStackTrace();

			throw e;
		}
	}

}
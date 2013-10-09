package dc.controller.pessoal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.vaadin.ui.Component;

import dc.controller.contabilidade.ContabilContaListController;
import dc.controller.tributario.OperacaoFiscalListController;
import dc.entidade.contabilidade.ContabilConta;
import dc.entidade.geral.Pessoa;
import dc.entidade.pessoal.AtividadeForCli;
import dc.entidade.pessoal.Cliente;
import dc.entidade.pessoal.SituacaoForCli;
import dc.entidade.tributario.OperacaoFiscal;
import dc.entidade.type.pessoal.FormaDescontoType;
import dc.entidade.type.pessoal.GerarFinanceiroType;
import dc.entidade.type.pessoal.IndicadorPrecoType;
import dc.entidade.type.pessoal.TipoFreteType;
import dc.servicos.dao.contabilidade.ContabilContaDAO;
import dc.servicos.dao.pessoal.AtividadeForCliDAO;
import dc.servicos.dao.pessoal.ClienteDAO;
import dc.servicos.dao.pessoal.PessoaDAO;
import dc.servicos.dao.pessoal.SituacaoForCliDAO;
import dc.servicos.dao.tributario.OperacaoFiscalDAO;
import dc.servicos.util.Validator;
import dc.visao.framework.component.manytoonecombo.DefaultManyToOneComboModel;
import dc.visao.framework.geral.CRUDFormController;
import dc.visao.pessoal.ClienteFormView;

@Controller
@Scope("prototype")
public class ClienteFormController extends CRUDFormController<Cliente> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ClienteFormView subView;

	@Autowired
	private ClienteDAO clienteDAO;

	@Autowired
	private PessoaDAO pessoaDAO;

	@Autowired
	private SituacaoForCliDAO situacaoDAO;

	@Autowired
	private AtividadeForCliDAO atividadeDAO;

	@Autowired
	private ContabilContaDAO contaDAO;

	@Autowired
	private OperacaoFiscalDAO operacaoDAO;

	private Cliente currentBean;

	@Override
	protected boolean validaSalvar() {
		boolean valido = true;

		if (!Validator.validateObject(subView.getDtDesde().getValue())) {
			adicionarErroDeValidacao(subView.getDtDesde(),
					"Não pode ficar em branco");
			valido = false;
		}

		if (!Validator.validateString(subView.getTxtContaTomador().getValue())) {
			adicionarErroDeValidacao(subView.getTxtContaTomador(),
					"Não pode ficar em branco");
			valido = false;
		}

		if (!Validator.validateString(subView.getTxtTaxaDesconto().getValue())) {
			adicionarErroDeValidacao(subView.getTxtTaxaDesconto(),
					"Não pode ficar em branco");
			valido = false;
		}

		if (!Validator.validateString(subView.getTxtLimiteCredito().getValue())) {
			adicionarErroDeValidacao(subView.getTxtLimiteCredito(),
					"Não pode ficar em branco");
			valido = false;
		}

		Pessoa pessoa = (Pessoa) subView.getCmbPessoa().getValue();
		if (!Validator.validateObject(pessoa)) {
			adicionarErroDeValidacao(subView.getCmbPessoa(),
					"Não pode ficar em branco");
			valido = false;
		}

		SituacaoForCli situacao = (SituacaoForCli) subView.getCmbSituacao()
				.getValue();
		if (!Validator.validateObject(situacao)) {
			adicionarErroDeValidacao(subView.getCmbSituacao(),
					"Não pode ficar em branco");
			valido = false;
		}

		AtividadeForCli atividade = (AtividadeForCli) subView.getCmbAtividade()
				.getValue();
		if (!Validator.validateObject(atividade)) {
			adicionarErroDeValidacao(subView.getCmbAtividade(),
					"Não pode ficar em branco");
			valido = false;
		}

		ContabilConta contabil = (ContabilConta) subView.getCmbContaContabil()
				.getValue();
		if (!Validator.validateObject(contabil)) {
			adicionarErroDeValidacao(subView.getCmbContaContabil(),
					"Não pode ficar em branco");
			valido = false;
		}

		return valido;
	}

	@Override
	protected void criarNovoBean() {
		currentBean = new Cliente();
	}

	@Override
	protected void initSubView() {
		subView = new ClienteFormView();

		/* subView.getCmbGerarFinanceiro.setValue(GerarFinanceiroType); */

		/*
		 * this.subView.InitCbs(getClienteTipo());
		 * this.subView.InitCbs(getClienteIndicadorPrecoType());
		 * this.subView.InitCbs(getClienteTipoFreteType());
		 * this.subView.InitCbs(getClienteFormaDescontoType());
		 */

		/*this.subView.getCmbGerarFinanceiro().setData(getClienteGerarFinanceiroType());
		this.subView.getCmbIndicadorPreco().setData(getClienteIndicadorPrecoType());
		this.subView.getCmbTipoFrete().setData(getClienteTipoFreteType());
		this.subView.getCmbFormaDesconto().setData(	getClienteFormaDescontoType());*/

		this.subView.InitCbs(getClienteGerarFinanceiroType(), getClienteIndicadorPrecoType(),	getClienteTipoFreteType(), getClienteFormaDescontoType());
	}

	@Override
	protected void carregar(Serializable id) {
		currentBean = clienteDAO.find(id);
		subView.getDtDesde().setValue(currentBean.getDesde());
		subView.getTxtContaTomador().setValue(currentBean.getContaTomador());
		subView.getTxtObservacao().setValue(currentBean.getObservacao());

		DefaultManyToOneComboModel<Pessoa> model = new DefaultManyToOneComboModel<Pessoa>(
				PessoaListController.class, this.pessoaDAO,
				super.getMainController());

		subView.getCmbPessoa().setModel(model);
		subView.getCmbPessoa().setValue(currentBean.getPessoa());

		DefaultManyToOneComboModel<SituacaoForCli> modelsituacao = new DefaultManyToOneComboModel<SituacaoForCli>(
				SituacaoForCliListController.class, this.situacaoDAO,
				super.getMainController());

		subView.getCmbSituacao().setModel(modelsituacao);
		subView.getCmbSituacao().setValue(currentBean.getSituacao());

		DefaultManyToOneComboModel<AtividadeForCli> modelatividade = new DefaultManyToOneComboModel<AtividadeForCli>(
				AtividadeForCliListController.class, this.atividadeDAO,
				super.getMainController());

		subView.getCmbAtividade().setModel(modelatividade);
		subView.getCmbAtividade().setValue(currentBean.getAtividadeForCli());

		DefaultManyToOneComboModel<ContabilConta> modelconta = new DefaultManyToOneComboModel<ContabilConta>(
				ContabilContaListController.class, this.contaDAO,
				super.getMainController());

		subView.getCmbContaContabil().setModel(modelconta);
		subView.getCmbContaContabil().setValue(currentBean.getContabilConta());

		DefaultManyToOneComboModel<OperacaoFiscal> modeloperacao = new DefaultManyToOneComboModel<OperacaoFiscal>(
				OperacaoFiscalListController.class, this.operacaoDAO,
				super.getMainController());

		subView.getCmbOperacaoFiscal().setModel(modeloperacao);
		subView.getCmbOperacaoFiscal()
				.setValue(currentBean.getOperacaoFiscal());
	}

	@Override
	protected void actionSalvar() {
		currentBean.setContaTomador(subView.getTxtContaTomador().getValue());
		currentBean.setPessoa((Pessoa) subView.getCmbPessoa().getValue());
		currentBean.setSituacao((SituacaoForCli) subView.getCmbSituacao()
				.getValue());
		currentBean.setAtividadeForCli((AtividadeForCli) subView
				.getCmbAtividade().getValue());
		currentBean.setContabilConta((ContabilConta) subView
				.getCmbContaContabil().getValue());
		currentBean.setOperacaoFiscal((OperacaoFiscal) subView
				.getCmbOperacaoFiscal().getValue());
		currentBean.setObservacao(subView.getTxtObservacao().getValue());

		try {
			clienteDAO.saveOrUpdate(currentBean);

			notifiyFrameworkSaveOK(this.currentBean);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	protected void quandoNovo() {

	}

	@Override
	protected Component getSubView() {
		return subView;
	}

	@Override
	protected String getNome() {
		return "Cliente";
	}

	@Override
	protected void remover(List<Serializable> ids) {
		clienteDAO.deleteAllByIds(ids);

		mensagemRemovidoOK();
	}

	@Override
	protected void removerEmCascata(List<Serializable> ids) {

	}

	@Override
	public String getViewIdentifier() {
		return "clienteForm";
	}

	/**
	 * COMBO
	 */
	public List<String> getClienteGerarFinanceiroType() {
		try {
			List<String> siLista = new ArrayList<String>();

			for (GerarFinanceiroType en : GerarFinanceiroType.values()) {
				siLista.add(en.ordinal(), en.toString());

			}

			return siLista;
		} catch (Exception e) {
			e.printStackTrace();

			return null;
		}
	}

	public List<String> getClienteIndicadorPrecoType() {

		try {
			List<String> siLista = new ArrayList<String>();

			for (IndicadorPrecoType in : IndicadorPrecoType.values()) {
				siLista.add(in.ordinal(), in.toString());

			}
			return siLista;
		} catch (Exception e) {
			e.printStackTrace();

			return null;
		}

	}

	public List<String> getClienteTipoFreteType() {

		try {
			List<String> siLista = new ArrayList<String>();

			for (TipoFreteType tf : TipoFreteType.values()) {
				siLista.add(tf.ordinal(), tf.toString());
			}
			return siLista;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public List<String> getClienteFormaDescontoType() {

		try {
			List<String> siLista = new ArrayList<String>();

			for (FormaDescontoType fd : FormaDescontoType.values()) {
				siLista.add(fd.ordinal(), fd.toString());
			}
			return siLista;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
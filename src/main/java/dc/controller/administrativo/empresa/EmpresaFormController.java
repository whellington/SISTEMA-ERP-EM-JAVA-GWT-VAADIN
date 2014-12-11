package dc.controller.administrativo.empresa;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.Component;

import dc.control.enums.CrtEn;
import dc.control.enums.TipoEmpresaEn;
import dc.control.enums.TipoRegimeEn;
import dc.control.util.ClassUtils;
import dc.control.util.NumberUtils;
import dc.control.util.ObjectUtils;
import dc.control.validator.DotErpException;
import dc.control.validator.classe.EmpresaValidator;
import dc.controller.sistema.SeguimentoListController;
import dc.entidade.administrativo.empresa.EmpresaCnaeEntity;
import dc.entidade.administrativo.empresa.EmpresaEntity;
import dc.entidade.financeiro.SindicatoEntity;
import dc.entidade.framework.EmpresaSeguimento;
import dc.entidade.framework.Fpas;
import dc.entidade.framework.SeguimentoEntity;
import dc.entidade.geral.CnaeEntity;
import dc.entidade.geral.PessoaEnderecoEntity;
import dc.entidade.geral.pessoal.ContadorEntity;
import dc.servicos.dao.administrativo.empresa.EmpresaCnaeDAO;
import dc.servicos.dao.administrativo.empresa.EmpresaDAO;
import dc.servicos.dao.financeiro.SindicatoDAO;
import dc.servicos.dao.framework.geral.EmpresaSeguimentoDAO;
import dc.servicos.dao.framework.geral.FpasDAO;
import dc.servicos.dao.framework.geral.SeguimentoDAO;
import dc.servicos.dao.geral.CnaeDAO;
import dc.servicos.dao.geral.PessoaEnderecoDAO;
import dc.servicos.dao.geral.pessoal.ContadorDAO;
import dc.visao.administrativo.empresa.EmpresaFormView;
import dc.visao.framework.component.manytoonecombo.DefaultManyToOneComboModel;
import dc.visao.framework.geral.CRUDFormController;

@Controller
@Scope("prototype")
public class EmpresaFormController extends CRUDFormController<EmpresaEntity> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private EmpresaFormView subView;

	private EmpresaEntity currentBean;

	@Autowired
	private EmpresaDAO empresaDAO;

	/*
	 * @Autowired private MatrizDAO matrizDAO;
	 */

	@Autowired
	private ContadorDAO contadorDAO;

	@Autowired
	private SindicatoDAO sindicatoDAO;

	@Autowired
	private FpasDAO fpasDAO;

	@Autowired
	private EmpresaCnaeDAO empresaCnaeDAO;

	@Autowired
	private PessoaEnderecoDAO pessoaEnderecoDAO;

	@Autowired
	private CnaeDAO cnaeDAO;

	@Autowired
	private SeguimentoDAO seguimentoDAO;

	@Autowired
	private EmpresaSeguimentoDAO empresaSeguimentoDAO;

	private List<PessoaEnderecoEntity> pessoaEnderecoList;

	private List<EmpresaSeguimento> empresaSeguimentoList;

	public EmpresaFormController() {
		// TODO Auto-generated constructor stub
		this.pessoaEnderecoList = new ArrayList<PessoaEnderecoEntity>();
		this.empresaSeguimentoList = new ArrayList<EmpresaSeguimento>();
	}

	@Override
	protected String getNome() {
		return "Empresa";
	}

	@Override
	protected Component getSubView() {
		return subView;
	}

	@Override
	protected boolean validaSalvar() {
		try {
			EmpresaValidator.validaSalvar(this.subView);

			return true;
		} catch (DotErpException dee) {
			adicionarErroDeValidacao(dee.getComponent(), dee.getMessage());

			return false;
		}
	}

	@Override
	protected void actionSalvar() {
		try {
			ContadorEntity contador = (ContadorEntity) this.subView
					.getCbContador().getValue();

			if (ObjectUtils.isNotBlank(contador)) {
				this.currentBean.setContador(contador.getId());
			}

			SindicatoEntity sindicato = (SindicatoEntity) this.subView
					.getCbSindicato().getValue();

			if (ObjectUtils.isNotBlank(sindicato)) {
				this.currentBean.setSindicatoPatronal(sindicato.getId());
			}

			Fpas fpas = (Fpas) this.subView.getCbFpas().getValue();

			if (ObjectUtils.isNotBlank(fpas)) {
				this.currentBean.setFpas(fpas.getId());
			}

			CnaeEntity cnaePrincipal = (CnaeEntity) this.subView
					.getCbCnaePrincipal().getValue();

			if (ObjectUtils.isNotBlank(cnaePrincipal)) {
				this.currentBean.setCodigoCnaePrincipal(cnaePrincipal.getId()
						.toString());
			}

			EmpresaEntity empresaMatriz = (EmpresaEntity) this.subView
					.getCbMatriz().getValue();

			if (ObjectUtils.isNotBlank(empresaMatriz)) {
				this.currentBean.setMatriz(empresaMatriz.getId());
			}

			String razaoSocial = this.subView.getTfRazaoSocial().getValue();

			this.currentBean.setRazaoSocial(razaoSocial);

			String nomeFantasia = this.subView.getTfNomeFantasia().getValue();

			this.currentBean.setNomeFantasia(nomeFantasia);

			Date dataInicioAtividades = this.subView
					.getPdfDataInicioAtividades().getValue();

			this.currentBean.setDataInicioAtividades(dataInicioAtividades);

			String cnpj = this.subView.getMtfCnpj().getValue();

			this.currentBean.setCnpj(cnpj);

			String inscricaoEstadual = this.subView.getTfInscricaoEstadual()
					.getValue();

			this.currentBean.setInscricaoEstadual(inscricaoEstadual);

			String inscricaoEstadualSt = this.subView
					.getTfInscricaoEstadualSt().getValue();

			this.currentBean.setInscricaoEstadualSt(inscricaoEstadualSt);

			String inscricaoMunicipal = this.subView.getTfInscricaoMunicipal()
					.getValue();

			this.currentBean.setInscricaoMunicipal(inscricaoMunicipal);

			String inscricaoJuntaComercial = this.subView
					.getTfInscricaoJuntaComercial().getValue();

			this.currentBean
					.setInscricaoJuntaComercial(inscricaoJuntaComercial);

			Date dataInscricaoJuntaComercial = this.subView
					.getPdfDataInscricaoJuntaComercial().getValue();

			this.currentBean
					.setDataInscJuntaComercial(dataInscricaoJuntaComercial);

			String suframa = this.subView.getTfSuframa().getValue();

			this.currentBean.setSuframa(suframa);

			String contato = this.subView.getTfContato().getValue();

			this.currentBean.setContato(contato);

			String codigoTerceiros = this.subView.getTfCodigoTerceiros()
					.getValue();

			if (NumberUtils.isNumber(codigoTerceiros)) {
				this.currentBean.setCodigoTerceiros(NumberUtils
						.toInt(codigoTerceiros));
			}

			String cei = this.subView.getTfCei().getValue();

			this.currentBean.setCei(cei);

			String aliquotaPis = this.subView.getTfAliquotaPis().getValue();

			if (NumberUtils.isNumber(aliquotaPis)) {
				this.currentBean.setAliquotaPis(NumberUtils
						.createBigDecimal(aliquotaPis));
			}

			String aliquotaCofins = this.subView.getTfAliquotaCofins()
					.getValue();

			if (NumberUtils.isNumber(aliquotaCofins)) {
				this.currentBean.setAliquotaCofins(NumberUtils
						.createBigDecimal(aliquotaCofins));
			}

			String aliquotaSat = this.subView.getTfAliquotaSat().getValue();

			if (NumberUtils.isNumber(aliquotaSat)) {
				this.currentBean.setAliquotaSat(NumberUtils
						.createBigDecimal(aliquotaSat));
			}

			String codigoGps = this.subView.getTfCodigoGps().getValue();

			if (NumberUtils.isNumber(codigoGps)) {
				this.currentBean.setCodigoGps(NumberUtils.toInt(codigoGps));
			}

			String codigoIbgeCidade = this.subView.getTfMunicipio().getValue();

			if (NumberUtils.isNumber(codigoIbgeCidade)) {
				this.currentBean.setCodigoIbgeCidade(NumberUtils
						.toInt(codigoIbgeCidade));
			}

			String codigoIbgeUf = this.subView.getTfUf().getValue();

			if (NumberUtils.isNumber(codigoIbgeUf)) {
				this.currentBean.setCodigoIbgeUf(NumberUtils
						.toInt(codigoIbgeUf));
			}

			TipoEmpresaEn tipoEmpresaEn = (TipoEmpresaEn) this.subView
					.getCbTipoEmpresa().getValue();

			if (ObjectUtils.isNotBlank(tipoEmpresaEn)) {
				this.currentBean.setTipoEmpresa(tipoEmpresaEn);
			}

			CrtEn crtEn = (CrtEn) this.subView.getCbCrt().getValue();

			if (ObjectUtils.isNotBlank(crtEn)) {
				this.currentBean.setCrt(crtEn);
			}

			TipoRegimeEn tipoRegimeEn = (TipoRegimeEn) this.subView
					.getCbTipoRegime().getValue();

			if (ObjectUtils.isNotBlank(tipoRegimeEn)) {
				this.currentBean.setTipoRegime(tipoRegimeEn);
			}

			// ********** ENDERECO **********

			this.pessoaEnderecoList = this.subView.getSfPessoaEndereco()
					.getDados();

			this.currentBean.setPessoaEnderecoList(this.pessoaEnderecoList);

			// List<EmpresaSeguimento> empresaSeguimentoList = this.subView
			// .getSeguimentos();

			// for (EmpresaSeguimento ent : empresaSeguimentoList) {
			// ent.setEmpresa(this.currentBean);
			// }

			// ********** SEGUIMENTO **********

			this.currentBean
					.setEmpresaSeguimentoList(this.empresaSeguimentoList);

			// this.empresaDAO.saveOrUpdate(this.currentBean);

			// for (PessoaEnderecoEntity ent :
			// this.currentBean.getEnderecoList()) {
			// ent.setEmpresa(this.currentBean);

			// String cep = ent.getCep().replace(".", "").replace("-", "")
			// .trim();
			// String cep = StringUtils.removeSpecialCharacters(ent.getCep());
			// ent.setCep(cep);

			// this.enderecoDAO.saveOrUpdate(ent);
			// }

			this.currentBean.setEmpresa(this.currentBean.getId());

			this.empresaDAO.saveOrUpdateEmpresa(this.currentBean);

			notifiyFrameworkSaveOK(this.currentBean);
		} catch (Exception e) {
			e.printStackTrace();

			mensagemErro(e.getMessage());
		}
	}

	@Override
	protected void carregar(Serializable id) {
		try {
			this.currentBean = this.empresaDAO.find(id);

			this.subView.getTfRazaoSocial().setValue(
					this.currentBean.getRazaoSocial());
			this.subView.getTfNomeFantasia().setValue(
					this.currentBean.getNomeFantasia());
			this.subView.getMtfCnpj().setValue(this.currentBean.getCnpj());
			this.subView.getPdfDataInicioAtividades().setValue(
					this.currentBean.getDataInicioAtividades());
			this.subView.getTfInscricaoEstadual().setValue(
					this.currentBean.getInscricaoEstadual());
			this.subView.getTfInscricaoEstadualSt().setValue(
					this.currentBean.getInscricaoEstadualSt());
			this.subView.getTfInscricaoMunicipal().setValue(
					this.currentBean.getInscricaoEstadualSt());
			this.subView.getTfInscricaoJuntaComercial().setValue(
					this.currentBean.getInscricaoJuntaComercial());
			this.subView.getPdfDataInscricaoJuntaComercial().setValue(
					this.currentBean.getDataInscJuntaComercial());
			this.subView.getTfSuframa().setValue(this.currentBean.getSuframa());
			this.subView.getTfContato().setValue(this.currentBean.getContato());

			Integer codigoTerceiros = this.currentBean.getCodigoTerceiros();

			if (NumberUtils.isNotBlank(codigoTerceiros)) {
				this.subView.getTfCodigoTerceiros().setValue(
						codigoTerceiros.toString());
			}

			this.subView.getTfCei().setValue(this.currentBean.getCei());

			BigDecimal aliquotaPis = this.currentBean.getAliquotaPis();

			if (NumberUtils.isNotBlank(aliquotaPis)) {
				this.subView.getTfAliquotaPis()
						.setValue(aliquotaPis.toString());
			}

			BigDecimal aliquotaCofins = this.currentBean.getAliquotaCofins();

			if (NumberUtils.isNotBlank(aliquotaCofins)) {
				this.subView.getTfAliquotaCofins().setValue(
						aliquotaCofins.toString());
			}

			BigDecimal aliquotaSat = this.currentBean.getAliquotaSat();

			if (NumberUtils.isNotBlank(aliquotaSat)) {
				this.subView.getTfAliquotaSat()
						.setValue(aliquotaSat.toString());
			}

			Integer codigoGps = this.currentBean.getCodigoGps();

			if (NumberUtils.isNotBlank(codigoGps)) {
				this.subView.getTfCodigoGps().setValue(codigoGps.toString());
			}

			Integer codigoIbgeCidade = this.currentBean.getCodigoIbgeCidade();

			if (NumberUtils.isNotBlank(codigoIbgeCidade)) {
				this.subView.getTfMunicipio().setValue(
						codigoIbgeCidade.toString());
			}

			Integer codigoIbgeUf = this.currentBean.getCodigoIbgeUf();

			if (NumberUtils.isNotBlank(codigoIbgeUf)) {
				this.subView.getTfUf().setValue(codigoIbgeUf.toString());
			}

			Integer codigoSindicato = this.currentBean.getSindicatoPatronal();

			if (NumberUtils.isNotBlank(codigoSindicato)) {
				SindicatoEntity sindicato = this.sindicatoDAO
						.find(codigoSindicato);

				this.subView.getCbSindicato().setValue(sindicato);
			}

			Integer codigoContador = this.currentBean.getContador();

			if (NumberUtils.isNotBlank(codigoContador)) {
				ContadorEntity contador = this.contadorDAO.find(codigoContador);

				this.subView.getCbContador().setValue(contador);
			}

			Integer codigoFpas = this.currentBean.getFpas();

			if (NumberUtils.isNotBlank(codigoFpas)) {
				Fpas fpas = this.fpasDAO.find(codigoFpas);

				this.subView.getCbFpas().setValue(fpas);
			}

			String codigoCnaePrincipal = this.currentBean
					.getCodigoCnaePrincipal();

			if (NumberUtils.isNumber(codigoCnaePrincipal)) {
				CnaeEntity cnae = this.cnaeDAO.find(NumberUtils
						.toInt(codigoCnaePrincipal));

				this.subView.getCbCnaePrincipal().setValue(cnae);
			}

			Integer codigoEmpresaMatriz = this.currentBean.getMatriz();

			if (NumberUtils.isNotBlank(codigoEmpresaMatriz)) {
				EmpresaEntity empresaMatriz = this.empresaDAO
						.find(codigoEmpresaMatriz);

				this.subView.getCbMatriz().setValue(empresaMatriz);
			}

			TipoEmpresaEn tipoEmpresaEn = (TipoEmpresaEn) this.currentBean
					.getTipoEmpresa();

			if (ObjectUtils.isNotBlank(tipoEmpresaEn)) {
				this.subView.getCbTipoEmpresa().setValue(tipoEmpresaEn);
			}

			CrtEn crtEn = (CrtEn) this.currentBean.getCrt();

			if (ObjectUtils.isNotBlank(crtEn)) {
				this.subView.getCbCrt().setValue(crtEn);
			}

			TipoRegimeEn tipoRegimeEn = (TipoRegimeEn) this.currentBean
					.getTipoRegime();

			if (ObjectUtils.isNotBlank(tipoRegimeEn)) {
				this.subView.getCbTipoRegime().setValue(tipoRegimeEn);
			}

			List<PessoaEnderecoEntity> pessoaEnderecoList = this.pessoaEnderecoDAO
					.getPessoaEnderecoList(this.currentBean);

			this.currentBean.setPessoaEnderecoList(pessoaEnderecoList);

			this.subView.fillEnderecoSubForm(this.currentBean
					.getPessoaEnderecoList());

			List<EmpresaSeguimento> empresaSeguimentoList = this.empresaSeguimentoDAO
					.getEmpresaSeguimentoList(this.currentBean);

			this.currentBean.setEmpresaSeguimentoList(empresaSeguimentoList);

			// this.subView.getTableEmpresaSeguimento().setContainerDataSource(newDataSource);

			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void initSubView() {
		try {
			this.subView = new EmpresaFormView(this);

			DefaultManyToOneComboModel<SeguimentoEntity> modelSeguimento = new DefaultManyToOneComboModel<SeguimentoEntity>(
					SeguimentoListController.class, this.seguimentoDAO,
					super.getMainController());

			this.subView.getMocSeguimento().setModel(modelSeguimento);

			carregarContador();
			carregarEmpresaMatriz();
			carregarSindicato();
			carregarEmpresaCnae();
			carregarFpas();
			carregarCrt();
			carregarTipoRegime();
			carregarTipoEmpresa();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void criarNovoBean() {
		try {
			this.currentBean = new EmpresaEntity();
		} catch (Exception e) {
			e.printStackTrace();

			mensagemErro(e.getMessage());
		}
	}

	@Override
	@Transactional
	protected void quandoNovo() {
		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void remover(List<Serializable> ids) {
		try {
			this.empresaDAO.deleteEmpresaList(ids);

			mensagemRemovidoOK();
		} catch (Exception e) {
			e.printStackTrace();

			mensagemErro(e.getMessage());
		}
	}

	@Override
	protected void removerEmCascata(List<Serializable> ids) {

	}

	@Override
	public String getViewIdentifier() {
		// TODO Auto-generated method stub
		return ClassUtils.getUrl(this);
	}

	@Override
	protected boolean isFullSized() {
		return true;
	}

	@Override
	public EmpresaEntity getModelBean() {
		return currentBean;
	}

	public PessoaEnderecoEntity aderirPessoaEndereco() {
		try {
			PessoaEnderecoEntity pessoaEndereco = new PessoaEnderecoEntity();

			this.pessoaEnderecoList.add(pessoaEndereco);

			return pessoaEndereco;
		} catch (Exception e) {
			e.printStackTrace();

			throw e;
		}
	}

	public void removerPessoaEndereco(List<PessoaEnderecoEntity> values) {
		try {
			for (PessoaEnderecoEntity ent : values) {
				// this.currentBean.getPessoaEnderecoList().remove(ent);
				this.pessoaEnderecoList.remove(ent);
			}

			mensagemRemovidoOK();
		} catch (Exception e) {
			e.printStackTrace();

			mensagemErro(e.getMessage());
		}
	}

	public EmpresaSeguimento aderirEmpresaSeguimento() {
		try {
			SeguimentoEntity seguimento = (SeguimentoEntity) this.subView
					.getMocSeguimento().getValue();

			EmpresaSeguimento empresaSeguimento = new EmpresaSeguimento();
			empresaSeguimento.setSeguimento(seguimento);

			this.empresaSeguimentoList.add(empresaSeguimento);

			return empresaSeguimento;
		} catch (Exception e) {
			e.printStackTrace();

			return null;
		}
	}

	public void removerEmpresaSeguimento() {

	}

	/**
	 * COMBOS
	 */

	public void carregarContador() {
		List<ContadorEntity> auxLista = this.contadorDAO.listaTodos();

		BeanItemContainer<ContadorEntity> bic = new BeanItemContainer<ContadorEntity>(
				ContadorEntity.class, auxLista);
		this.subView.getCbContador().setContainerDataSource(bic);
		this.subView.getCbContador().setItemCaptionPropertyId("nome");
	}

	public void carregarEmpresaMatriz() {
		List<EmpresaEntity> auxLista = this.empresaDAO.getEmpresaMatrizList();

		BeanItemContainer<EmpresaEntity> bic = new BeanItemContainer<EmpresaEntity>(
				EmpresaEntity.class, auxLista);
		this.subView.getCbMatriz().setContainerDataSource(bic);
		this.subView.getCbMatriz().setItemCaptionPropertyId("nome");
	}

	public void carregarSindicato() {
		List<SindicatoEntity> auxLista = this.sindicatoDAO.getSindicatoList();

		BeanItemContainer<SindicatoEntity> bic = new BeanItemContainer<SindicatoEntity>(
				SindicatoEntity.class, auxLista);
		this.subView.getCbSindicato().setContainerDataSource(bic);
		this.subView.getCbSindicato().setItemCaptionPropertyId("nome");
	}

	public void carregarEmpresaCnae() {
		List<EmpresaCnaeEntity> auxLista = this.empresaCnaeDAO
				.getCnaePrincipalList();

		BeanItemContainer<EmpresaCnaeEntity> bic = new BeanItemContainer<EmpresaCnaeEntity>(
				EmpresaCnaeEntity.class, auxLista);
		this.subView.getCbCnaePrincipal().setContainerDataSource(bic);
		this.subView.getCbCnaePrincipal().setItemCaptionPropertyId("nome");
	}

	public void carregarFpas() {
		List<Fpas> auxLista = this.fpasDAO.getFpasList();

		BeanItemContainer<Fpas> bic = new BeanItemContainer<Fpas>(Fpas.class,
				auxLista);
		this.subView.getCbFpas().setContainerDataSource(bic);
		this.subView.getCbFpas().setItemCaptionPropertyId("nome");
	}

	public void carregarCrt() {
		for (CrtEn en : CrtEn.values()) {
			this.subView.getCbCrt().addItem(en);
		}
	}

	public void carregarTipoRegime() {
		for (TipoRegimeEn en : TipoRegimeEn.values()) {
			this.subView.getCbTipoRegime().addItem(en);
		}
	}

	public void carregarTipoEmpresa() {
		for (TipoEmpresaEn en : TipoEmpresaEn.values()) {
			this.subView.getCbTipoEmpresa().addItem(en);
		}
	}

}
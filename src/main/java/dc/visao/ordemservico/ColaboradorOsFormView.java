package dc.visao.ordemservico;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.OptionGroup;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import dc.entidade.contabilidade.PlanoConta;
import dc.entidade.financeiro.ContaCaixa;
import dc.entidade.ordemservico.TipoColaboradorOsEntity;
import dc.visao.framework.component.manytoonecombo.ManyToOneCombo;
import dc.visao.framework.util.ComponentUtil;

public class ColaboradorOsFormView extends CustomComponent {

	private static final long serialVersionUID = 1L;

	@AutoGenerated
	private GridLayout fields;

	@AutoGenerated
	private VerticalLayout mainLayout;
	
	@AutoGenerated
	private TextField tfNome, tfFilial, tfApelido, tfCpfCnpj, tfRgInscEstadual,tfTelefone, tfCelular, tfCep,
	                  tfEndereco, tfCidade, tfBairro, tfUf, tfEmail, tfNrConta, tfSalarioFixo, tfComissaoServico,
	                  tfComissaoProduto;

	@AutoGenerated
	private PopupDateField pdfDataAdmissao,pdfDataDemissao,pdfDataNascimento;

	@AutoGenerated
	private ManyToOneCombo<TipoColaboradorOsEntity> cbTipoColaborador;
	
	@AutoGenerated
	private ManyToOneCombo<PlanoConta> cbPlanoConta;

	@AutoGenerated
	private ManyToOneCombo<ContaCaixa> cbContaCaixa;

	@AutoGenerated
	private ComboBox cbTipoSangue,cbPriorizarPgto,cbComissaoOver,cbPgtoComissao,cbLctoComissao;
	
	@AutoGenerated
	private OptionGroup optTipoComissaoServico,optTipoComissaoProduto;
	
	public ColaboradorOsFormView() {
		buildMainLayout();
		setCompositionRoot(mainLayout);
	}

	@AutoGenerated
	private VerticalLayout buildMainLayout() {
		setSizeFull();
		mainLayout = new VerticalLayout();
		mainLayout.setImmediate(false);
		mainLayout.setSizeFull();
		mainLayout.setMargin(false);
		mainLayout.setSpacing(true);
		setWidth("100.0%");
		
		fields = buildFields();
		mainLayout.addComponent(fields);
		
		for (TipoSangue value : TipoSangue.values()) {
			cbTipoSangue.addItem(value);
		}
		
		return mainLayout;
	}

	private GridLayout buildFields() {
		GridLayout gridLayout_1 = new GridLayout();
		gridLayout_1.setImmediate(false);
		gridLayout_1.setWidth("100.0%");
		gridLayout_1.setMargin(true);
		gridLayout_1.setSpacing(true);
		gridLayout_1.setRows(10);
		gridLayout_1.setColumns(5);

		//Filial
		tfFilial= ComponentUtil.buildTextField("Filial");
		gridLayout_1.addComponent(tfFilial, 0, 1,0,1);

		// Data de admissão
		pdfDataAdmissao = ComponentUtil.buildPopupDateField("Data de admissão");
		gridLayout_1.addComponent(pdfDataAdmissao, 1, 1,1,1);

		// Data de demissão
		pdfDataDemissao = ComponentUtil.buildPopupDateField("Data de demissão");
		gridLayout_1.addComponent(pdfDataDemissao, 2, 1,2,1);

		cbTipoColaborador = new ManyToOneCombo<TipoColaboradorOsEntity>();
		cbTipoColaborador.setCaption("Tipo colaborador");
		gridLayout_1.addComponent(cbTipoColaborador,3,1,4,1);

		tfNome = ComponentUtil.buildTextField("Nome");
		gridLayout_1.addComponent(tfNome, 0, 2,1,2);

		tfApelido = ComponentUtil.buildTextField("Apelido");
		gridLayout_1.addComponent(tfApelido, 2, 2,3,2);

		//tipo sanguíneo
		cbTipoSangue = ComponentUtil.buildComboBox("Tipo Sanguineo");
		gridLayout_1.addComponent(cbTipoSangue,4,2,4,2);

		// Data de demissão
		pdfDataNascimento = ComponentUtil.buildPopupDateField("Data de nascimento");
		gridLayout_1.addComponent(pdfDataNascimento, 0, 3,0,3);
		
		tfCpfCnpj = ComponentUtil.buildTextField("Cpf/Cnpj");
		gridLayout_1.addComponent(tfCpfCnpj,1,3,1,3);

		tfRgInscEstadual = ComponentUtil.buildTextField("Rg/Insc estadual");
		gridLayout_1.addComponent(tfRgInscEstadual,2,3,2,3);

		tfTelefone = ComponentUtil.buildPhoneField("Telefone");
		gridLayout_1.addComponent(tfTelefone,3,3,3,3);

		tfCelular = ComponentUtil.buildPhoneField("Celular");
		gridLayout_1.addComponent(tfCelular,4,3,4,3);

		tfCep = ComponentUtil.buildTextField("Cep");
		gridLayout_1.addComponent(tfCep,0,4,0,4);

		tfEndereco = ComponentUtil.buildTextField("Endereço");
		gridLayout_1.addComponent(tfEndereco,1,4,1,4);

		tfBairro = ComponentUtil.buildTextField("Bairro");
		gridLayout_1.addComponent(tfBairro,2,4,2,4);

		tfCidade = ComponentUtil.buildTextField("Cidade");
		gridLayout_1.addComponent(tfCidade,3,4,3,4);

		tfUf = ComponentUtil.buildTextField("Uf");
		gridLayout_1.addComponent(tfUf,4,4,4,4);

		tfEmail = ComponentUtil.buildTextField("Email");
		gridLayout_1.addComponent(tfEmail,0,5,0,5);

		tfSalarioFixo = ComponentUtil.buildCurrencyField("Salário fixo");
		gridLayout_1.addComponent(tfSalarioFixo,1,5,1,5);

		cbPriorizarPgto = ComponentUtil.buildComboBox("Priorizar comissão cadastro");
		gridLayout_1.addComponent(cbPriorizarPgto,2,5,3,5);
		for (SimNao value : SimNao.values()) {
			cbPriorizarPgto.addItem(value.valor);
			cbPriorizarPgto.setItemCaption(value.valor, value.label);
		}

		cbComissaoOver = ComponentUtil.buildComboBox("Pagamento comissão over");
		gridLayout_1.addComponent(cbComissaoOver,4,5,4,5);
		for (SimNao value : SimNao.values()) {
			cbComissaoOver.addItem(value.valor);
			cbComissaoOver.setItemCaption(value.valor, value.label);
		}

		optTipoComissaoServico = new OptionGroup();
		optTipoComissaoServico.setStyleName("horizontal");
		optTipoComissaoServico.setCaption("Tipo comissão serviço");
		optTipoComissaoServico.setImmediate(false);
		optTipoComissaoServico.addItem("R");
		optTipoComissaoServico.setItemCaption("R", "Comissão/Serviço R$");
		optTipoComissaoServico.addItem("P");
		optTipoComissaoServico.setItemCaption("P", "Comissão/Serviço %");
		gridLayout_1.addComponent(optTipoComissaoServico,0,6,1,6);
		
		tfComissaoServico = ComponentUtil.buildCurrencyField("Valor comissão serviço");
		gridLayout_1.addComponent(tfComissaoServico,2,6,2,6);

		optTipoComissaoProduto = new OptionGroup();
		optTipoComissaoProduto.setStyleName("horizontal");
		optTipoComissaoProduto.setCaption("Tipo comissão produto");
		optTipoComissaoProduto.setImmediate(false);
		optTipoComissaoProduto.addItem("R");
		optTipoComissaoProduto.setItemCaption("R", "Comissão/Produto R$");
		optTipoComissaoProduto.addItem("P");
		optTipoComissaoProduto.setItemCaption("P", "Comissão/Produto %");
		gridLayout_1.addComponent(optTipoComissaoProduto,0,7,1,7);

		tfComissaoProduto = ComponentUtil.buildCurrencyField("Valor comissão produto");
		gridLayout_1.addComponent(tfComissaoProduto,2,7,2,7);

		cbPgtoComissao = ComponentUtil.buildComboBox("Vendedor\\Atendente pgto comissão será");
		gridLayout_1.addComponent(cbPgtoComissao,0,8,0,8);

		cbLctoComissao = ComponentUtil.buildComboBox("Lançamento de comissão");
		gridLayout_1.addComponent(cbLctoComissao,1,8,1,8);

		cbContaCaixa = new ManyToOneCombo<ContaCaixa>();
		cbContaCaixa.setCaption("Nr. conta");
		gridLayout_1.addComponent(cbContaCaixa,0,9,1,9);

		cbPlanoConta = new ManyToOneCombo<PlanoConta>();
		cbPlanoConta.setCaption("Plano conta");
		gridLayout_1.addComponent(cbPlanoConta,2,9,3,9);

		return gridLayout_1;
	}
	
	public GridLayout getFields() {
		return fields;
	}

	public void setFields(GridLayout fields) {
		this.fields = fields;
	}

	public VerticalLayout getMainLayout() {
		return mainLayout;
	}

	public void setMainLayout(VerticalLayout mainLayout) {
		this.mainLayout = mainLayout;
	}

	public TextField getTfNome() {
		return tfNome;
	}

	public void setTfNome(TextField tfNome) {
		this.tfNome = tfNome;
	}

	public TextField getTfFilial() {
		return tfFilial;
	}

	public void setTfFilial(TextField tfFilial) {
		this.tfFilial = tfFilial;
	}

	public TextField getTfApelido() {
		return tfApelido;
	}

	public void setTfApelido(TextField tfApelido) {
		this.tfApelido = tfApelido;
	}

	public TextField getTfCpfCnpj() {
		return tfCpfCnpj;
	}

	public void setTfCpfCnpj(TextField tfCpfCnpj) {
		this.tfCpfCnpj = tfCpfCnpj;
	}

	public TextField getTfRgInscEstadual() {
		return tfRgInscEstadual;
	}

	public void setTfRgInscEstadual(TextField tfRgInscEstadual) {
		this.tfRgInscEstadual = tfRgInscEstadual;
	}

	public TextField getTfTelefone() {
		return tfTelefone;
	}

	public void setTfTelefone(TextField tfTelefone) {
		this.tfTelefone = tfTelefone;
	}

	public TextField getTfCelular() {
		return tfCelular;
	}

	public void setTfCelular(TextField tfCelular) {
		this.tfCelular = tfCelular;
	}

	public TextField getTfCep() {
		return tfCep;
	}

	public void setTfCep(TextField tfCep) {
		this.tfCep = tfCep;
	}

	public TextField getTfEndereco() {
		return tfEndereco;
	}

	public void setTfEndereco(TextField tfEndereco) {
		this.tfEndereco = tfEndereco;
	}

	public TextField getTfCidade() {
		return tfCidade;
	}

	public void setTfCidade(TextField tfCidade) {
		this.tfCidade = tfCidade;
	}

	public TextField getTfBairro() {
		return tfBairro;
	}

	public void setTfBairro(TextField tfBairro) {
		this.tfBairro = tfBairro;
	}

	public TextField getTfUf() {
		return tfUf;
	}

	public void setTfUf(TextField tfUf) {
		this.tfUf = tfUf;
	}

	public TextField getTfEmail() {
		return tfEmail;
	}

	public void setTfEmail(TextField tfEmail) {
		this.tfEmail = tfEmail;
	}

	public TextField getTfNrConta() {
		return tfNrConta;
	}

	public void setTfNrConta(TextField tfNrConta) {
		this.tfNrConta = tfNrConta;
	}

	public TextField getTfSalarioFixo() {
		return tfSalarioFixo;
	}

	public void setTfSalarioFixo(TextField tfSalarioFixo) {
		this.tfSalarioFixo = tfSalarioFixo;
	}

	public TextField getTfComissaoServico() {
		return tfComissaoServico;
	}

	public void setTfComissaoServico(TextField tfComissaoServico) {
		this.tfComissaoServico = tfComissaoServico;
	}

	public TextField getTfComissaoProduto() {
		return tfComissaoProduto;
	}

	public void setTfComissaoProduto(TextField tfComissaoProduto) {
		this.tfComissaoProduto = tfComissaoProduto;
	}

	public PopupDateField getPdfDataAdmissao() {
		return pdfDataAdmissao;
	}

	public void setPdfDataAdmissao(PopupDateField pdfDataAdmissao) {
		this.pdfDataAdmissao = pdfDataAdmissao;
	}

	public PopupDateField getPdfDataDemissao() {
		return pdfDataDemissao;
	}

	public void setPdfDataDemissao(PopupDateField pdfDataDemissao) {
		this.pdfDataDemissao = pdfDataDemissao;
	}

	public PopupDateField getPdfDataNascimento() {
		return pdfDataNascimento;
	}

	public void setPdfDataNascimento(PopupDateField pdfDataNascimento) {
		this.pdfDataNascimento = pdfDataNascimento;
	}

	public ManyToOneCombo<TipoColaboradorOsEntity> getCbTipoColaborador() {
		return cbTipoColaborador;
	}

	public void setCbTipoColaborador(
			ManyToOneCombo<TipoColaboradorOsEntity> cbTipoColaborador) {
		this.cbTipoColaborador = cbTipoColaborador;
	}

	public ComboBox getCbTipoSangue() {
		return cbTipoSangue;
	}

	public void setCbTipoSangue(ComboBox cbTipoSangue) {
		this.cbTipoSangue = cbTipoSangue;
	}

	public OptionGroup getOptTipoComissaoServico() {
		return optTipoComissaoServico;
	}

	public void setOptTipoComissaoServico(OptionGroup optTipoComissaoServico) {
		this.optTipoComissaoServico = optTipoComissaoServico;
	}

	public OptionGroup getOptTipoComissaoProduto() {
		return optTipoComissaoProduto;
	}

	public void setOptTipoComissaoProduto(OptionGroup optTipoComissaoProduto) {
		this.optTipoComissaoProduto = optTipoComissaoProduto;
	}

	public ComboBox getCbPriorizarPgto() {
		return cbPriorizarPgto;
	}

	public void setCbPriorizarPgto(ComboBox cbPriorizarPgto) {
		this.cbPriorizarPgto = cbPriorizarPgto;
	}

	public ComboBox getCbComissaoOver() {
		return cbComissaoOver;
	}

	public void setCbComissaoOver(ComboBox cbComissaoOver) {
		this.cbComissaoOver = cbComissaoOver;
	}

	public ManyToOneCombo<PlanoConta> getCbPlanoConta() {
		return cbPlanoConta;
	}

	public void setCbPlanoConta(ManyToOneCombo<PlanoConta> cbPlanoConta) {
		this.cbPlanoConta = cbPlanoConta;
	}

	public ManyToOneCombo<ContaCaixa> getCbContaCaixa() {
		return cbContaCaixa;
	}

	public void setCbContaCaixa(ManyToOneCombo<ContaCaixa> cbContaCaixa) {
		this.cbContaCaixa = cbContaCaixa;
	}

	public ComboBox getCbPgtoComissao() {
		return cbPgtoComissao;
	}

	public void setCbPgtoComissao(ComboBox cbPgtoComissao) {
		this.cbPgtoComissao = cbPgtoComissao;
	}

	public ComboBox getCbLctoComissao() {
		return cbLctoComissao;
	}

	public void setCbLctoComissao(ComboBox cbLctoComissao) {
		this.cbLctoComissao = cbLctoComissao;
	}

	public enum TipoSangue {

		A_POSITIVO("A+", "A+"), A_NEGATIVO("A-", "A-"), B_POSITIVO("B+", "B+"), B_NEGATIVO("B-", "B-"), O_POSITIVO("O+", "O+"), O_NEGATIVO("O-", "O-"), AB_POSITIVO(
				"AB+", "AB+"), AB_NEGATIVO("AB-", "AB-");

		private TipoSangue(String label, String codigo) {
			this.label = label;
			this.codigo = codigo;
		}

		private String label;
		private String codigo;

		public static TipoSangue getTipoSangue(String codigo) {
			if (codigo == null)
				return null;

			codigo = codigo.trim();

			for (TipoSangue e : TipoSangue.values()) {
				if (e.getCodigo().equalsIgnoreCase(codigo)) {
					return e;
				}
			}

			return null;
		}

		public String getCodigo() {
			return codigo;
		}

		public String getLabel() {
			return label;
		}

		@Override
		public String toString() {
			return label;
		}
	}
	
	public enum SimNao {

		SIM("Sim", true), NAO("Não", false);

		private SimNao(String label, Boolean valor) {
			this.label = label;
			this.valor = valor;
		}

		private String label;
		private Boolean valor;

		public static SimNao getSimNao(Boolean valor) {
			for (SimNao e : SimNao.values()) {
				if (e.getValor().equals(valor)) {
					return e;
				}
			}

			return null;
		}

		public Boolean getValor() {
			return valor;
		}

		public String getLabel() {
			return label;
		}

		
		@Override
		public String toString() {
			return label;
		}
	}
}


package dc.visao.pessoal;

import java.math.BigDecimal;
import java.util.List;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextField;

import dc.controller.pessoal.ClienteFormController;
import dc.entidade.contabilidade.ContabilConta;
import dc.entidade.geral.PessoaEntity;
import dc.entidade.pessoal.AtividadeForCli;
import dc.entidade.pessoal.ClienteEntity;
import dc.entidade.pessoal.SituacaoForCli;
import dc.entidade.tributario.OperacaoFiscal;
import dc.visao.framework.component.manytoonecombo.ManyToOneCombo;

public class ClienteFormView extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@AutoGenerated
	private GridLayout mainLayout;
	@AutoGenerated
	private HorizontalLayout horizontalLayout_6;
	@AutoGenerated
	private TextField txtObservacao;
	@AutoGenerated
	private HorizontalLayout horizontalLayout_5;
	@AutoGenerated
	private TextField txtLimiteCredito;
	@AutoGenerated
	private TextField txtTaxaDesconto;
	@AutoGenerated
	private ComboBox cmbFormaDesconto;
	@AutoGenerated
	private HorizontalLayout horizontalLayout_4;
	@AutoGenerated
	private ComboBox cmbTipoFrete;
	@AutoGenerated
	private ComboBox cmbIndicadorPreco;
	@AutoGenerated
	private ComboBox cmbGerarFinanceiro;
	@AutoGenerated
	private TextField txtContaTomador;
	@AutoGenerated
	private PopupDateField dtDesde;
	@AutoGenerated
	private HorizontalLayout horizontalLayout_3;
	@AutoGenerated
	private HorizontalLayout horizontalLayout_2;
	@AutoGenerated
	private HorizontalLayout horizontalLayout_1;

	private ManyToOneCombo<PessoaEntity> cmbPessoa;
	private ManyToOneCombo<SituacaoForCli> cmbSituacao;
	private ManyToOneCombo<AtividadeForCli> cmbAtividade;
	private ManyToOneCombo<ContabilConta> cmbContaContabil;
	private ManyToOneCombo<OperacaoFiscal> cmbOperacaoFiscal;

	/**
	 * The constructor should first build the main layout, set the composition
	 * root and then do any custom initialization.
	 * 
	 * The constructor will not be automatically regenerated by the visual
	 * editor.
	 */

	private ClienteFormController controller;

	public ClienteFormView(ClienteFormController clienteFormController) {
		buildMainLayout();
		setCompositionRoot(mainLayout);
		this.controller = clienteFormController;

		// TODO add user code here
	}

	@AutoGenerated
	private GridLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new GridLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("-1px");
		mainLayout.setHeight("-1px");
		mainLayout.setMargin(true);
		mainLayout.setSpacing(true);
		mainLayout.setRows(6);

		// top-level component properties
		setWidth("-1px");
		setHeight("-1px");

		// horizontalLayout_1
		horizontalLayout_1 = buildHorizontalLayout_1();
		mainLayout.addComponent(horizontalLayout_1, 0, 0);

		// horizontalLayout_2
		horizontalLayout_2 = buildHorizontalLayout_2();
		mainLayout.addComponent(horizontalLayout_2, 0, 1);

		// horizontalLayout_3
		horizontalLayout_3 = buildHorizontalLayout_3();
		mainLayout.addComponent(horizontalLayout_3, 0, 2);

		// horizontalLayout_4
		horizontalLayout_4 = buildHorizontalLayout_4();
		mainLayout.addComponent(horizontalLayout_4, 0, 3);

		// horizontalLayout_5
		horizontalLayout_5 = buildHorizontalLayout_5();
		mainLayout.addComponent(horizontalLayout_5, 0, 4);

		// horizontalLayout_6
		horizontalLayout_6 = buildHorizontalLayout_6();
		mainLayout.addComponent(horizontalLayout_6, 0, 5);

		return mainLayout;
	}

	@AutoGenerated
	private HorizontalLayout buildHorizontalLayout_1() {
		// common part: create layout
		horizontalLayout_1 = new HorizontalLayout();
		horizontalLayout_1.setImmediate(false);
		horizontalLayout_1.setWidth("-1px");
		horizontalLayout_1.setHeight("-1px");
		horizontalLayout_1.setMargin(false);
		horizontalLayout_1.setSpacing(true);

		// cmbPessoa
		cmbPessoa = new ManyToOneCombo<>();
		cmbPessoa.setCaption("Pessoa");
		cmbPessoa.setImmediate(false);
		cmbPessoa.setWidth("380px");
		cmbPessoa.setHeight("-1px");
		horizontalLayout_1.addComponent(cmbPessoa);

		// cmbSituacao
		cmbSituacao = new ManyToOneCombo<>();
		cmbSituacao.setCaption("Situação");
		cmbSituacao.setImmediate(false);
		cmbSituacao.setWidth("394px");
		cmbSituacao.setHeight("-1px");
		horizontalLayout_1.addComponent(cmbSituacao);

		return horizontalLayout_1;
	}

	@AutoGenerated
	private HorizontalLayout buildHorizontalLayout_2() {
		// common part: create layout
		horizontalLayout_2 = new HorizontalLayout();
		horizontalLayout_2.setImmediate(false);
		horizontalLayout_2.setWidth("-1px");
		horizontalLayout_2.setHeight("-1px");
		horizontalLayout_2.setMargin(false);
		horizontalLayout_2.setSpacing(true);

		// cmbAtividade
		cmbAtividade = new ManyToOneCombo<>();
		cmbAtividade.setCaption("Atividade");
		cmbAtividade.setImmediate(false);
		cmbAtividade.setWidth("383px");
		cmbAtividade.setHeight("-1px");
		horizontalLayout_2.addComponent(cmbAtividade);

		// cmbContaContabil
		cmbContaContabil = new ManyToOneCombo<>();
		cmbContaContabil.setCaption("Conta Contábil");
		cmbContaContabil.setImmediate(false);
		cmbContaContabil.setWidth("391px");
		cmbContaContabil.setHeight("-1px");
		horizontalLayout_2.addComponent(cmbContaContabil);

		return horizontalLayout_2;
	}

	@AutoGenerated
	private HorizontalLayout buildHorizontalLayout_3() {
		// common part: create layout
		horizontalLayout_3 = new HorizontalLayout();
		horizontalLayout_3.setImmediate(false);
		horizontalLayout_3.setWidth("-1px");
		horizontalLayout_3.setHeight("-1px");
		horizontalLayout_3.setMargin(false);
		horizontalLayout_3.setSpacing(true);

		// cmbOperacaoFiscal
		cmbOperacaoFiscal = new ManyToOneCombo<>();
		cmbOperacaoFiscal.setCaption("Operação Fiscal");
		cmbOperacaoFiscal.setImmediate(false);
		cmbOperacaoFiscal.setWidth("780px");
		cmbOperacaoFiscal.setHeight("-1px");
		horizontalLayout_3.addComponent(cmbOperacaoFiscal);

		return horizontalLayout_3;
	}

	@AutoGenerated
	private HorizontalLayout buildHorizontalLayout_4() {
		// common part: create layout
		horizontalLayout_4 = new HorizontalLayout();
		horizontalLayout_4.setImmediate(false);
		horizontalLayout_4.setWidth("-1px");
		horizontalLayout_4.setHeight("-1px");
		horizontalLayout_4.setMargin(false);
		horizontalLayout_4.setSpacing(true);

		// dtDesde
		dtDesde = new PopupDateField();
		dtDesde.setCaption("Desde");
		dtDesde.setImmediate(false);
		dtDesde.setWidth("100px");
		dtDesde.setHeight("-1px");
		horizontalLayout_4.addComponent(dtDesde);

		// txtContaTomador
		txtContaTomador = new TextField();
		txtContaTomador.setCaption("Conta Tomador");
		txtContaTomador.setImmediate(false);
		txtContaTomador.setWidth("193px");
		txtContaTomador.setHeight("-1px");
		horizontalLayout_4.addComponent(txtContaTomador);

		// cmbGerarFinanceiro
		cmbGerarFinanceiro = new ComboBox();
		cmbGerarFinanceiro.setCaption("Gerar Financeiro");
		cmbGerarFinanceiro.setImmediate(false);
		cmbGerarFinanceiro.setWidth("147px");
		cmbGerarFinanceiro.setHeight("-1px");
		horizontalLayout_4.addComponent(cmbGerarFinanceiro);

		// cmbIndicadorPreco
		cmbIndicadorPreco = new ComboBox();
		cmbIndicadorPreco.setCaption("Indicador de Preço");
		cmbIndicadorPreco.setImmediate(false);
		cmbIndicadorPreco.setWidth("-1px");
		cmbIndicadorPreco.setHeight("-1px");
		horizontalLayout_4.addComponent(cmbIndicadorPreco);

		// cmbTipoFrete
		cmbTipoFrete = new ComboBox();
		cmbTipoFrete.setCaption("Tipo de Frete");
		cmbTipoFrete.setImmediate(false);
		cmbTipoFrete.setWidth("154px");
		cmbTipoFrete.setHeight("-1px");
		horizontalLayout_4.addComponent(cmbTipoFrete);

		return horizontalLayout_4;
	}

	@AutoGenerated
	private HorizontalLayout buildHorizontalLayout_5() {
		// common part: create layout
		horizontalLayout_5 = new HorizontalLayout();
		horizontalLayout_5.setImmediate(false);
		horizontalLayout_5.setWidth("-1px");
		horizontalLayout_5.setHeight("-1px");
		horizontalLayout_5.setMargin(false);
		horizontalLayout_5.setSpacing(true);

		// cmbFormaDesconto
		cmbFormaDesconto = new ComboBox();
		cmbFormaDesconto.setCaption("Forma de Desconto");
		cmbFormaDesconto.setImmediate(false);
		cmbFormaDesconto.setWidth("383px");
		cmbFormaDesconto.setHeight("-1px");
		horizontalLayout_5.addComponent(cmbFormaDesconto);

		// txtTaxaDesconto
		txtTaxaDesconto = new TextField();
		txtTaxaDesconto.setCaption("Taxa Desconto");
		txtTaxaDesconto.setImmediate(false);
		txtTaxaDesconto.setWidth("191px");
		txtTaxaDesconto.setHeight("-1px");
		horizontalLayout_5.addComponent(txtTaxaDesconto);

		// txtLimiteCredito
		txtLimiteCredito = new TextField();
		txtLimiteCredito.setCaption("Limite de Crédito");
		txtLimiteCredito.setImmediate(false);
		txtLimiteCredito.setWidth("194px");
		txtLimiteCredito.setHeight("-1px");
		horizontalLayout_5.addComponent(txtLimiteCredito);

		return horizontalLayout_5;
	}

	@AutoGenerated
	private HorizontalLayout buildHorizontalLayout_6() {
		// common part: create layout
		horizontalLayout_6 = new HorizontalLayout();
		horizontalLayout_6.setImmediate(false);
		horizontalLayout_6.setWidth("-1px");
		horizontalLayout_6.setHeight("-1px");
		horizontalLayout_6.setMargin(false);
		horizontalLayout_6.setSpacing(true);

		// txtObservacao
		txtObservacao = new TextField();
		txtObservacao.setCaption("Observação");
		txtObservacao.setImmediate(false);
		txtObservacao.setWidth("780px");
		txtObservacao.setHeight("-1px");
		horizontalLayout_6.addComponent(txtObservacao);

		return horizontalLayout_6;
	}

	public void InitCbs(List<String> clienteTipoList, List<String> auxLista,
			List<String> auxlista, List<String> auxCliente) {
		for (String str : clienteTipoList) {
			cmbGerarFinanceiro.addItem(str.toString());
		}

		for (String str : auxLista) {
			cmbIndicadorPreco.addItem(str.toString());
		}
		for (String str : auxlista) {
			cmbTipoFrete.addItem(str.toString());
		}
		for (String str : auxCliente) {
			cmbFormaDesconto.addItem(str.toString());
		}
	}

	public void preencheCliente(ClienteEntity cliente) {

		cliente.setPessoa((PessoaEntity) cmbPessoa.getValue());
		cliente.setContabilConta((ContabilConta) cmbContaContabil.getValue());
		cliente.setSituacao((SituacaoForCli) cmbSituacao.getValue());
		cliente.setAtividadeForCli((AtividadeForCli) cmbAtividade.getValue());
		cliente.setOperacaoFiscal((OperacaoFiscal) cmbOperacaoFiscal.getValue());
		cliente.setDesde(dtDesde.getValue());
		cliente.setContaTomador(txtContaTomador.getValue());
		cliente.setObservacao(txtObservacao.getValue());

		/*
		 * GerarFinanceiroType enumGeraFinanceiro = (GerarFinanceiroType)
		 * (cmbGerarFinanceiro.getValue()); if
		 * (Validator.validateObject(enumGeraFinanceiro)) { String
		 * geraFinanceiro = (enumGeraFinanceiro).getCodigo();
		 * cliente.setGeraFinanceiro(geraFinanceiro); }
		 * 
		 * FormaDescontoType enumFormaDesconto = (FormaDescontoType)
		 * (cmbFormaDesconto.getValue()); if
		 * (Validator.validateObject(enumFormaDesconto)) { String formaDesconto
		 * = (enumFormaDesconto).getCodigo();
		 * cliente.setFormaDesconto(formaDesconto); }
		 * 
		 * TipoFreteType enumTipoFrete = (TipoFreteType)
		 * (cmbTipoFrete.getValue()); if
		 * (Validator.validateObject(enumTipoFrete)) { String tipoFrete =
		 * (enumTipoFrete).getCodigo(); cliente.setTipoFrete(tipoFrete); }
		 */

		cliente.setPorcentoDesconto((BigDecimal) txtTaxaDesconto
				.getConvertedValue());
		cliente.setLimiteCredito((BigDecimal) txtLimiteCredito
				.getConvertedValue());

	}

	public void preencheClienteForm(ClienteEntity cliente) {
		cmbPessoa.setValue(cliente.getPessoa());
		cmbContaContabil.setValue(cliente.getContabilConta());
		cmbSituacao.setValue(cliente.getSituacao());
		cmbAtividade.setValue(cliente.getAtividadeForCli());
		cmbOperacaoFiscal.setValue(cliente.getOperacaoFiscal());

		dtDesde.setValue(cliente.getDesde());
		txtContaTomador.setValue(cliente.getContaTomador());
		txtObservacao.setValue(cliente.getObservacao());

		cmbTipoFrete.setValue(cliente.getTipoFrete());
		cmbFormaDesconto.setValue(cliente.getFormaDesconto());
		cmbGerarFinanceiro.setValue(cliente.getGeraFinanceiro());
		cmbIndicadorPreco.setValue(cliente.getIndicadorPreco());
		txtTaxaDesconto.setConvertedValue(cliente.getPorcentoDesconto());
		txtLimiteCredito.setConvertedValue(cliente.getLimiteCredito());
		// getTxtValor().setValue(contrato.getValor().toString());

	}

	/*
	 * public void InitCbs() {
	 * 
	 * 
	 * cmbGerarFinanceiro.addItem(GerarFinanceiroType.SIM.toString());
	 * cmbGerarFinanceiro.addItem(GerarFinanceiroType.NAO.toString());
	 * 
	 * cmbIndicadorPreco.addItem(IndicadorPrecoType.TABELA.toString());
	 * cmbIndicadorPreco.addItem(IndicadorPrecoType.ULTIMOPEDIDO.toString());
	 * 
	 * cmbTipoFrete.addItem(TipoFreteType.EMITENTE.toString());
	 * cmbTipoFrete.addItem(TipoFreteType.DESTINATARIO.toString());
	 * cmbTipoFrete.addItem(TipoFreteType.SEMFRETE.toString());
	 * cmbTipoFrete.addItem(TipoFreteType.TERCEIROS.toString());
	 * 
	 * cmbFormaDesconto.addItem(FormaDescontoType.PRODUTO.toString());
	 * cmbFormaDesconto.addItem(FormaDescontoType.FIMPEDIDO.toString());
	 * 
	 * }
	 * 
	 * public String getCbGerarFinanceiro() { String cbvalue = new String(); if
	 * (cmbGerarFinanceiro.getValue() == "Sim") { cbvalue = "S"; } else if
	 * (cmbGerarFinanceiro.getValue() == "Nao") { cbvalue = "N"; } return
	 * cbvalue; }
	 * 
	 * public void setCbGerarFinanceiro(String cbGerarFinanceiro) { if
	 * (cbGerarFinanceiro.equalsIgnoreCase("S")) {
	 * this.cmbGerarFinanceiro.setValue("Sim"); } else if
	 * (cbGerarFinanceiro.equalsIgnoreCase("N")) {
	 * this.cmbGerarFinanceiro.setValue("Nao"); } }
	 * 
	 * public String getCbIndicadorPreco() { String cbvalue = new String(); if
	 * (cmbIndicadorPreco.getValue() == "Tabela") { cbvalue = "T"; } else if
	 * (cmbIndicadorPreco.getValue() == "Último Pedido") { cbvalue = "P"; }
	 * return cbvalue; }
	 * 
	 * public void setCbIndicadorPreco(String cbIndicadorPreco) { if
	 * (cbIndicadorPreco.equalsIgnoreCase("T")) {
	 * this.cmbIndicadorPreco.setValue("Tabela"); } else if
	 * (cbIndicadorPreco.equalsIgnoreCase("P")) {
	 * this.cmbIndicadorPreco.setValue("Último Pedido"); } }
	 * 
	 * public String getCbTipoFrete() { String cbvalue = new String(); if
	 * (cmbTipoFrete.getValue() == "Emitente") { cbvalue = "E"; } else if
	 * (cmbTipoFrete.getValue() == "Destinatários") { cbvalue = "D"; } else if
	 * (cmbTipoFrete.getValue() == "Sem Frete") {
	 * 
	 * cbvalue = "S"; } else if (cmbTipoFrete.getValue() == "Terceiros") {
	 * 
	 * cbvalue = "T"; } return cbvalue; }
	 * 
	 * public void setCbTipoFrete(String cbTipoFrete) { if
	 * (cbTipoFrete.equalsIgnoreCase("E")) {
	 * this.cmbTipoFrete.setValue("Emitente"); } else if
	 * (cbTipoFrete.equalsIgnoreCase("D")) {
	 * this.cmbTipoFrete.setValue("Destinatários"); } else if
	 * (cbTipoFrete.equalsIgnoreCase("S")) {
	 * 
	 * this.cmbTipoFrete.setValue("Sem Frete"); } else if
	 * (cbTipoFrete.equalsIgnoreCase("T")) {
	 * 
	 * this.cmbTipoFrete.setValue("Terceiros"); } }
	 * 
	 * public String getCbFormaDesconto() { String cbvalue = new String(); if
	 * (cmbFormaDesconto.getValue() == "Produto") { cbvalue = "P"; } else if
	 * (cmbFormaDesconto.getValue() == "Fim do Pedido") { cbvalue = "F"; }
	 * return cbvalue; }
	 * 
	 * public void setCbFormaDesconto(String cbFormaDesconto) { if
	 * (cbFormaDesconto.equalsIgnoreCase("P")) {
	 * this.cmbFormaDesconto.setValue("Produto"); } else if
	 * (cbFormaDesconto.equalsIgnoreCase("F")) {
	 * this.cmbFormaDesconto.setValue("Fim do pedido"); } }
	 */

	public GridLayout getMainLayout() {
		return mainLayout;
	}

	public void setMainLayout(GridLayout mainLayout) {
		this.mainLayout = mainLayout;
	}

	public HorizontalLayout getHorizontalLayout_6() {
		return horizontalLayout_6;
	}

	public void setHorizontalLayout_6(HorizontalLayout horizontalLayout_6) {
		this.horizontalLayout_6 = horizontalLayout_6;
	}

	public TextField getTxtObservacao() {
		return txtObservacao;
	}

	public void setTxtObservacao(TextField txtObservacao) {
		this.txtObservacao = txtObservacao;
	}

	public HorizontalLayout getHorizontalLayout_5() {
		return horizontalLayout_5;
	}

	public void setHorizontalLayout_5(HorizontalLayout horizontalLayout_5) {
		this.horizontalLayout_5 = horizontalLayout_5;
	}

	public TextField getTxtLimiteCredito() {
		return txtLimiteCredito;
	}

	public void setTxtLimiteCredito(TextField txtLimiteCredito) {
		this.txtLimiteCredito = txtLimiteCredito;
	}

	public TextField getTxtTaxaDesconto() {
		return txtTaxaDesconto;
	}

	public void setTxtTaxaDesconto(TextField txtTaxaDesconto) {
		this.txtTaxaDesconto = txtTaxaDesconto;
	}

	public HorizontalLayout getHorizontalLayout_4() {
		return horizontalLayout_4;
	}

	public void setHorizontalLayout_4(HorizontalLayout horizontalLayout_4) {
		this.horizontalLayout_4 = horizontalLayout_4;
	}

	public TextField getTxtContaTomador() {
		return txtContaTomador;
	}

	public void setTxtContaTomador(TextField txtContaTomador) {
		this.txtContaTomador = txtContaTomador;
	}

	public PopupDateField getDtDesde() {
		return dtDesde;
	}

	public void setDtDesde(PopupDateField dtDesde) {
		this.dtDesde = dtDesde;
	}

	public HorizontalLayout getHorizontalLayout_3() {
		return horizontalLayout_3;
	}

	public void setHorizontalLayout_3(HorizontalLayout horizontalLayout_3) {
		this.horizontalLayout_3 = horizontalLayout_3;
	}

	public HorizontalLayout getHorizontalLayout_2() {
		return horizontalLayout_2;
	}

	public void setHorizontalLayout_2(HorizontalLayout horizontalLayout_2) {
		this.horizontalLayout_2 = horizontalLayout_2;
	}

	public HorizontalLayout getHorizontalLayout_1() {
		return horizontalLayout_1;
	}

	public void setHorizontalLayout_1(HorizontalLayout horizontalLayout_1) {
		this.horizontalLayout_1 = horizontalLayout_1;
	}

	public ManyToOneCombo<PessoaEntity> getCmbPessoa() {
		return cmbPessoa;
	}

	public void setCmbPessoa(ManyToOneCombo<PessoaEntity> cmbPessoa) {
		this.cmbPessoa = cmbPessoa;
	}

	public ManyToOneCombo<SituacaoForCli> getCmbSituacao() {
		return cmbSituacao;
	}

	public void setCmbSituacao(ManyToOneCombo<SituacaoForCli> cmbSituacao) {
		this.cmbSituacao = cmbSituacao;
	}

	public ManyToOneCombo<AtividadeForCli> getCmbAtividade() {
		return cmbAtividade;
	}

	public void setCmbAtividade(ManyToOneCombo<AtividadeForCli> cmbAtividade) {
		this.cmbAtividade = cmbAtividade;
	}

	public ManyToOneCombo<ContabilConta> getCmbContaContabil() {
		return cmbContaContabil;
	}

	public void setCmbContaContabil(
			ManyToOneCombo<ContabilConta> cmbContaContabil) {
		this.cmbContaContabil = cmbContaContabil;
	}

	public ManyToOneCombo<dc.entidade.tributario.OperacaoFiscal> getCmbOperacaoFiscal() {
		return cmbOperacaoFiscal;
	}

	public void setCmbOperacaoFiscal(
			ManyToOneCombo<OperacaoFiscal> cmbOperacaoFiscal) {
		this.cmbOperacaoFiscal = cmbOperacaoFiscal;
	}

	public ComboBox getCmbFormaDesconto() {
		return cmbFormaDesconto;
	}

	public void setCmbFormaDesconto(ComboBox cmbFormaDesconto) {
		this.cmbFormaDesconto = cmbFormaDesconto;
	}

	public ComboBox getCmbTipoFrete() {
		return cmbTipoFrete;
	}

	public void setCmbTipoFrete(ComboBox cmbTipoFrete) {
		this.cmbTipoFrete = cmbTipoFrete;
	}

	public ComboBox getCmbIndicadorPreco() {
		return cmbIndicadorPreco;
	}

	public void setCmbIndicadorPreco(ComboBox cmbIndicadorPreco) {
		this.cmbIndicadorPreco = cmbIndicadorPreco;
	}

	public ComboBox getCmbGerarFinanceiro() {
		return cmbGerarFinanceiro;
	}

	public void setCmbGerarFinanceiro(ComboBox cmbGerarFinanceiro) {
		this.cmbGerarFinanceiro = cmbGerarFinanceiro;
	}

}
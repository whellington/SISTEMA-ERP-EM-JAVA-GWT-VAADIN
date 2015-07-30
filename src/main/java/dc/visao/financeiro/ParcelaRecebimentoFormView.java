package dc.visao.financeiro;

import java.math.BigDecimal;
import java.util.List;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.data.Container;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Component;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.DateField;
import com.vaadin.ui.Field;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.Table;
import com.vaadin.ui.TableFieldFactory;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import dc.control.enums.TipoBaixaEn;
import dc.controller.financeiro.ParcelaRecebimentoFormController;
import dc.entidade.financeiro.ContaCaixa;
import dc.entidade.financeiro.ParcelaRecebimento;
import dc.entidade.financeiro.TipoRecebimento;
import dc.visao.financeiro.converters.TipoRecebimentoConverter;
import dc.visao.framework.component.SubFormComponent;
import dc.visao.framework.component.manytoonecombo.ManyToOneCombo;
import dc.visao.framework.util.ComponentUtil;

public class ParcelaRecebimentoFormView extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@AutoGenerated
	private VerticalLayout mainLayout;
	@AutoGenerated
	private GridLayout fields;

	@AutoGenerated
	private GridLayout pagamentoButtons;

	@AutoGenerated
	private HorizontalLayout pagamentosButtonsContainer;

	@AutoGenerated
	private PopupDateField dtDataVencimento;

	@AutoGenerated
	private PopupDateField dtDataRecebimento;

	@AutoGenerated
	private ComboBox cbTipoBaixa;

	@AutoGenerated
	private ManyToOneCombo<TipoRecebimento> cbTipoRecebimento;

	@AutoGenerated
	private ManyToOneCombo<ContaCaixa> cbContaCaixa;

	@AutoGenerated
	private TextField txValorReceber;

	@AutoGenerated
	private TextField txTaxaJuro;

	@AutoGenerated
	private TextField txValorJuro;

	@AutoGenerated
	private TextField txTaxaMulta;

	@AutoGenerated
	private TextField txValorMulta;

	@AutoGenerated
	private TextField txTaxaDesconto;

	@AutoGenerated
	private TextField txValorDesconto;

	@AutoGenerated
	private TextField txValorRecebido;

	@AutoGenerated
	private TextArea txaHistorico;

	@AutoGenerated
	private Button btnEfetuaRecebimento;

	@AutoGenerated
	private Button btnExcluiRecebimento;

	@AutoGenerated
	private SubFormComponent<ParcelaRecebimento, Integer> pagamentosSubForm;

	public ParcelaRecebimentoFormView(ParcelaRecebimentoFormController parcelaRecebimentoFormController) {
		buildMainLayout();
		setCompositionRoot(mainLayout);
	}

	@AutoGenerated
	private VerticalLayout buildMainLayout() {
		// common part: create layout
		setSizeFull();
		mainLayout = new VerticalLayout();
		mainLayout.setImmediate(false);
		mainLayout.setSizeFull();
		mainLayout.setMargin(false);
		mainLayout.setSpacing(true);

		// top-level component properties
		setWidth("100.0%");
		// setHeight("100.0%");

		fields = buildFields();
		mainLayout.addComponent(fields);

		pagamentosSubForm = buildSubFormParcelaRecebimento();
		mainLayout.addComponent(pagamentosSubForm);

		mainLayout.setExpandRatio(pagamentosSubForm, 1.0f);

		return mainLayout;
	}

	@AutoGenerated
	private GridLayout buildFields() {
		// common part: create layout
		fields = new GridLayout(5, 6);
		fields.setImmediate(false);
		fields.setWidth("100.0%");
		fields.setHeight("-1px");
		fields.setMargin(false);
		fields.setSpacing(true);

		pagamentoButtons = buildRecebimentoButtons();
		fields.addComponent(pagamentoButtons, 0, 0, 1, 0);

		cbTipoBaixa = ComponentUtil.buildComboBox("Tipo Baixa");
		fields.addComponent(cbTipoBaixa, 0, 1);

		cbTipoRecebimento = new ManyToOneCombo<TipoRecebimento>();
		cbTipoRecebimento.setCaption("Tipo Recebimento");
		fields.addComponent(cbTipoRecebimento, 1, 1);

		cbContaCaixa = new ManyToOneCombo<ContaCaixa>();
		cbContaCaixa.setCaption("Conta Caixa");
		cbContaCaixa.setHeight("-1px");
		cbContaCaixa.setWidth("200px");
		fields.addComponent(cbContaCaixa, 2, 1);
		//

		dtDataVencimento = ComponentUtil.buildPopupDateField("Data Vencimento");
		fields.addComponent(dtDataVencimento, 0, 2);

		dtDataRecebimento = ComponentUtil.buildPopupDateField("Data Recebimento");
		fields.addComponent(dtDataRecebimento, 1, 2);

		txValorReceber = ComponentUtil.buildCurrencyField("Valor à Receber");
		fields.addComponent(txValorReceber, 2, 2);

		txTaxaJuro = ComponentUtil.buildPercentageField("Taxa Juro");
		fields.addComponent(txTaxaJuro, 3, 2);

		txValorJuro = ComponentUtil.buildCurrencyField("Valor Juro");
		fields.addComponent(txValorJuro, 4, 2);
		//

		txTaxaMulta = ComponentUtil.buildPercentageField("Taxa Multa");
		fields.addComponent(txTaxaMulta, 0, 3);

		txValorMulta = ComponentUtil.buildCurrencyField("Valor Multa");
		fields.addComponent(txValorMulta, 1, 3);

		txTaxaDesconto = ComponentUtil.buildPercentageField("Taxa Desconto");
		fields.addComponent(txTaxaDesconto, 2, 3);

		txValorDesconto = ComponentUtil.buildCurrencyField("Valor Desconto");
		fields.addComponent(txValorDesconto, 3, 3);

		txValorRecebido = ComponentUtil.buildCurrencyField("Valor Recebido");
		fields.addComponent(txValorRecebido, 4, 3);

		txaHistorico = ComponentUtil.buildTextArea("Histórico");
		fields.addComponent(txaHistorico, 0, 4, 4, 5);

		return fields;
	}

	private GridLayout buildRecebimentoButtons() {
		pagamentoButtons = new GridLayout(2, 1);
		pagamentoButtons.setImmediate(false);
		pagamentoButtons.setSizeFull();
		pagamentoButtons.setMargin(false);
		pagamentoButtons.setSpacing(true);

		btnEfetuaRecebimento = new Button("Efetua Recebimento");
		btnEfetuaRecebimento.setImmediate(true);
		pagamentoButtons.addComponent(btnEfetuaRecebimento, 0, 0);

		btnExcluiRecebimento = new Button("Exclui Recebimento");
		btnExcluiRecebimento.setImmediate(true);
		pagamentoButtons.addComponent(btnExcluiRecebimento, 1, 0);

		return pagamentoButtons;
	}

	private SubFormComponent<ParcelaRecebimento, Integer> buildSubFormParcelaRecebimento() {

		String[] atributos = new String[] { "tipoRecebimento", "dataRecebimento", "taxaJuro", "valorJuro", "taxaMulta", "valorMulta", "taxaDesconto",
				"valorDesconto", "valorRecebido", "historico" };

		String[] headers = new String[] { "Tipo Recebimento", "Data Recebimento", "Taxa Juro", "Valor Juro", "Taxa Multa", "Valor Multa",
				"Taxa Desconto", "Valor Desconto", "Valor Recebido", "Histórico" };

		this.pagamentosSubForm = new SubFormComponent<ParcelaRecebimento, Integer>(ParcelaRecebimento.class, atributos, headers) {

			private static final long serialVersionUID = 1L;

			@Override
			protected void adicionarBotoes(Table table) {

			}

			@Override
			protected TableFieldFactory getFieldFactory() {
				return new TableFieldFactory() {

					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					@SuppressWarnings("rawtypes")
					@Override
					public Field<?> createField(Container container, Object itemId, Object propertyId, Component uiContext) {

						if ("dataRecebimento".equals(propertyId)) {
							DateField dateField = new DateField();
							dateField.setSizeFull();
							dateField.setEnabled(false);
							return dateField;
						} else if ("tipoRecebimento".equals(propertyId)) {
							TextField field = ComponentUtil.buildTextField(null);
							field.setConverter(new TipoRecebimentoConverter());
							field.setEnabled(false);
							return field;
						} else if ("taxaJuro".equals(propertyId)) {
							Field field = ComponentUtil.buildPercentageField(null);
							field.setEnabled(false);
							return field;
						} else if ("taxaMulta".equals(propertyId)) {
							Field field = ComponentUtil.buildPercentageField(null);
							field.setEnabled(false);
							return field;
						} else if ("taxaDesconto".equals(propertyId)) {
							Field field = ComponentUtil.buildPercentageField(null);
							field.setEnabled(false);
							return field;
						} else if ("valorJuro".equals(propertyId)) {
							Field field = ComponentUtil.buildCurrencyField(null);
							field.setEnabled(false);
							return field;
						} else if ("valorMulta".equals(propertyId)) {
							Field field = ComponentUtil.buildCurrencyField(null);
							field.setEnabled(false);
							return field;
						} else if ("valorDesconto".equals(propertyId)) {
							Field field = ComponentUtil.buildCurrencyField(null);
							field.setEnabled(false);
							return field;
						} else if ("valorRecebido".equals(propertyId)) {
							Field field = ComponentUtil.buildCurrencyField(null);
							field.setEnabled(false);
							return field;
						} else {
							Field field = ComponentUtil.buildTextField(null);
							field.setEnabled(false);
							return field;
						}
					}

				};
			}

			@Override
			public boolean validateItems(List<ParcelaRecebimento> items) {
				return true;
			}
		};

		return this.pagamentosSubForm;
	}

	public void preencheBean(ParcelaRecebimento currentBean) {
		currentBean.setDataRecebimento(dtDataRecebimento.getValue());
		currentBean.setContaCaixa((ContaCaixa) cbContaCaixa.getValue());
		currentBean.setTipoRecebimento((TipoRecebimento) cbTipoRecebimento.getValue());
		currentBean.setTaxaJuro((BigDecimal) txTaxaJuro.getConvertedValue());
		currentBean.setValorJuro((BigDecimal) txValorJuro.getConvertedValue());
		currentBean.setTaxaMulta((BigDecimal) txTaxaMulta.getConvertedValue());
		currentBean.setValorMulta((BigDecimal) txValorMulta.getConvertedValue());
		currentBean.setTaxaDesconto((BigDecimal) txTaxaDesconto.getConvertedValue());
		currentBean.setValorDesconto((BigDecimal) txValorDesconto.getConvertedValue());
		currentBean.setValorRecebido((BigDecimal) txValorRecebido.getConvertedValue());
		currentBean.setHistorico(txaHistorico.getValue());
	}

	public void preencheForm(ParcelaRecebimento currentBean) {
		dtDataVencimento.setValue(currentBean.getParcelaReceber().getDataVencimento());
		dtDataRecebimento.setValue(currentBean.getDataRecebimento());
		txValorReceber.setConvertedValue(currentBean.getParcelaReceber().getValor());
		cbContaCaixa.setValue(currentBean.getContaCaixa());
		if (currentBean.getTipoRecebimento() != null) {
			cbTipoRecebimento.setValue(currentBean.getTipoRecebimento());
		}
		txTaxaJuro.setConvertedValue(currentBean.getTaxaJuro());
		txValorJuro.setConvertedValue(currentBean.getValorJuro());
		txTaxaMulta.setConvertedValue(currentBean.getTaxaMulta());
		txValorMulta.setConvertedValue(currentBean.getValorMulta());
		txTaxaDesconto.setConvertedValue(currentBean.getTaxaDesconto());
		txValorDesconto.setConvertedValue(currentBean.getValorDesconto());
		txValorRecebido.setConvertedValue(currentBean.getValorRecebido());
		txaHistorico.setValue(currentBean.getHistorico());

	}

	public GridLayout getFields() {
		return fields;
	}

	public void setFields(GridLayout fields) {
		this.fields = fields;
	}

	public PopupDateField getDtDataVencimento() {
		return dtDataVencimento;
	}

	public void setDtDataVencimento(PopupDateField dtDataVencimento) {
		this.dtDataVencimento = dtDataVencimento;
	}

	public PopupDateField getDtDataRecebimento() {
		return dtDataRecebimento;
	}

	public void setDtDataRecebimento(PopupDateField dtDataRecebimento) {
		this.dtDataRecebimento = dtDataRecebimento;
	}

	public ComboBox getCbTipoBaixa() {
		return cbTipoBaixa;
	}

	public void setCbTipoBaixa(ComboBox cbTipoBaixa) {
		this.cbTipoBaixa = cbTipoBaixa;
	}

	public TextField getTxValorReceber() {
		return txValorReceber;
	}

	public void setTxValorReceber(TextField txValorReceber) {
		this.txValorReceber = txValorReceber;
	}

	public TextField getTxTaxaJuro() {
		return txTaxaJuro;
	}

	public void setTxTaxaJuro(TextField txTaxaJuro) {
		this.txTaxaJuro = txTaxaJuro;
	}

	public TextField getTxValorJuro() {
		return txValorJuro;
	}

	public void setTxValorJuro(TextField txValorJuro) {
		this.txValorJuro = txValorJuro;
	}

	public TextField getTxTaxaMulta() {
		return txTaxaMulta;
	}

	public void setTxTaxaMulta(TextField txTaxaMulta) {
		this.txTaxaMulta = txTaxaMulta;
	}

	public TextField getTxValorMulta() {
		return txValorMulta;
	}

	public void setTxValorMulta(TextField txValorMulta) {
		this.txValorMulta = txValorMulta;
	}

	public TextField getTxTaxaDesconto() {
		return txTaxaDesconto;
	}

	public void setTxTaxaDesconto(TextField txTaxaDesconto) {
		this.txTaxaDesconto = txTaxaDesconto;
	}

	public TextField getTxValorDesconto() {
		return txValorDesconto;
	}

	public void setTxValorDesconto(TextField txValorDesconto) {
		this.txValorDesconto = txValorDesconto;
	}

	public TextField getTxValorRecebido() {
		return txValorRecebido;
	}

	public void setTxValorRecebido(TextField txValorRecebido) {
		this.txValorRecebido = txValorRecebido;
	}

	public TextArea getTxaHistorico() {
		return txaHistorico;
	}

	public void setTxaHistorico(TextArea txaHistorico) {
		this.txaHistorico = txaHistorico;
	}

	public SubFormComponent<ParcelaRecebimento, Integer> getRecebimentosSubForm() {
		return pagamentosSubForm;
	}

	public void setRecebimentosSubForm(SubFormComponent<ParcelaRecebimento, Integer> pagamentosSubForm) {
		this.pagamentosSubForm = pagamentosSubForm;
	}

	public void fillParcelaRecebimentosSubForm(List<ParcelaRecebimento> parcelasReceber) {
		pagamentosSubForm.fillWith(parcelasReceber);
	}

	public Button getBtnEfetuaRecebimento() {
		return btnEfetuaRecebimento;
	}

	public void setBtnEfetuaRecebimento(Button btnEfetuaRecebimento) {
		this.btnEfetuaRecebimento = btnEfetuaRecebimento;
	}

	public Button getBtnExcluiRecebimento() {
		return btnExcluiRecebimento;
	}

	public void setBtnExcluiRecebimento(Button btnExcluiRecebimento) {
		this.btnExcluiRecebimento = btnExcluiRecebimento;
	}

	public enum TipoBaixa {
		TOTAL("Total", "T"), PARCIAL("Parcial", "P");

		private TipoBaixa(String label, String codigo) {
			this.label = label;
			this.codigo = codigo;
		}

		private String label;
		private String codigo;

		public static TipoBaixa getSimNao(String codigo) {
			for (TipoBaixa e : TipoBaixa.values()) {
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

	public void preencheComboTipoBaixa() {
		cbTipoBaixa.removeAllItems();

		for (TipoBaixaEn value : TipoBaixaEn.values()) {
			cbTipoBaixa.addItem(value);
		}

	}

	public ManyToOneCombo<TipoRecebimento> getCbTipoRecebimento() {
		return cbTipoRecebimento;
	}

	public void setCbTipoRecebimento(ManyToOneCombo<TipoRecebimento> cbTipoRecebimento) {
		this.cbTipoRecebimento = cbTipoRecebimento;
	}

	public ManyToOneCombo<ContaCaixa> getCbContaCaixa() {
		return cbContaCaixa;
	}

	public void setCbContaCaixa(ManyToOneCombo<ContaCaixa> cbContaCaixa) {
		this.cbContaCaixa = cbContaCaixa;
	}

}

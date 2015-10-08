package dc.visao.geral.tabela;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import dc.controller.geral.tabela.SalarioMinimoFormController;
import dc.entidade.geral.tabela.SalarioMinimoEntity;
import dc.visao.framework.component.BigDecimalConverter;
import dc.visao.framework.util.ComponentUtil;

public class SalarioMinimoFormView extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	private static final long serialVersionUID = 1L;
	
	@AutoGenerated
	private GridLayout fields;
	@AutoGenerated
	private VerticalLayout mainLayout;
	@AutoGenerated
	private PopupDateField dtDou;
	@AutoGenerated
	private TextField txtNormaLegal;
	@AutoGenerated
	private TextField txtValorHora;
	@AutoGenerated
	private TextField txtValorDiario;
	@AutoGenerated
	private TextField txtValorMensal;
	@AutoGenerated
	private PopupDateField dataVigencia;
	
	SalarioMinimoFormController controller;
	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	public SalarioMinimoFormView(SalarioMinimoFormController controller) {
		buildMainLayout();
		setCompositionRoot(mainLayout);

		this.controller = controller;
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
	
		return mainLayout;
	}

	
	private GridLayout buildFields() {
		fields = new GridLayout();
		fields.setImmediate(false);
		fields.setWidth("100.0%");
		fields.setHeight("-1px");
		fields.setMargin(false);
		fields.setSpacing(true);
		fields.setRows(4);
		fields.setColumns(3);
		
		// dataVigencia
		dataVigencia = new PopupDateField();
		dataVigencia.setCaption("Vigência");
		dataVigencia.setImmediate(false);
		dataVigencia.setRequired(true);
		dataVigencia.setWidth("156px");
		dataVigencia.setHeight("-1px");
		dataVigencia.setSizeFull();
		fields.addComponent(dataVigencia, 0, 0);
		
		// txtValorMensal
		txtValorMensal = ComponentUtil.buildCurrencyField("Valor Mensal");
		txtValorMensal.setRequired(true);
		//txtValorMensal.setConverter(new BigDecimalConverter("R$ "));
		//txtValorMensal.addTextChangeListener(event -> CurrencyConverter.vceMask(event, txtValorMensal));
		fields.addComponent(txtValorMensal, 1, 0);
		
		// txtValorDiario
		txtValorDiario = ComponentUtil.buildCurrencyField("Valor Diário");
		txtValorDiario.setImmediate(false);
		txtValorDiario.setRequired(true);
		txtValorDiario.setWidth("174px");
		txtValorDiario.setHeight("-1px");
		txtValorDiario.setSizeFull();
		fields.addComponent(txtValorDiario, 2, 0);
		
		// txtValorHora
		txtValorHora = ComponentUtil.buildCurrencysField("Valor Hora");
		txtValorHora.setImmediate(false);
		txtValorHora.setRequired(true);
		txtValorHora.setWidth("156px");
		txtValorHora.setHeight("-1px");
		txtValorHora.setSizeFull();
		fields.addComponent(txtValorHora, 0, 1);
		
		// txtNormaLegal
		txtNormaLegal = new TextField();
		txtNormaLegal.setCaption("Norma Legal");
		txtNormaLegal.setImmediate(false);
		txtNormaLegal.setWidth("334px");
		txtNormaLegal.setHeight("-1px");
		txtNormaLegal.setSizeFull();
		fields.addComponent(txtNormaLegal, 1, 1);
		
		// dtDou
		dtDou = new PopupDateField();
		dtDou.setCaption("Dou");
		dtDou.setImmediate(false);
		dtDou.setWidth("156px");
		dtDou.setHeight("-1px");
		dtDou.setSizeFull();
		fields.addComponent(dtDou, 2, 1);
		
		return fields;
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

	public PopupDateField getDtDou() {
		return dtDou;
	}

	public void setDtDou(PopupDateField dtDou) {
		this.dtDou = dtDou;
	}
	public TextField getTxtNormaLegal() {
		return txtNormaLegal;
	}

	public void setTxtNormaLegal(TextField txtNormaLegal) {
		this.txtNormaLegal = txtNormaLegal;
	}

	public TextField getTxtValorHora() {
		return txtValorHora;
	}

	public void setTxtValorHora(TextField txtValorHora) {
		this.txtValorHora = txtValorHora;
	}

	public TextField getTxtValorDiario() {
		return txtValorDiario;
	}

	public void setTxtValorDiario(TextField txtValorDiario) {
		this.txtValorDiario = txtValorDiario;
	}

	public TextField getTxtValorMensal() {
		return txtValorMensal;
	}

	public void setTxtValorMensal(TextField txtValorMensal) {
		this.txtValorMensal = txtValorMensal;
	}

	public PopupDateField getDataVigencia() {
		return dataVigencia;
	}

	public void setDataVigencia(PopupDateField dataVigencia) {
		this.dataVigencia = dataVigencia;
	}
	
	public void preencheSalario(SalarioMinimoEntity salario) {

		salario.setVigencia(dataVigencia.getValue());
		salario.setNormaLegal(txtNormaLegal.getValue());
		salario.setDou(dtDou.getValue());
		salario.setValorMensal(((BigDecimal) txtValorMensal.getConvertedValue()).setScale(2, RoundingMode.HALF_EVEN));
		salario.setValorDiario(((BigDecimal) txtValorDiario.getConvertedValue()).setScale(2, RoundingMode.HALF_EVEN));
		salario.setValorHora(((BigDecimal) txtValorHora.getConvertedValue()).setScale(2, RoundingMode.HALF_EVEN));
		txtValorMensal.setConverter(new BigDecimalConverter("R$ "));
		txtValorDiario.setConverter(new BigDecimalConverter("R$ "));
		txtValorHora.setConverter(new BigDecimalConverter("R$ "));

	}
	
	public void preencheSalarioForm(SalarioMinimoEntity salario) {
		dataVigencia.setValue(salario.getVigencia());
		txtNormaLegal.setValue(salario.getNormaLegal());
		dtDou.setValue(salario.getDou());
		txtValorMensal.setConvertedValue(salario.getValorMensal());
		txtValorDiario.setConvertedValue(salario.getValorDiario());
		txtValorHora.setConvertedValue(salario.getValorHora());
	}
	
}

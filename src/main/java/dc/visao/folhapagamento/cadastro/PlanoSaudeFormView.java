package dc.visao.folhapagamento.cadastro;

import java.util.List;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import dc.controller.folhapagamento.cadastro.PlanoSaudeFormController;
import dc.entidade.diversos.OperadoraPlanoSaude;
import dc.entidade.pessoal.Colaborador;

public class PlanoSaudeFormView extends CustomComponent {

	@AutoGenerated
	private VerticalLayout mainLayout;

	@AutoGenerated
	private Panel panel_1;

	@AutoGenerated
	private VerticalLayout verticalLayout_2;

	@AutoGenerated
	private GridLayout gridLayout_1;

	@AutoGenerated
	private TextField tfBeneficiario;

	@AutoGenerated
	private PopupDateField pdfDataInicio;

	@AutoGenerated
	private ComboBox cbColaborador;

	@AutoGenerated
	private ComboBox cbOperadoraPlanoSaude;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	private PlanoSaudeFormController controller;

	public PlanoSaudeFormView(final PlanoSaudeFormController controller) {
		this.controller = controller;

		buildMainLayout();
		setCompositionRoot(this.mainLayout);
	}

	public PopupDateField getPdfDataInicio() {
		return pdfDataInicio;
	}

	public void setPdfDataInicio(PopupDateField pdfDataInicio) {
		this.pdfDataInicio = pdfDataInicio;
	}

	public TextField getTfBeneficiario() {
		return tfBeneficiario;
	}

	public void setTfBeneficiario(TextField tfBeneficiario) {
		this.tfBeneficiario = tfBeneficiario;
	}

	public ComboBox getCbColaborador() {
		return cbColaborador;
	}

	public void setCbColaborador(ComboBox cbColaborador) {
		this.cbColaborador = cbColaborador;
	}

	public ComboBox getCbOperadoraPlanoSaude() {
		return cbOperadoraPlanoSaude;
	}

	public void setCbOperadoraPlanoSaude(ComboBox cbOperadoraPlanoSaude) {
		this.cbOperadoraPlanoSaude = cbOperadoraPlanoSaude;
	}

	@AutoGenerated
	private VerticalLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new VerticalLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("100%");
		mainLayout.setHeight("100%");
		mainLayout.setMargin(false);

		// top-level component properties
		setWidth("100.0%");
		setHeight("100.0%");

		// panel_1
		panel_1 = buildPanel_1();
		mainLayout.addComponent(panel_1);

		return mainLayout;
	}

	@AutoGenerated
	private Panel buildPanel_1() {
		// common part: create layout
		panel_1 = new Panel();
		panel_1.setImmediate(false);
		panel_1.setWidth("100.0%");
		panel_1.setHeight("100.0%");

		// verticalLayout_2
		verticalLayout_2 = buildVerticalLayout_2();
		panel_1.setContent(verticalLayout_2);

		return panel_1;
	}

	@AutoGenerated
	private VerticalLayout buildVerticalLayout_2() {
		// common part: create layout
		verticalLayout_2 = new VerticalLayout();
		verticalLayout_2.setImmediate(false);
		verticalLayout_2.setWidth("100.0%");
		verticalLayout_2.setHeight("100.0%");
		verticalLayout_2.setMargin(false);

		// verticalLayout_2
		verticalLayout_2 = buildVerticalLayout_2();
		panel_1.setContent(verticalLayout_2);

		return verticalLayout_2;
	}

	@AutoGenerated
	private GridLayout buildGridLayout_1() {
		// common part: create layout
		gridLayout_1 = new GridLayout();
		gridLayout_1.setImmediate(false);
		gridLayout_1.setWidth("100.0%");
		// gridLayout_1.setHeight("100.0%");
		gridLayout_1.setMargin(false);
		gridLayout_1.setRows(20);
		gridLayout_1.setColumns(3);

		// pdfDataInicio
		pdfDataInicio = new PopupDateField();
		pdfDataInicio.setCaption("Data de inicio:");
		pdfDataInicio.setImmediate(false);
		pdfDataInicio.setWidth("-1px");
		pdfDataInicio.setHeight("-1px");
		gridLayout_1.addComponent(pdfDataInicio, 0, 1);

		// tfBeneficiario
		tfBeneficiario = new TextField();
		tfBeneficiario.setCaption("Beneficiario:");
		tfBeneficiario.setNullRepresentation("");
		tfBeneficiario.setImmediate(false);
		tfBeneficiario.setWidth("175px");
		tfBeneficiario.setHeight("-1px");
		gridLayout_1.addComponent(tfBeneficiario, 1, 1);

		// cbColaborador
		cbColaborador = new ComboBox();
		cbColaborador.setCaption("Colaborador:");
		cbColaborador.setImmediate(false);
		cbColaborador.setWidth("160px");
		cbColaborador.setHeight("-1px");
		cbColaborador.setRequired(true);
		gridLayout_1.addComponent(cbColaborador, 0, 2);

		// cbOperadoraPlanoSaude
		cbOperadoraPlanoSaude = new ComboBox();
		cbOperadoraPlanoSaude.setCaption("Operadora do plano de saúde:");
		cbOperadoraPlanoSaude.setImmediate(false);
		cbOperadoraPlanoSaude.setWidth("160px");
		cbOperadoraPlanoSaude.setHeight("-1px");
		cbColaborador.setRequired(true);
		gridLayout_1.addComponent(cbOperadoraPlanoSaude, 1, 2);

		return gridLayout_1;
	}

	/**
	 * COMBOS
	 */

	public void carregarCmbColaborador(List<Colaborador> lista) {
		BeanItemContainer<Colaborador> bic = new BeanItemContainer<Colaborador>(
				Colaborador.class, lista);
		this.cbColaborador.setContainerDataSource(bic);
		this.cbColaborador.setItemCaptionPropertyId("nome");
	}

	public void carregarCmbOperadoraPlanoSaude(List<OperadoraPlanoSaude> lista) {
		BeanItemContainer<OperadoraPlanoSaude> bic = new BeanItemContainer<OperadoraPlanoSaude>(
				OperadoraPlanoSaude.class, lista);
		this.cbColaborador.setContainerDataSource(bic);
		this.cbColaborador.setItemCaptionPropertyId("nome");
	}

}
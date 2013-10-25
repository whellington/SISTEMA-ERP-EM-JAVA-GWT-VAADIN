package dc.visao.contabilidade.lancamento;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import dc.controller.contabilidade.lancamento.FechamentoFormController;

public class FechamentoFormView extends CustomComponent {

	@AutoGenerated
	private VerticalLayout mainLayout;

	@AutoGenerated
	private Panel panel_1;

	@AutoGenerated
	private VerticalLayout verticalLayout_2;

	@AutoGenerated
	private GridLayout gridLayout_1;

	@AutoGenerated
	private PopupDateField pdfDataInicio;

	@AutoGenerated
	private PopupDateField pdfDataFim;

	@AutoGenerated
	private TextField tfCriterioLancamento;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	private FechamentoFormController controller;

	public FechamentoFormView(final FechamentoFormController controller) {
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

	public PopupDateField getPdfDataFim() {
		return pdfDataFim;
	}

	public void setPdfDataFim(PopupDateField pdfDataFim) {
		this.pdfDataFim = pdfDataFim;
	}

	public TextField getTfCriterioLancamento() {
		return tfCriterioLancamento;
	}

	public void setTfCriterioLancamento(TextField tfCriterioLancamento) {
		this.tfCriterioLancamento = tfCriterioLancamento;
	}

	@AutoGenerated
	private VerticalLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new VerticalLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("100%");
		mainLayout.setHeight("100%");
		mainLayout.setMargin(true);
		mainLayout.setSpacing(true);

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

		// gridLayout_1
		gridLayout_1 = buildGridLayout_1();
		verticalLayout_2.addComponent(gridLayout_1);

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
		gridLayout_1.setSpacing(true);
		gridLayout_1.setRows(20);
		gridLayout_1.setColumns(2);

		// pdfDataInicio
		pdfDataInicio = new PopupDateField();
		pdfDataInicio.setCaption("Data de início:");
		pdfDataInicio.setImmediate(false);
		pdfDataInicio.setWidth("175px");
		pdfDataInicio.setHeight("-1px");
		pdfDataInicio.setSizeFull();
		gridLayout_1.addComponent(pdfDataInicio, 0, 1);

		// pdfDataFim
		pdfDataFim = new PopupDateField();
		pdfDataFim.setCaption("Data de término:");
		pdfDataFim.setImmediate(false);
		pdfDataFim.setWidth("175px");
		pdfDataFim.setHeight("-1px");
		pdfDataFim.setSizeFull();
		gridLayout_1.addComponent(pdfDataFim, 1, 1);

		// tfCriterioLancamento
		tfCriterioLancamento = new TextField();
		tfCriterioLancamento.setCaption("Critério de lançamento:");
		tfCriterioLancamento.setImmediate(false);
		tfCriterioLancamento.setWidth("175px");
		tfCriterioLancamento.setHeight("-1px");
		tfCriterioLancamento.setSizeFull();
		tfCriterioLancamento.setNullRepresentation("");
		gridLayout_1.addComponent(tfCriterioLancamento, 0, 2);

		return gridLayout_1;
	}

}
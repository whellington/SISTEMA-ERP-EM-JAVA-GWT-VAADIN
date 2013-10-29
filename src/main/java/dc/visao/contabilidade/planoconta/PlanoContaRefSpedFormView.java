package dc.visao.contabilidade.planoconta;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import dc.controller.contabilidade.planoconta.PlanoContaRefSpedFormController;

public class PlanoContaRefSpedFormView extends CustomComponent {

	@AutoGenerated
	private VerticalLayout mainLayout;

	@AutoGenerated
	private Panel panel_1;

	@AutoGenerated
	private VerticalLayout verticalLayout_2;

	@AutoGenerated
	private GridLayout gridLayout_1;

	@AutoGenerated
	private TextField tfCodCtaRef;

	@AutoGenerated
	private TextField tfDescricao;

	@AutoGenerated
	private TextField tfOrientacoes;

	@AutoGenerated
	private PopupDateField pdfInicioValidade;

	@AutoGenerated
	private PopupDateField pdfFimValidade;

	@AutoGenerated
	private TextField tfTipo;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	private PlanoContaRefSpedFormController controller;

	public PlanoContaRefSpedFormView(
			final PlanoContaRefSpedFormController controller) {
		this.controller = controller;

		buildMainLayout();
		setCompositionRoot(this.mainLayout);
	}

	public TextField getTfCodCtaRef() {
		return tfCodCtaRef;
	}

	public void setTfCodCtaRef(TextField tfCodCtaRef) {
		this.tfCodCtaRef = tfCodCtaRef;
	}

	public TextField getTfDescricao() {
		return tfDescricao;
	}

	public void setTfDescricao(TextField tfDescricao) {
		this.tfDescricao = tfDescricao;
	}

	public TextField getTfOrientacoes() {
		return tfOrientacoes;
	}

	public void setTfOrientacoes(TextField tfOrientacoes) {
		this.tfOrientacoes = tfOrientacoes;
	}

	public PopupDateField getPdfInicioValidade() {
		return pdfInicioValidade;
	}

	public void setPdfInicioValidade(PopupDateField pdfInicioValidade) {
		this.pdfInicioValidade = pdfInicioValidade;
	}

	public PopupDateField getPdfFimValidade() {
		return pdfFimValidade;
	}

	public void setPdfFimValidade(PopupDateField pdfFimValidade) {
		this.pdfFimValidade = pdfFimValidade;
	}

	public TextField getTfTipo() {
		return tfTipo;
	}

	public void setTfTipo(TextField tfTipo) {
		this.tfTipo = tfTipo;
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

		// tfCodCtaRef
		tfCodCtaRef = new TextField();
		tfCodCtaRef.setCaption("tfCodCtaRef:");
		tfCodCtaRef.setImmediate(false);
		tfCodCtaRef.setWidth("175px");
		tfCodCtaRef.setHeight("-1px");
		tfCodCtaRef.setSizeFull();
		tfCodCtaRef.setNullRepresentation("");
		gridLayout_1.addComponent(tfCodCtaRef, 0, 1);

		// tfDescricao
		tfDescricao = new TextField();
		tfDescricao.setCaption("tfDescricao:");
		tfDescricao.setImmediate(false);
		tfDescricao.setWidth("175px");
		tfDescricao.setHeight("-1px");
		tfDescricao.setSizeFull();
		tfDescricao.setNullRepresentation("");
		gridLayout_1.addComponent(tfDescricao, 1, 1);

		// tfOrientacoes
		tfOrientacoes = new TextField();
		tfOrientacoes.setCaption("tfOrientacoes:");
		tfOrientacoes.setImmediate(false);
		tfOrientacoes.setWidth("175px");
		tfOrientacoes.setHeight("-1px");
		tfOrientacoes.setSizeFull();
		tfOrientacoes.setNullRepresentation("");
		gridLayout_1.addComponent(tfOrientacoes, 0, 2);

		// pdfInicioValidade
		pdfInicioValidade = new PopupDateField();
		pdfInicioValidade.setCaption("pdfInicioValidade:");
		pdfInicioValidade.setImmediate(false);
		pdfInicioValidade.setWidth("175px");
		pdfInicioValidade.setHeight("-1px");
		pdfInicioValidade.setSizeFull();
		gridLayout_1.addComponent(pdfInicioValidade, 1, 2);

		// pdfFimValidade
		pdfFimValidade = new PopupDateField();
		pdfFimValidade.setCaption("pdfFimValidade:");
		pdfFimValidade.setImmediate(false);
		pdfFimValidade.setWidth("175px");
		pdfFimValidade.setHeight("-1px");
		pdfFimValidade.setSizeFull();
		gridLayout_1.addComponent(pdfFimValidade, 0, 3);

		// tfTipo
		tfTipo = new TextField();
		tfTipo.setCaption("tfTipo:");
		tfTipo.setImmediate(false);
		tfTipo.setWidth("175px");
		tfTipo.setHeight("-1px");
		tfTipo.setSizeFull();
		tfTipo.setNullRepresentation("");
		gridLayout_1.addComponent(tfTipo, 1, 3);

		return gridLayout_1;
	}

}
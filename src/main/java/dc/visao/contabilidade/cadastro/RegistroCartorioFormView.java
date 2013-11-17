package dc.visao.contabilidade.cadastro;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import dc.controller.contabilidade.cadastro.RegistroCartorioFormController;

public class RegistroCartorioFormView extends CustomComponent {

	@AutoGenerated
	private VerticalLayout mainLayout;

	@AutoGenerated
	private Panel panel_1;

	@AutoGenerated
	private VerticalLayout verticalLayout_2;

	@AutoGenerated
	private GridLayout gridLayout_1;

	@AutoGenerated
	private TextField tfNomeCartorio;

	@AutoGenerated
	private PopupDateField pdfDataRegistro;

	@AutoGenerated
	private TextField tfNumero;

	@AutoGenerated
	private TextField tfFolha;

	@AutoGenerated
	private TextField tfLivro;

	@AutoGenerated
	private TextField tfNire;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	private RegistroCartorioFormController controller;

	public RegistroCartorioFormView(
			final RegistroCartorioFormController controller) {
		this.controller = controller;

		buildMainLayout();
		setCompositionRoot(this.mainLayout);
	}

	public TextField getTfNomeCartorio() {
		return tfNomeCartorio;
	}

	public void setTfNomeCartorio(TextField tfNomeCartorio) {
		this.tfNomeCartorio = tfNomeCartorio;
	}

	public PopupDateField getPdfDataRegistro() {
		return pdfDataRegistro;
	}

	public void setPdfDataRegistro(PopupDateField pdfDataRegistro) {
		this.pdfDataRegistro = pdfDataRegistro;
	}

	public TextField getTfNumero() {
		return tfNumero;
	}

	public void setTfNumero(TextField tfNumero) {
		this.tfNumero = tfNumero;
	}

	public TextField getTfFolha() {
		return tfFolha;
	}

	public void setTfFolha(TextField tfFolha) {
		this.tfFolha = tfFolha;
	}

	public TextField getTfLivro() {
		return tfLivro;
	}

	public void setTfLivro(TextField tfLivro) {
		this.tfLivro = tfLivro;
	}

	public TextField getTfNire() {
		return tfNire;
	}

	public void setTfNire(TextField tfNire) {
		this.tfNire = tfNire;
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

		// tfNomeCartorio
		tfNomeCartorio = new TextField();
		tfNomeCartorio.setCaption("Nome do cartório:");
		tfNomeCartorio.setImmediate(false);
		tfNomeCartorio.setWidth("175px");
		tfNomeCartorio.setHeight("-1px");
		tfNomeCartorio.setSizeFull();
		tfNomeCartorio.setNullRepresentation("");
		gridLayout_1.addComponent(tfNomeCartorio, 0, 1);

		// pdfDataRegistro
		pdfDataRegistro = new PopupDateField();
		pdfDataRegistro.setCaption("Data de registro:");
		pdfDataRegistro.setImmediate(false);
		pdfDataRegistro.setWidth("175px");
		pdfDataRegistro.setHeight("-1px");
		pdfDataRegistro.setSizeFull();
		gridLayout_1.addComponent(pdfDataRegistro, 1, 1);

		// tfNumero
		tfNumero = new TextField();
		tfNumero.setCaption("Número:");
		tfNumero.setImmediate(false);
		tfNumero.setWidth("175px");
		tfNumero.setHeight("-1px");
		tfNumero.setSizeFull();
		tfNumero.setNullRepresentation("");
		gridLayout_1.addComponent(tfNumero, 0, 2);

		// tfFolha
		tfFolha = new TextField();
		tfFolha.setCaption("Folha:");
		tfFolha.setImmediate(false);
		tfFolha.setWidth("175px");
		tfFolha.setHeight("-1px");
		tfFolha.setSizeFull();
		tfFolha.setNullRepresentation("");
		gridLayout_1.addComponent(tfFolha, 1, 2);

		// tfLivro
		tfLivro = new TextField();
		tfLivro.setCaption("Livro:");
		tfLivro.setImmediate(false);
		tfLivro.setWidth("175px");
		tfLivro.setHeight("-1px");
		tfLivro.setSizeFull();
		tfLivro.setNullRepresentation("");
		gridLayout_1.addComponent(tfLivro, 0, 3);

		// tfNire
		tfNire = new TextField();
		tfNire.setCaption("Nire:");
		tfNire.setImmediate(false);
		tfNire.setWidth("175px");
		tfNire.setHeight("-1px");
		tfNire.setSizeFull();
		tfNire.setNullRepresentation("");
		gridLayout_1.addComponent(tfNire, 1, 3);

		return gridLayout_1;
	}

}
package dc.visao.contabilidade.livrocontabil;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import dc.controller.contabilidade.livrocontabil.TermoFormController;

public class TermoFormView extends CustomComponent {

	@AutoGenerated
	private VerticalLayout mainLayout;

	@AutoGenerated
	private Panel panel_1;

	@AutoGenerated
	private VerticalLayout verticalLayout_2;

	@AutoGenerated
	private GridLayout gridLayout_1;

	@AutoGenerated
	private TextField tfAberturaEncerramento;

	@AutoGenerated
	private TextField tfNumero;

	@AutoGenerated
	private TextField tfPaginaInicial;

	@AutoGenerated
	private TextField tfPaginaFinal;

	@AutoGenerated
	private TextField tfRegistrado;

	@AutoGenerated
	private TextField tfNumeroRegistro;

	@AutoGenerated
	private PopupDateField pdfDataDespacho;

	@AutoGenerated
	private PopupDateField pdfDataAbertura;

	@AutoGenerated
	private PopupDateField pdfDataEncerramento;

	@AutoGenerated
	private PopupDateField pdfEscrituracaoInicio;

	@AutoGenerated
	private PopupDateField pdfEscrituracaoFim;

	@AutoGenerated
	private TextField tfTexto;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	private TermoFormController controller;

	public TermoFormView(final TermoFormController controller) {
		this.controller = controller;

		buildMainLayout();
		setCompositionRoot(this.mainLayout);
	}

	/**
	 * GETS E SETS
	 */

	public TextField getTfAberturaEncerramento() {
		return tfAberturaEncerramento;
	}

	public void setTfAberturaEncerramento(TextField tfAberturaEncerramento) {
		this.tfAberturaEncerramento = tfAberturaEncerramento;
	}

	public TextField getTfNumero() {
		return tfNumero;
	}

	public void setTfNumero(TextField tfNumero) {
		this.tfNumero = tfNumero;
	}

	public TextField getTfPaginaInicial() {
		return tfPaginaInicial;
	}

	public void setTfPaginaInicial(TextField tfPaginaInicial) {
		this.tfPaginaInicial = tfPaginaInicial;
	}

	public TextField getTfPaginaFinal() {
		return tfPaginaFinal;
	}

	public void setTfPaginaFinal(TextField tfPaginaFinal) {
		this.tfPaginaFinal = tfPaginaFinal;
	}

	public TextField getTfRegistrado() {
		return tfRegistrado;
	}

	public void setTfRegistrado(TextField tfRegistrado) {
		this.tfRegistrado = tfRegistrado;
	}

	public TextField getTfNumeroRegistro() {
		return tfNumeroRegistro;
	}

	public void setTfNumeroRegistro(TextField tfNumeroRegistro) {
		this.tfNumeroRegistro = tfNumeroRegistro;
	}

	public PopupDateField getPdfDataDespacho() {
		return pdfDataDespacho;
	}

	public void setPdfDataDespacho(PopupDateField pdfDataDespacho) {
		this.pdfDataDespacho = pdfDataDespacho;
	}

	public PopupDateField getPdfDataAbertura() {
		return pdfDataAbertura;
	}

	public void setPdfDataAbertura(PopupDateField pdfDataAbertura) {
		this.pdfDataAbertura = pdfDataAbertura;
	}

	public PopupDateField getPdfDataEncerramento() {
		return pdfDataEncerramento;
	}

	public void setPdfDataEncerramento(PopupDateField pdfDataEncerramento) {
		this.pdfDataEncerramento = pdfDataEncerramento;
	}

	public PopupDateField getPdfEscrituracaoInicio() {
		return pdfEscrituracaoInicio;
	}

	public void setPdfEscrituracaoInicio(PopupDateField pdfEscrituracaoInicio) {
		this.pdfEscrituracaoInicio = pdfEscrituracaoInicio;
	}

	public PopupDateField getPdfEscrituracaoFim() {
		return pdfEscrituracaoFim;
	}

	public void setPdfEscrituracaoFim(PopupDateField pdfEscrituracaoFim) {
		this.pdfEscrituracaoFim = pdfEscrituracaoFim;
	}

	public TextField getTfTexto() {
		return tfTexto;
	}

	public void setTfTexto(TextField tfTexto) {
		this.tfTexto = tfTexto;
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

		tfAberturaEncerramento = new TextField();
		tfAberturaEncerramento.setCaption("Abertura encerramento:");
		tfAberturaEncerramento.setImmediate(false);
		tfAberturaEncerramento.setWidth("175px");
		tfAberturaEncerramento.setHeight("-1px");
		tfAberturaEncerramento.setSizeFull();
		tfAberturaEncerramento.setNullRepresentation("");
		gridLayout_1.addComponent(tfAberturaEncerramento, 0, 1);

		// tfNumero
		tfNumero = new TextField();
		tfNumero.setCaption("Número:");
		tfNumero.setImmediate(false);
		tfNumero.setWidth("175px");
		tfNumero.setHeight("-1px");
		tfNumero.setSizeFull();
		tfNumero.setNullRepresentation("");
		gridLayout_1.addComponent(tfNumero, 1, 1);

		// tfPaginaInicial
		tfPaginaInicial = new TextField();
		tfPaginaInicial.setCaption("Página inicial:");
		tfPaginaInicial.setImmediate(false);
		tfPaginaInicial.setWidth("175px");
		tfPaginaInicial.setHeight("-1px");
		tfPaginaInicial.setSizeFull();
		tfPaginaInicial.setNullRepresentation("");
		gridLayout_1.addComponent(tfPaginaInicial, 0, 2);

		// tfPaginaFinal
		tfPaginaFinal = new TextField();
		tfPaginaFinal.setCaption("Página final:");
		tfPaginaFinal.setImmediate(false);
		tfPaginaFinal.setWidth("175px");
		tfPaginaFinal.setHeight("-1px");
		tfPaginaFinal.setSizeFull();
		tfPaginaFinal.setNullRepresentation("");
		gridLayout_1.addComponent(tfPaginaFinal, 1, 2);

		// tfRegistrado
		tfRegistrado = new TextField();
		tfRegistrado.setCaption("Registrado:");
		tfRegistrado.setImmediate(false);
		tfRegistrado.setWidth("175px");
		tfRegistrado.setHeight("-1px");
		tfRegistrado.setSizeFull();
		tfRegistrado.setNullRepresentation("");
		gridLayout_1.addComponent(tfRegistrado, 0, 3);

		// tfNumeroRegistro
		tfNumeroRegistro = new TextField();
		tfNumeroRegistro.setCaption("Número do registro:");
		tfNumeroRegistro.setImmediate(false);
		tfNumeroRegistro.setWidth("175px");
		tfNumeroRegistro.setHeight("-1px");
		tfNumeroRegistro.setSizeFull();
		tfNumeroRegistro.setNullRepresentation("");
		gridLayout_1.addComponent(tfNumeroRegistro, 1, 3);

		// pdfDataDespacho
		pdfDataDespacho = new PopupDateField();
		pdfDataDespacho.setCaption("Data do despacho:");
		pdfDataDespacho.setImmediate(false);
		pdfDataDespacho.setWidth("175px");
		pdfDataDespacho.setHeight("-1px");
		pdfDataDespacho.setSizeFull();
		gridLayout_1.addComponent(pdfDataDespacho, 0, 4);

		// pdfDataAbertura
		pdfDataAbertura = new PopupDateField();
		pdfDataAbertura.setCaption("Data de abertura:");
		pdfDataAbertura.setImmediate(false);
		pdfDataAbertura.setWidth("175px");
		pdfDataAbertura.setHeight("-1px");
		pdfDataAbertura.setSizeFull();
		gridLayout_1.addComponent(pdfDataAbertura, 1, 4);

		// pdfDataEncerramento
		pdfDataEncerramento = new PopupDateField();
		pdfDataEncerramento.setCaption("Data de encerramento:");
		pdfDataEncerramento.setImmediate(false);
		pdfDataEncerramento.setWidth("175px");
		pdfDataEncerramento.setHeight("-1px");
		pdfDataEncerramento.setSizeFull();
		gridLayout_1.addComponent(pdfDataEncerramento, 0, 5);

		// pdfEscrituracaoInicio
		pdfEscrituracaoInicio = new PopupDateField();
		pdfEscrituracaoInicio.setCaption("Escrituração início:");
		pdfEscrituracaoInicio.setImmediate(false);
		pdfEscrituracaoInicio.setWidth("175px");
		pdfEscrituracaoInicio.setHeight("-1px");
		pdfEscrituracaoInicio.setSizeFull();
		gridLayout_1.addComponent(pdfEscrituracaoInicio, 1, 5);

		// pdfEscrituracaoFim
		pdfEscrituracaoFim = new PopupDateField();
		pdfEscrituracaoFim.setCaption("Escrituração término:");
		pdfEscrituracaoFim.setImmediate(false);
		pdfEscrituracaoFim.setWidth("175px");
		pdfEscrituracaoFim.setHeight("-1px");
		pdfEscrituracaoFim.setSizeFull();
		gridLayout_1.addComponent(pdfEscrituracaoFim, 0, 6);

		// tfTexto
		tfTexto = new TextField();
		tfTexto.setCaption("Texto:");
		tfTexto.setImmediate(false);
		tfTexto.setWidth("175px");
		tfTexto.setHeight("-1px");
		tfTexto.setSizeFull();
		tfTexto.setNullRepresentation("");
		gridLayout_1.addComponent(tfTexto, 1, 6);

		return gridLayout_1;
	}

}
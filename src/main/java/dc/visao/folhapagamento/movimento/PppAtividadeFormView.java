package dc.visao.folhapagamento.movimento;

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

import dc.controller.folhapagamento.movimento.PppAtividadeFormController;
import dc.entidade.folhapagamento.movimento.PppEntity;

public class PppAtividadeFormView extends CustomComponent {

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
	private PopupDateField pdfDataTermino;

	@AutoGenerated
	private TextField tfDescricao;

	@AutoGenerated
	private ComboBox cbPpp;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	private PppAtividadeFormController controller;

	public PppAtividadeFormView(final PppAtividadeFormController controller) {
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

	public PopupDateField getPdfDataTermino() {
		return pdfDataTermino;
	}

	public void setPdfDataTermino(PopupDateField pdfDataTermino) {
		this.pdfDataTermino = pdfDataTermino;
	}

	public TextField getTfDescricao() {
		return tfDescricao;
	}

	public void setTfDescricao(TextField tfDescricao) {
		this.tfDescricao = tfDescricao;
	}

	public ComboBox getCbPpp() {
		return cbPpp;
	}

	public void setCbPpp(ComboBox cbPpp) {
		this.cbPpp = cbPpp;
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
		gridLayout_1.setHeight("100.0%");
		gridLayout_1.setMargin(false);
		gridLayout_1.setRows(20);
		gridLayout_1.setColumns(3);

		// pdfDataInicio
		pdfDataInicio = new PopupDateField();
		pdfDataInicio.setCaption("Data do início:");
		pdfDataInicio.setImmediate(false);
		pdfDataInicio.setWidth("-1px");
		pdfDataInicio.setHeight("-1px");
		gridLayout_1.addComponent(pdfDataInicio, 0, 1);

		// pdfDataTermino
		pdfDataTermino = new PopupDateField();
		pdfDataTermino.setCaption("Data do término:");
		pdfDataTermino.setImmediate(false);
		pdfDataTermino.setWidth("-1px");
		pdfDataTermino.setHeight("-1px");
		gridLayout_1.addComponent(pdfDataTermino, 1, 1);

		// tfDescricao
		tfDescricao = new TextField();
		tfDescricao.setCaption("Descrição:");
		tfDescricao.setImmediate(false);
		tfDescricao.setWidth("175px");
		tfDescricao.setHeight("-1px");
		gridLayout_1.addComponent(tfDescricao, 0, 2);

		// cbPpp
		cbPpp = new ComboBox();
		cbPpp.setCaption("PPP");
		cbPpp.setImmediate(false);
		cbPpp.setWidth("-1px");
		cbPpp.setHeight("-1px");
		gridLayout_1.addComponent(cbPpp, 1, 2);

		return gridLayout_1;
	}

	/**
	 * COMBOS
	 */

	public void carregarCmbPpp(List<PppEntity> lista) {
		BeanItemContainer<PppEntity> bic = new BeanItemContainer<PppEntity>(
				PppEntity.class, lista);
		this.cbPpp.setContainerDataSource(bic);
		this.cbPpp.setItemCaptionPropertyId("observacao");
	}

}
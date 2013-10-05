package dc.visao.folhapagamento.movimento;

import java.util.List;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import dc.controller.folhapagamento.movimento.PppFormController;
import dc.entidade.pessoal.Colaborador;

public class PppFormView extends CustomComponent {

	@AutoGenerated
	private VerticalLayout mainLayout;

	@AutoGenerated
	private Panel panel_1;

	@AutoGenerated
	private VerticalLayout verticalLayout_2;

	@AutoGenerated
	private GridLayout gridLayout_1;

	@AutoGenerated
	private TextField tfObservacao;

	@AutoGenerated
	private ComboBox cbColaborador;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	private PppFormController controller;

	public PppFormView(final PppFormController controller) {
		this.controller = controller;

		buildMainLayout();
		setCompositionRoot(this.mainLayout);
	}

	public TextField getTfObservacao() {
		return tfObservacao;
	}

	public void setTfObservacao(TextField tfObservacao) {
		this.tfObservacao = tfObservacao;
	}

	public ComboBox getCbColaborador() {
		return cbColaborador;
	}

	public void setCbColaborador(ComboBox cbColaborador) {
		this.cbColaborador = cbColaborador;
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
		// gridLayout_1.setHeight("100.0%");
		gridLayout_1.setMargin(false);
		gridLayout_1.setSpacing(true);
		gridLayout_1.setRows(20);
		gridLayout_1.setColumns(3);

		// tfObservacao
		tfObservacao = new TextField();
		tfObservacao.setCaption("Observação:");
		tfObservacao.setImmediate(false);
		tfObservacao.setWidth("175px");
		tfObservacao.setHeight("-1px");
		gridLayout_1.addComponent(tfObservacao, 0, 1);

		// cbColaborador
		cbColaborador = new ComboBox();
		cbColaborador.setCaption("Colaborador:");
		cbColaborador.setImmediate(false);
		cbColaborador.setWidth("-1px");
		cbColaborador.setHeight("-1px");
		gridLayout_1.addComponent(cbColaborador, 1, 1);

		return gridLayout_1;
	}

	/**
	 * COMBOS
	 */

	public void carregarCmbColaborador(List<Colaborador> lista) {
		BeanItemContainer<Colaborador> bic = new BeanItemContainer<Colaborador>(
				Colaborador.class, lista);
		this.cbColaborador.setContainerDataSource(bic);
		this.cbColaborador.setItemCaptionPropertyId("matricula");
	}

}
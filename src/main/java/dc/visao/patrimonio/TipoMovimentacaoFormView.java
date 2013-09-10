package dc.visao.patrimonio;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import dc.controller.patrimonio.TipoMovimentacaoFormController;

/**
 * 
 * @author Gutemberg A. Da Silva
 * 
 */

public class TipoMovimentacaoFormView extends CustomComponent {

	@AutoGenerated
	private VerticalLayout mainLayout;

	@AutoGenerated
	private Panel panel_1;

	@AutoGenerated
	private VerticalLayout verticalLayout_2;

	@AutoGenerated
	private AbsoluteLayout absoluteLayout_2;

	@AutoGenerated
	private TextField tfDescricao;

	@AutoGenerated
	private TextField tfNome;

	@AutoGenerated
	private TextField tfTipo;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	private TipoMovimentacaoFormController controller;

	public TipoMovimentacaoFormView(
			final TipoMovimentacaoFormController controller) {
		this.controller = controller;

		buildMainLayout();
		setCompositionRoot(this.mainLayout);
	}

	public TextField getTfTipo() {
		return tfTipo;
	}

	public void setTfTipo(TextField tfTipo) {
		this.tfTipo = tfTipo;
	}

	public TextField getTfNome() {
		return tfNome;
	}

	public void setTfNome(TextField tfNome) {
		this.tfNome = tfNome;
	}

	public TextField getTfDescricao() {
		return tfDescricao;
	}

	public void setTfDescricao(TextField tfDescricao) {
		this.tfDescricao = tfDescricao;
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

		// absoluteLayout_2
		absoluteLayout_2 = buildAbsoluteLayout_2();
		verticalLayout_2.addComponent(absoluteLayout_2);

		return verticalLayout_2;
	}

	@AutoGenerated
	private AbsoluteLayout buildAbsoluteLayout_2() {
		// common part: create layout
		absoluteLayout_2 = new AbsoluteLayout();
		absoluteLayout_2.setImmediate(false);
		absoluteLayout_2.setWidth("100.0%");
		absoluteLayout_2.setHeight("1300px");

		// tfTipo
		tfTipo = new TextField();
		tfTipo.setCaption("Tipo:");
		tfTipo.setNullRepresentation("");
		tfTipo.setImmediate(true);
		tfTipo.setWidth("160px");
		tfTipo.setHeight("-1px");
		absoluteLayout_2.addComponent(tfTipo, "top:100.0px;left:22.0px;");

		// tfNome
		tfNome = new TextField();
		tfNome.setCaption("Nome:");
		tfNome.setNullRepresentation("");
		tfNome.setImmediate(false);
		tfNome.setWidth("160px");
		tfNome.setHeight("-1px");
		absoluteLayout_2.addComponent(tfNome, "top:100.0px;left:230.0px;");

		// tfDescricao
		tfDescricao = new TextField();
		tfDescricao.setCaption("Descrição:");
		tfDescricao.setNullRepresentation("");
		tfDescricao.setImmediate(false);
		tfDescricao.setWidth("160px");
		tfDescricao.setHeight("-1px");
		absoluteLayout_2.addComponent(tfDescricao, "top:150.0px;left:22.0px;");

		return absoluteLayout_2;
	}

}
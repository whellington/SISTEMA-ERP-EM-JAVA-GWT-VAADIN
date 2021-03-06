package dc.visao.contabilidade.demonstrativo;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

import dc.controller.contabilidade.demonstrativo.DreVinculoFormController;
import dc.entidade.contabilidade.demonstrativo.DreDetalheEntity;
import dc.entidade.contabilidade.planoconta.ContaEntity;
import dc.visao.framework.component.manytoonecombo.ManyToOneCombo;

public class DreVinculoFormView extends CustomComponent {

	@AutoGenerated
	private VerticalLayout mainLayout;

	@AutoGenerated
	private Panel panel_1;

	@AutoGenerated
	private VerticalLayout verticalLayout_2;

	@AutoGenerated
	private GridLayout gridLayout_1;

	@AutoGenerated
	private ManyToOneCombo<DreDetalheEntity> cbDreDetalhe;

	@AutoGenerated
	private ManyToOneCombo<ContaEntity> cbConta;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	private DreVinculoFormController controller;

	public DreVinculoFormView(final DreVinculoFormController controller) {
		this.controller = controller;

		buildMainLayout();
		setCompositionRoot(this.mainLayout);
	}

	public ManyToOneCombo<DreDetalheEntity> getCbDreDetalhe() {
		return cbDreDetalhe;
	}

	public void setCbDreDetalhe(ManyToOneCombo<DreDetalheEntity> cbDreDetalhe) {
		this.cbDreDetalhe = cbDreDetalhe;
	}

	public ManyToOneCombo<ContaEntity> getCbConta() {
		return cbConta;
	}

	public void setCbConta(ManyToOneCombo<ContaEntity> cbConta) {
		this.cbConta = cbConta;
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

		// cbDreDetalhe
		cbDreDetalhe = new ManyToOneCombo<>();
		cbDreDetalhe.setCaption("DRE detalhe:");
		cbDreDetalhe.setImmediate(false);
		cbDreDetalhe.setWidth("175px");
		cbDreDetalhe.setHeight("-1px");
		cbDreDetalhe.setSizeFull();
		gridLayout_1.addComponent(cbDreDetalhe, 0, 1);

		// cbConta
		cbConta = new ManyToOneCombo<>();
		cbConta.setCaption("Conta:");
		cbConta.setImmediate(false);
		cbConta.setWidth("175px");
		cbConta.setHeight("-1px");
		cbConta.setSizeFull();
		gridLayout_1.addComponent(cbConta, 1, 1);

		return gridLayout_1;
	}

}
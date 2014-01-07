package dc.visao.nfe;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.Table;
import com.vaadin.ui.VerticalLayout;

/**
 * 
 * @author Gutemberg A. Da Silva
 * 
 */

public class ProdutoServicoFormView extends CustomComponent {

	@AutoGenerated
	private VerticalLayout mainLayout;

	@AutoGenerated
	private Panel panel_1;

	@AutoGenerated
	private VerticalLayout verticalLayout_2;

	@AutoGenerated
	private Panel panel_3;

	@AutoGenerated
	private VerticalLayout verticalLayout_4;

	@AutoGenerated
	private TabSheet tabSheet_1;

	@AutoGenerated
	private TabSheet tabSheet_12;

	@AutoGenerated
	private TabSheet tabSheet_11;

	@AutoGenerated
	private TabSheet tabSheet_10;

	@AutoGenerated
	private TabSheet tabSheet_9;

	@AutoGenerated
	private TabSheet tabSheet_8;

	@AutoGenerated
	private TabSheet tabSheet_7;

	@AutoGenerated
	private TabSheet tabSheet_6;

	@AutoGenerated
	private TabSheet tabSheet_5;

	@AutoGenerated
	private TabSheet tabSheet_4;

	@AutoGenerated
	private TabSheet tabSheet_3;

	@AutoGenerated
	private TabSheet tabSheet_2;

	@AutoGenerated
	private Panel panel_2;

	@AutoGenerated
	private VerticalLayout verticalLayout_3;

	@AutoGenerated
	private TabSheet tabSheet_13;

	@AutoGenerated
	private TabSheet tabSheet_15;

	@AutoGenerated
	private TabSheet tabSheet_14;

	@AutoGenerated
	private Table table_1;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	// private DepreciacaoBemFormController controller;

	public ProdutoServicoFormView() {
		// this.controller = controller;

		buildMainLayout();
		setCompositionRoot(this.mainLayout);
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
		
		// panel_2
		panel_2 = buildPanel_2();
		verticalLayout_2.addComponent(panel_2);
		
		// panel_3
		panel_3 = buildPanel_3();
		verticalLayout_2.addComponent(panel_3);
		
		return verticalLayout_2;
	}

	@AutoGenerated
	private Panel buildPanel_2() {
		// common part: create layout
		panel_2 = new Panel();
		panel_2.setImmediate(false);
		panel_2.setWidth("100.0%");
		panel_2.setHeight("100.0%");
		
		// verticalLayout_3
		verticalLayout_3 = buildVerticalLayout_3();
		panel_2.setContent(verticalLayout_3);
		
		return panel_2;
	}

	@AutoGenerated
	private VerticalLayout buildVerticalLayout_3() {
		// common part: create layout
		verticalLayout_3 = new VerticalLayout();
		verticalLayout_3.setImmediate(false);
		verticalLayout_3.setWidth("100.0%");
		verticalLayout_3.setHeight("100.0%");
		verticalLayout_3.setMargin(false);
		
		// table_1
		table_1 = new Table();
		table_1.setImmediate(false);
		table_1.setWidth("100.0%");
		table_1.setHeight("100.0%");
		verticalLayout_3.addComponent(table_1);
		
		// tabSheet_13
		tabSheet_13 = buildTabSheet_13();
		verticalLayout_3.addComponent(tabSheet_13);
		
		return verticalLayout_3;
	}

	@AutoGenerated
	private TabSheet buildTabSheet_13() {
		// common part: create layout
		tabSheet_13 = new TabSheet();
		tabSheet_13.setImmediate(true);
		tabSheet_13.setWidth("100.0%");
		tabSheet_13.setHeight("100.0%");
		
		// tabSheet_14
		tabSheet_14 = new TabSheet();
		tabSheet_14.setImmediate(false);
		tabSheet_14.setWidth("100.0%");
		tabSheet_14.setHeight("100.0%");
		tabSheet_13.addTab(tabSheet_14, "Total geral", null);
		
		// tabSheet_15
		tabSheet_15 = new TabSheet();
		tabSheet_15.setImmediate(false);
		tabSheet_15.setWidth("100.0%");
		tabSheet_15.setHeight("100.0%");
		tabSheet_13.addTab(tabSheet_15, "Outros totais", null);
		
		return tabSheet_13;
	}

	@AutoGenerated
	private Panel buildPanel_3() {
		// common part: create layout
		panel_3 = new Panel();
		panel_3.setImmediate(false);
		panel_3.setWidth("100.0%");
		panel_3.setHeight("100.0%");
		
		// verticalLayout_4
		verticalLayout_4 = buildVerticalLayout_4();
		panel_3.setContent(verticalLayout_4);
		
		return panel_3;
	}

	@AutoGenerated
	private VerticalLayout buildVerticalLayout_4() {
		// common part: create layout
		verticalLayout_4 = new VerticalLayout();
		verticalLayout_4.setImmediate(false);
		verticalLayout_4.setWidth("100.0%");
		verticalLayout_4.setHeight("100.0%");
		verticalLayout_4.setMargin(false);
		
		// tabSheet_1
		tabSheet_1 = buildTabSheet_1();
		verticalLayout_4.addComponent(tabSheet_1);
		
		return verticalLayout_4;
	}

	@AutoGenerated
	private TabSheet buildTabSheet_1() {
		// common part: create layout
		tabSheet_1 = new TabSheet();
		tabSheet_1.setImmediate(true);
		tabSheet_1.setWidth("100.0%");
		tabSheet_1.setHeight("100.0%");
		
		// tabSheet_2
		tabSheet_2 = new TabSheet();
		tabSheet_2.setImmediate(false);
		tabSheet_2.setWidth("100.0%");
		tabSheet_2.setHeight("100.0%");
		tabSheet_1.addTab(tabSheet_2, "ICMS", null);
		
		// tabSheet_3
		tabSheet_3 = new TabSheet();
		tabSheet_3.setImmediate(false);
		tabSheet_3.setWidth("100.0%");
		tabSheet_3.setHeight("100.0%");
		tabSheet_1.addTab(tabSheet_3, "PIS", null);
		
		// tabSheet_4
		tabSheet_4 = new TabSheet();
		tabSheet_4.setImmediate(false);
		tabSheet_4.setWidth("100.0%");
		tabSheet_4.setHeight("100.0%");
		tabSheet_1.addTab(tabSheet_4, "COFINS", null);
		
		// tabSheet_5
		tabSheet_5 = new TabSheet();
		tabSheet_5.setImmediate(false);
		tabSheet_5.setWidth("100.0%");
		tabSheet_5.setHeight("100.0%");
		tabSheet_1.addTab(tabSheet_5, "IPI", null);
		
		// tabSheet_6
		tabSheet_6 = new TabSheet();
		tabSheet_6.setImmediate(false);
		tabSheet_6.setWidth("100.0%");
		tabSheet_6.setHeight("100.0%");
		tabSheet_1.addTab(tabSheet_6, "Imposto importação", null);
		
		// tabSheet_7
		tabSheet_7 = new TabSheet();
		tabSheet_7.setImmediate(false);
		tabSheet_7.setWidth("100.0%");
		tabSheet_7.setHeight("100.0%");
		tabSheet_1.addTab(tabSheet_7, "ISSQN", null);
		
		// tabSheet_8
		tabSheet_8 = new TabSheet();
		tabSheet_8.setImmediate(false);
		tabSheet_8.setWidth("100.0%");
		tabSheet_8.setHeight("100.0%");
		tabSheet_1.addTab(tabSheet_8, "Combustível", null);
		
		// tabSheet_9
		tabSheet_9 = new TabSheet();
		tabSheet_9.setImmediate(false);
		tabSheet_9.setWidth("100.0%");
		tabSheet_9.setHeight("100.0%");
		tabSheet_1.addTab(tabSheet_9, "Veículo", null);
		
		// tabSheet_10
		tabSheet_10 = new TabSheet();
		tabSheet_10.setImmediate(false);
		tabSheet_10.setWidth("100.0%");
		tabSheet_10.setHeight("100.0%");
		tabSheet_1.addTab(tabSheet_10, "Medicamento", null);
		
		// tabSheet_11
		tabSheet_11 = new TabSheet();
		tabSheet_11.setImmediate(false);
		tabSheet_11.setWidth("100.0%");
		tabSheet_11.setHeight("100.0%");
		tabSheet_1.addTab(tabSheet_11, "Armamento", null);
		
		// tabSheet_12
		tabSheet_12 = new TabSheet();
		tabSheet_12.setImmediate(false);
		tabSheet_12.setWidth("100.0%");
		tabSheet_12.setHeight("100.0%");
		tabSheet_1.addTab(tabSheet_12, "Declaração importação", null);
		
		return tabSheet_1;
	}

}
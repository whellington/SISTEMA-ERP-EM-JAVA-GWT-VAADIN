package dc.visao.nfe;

import java.util.List;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.data.Container;
import com.vaadin.ui.Component;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Field;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.Table;
import com.vaadin.ui.TableFieldFactory;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import dc.controller.nfe.ProdutoServicoFormController;
import dc.entidade.contabilidade.livrocontabil.LivroEntity;
import dc.visao.framework.component.SubFormComponent;

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
	private GridLayout gridLayout_3;

	@AutoGenerated
	private TextField textField_13;

	@AutoGenerated
	private GridLayout gridLayout_2;

	@AutoGenerated
	private TextField textField_12;

	@AutoGenerated
	private GridLayout gridLayout_1;

	@AutoGenerated
	private TextField textField_11;

	@AutoGenerated
	private GridLayout gridLayout_21;

	@AutoGenerated
	private TextField textField_10;

	@AutoGenerated
	private GridLayout gridLayout_19;

	@AutoGenerated
	private TextField textField_8;

	@AutoGenerated
	private GridLayout gridLayout_20;

	@AutoGenerated
	private TextField textField_9;

	@AutoGenerated
	private GridLayout gridLayout_18;

	@AutoGenerated
	private TextField textField_7;

	@AutoGenerated
	private GridLayout gridLayout_17;

	@AutoGenerated
	private TextField textField_6;

	@AutoGenerated
	private GridLayout gridLayout_16;

	@AutoGenerated
	private TextField textField_5;

	@AutoGenerated
	private GridLayout gridLayout_15;

	@AutoGenerated
	private TextField textField_4;

	@AutoGenerated
	private GridLayout gridLayout_14;

	@AutoGenerated
	private TextField textField_1;

	@AutoGenerated
	private Panel panel_2;

	@AutoGenerated
	private VerticalLayout verticalLayout_3;

	@AutoGenerated
	private TabSheet tabSheet_13;

	@AutoGenerated
	private GridLayout gridLayout_23;

	@AutoGenerated
	private TextField textField_3;

	@AutoGenerated
	private GridLayout gridLayout_22;

	@AutoGenerated
	private TextField textField_2;

	@AutoGenerated
	private Table table_1;

	private SubFormComponent<LivroEntity, Integer> subForm;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	private ProdutoServicoFormController controller;

	public ProdutoServicoFormView(ProdutoServicoFormController controller) {
		this.controller = controller;

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

		verticalLayout_3.addComponent(buildSubForm());

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

		// gridLayout_22
		gridLayout_22 = buildGridLayout_22();
		tabSheet_13.addTab(gridLayout_22, "Total geral", null);

		// gridLayout_23
		gridLayout_23 = buildGridLayout_23();
		tabSheet_13.addTab(gridLayout_23, "Outros totais", null);

		return tabSheet_13;
	}

	@AutoGenerated
	private GridLayout buildGridLayout_22() {
		// common part: create layout
		gridLayout_22 = new GridLayout();
		gridLayout_22.setImmediate(false);
		gridLayout_22.setWidth("100.0%");
		gridLayout_22.setHeight("100.0%");
		gridLayout_22.setMargin(false);

		// textField_2
		textField_2 = new TextField();
		textField_2.setImmediate(false);
		textField_2.setWidth("-1px");
		textField_2.setHeight("-1px");
		gridLayout_22.addComponent(textField_2, 0, 0);

		return gridLayout_22;
	}

	@AutoGenerated
	private GridLayout buildGridLayout_23() {
		// common part: create layout
		gridLayout_23 = new GridLayout();
		gridLayout_23.setImmediate(false);
		gridLayout_23.setWidth("100.0%");
		gridLayout_23.setHeight("100.0%");
		gridLayout_23.setMargin(false);

		// textField_3
		textField_3 = new TextField();
		textField_3.setImmediate(false);
		textField_3.setWidth("-1px");
		textField_3.setHeight("-1px");
		gridLayout_23.addComponent(textField_3, 0, 0);

		return gridLayout_23;
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

		// gridLayout_14
		gridLayout_14 = buildGridLayout_14();
		tabSheet_1.addTab(gridLayout_14, "ICMS", null);

		// gridLayout_15
		gridLayout_15 = buildGridLayout_15();
		tabSheet_1.addTab(gridLayout_15, "PIS", null);

		// gridLayout_16
		gridLayout_16 = buildGridLayout_16();
		tabSheet_1.addTab(gridLayout_16, "COFINS", null);

		// gridLayout_17
		gridLayout_17 = buildGridLayout_17();
		tabSheet_1.addTab(gridLayout_17, "IPI", null);

		// gridLayout_18
		gridLayout_18 = buildGridLayout_18();
		tabSheet_1.addTab(gridLayout_18, "Imposto importação", null);

		// gridLayout_20
		gridLayout_20 = buildGridLayout_20();
		tabSheet_1.addTab(gridLayout_20, "Combustível", null);

		// gridLayout_19
		gridLayout_19 = buildGridLayout_19();
		tabSheet_1.addTab(gridLayout_19, "ISSQN", null);

		// gridLayout_21
		gridLayout_21 = buildGridLayout_21();
		tabSheet_1.addTab(gridLayout_21, "Veículo", null);

		// gridLayout_1
		gridLayout_1 = buildGridLayout_1();
		tabSheet_1.addTab(gridLayout_1, "Medicamentos", null);

		// gridLayout_2
		gridLayout_2 = buildGridLayout_2();
		tabSheet_1.addTab(gridLayout_2, "Armamento", null);

		// gridLayout_3
		gridLayout_3 = buildGridLayout_3();
		tabSheet_1.addTab(gridLayout_3, "Declaração importação", null);

		return tabSheet_1;
	}

	@AutoGenerated
	private GridLayout buildGridLayout_14() {
		// common part: create layout
		gridLayout_14 = new GridLayout();
		gridLayout_14.setImmediate(false);
		gridLayout_14.setWidth("100.0%");
		gridLayout_14.setHeight("100.0%");
		gridLayout_14.setMargin(false);

		// textField_1
		textField_1 = new TextField();
		textField_1.setImmediate(false);
		textField_1.setWidth("-1px");
		textField_1.setHeight("-1px");
		gridLayout_14.addComponent(textField_1, 0, 0);

		return gridLayout_14;
	}

	@AutoGenerated
	private GridLayout buildGridLayout_15() {
		// common part: create layout
		gridLayout_15 = new GridLayout();
		gridLayout_15.setImmediate(false);
		gridLayout_15.setWidth("100.0%");
		gridLayout_15.setHeight("100.0%");
		gridLayout_15.setMargin(false);

		// textField_4
		textField_4 = new TextField();
		textField_4.setImmediate(false);
		textField_4.setWidth("-1px");
		textField_4.setHeight("-1px");
		gridLayout_15.addComponent(textField_4, 0, 0);

		return gridLayout_15;
	}

	@AutoGenerated
	private GridLayout buildGridLayout_16() {
		// common part: create layout
		gridLayout_16 = new GridLayout();
		gridLayout_16.setImmediate(false);
		gridLayout_16.setWidth("100.0%");
		gridLayout_16.setHeight("100.0%");
		gridLayout_16.setMargin(false);

		// textField_5
		textField_5 = new TextField();
		textField_5.setImmediate(false);
		textField_5.setWidth("-1px");
		textField_5.setHeight("-1px");
		gridLayout_16.addComponent(textField_5, 0, 0);

		return gridLayout_16;
	}

	@AutoGenerated
	private GridLayout buildGridLayout_17() {
		// common part: create layout
		gridLayout_17 = new GridLayout();
		gridLayout_17.setImmediate(false);
		gridLayout_17.setWidth("100.0%");
		gridLayout_17.setHeight("100.0%");
		gridLayout_17.setMargin(false);

		// textField_6
		textField_6 = new TextField();
		textField_6.setImmediate(false);
		textField_6.setWidth("-1px");
		textField_6.setHeight("-1px");
		gridLayout_17.addComponent(textField_6, 0, 0);

		return gridLayout_17;
	}

	@AutoGenerated
	private GridLayout buildGridLayout_18() {
		// common part: create layout
		gridLayout_18 = new GridLayout();
		gridLayout_18.setImmediate(false);
		gridLayout_18.setWidth("100.0%");
		gridLayout_18.setHeight("100.0%");
		gridLayout_18.setMargin(false);

		// textField_7
		textField_7 = new TextField();
		textField_7.setImmediate(false);
		textField_7.setWidth("-1px");
		textField_7.setHeight("-1px");
		gridLayout_18.addComponent(textField_7, 0, 0);

		return gridLayout_18;
	}

	@AutoGenerated
	private GridLayout buildGridLayout_20() {
		// common part: create layout
		gridLayout_20 = new GridLayout();
		gridLayout_20.setImmediate(false);
		gridLayout_20.setWidth("100.0%");
		gridLayout_20.setHeight("100.0%");
		gridLayout_20.setMargin(false);

		// textField_9
		textField_9 = new TextField();
		textField_9.setImmediate(false);
		textField_9.setWidth("-1px");
		textField_9.setHeight("-1px");
		gridLayout_20.addComponent(textField_9, 0, 0);

		return gridLayout_20;
	}

	@AutoGenerated
	private GridLayout buildGridLayout_19() {
		// common part: create layout
		gridLayout_19 = new GridLayout();
		gridLayout_19.setImmediate(false);
		gridLayout_19.setWidth("100.0%");
		gridLayout_19.setHeight("100.0%");
		gridLayout_19.setMargin(false);

		// textField_8
		textField_8 = new TextField();
		textField_8.setImmediate(false);
		textField_8.setWidth("-1px");
		textField_8.setHeight("-1px");
		gridLayout_19.addComponent(textField_8, 0, 0);

		return gridLayout_19;
	}

	@AutoGenerated
	private GridLayout buildGridLayout_21() {
		// common part: create layout
		gridLayout_21 = new GridLayout();
		gridLayout_21.setImmediate(false);
		gridLayout_21.setWidth("100.0%");
		gridLayout_21.setHeight("100.0%");
		gridLayout_21.setMargin(false);

		// textField_10
		textField_10 = new TextField();
		textField_10.setImmediate(false);
		textField_10.setWidth("-1px");
		textField_10.setHeight("-1px");
		gridLayout_21.addComponent(textField_10, 0, 0);

		return gridLayout_21;
	}

	@AutoGenerated
	private GridLayout buildGridLayout_1() {
		// common part: create layout
		gridLayout_1 = new GridLayout();
		gridLayout_1.setImmediate(false);
		gridLayout_1.setWidth("100.0%");
		gridLayout_1.setHeight("100.0%");
		gridLayout_1.setMargin(false);

		// textField_11
		textField_11 = new TextField();
		textField_11.setImmediate(false);
		textField_11.setWidth("-1px");
		textField_11.setHeight("-1px");
		gridLayout_1.addComponent(textField_11, 0, 0);

		return gridLayout_1;
	}

	@AutoGenerated
	private GridLayout buildGridLayout_2() {
		// common part: create layout
		gridLayout_2 = new GridLayout();
		gridLayout_2.setImmediate(false);
		gridLayout_2.setWidth("100.0%");
		gridLayout_2.setHeight("100.0%");
		gridLayout_2.setMargin(false);

		// textField_12
		textField_12 = new TextField();
		textField_12.setImmediate(false);
		textField_12.setWidth("-1px");
		textField_12.setHeight("-1px");
		gridLayout_2.addComponent(textField_12, 0, 0);

		return gridLayout_2;
	}

	@AutoGenerated
	private GridLayout buildGridLayout_3() {
		// common part: create layout
		gridLayout_3 = new GridLayout();
		gridLayout_3.setImmediate(false);
		gridLayout_3.setWidth("100.0%");
		gridLayout_3.setHeight("100.0%");
		gridLayout_3.setMargin(false);

		// textField_13
		textField_13 = new TextField();
		textField_13.setImmediate(false);
		textField_13.setWidth("-1px");
		textField_13.setHeight("-1px");
		gridLayout_3.addComponent(textField_13, 0, 0);

		return gridLayout_3;
	}

	/**************/

	private SubFormComponent<LivroEntity, Integer> buildSubForm() {
		// common part: create layout
		subForm = new SubFormComponent<LivroEntity, Integer>(
				LivroEntity.class,
				new String[] { "descricao", "competencia", "formaEscrituracao" },
				new String[] { "Descrição", "Competência",
						"Forma de escrituração" }) {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			protected TableFieldFactory getFieldFactory() {
				return new TableFieldFactory() {

					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					@Override
					public Field<?> createField(Container container,
							Object itemId, Object propertyId,
							Component uiContext) {
						return null;
					}
				};
			}

			@Override
			public boolean validateItems(List<LivroEntity> items) {
				// TODO Auto-generated method stub
				return true;
			}
		};

		return subForm;
	}

	public void preencherSubForm(List<LivroEntity> detalhes) {
		try {
			subForm.fillWith(detalhes);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
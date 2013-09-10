package dc.visao.TelasdosistemaDesenhadas;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class CadastroPessoa extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,13","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":true,"snappingDistance":10} */

	@AutoGenerated
	private VerticalLayout mainLayout;
	@AutoGenerated
	private TabSheet tabSheet_15;
	@AutoGenerated
	private TabSheet tabSheet_21;
	@AutoGenerated
	private TabSheet tabSheet_20;
	@AutoGenerated
	private TabSheet tabSheet_19;
	@AutoGenerated
	private TabSheet tabSheet_18;
	@AutoGenerated
	private TabSheet tabSheet_17;
	@AutoGenerated
	private TabSheet tabSheet_16;
	@AutoGenerated
	private Panel panel_7;
	@AutoGenerated
	private HorizontalLayout horizontalLayout_6;
	@AutoGenerated
	private TextField textField_19;
	@AutoGenerated
	private Panel panel_6;
	@AutoGenerated
	private HorizontalLayout horizontalLayout_5;
	@AutoGenerated
	private TextField textField_17;
	@AutoGenerated
	private TextField textField_16;
	@AutoGenerated
	private Panel panel_1;
	@AutoGenerated
	private VerticalLayout verticalLayout_3;
	@AutoGenerated
	private Panel panel_4;
	@AutoGenerated
	private HorizontalLayout horizontalLayout_4;
	@AutoGenerated
	private ComboBox comboBox_5;
	@AutoGenerated
	private ComboBox comboBox_4;
	@AutoGenerated
	private PopupDateField popupDateField_3;
	@AutoGenerated
	private Panel panel_2;
	@AutoGenerated
	private HorizontalLayout horizontalLayout_2;
	@AutoGenerated
	private PopupDateField popupDateField_2;
	@AutoGenerated
	private TextField textField_4;
	@AutoGenerated
	private TextField textField_3;
	@AutoGenerated
	private TextField textField_2;
	@AutoGenerated
	private Panel panel_5;
	@AutoGenerated
	private HorizontalLayout horizontalLayout_3;
	@AutoGenerated
	private TextField textField_12;
	@AutoGenerated
	private Panel panel_3;
	@AutoGenerated
	private VerticalLayout verticalLayout_6;
	@AutoGenerated
	private ComboBox comboBox_1;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	public CadastroPessoa() {
		buildMainLayout();
		setCompositionRoot(mainLayout);

		// TODO add user code here
	}

	@AutoGenerated
	private VerticalLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new VerticalLayout();
		mainLayout.setImmediate(false);
		//mainLayout.setWidth("750px");
		mainLayout.setHeight("-1px");
		mainLayout.setMargin(true);
		mainLayout.setSpacing(true);
		
		// top-level component properties
		//setWidth("750px");
		setHeight("-1px");
		
		// panel_3
		panel_3 = buildPanel_3();
		mainLayout.addComponent(panel_3);
		
		// panel_5
		panel_5 = buildPanel_5();
		mainLayout.addComponent(panel_5);
		
		// panel_1
		panel_1 = buildPanel_1();
		mainLayout.addComponent(panel_1);
		
		// panel_6
		panel_6 = buildPanel_6();
		mainLayout.addComponent(panel_6);
		
		// panel_7
		panel_7 = buildPanel_7();
		mainLayout.addComponent(panel_7);
		
		// tabSheet_15
		tabSheet_15 = buildTabSheet_15();
		mainLayout.addComponent(tabSheet_15);
		mainLayout.setExpandRatio(tabSheet_15, 1.0f);
		
		return mainLayout;
	}

	@AutoGenerated
	private Panel buildPanel_3() {
		// common part: create layout
		panel_3 = new Panel();
		panel_3.setImmediate(false);
		panel_3.setWidth("100.0%");
		panel_3.setHeight("-1px");
		
		// verticalLayout_6
		verticalLayout_6 = buildVerticalLayout_6();
		panel_3.setContent(verticalLayout_6);
		
		return panel_3;
	}

	@AutoGenerated
	private VerticalLayout buildVerticalLayout_6() {
		// common part: create layout
		verticalLayout_6 = new VerticalLayout();
		verticalLayout_6.setImmediate(false);
		verticalLayout_6.setWidth("100.0%");
		verticalLayout_6.setHeight("100.0%");
		verticalLayout_6.setMargin(false);
		
		// comboBox_1
		comboBox_1 = new ComboBox();
		comboBox_1.setCaption("Tipo de Pessoa");
		comboBox_1.setImmediate(false);
		comboBox_1.setWidth("-1px");
		comboBox_1.setHeight("-1px");
		comboBox_1.setRequired(true);
		verticalLayout_6.addComponent(comboBox_1);
		verticalLayout_6.setComponentAlignment(comboBox_1, new Alignment(33));
		
		return verticalLayout_6;
	}

	@AutoGenerated
	private Panel buildPanel_5() {
		// common part: create layout
		panel_5 = new Panel();
		panel_5.setImmediate(false);
		panel_5.setWidth("100.0%");
		panel_5.setHeight("-1px");
		
		// horizontalLayout_3
		horizontalLayout_3 = buildHorizontalLayout_3();
		panel_5.setContent(horizontalLayout_3);
		
		return panel_5;
	}

	@AutoGenerated
	private HorizontalLayout buildHorizontalLayout_3() {
		// common part: create layout
		horizontalLayout_3 = new HorizontalLayout();
		horizontalLayout_3.setImmediate(false);
		horizontalLayout_3.setWidth("100.0%");
		horizontalLayout_3.setHeight("100.0%");
		horizontalLayout_3.setMargin(false);
		
		// textField_12
		textField_12 = new TextField();
		textField_12.setCaption("Nome");
		textField_12.setImmediate(false);
		textField_12.setWidth("100.0%");
		textField_12.setHeight("-1px");
		textField_12.setRequired(true);
		horizontalLayout_3.addComponent(textField_12);
		horizontalLayout_3.setExpandRatio(textField_12, 1.0f);
		horizontalLayout_3.setComponentAlignment(textField_12,
				new Alignment(33));
		
		return horizontalLayout_3;
	}

	@AutoGenerated
	private Panel buildPanel_1() {
		// common part: create layout
		panel_1 = new Panel();
		panel_1.setImmediate(false);
		panel_1.setWidth("100.0%");
		panel_1.setHeight("-1px");
		
		// verticalLayout_3
		verticalLayout_3 = buildVerticalLayout_3();
		panel_1.setContent(verticalLayout_3);
		
		return panel_1;
	}

	@AutoGenerated
	private VerticalLayout buildVerticalLayout_3() {
		// common part: create layout
		verticalLayout_3 = new VerticalLayout();
		verticalLayout_3.setImmediate(false);
		verticalLayout_3.setWidth("100.0%");
		verticalLayout_3.setHeight("100.0%");
		verticalLayout_3.setMargin(false);
		
		// panel_2
		panel_2 = buildPanel_2();
		verticalLayout_3.addComponent(panel_2);
		
		// panel_4
		panel_4 = buildPanel_4();
		verticalLayout_3.addComponent(panel_4);
		verticalLayout_3.setComponentAlignment(panel_4, new Alignment(20));
		
		return verticalLayout_3;
	}

	@AutoGenerated
	private Panel buildPanel_2() {
		// common part: create layout
		panel_2 = new Panel();
		panel_2.setImmediate(false);
		panel_2.setWidth("100.0%");
		panel_2.setHeight("46px");
		
		// horizontalLayout_2
		horizontalLayout_2 = buildHorizontalLayout_2();
		panel_2.setContent(horizontalLayout_2);
		
		return panel_2;
	}

	@AutoGenerated
	private HorizontalLayout buildHorizontalLayout_2() {
		// common part: create layout
		horizontalLayout_2 = new HorizontalLayout();
		horizontalLayout_2.setImmediate(false);
		horizontalLayout_2.setWidth("100.0%");
		horizontalLayout_2.setHeight("100.0%");
		horizontalLayout_2.setMargin(false);
		horizontalLayout_2.setSpacing(true);
		
		// textField_2
		textField_2 = new TextField();
		textField_2.setCaption("CPF");
		textField_2.setImmediate(false);
		textField_2.setWidth("100.0%");
		textField_2.setHeight("-1px");
		horizontalLayout_2.addComponent(textField_2);
		horizontalLayout_2.setExpandRatio(textField_2, 1.0f);
		horizontalLayout_2
				.setComponentAlignment(textField_2, new Alignment(33));
		
		// textField_3
		textField_3 = new TextField();
		textField_3.setCaption("RG");
		textField_3.setImmediate(false);
		textField_3.setWidth("100.0%");
		textField_3.setHeight("-1px");
		horizontalLayout_2.addComponent(textField_3);
		horizontalLayout_2.setExpandRatio(textField_3, 1.0f);
		horizontalLayout_2
				.setComponentAlignment(textField_3, new Alignment(33));
		
		// textField_4
		textField_4 = new TextField();
		textField_4.setCaption("Orgão Expedidor");
		textField_4.setImmediate(false);
		textField_4.setWidth("100.0%");
		textField_4.setHeight("-1px");
		horizontalLayout_2.addComponent(textField_4);
		horizontalLayout_2.setExpandRatio(textField_4, 1.0f);
		horizontalLayout_2
				.setComponentAlignment(textField_4, new Alignment(33));
		
		// popupDateField_2
		popupDateField_2 = new PopupDateField();
		popupDateField_2.setCaption("Data Emissão");
		popupDateField_2.setImmediate(false);
		popupDateField_2.setWidth("100.0%");
		popupDateField_2.setHeight("-1px");
		horizontalLayout_2.addComponent(popupDateField_2);
		horizontalLayout_2.setExpandRatio(popupDateField_2, 1.0f);
		horizontalLayout_2.setComponentAlignment(popupDateField_2,
				new Alignment(33));
		
		return horizontalLayout_2;
	}

	@AutoGenerated
	private Panel buildPanel_4() {
		// common part: create layout
		panel_4 = new Panel();
		panel_4.setImmediate(false);
		panel_4.setWidth("100.0%");
		panel_4.setHeight("46px");
		
		// horizontalLayout_4
		horizontalLayout_4 = buildHorizontalLayout_4();
		panel_4.setContent(horizontalLayout_4);
		
		return panel_4;
	}

	@AutoGenerated
	private HorizontalLayout buildHorizontalLayout_4() {
		// common part: create layout
		horizontalLayout_4 = new HorizontalLayout();
		horizontalLayout_4.setImmediate(false);
		horizontalLayout_4.setWidth("100.0%");
		horizontalLayout_4.setHeight("100.0%");
		horizontalLayout_4.setMargin(false);
		horizontalLayout_4.setSpacing(true);
		
		// popupDateField_3
		popupDateField_3 = new PopupDateField();
		popupDateField_3.setCaption("Data Nascimento");
		popupDateField_3.setImmediate(false);
		popupDateField_3.setWidth("100.0%");
		popupDateField_3.setHeight("-1px");
		horizontalLayout_4.addComponent(popupDateField_3);
		horizontalLayout_4.setExpandRatio(popupDateField_3, 1.0f);
		horizontalLayout_4.setComponentAlignment(popupDateField_3,
				new Alignment(33));
		
		// comboBox_4
		comboBox_4 = new ComboBox();
		comboBox_4.setCaption("Sexo");
		comboBox_4.setImmediate(false);
		comboBox_4.setWidth("100.0%");
		comboBox_4.setHeight("-1px");
		horizontalLayout_4.addComponent(comboBox_4);
		horizontalLayout_4.setExpandRatio(comboBox_4, 1.0f);
		horizontalLayout_4.setComponentAlignment(comboBox_4, new Alignment(33));
		
		// comboBox_5
		comboBox_5 = new ComboBox();
		comboBox_5.setCaption("Estado Civil");
		comboBox_5.setImmediate(false);
		comboBox_5.setWidth("100.0%");
		comboBox_5.setHeight("-1px");
		horizontalLayout_4.addComponent(comboBox_5);
		horizontalLayout_4.setExpandRatio(comboBox_5, 1.0f);
		horizontalLayout_4.setComponentAlignment(comboBox_5, new Alignment(33));
		
		return horizontalLayout_4;
	}

	@AutoGenerated
	private Panel buildPanel_6() {
		// common part: create layout
		panel_6 = new Panel();
		panel_6.setImmediate(false);
		panel_6.setWidth("100.0%");
		panel_6.setHeight("-1px");
		
		// horizontalLayout_5
		horizontalLayout_5 = buildHorizontalLayout_5();
		panel_6.setContent(horizontalLayout_5);
		
		return panel_6;
	}

	@AutoGenerated
	private HorizontalLayout buildHorizontalLayout_5() {
		// common part: create layout
		horizontalLayout_5 = new HorizontalLayout();
		horizontalLayout_5.setImmediate(false);
		horizontalLayout_5.setWidth("100.0%");
		horizontalLayout_5.setHeight("100.0%");
		horizontalLayout_5.setMargin(false);
		horizontalLayout_5.setSpacing(true);
		
		// textField_16
		textField_16 = new TextField();
		textField_16.setCaption("Site");
		textField_16.setImmediate(false);
		textField_16.setWidth("100.0%");
		textField_16.setHeight("-1px");
		horizontalLayout_5.addComponent(textField_16);
		horizontalLayout_5.setExpandRatio(textField_16, 1.0f);
		horizontalLayout_5.setComponentAlignment(textField_16,
				new Alignment(33));
		
		// textField_17
		textField_17 = new TextField();
		textField_17.setCaption("Email");
		textField_17.setImmediate(false);
		textField_17.setWidth("100.0%");
		textField_17.setHeight("-1px");
		horizontalLayout_5.addComponent(textField_17);
		horizontalLayout_5.setExpandRatio(textField_17, 1.0f);
		horizontalLayout_5.setComponentAlignment(textField_17,
				new Alignment(33));
		
		return horizontalLayout_5;
	}

	@AutoGenerated
	private Panel buildPanel_7() {
		// common part: create layout
		panel_7 = new Panel();
		panel_7.setImmediate(false);
		panel_7.setWidth("100.0%");
		panel_7.setHeight("-1px");
		
		// horizontalLayout_6
		horizontalLayout_6 = buildHorizontalLayout_6();
		panel_7.setContent(horizontalLayout_6);
		
		return panel_7;
	}

	@AutoGenerated
	private HorizontalLayout buildHorizontalLayout_6() {
		// common part: create layout
		horizontalLayout_6 = new HorizontalLayout();
		horizontalLayout_6.setImmediate(false);
		horizontalLayout_6.setWidth("100.0%");
		horizontalLayout_6.setHeight("100.0%");
		horizontalLayout_6.setMargin(false);
		
		// textField_19
		textField_19 = new TextField();
		textField_19.setCaption("Suframa");
		textField_19.setImmediate(false);
		textField_19.setWidth("300px");
		textField_19.setHeight("-1px");
		horizontalLayout_6.addComponent(textField_19);
		horizontalLayout_6.setComponentAlignment(textField_19,
				new Alignment(33));
		
		return horizontalLayout_6;
	}

	@AutoGenerated
	private TabSheet buildTabSheet_15() {
		// common part: create layout
		tabSheet_15 = new TabSheet();
		tabSheet_15.setImmediate(true);
		tabSheet_15.setWidth("100.0%");
		tabSheet_15.setHeight("100.0%");
		
		// tabSheet_16
		tabSheet_16 = new TabSheet();
		tabSheet_16.setImmediate(false);
		tabSheet_16.setWidth("100.0%");
		tabSheet_16.setHeight("100.0%");
		tabSheet_15.addTab(tabSheet_16, "Inscrilção Estadual", null);
		
		// tabSheet_17
		tabSheet_17 = new TabSheet();
		tabSheet_17.setImmediate(false);
		tabSheet_17.setWidth("-1px");
		tabSheet_17.setHeight("-1px");
		tabSheet_15.addTab(tabSheet_17, "Endereão", null);
		
		// tabSheet_18
		tabSheet_18 = new TabSheet();
		tabSheet_18.setImmediate(false);
		tabSheet_18.setWidth("100.0%");
		tabSheet_18.setHeight("100.0%");
		tabSheet_15.addTab(tabSheet_18, "Contatos", null);
		
		// tabSheet_19
		tabSheet_19 = new TabSheet();
		tabSheet_19.setImmediate(false);
		tabSheet_19.setWidth("100.0%");
		tabSheet_19.setHeight("100.0%");
		tabSheet_15.addTab(tabSheet_19, "Cliente", null);
		
		// tabSheet_20
		tabSheet_20 = new TabSheet();
		tabSheet_20.setImmediate(false);
		tabSheet_20.setWidth("100.0%");
		tabSheet_20.setHeight("100.0%");
		tabSheet_15.addTab(tabSheet_20, "Fornecedor", null);
		
		// tabSheet_21
		tabSheet_21 = new TabSheet();
		tabSheet_21.setImmediate(false);
		tabSheet_21.setWidth("100.0%");
		tabSheet_21.setHeight("100.0%");
		tabSheet_15.addTab(tabSheet_21, "Transportadora", null);
		
		return tabSheet_15;
	}

}
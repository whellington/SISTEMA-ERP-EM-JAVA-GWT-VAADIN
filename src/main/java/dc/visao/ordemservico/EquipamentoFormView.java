package dc.visao.ordemservico;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class EquipamentoFormView extends CustomComponent {

	private static final long serialVersionUID = 1L;
	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	@AutoGenerated
	private GridLayout fields;

	@AutoGenerated
	private VerticalLayout mainLayout;
	
	@AutoGenerated
	private TextField tfFilial;
	
	@AutoGenerated
	private TextField tfEquipamento;

	@AutoGenerated
	private TextField tfDescricao;

	@AutoGenerated
	private TextArea taObservacao;

	@AutoGenerated
	private HorizontalLayout horizontalLayout_1;

	@AutoGenerated
	private VerticalLayout verticalLayout_1;
	
	public EquipamentoFormView() {
		buildMainLayout();
		setCompositionRoot(mainLayout);
	}

	@AutoGenerated
	private VerticalLayout buildMainLayout() {

		// common part: create layout
		setSizeFull();
		mainLayout = new VerticalLayout();
		mainLayout.setImmediate(false);
		mainLayout.setSizeFull();
		mainLayout.setMargin(false);
		mainLayout.setSpacing(true);

		// top-level component properties
		setWidth("100.0%");
		// setHeight("100.0%");

		fields = buildFields();

		mainLayout.addComponent(fields);

		return mainLayout;
	}

	private GridLayout buildFields() {
		fields = new GridLayout();
		fields.setImmediate(false);
		fields.setWidth("100.0%");
		fields.setHeight("-1px");
		fields.setMargin(false);
		fields.setSpacing(true);
		fields.setRows(5);
		fields.setColumns(1);

		tfFilial = new TextField();
		tfFilial.setCaption("Filial");
		tfFilial.setImmediate(false);
		tfFilial.setWidth("-1px");
		tfFilial.setHeight("-1px");
		fields.addComponent(tfFilial, 0, 0);

		tfEquipamento = new TextField();
		tfEquipamento.setCaption("Equipamento");
		tfEquipamento.setImmediate(false);
		tfEquipamento.setWidth("-1px");
		tfEquipamento.setHeight("-1px");
		fields.addComponent(tfEquipamento, 0, 1);

		tfDescricao = new TextField();
		tfDescricao.setCaption("Descrição");
		tfDescricao.setImmediate(false);
		tfDescricao.setWidth("-1px");
		tfDescricao.setHeight("-1px");
		fields.addComponent(tfDescricao, 0, 2);

		
//		// horizontalLayout_1
//		horizontalLayout_1 = buildHorizontalLayout_1();
//		fields.addComponent(horizontalLayout_1, 0, 1);

		taObservacao = new TextArea();
		taObservacao.setCaption("Observacao");
		fields.addComponent(taObservacao,0,3);
		
		return fields;
	}
	
//	@AutoGenerated
//	private HorizontalLayout buildHorizontalLayout_1() {
//		// common part: create layout
//		horizontalLayout_1 = new HorizontalLayout(); 
//		horizontalLayout_1.setImmediate(false);
//		horizontalLayout_1.setWidth("-1px");
//		horizontalLayout_1.setHeight("100.0%");
//		horizontalLayout_1.setMargin(false);
//		horizontalLayout_1.setSpacing(true);
//
//
//		cbCor = new ManyToOneCombo<>();
//		cbCor.setCaption("Cor");
//		horizontalLayout_1.addComponent(cbCor);
//
//		cbMarca = new ManyToOneCombo<>();
//		cbMarca.setCaption("Marca");
//		horizontalLayout_1.addComponent(cbMarca);
//
//		cbModelo = new ManyToOneCombo<>();
//		cbModelo.setCaption("Modelo");
//		horizontalLayout_1.addComponent(cbModelo);
//
//		cbCombustivel = new ManyToOneCombo<>();
//		cbCombustivel.setCaption("Combustível");
//		horizontalLayout_1.addComponent(cbCombustivel);
//
//		return horizontalLayout_1;
//	}
	 
//	@AutoGenerated
//	private HorizontalLayout buildHorizontalLayout_2() {
//		// common part: create layout
//		horizontalLayout_2 = new HorizontalLayout();
//		horizontalLayout_2.setImmediate(false);
//		horizontalLayout_2.setWidth("-1px");
//		horizontalLayout_2.setHeight("100.0%");
//		horizontalLayout_2.setMargin(false);
//		horizontalLayout_2.setSpacing(true);
//
//		tfAno = new TextField();
//		tfAno.setCaption("Ano");
//		horizontalLayout_2.addComponent(tfAno);
//
//		tfChassi = new TextField();
//		tfChassi.setCaption("Chassi");
//		horizontalLayout_2.addComponent(tfChassi);
//
//		tfChassi = new TextField();
//		tfChassi.setCaption("Chassi");
//		horizontalLayout_2.addComponent(tfChassi);
//		
//		return horizontalLayout_2;
//	}
	
	public GridLayout getFields() {
		return fields;
	}

	public void setFields(GridLayout fields) {
		this.fields = fields;
	}

	public VerticalLayout getMainLayout() {
		return mainLayout;
	}

	public void setMainLayout(VerticalLayout mainLayout) {
		this.mainLayout = mainLayout;
	}

	public TextArea getTaObservacao() {
		return taObservacao;
	}

	public void setTaObservacao(TextArea taObservacao) {
		this.taObservacao = taObservacao;
	}

	public TextField getTfFilial() {
		return tfFilial;
	}

	public void setTfFilial(TextField tfFilial) {
		this.tfFilial = tfFilial;
	}

	public TextField getTfEquipamento() {
		return tfEquipamento;
	}

	public void setTfEquipamento(TextField tfEquipamento) {
		this.tfEquipamento = tfEquipamento;
	}

	public TextField getTfDescricao() {
		return tfDescricao;
	}

	public void setTfDescricao(TextField tfDescricao) {
		this.tfDescricao = tfDescricao;
	}

	public VerticalLayout getVerticalLayout_1() {
		return verticalLayout_1;
	}

	public void setVerticalLayout_1(VerticalLayout verticalLayout_1) {
		this.verticalLayout_1 = verticalLayout_1;
	}

}


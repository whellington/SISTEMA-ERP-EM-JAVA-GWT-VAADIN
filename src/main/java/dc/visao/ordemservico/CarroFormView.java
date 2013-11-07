package dc.visao.ordemservico;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import dc.entidade.ordemservico.Combustivel;
import dc.entidade.ordemservico.Cor;
import dc.entidade.ordemservico.Marca;
import dc.entidade.ordemservico.Modelo;
import dc.visao.framework.component.manytoonecombo.ManyToOneCombo;

public class CarroFormView extends CustomComponent {

	private static final long serialVersionUID = 1L;
	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	@AutoGenerated
	private GridLayout fields;

	@AutoGenerated
	private VerticalLayout mainLayout;

	@AutoGenerated
	private TextField tfPlaca;

	@AutoGenerated
	private TextField tfAno;

	@AutoGenerated
	private TextField tfMotorizacao;

	@AutoGenerated
	private TextField tfChassi;

	@AutoGenerated
	private TextArea taObservacao;

	@AutoGenerated
	private ManyToOneCombo<Marca> cbMarca;

	@AutoGenerated
	private ManyToOneCombo<Cor> cbCor;

	@AutoGenerated
	private ManyToOneCombo<Modelo> cbModelo;

	@AutoGenerated
	private ManyToOneCombo<Combustivel> cbCombustivel;

	@AutoGenerated
	private HorizontalLayout horizontalLayout_1;

	@AutoGenerated
	private HorizontalLayout horizontalLayout_2;

	public CarroFormView() {
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
		fields.setRows(7);
		fields.setColumns(3);

		tfPlaca = new TextField();
		tfPlaca.setCaption("Placa");
		tfPlaca.setImmediate(false);
		tfPlaca.setWidth("-1px");
		tfPlaca.setHeight("-1px");
		fields.addComponent(tfPlaca, 0, 0, 1, 0);

		// horizontalLayout_1
		horizontalLayout_1 = buildHorizontalLayout_1();
		fields.addComponent(horizontalLayout_1, 0, 1);

		// horizontalLayout_2
		horizontalLayout_2 = buildHorizontalLayout_2();
		fields.addComponent(horizontalLayout_2, 0, 2);

		taObservacao = new TextArea();
		taObservacao.setCaption("Observacao");
		fields.addComponent(taObservacao, 0, 3);

		return fields;
	}

	@AutoGenerated
	private HorizontalLayout buildHorizontalLayout_1() {
		// common part: create layout
		horizontalLayout_1 = new HorizontalLayout();
		horizontalLayout_1.setImmediate(false);
		horizontalLayout_1.setWidth("-1px");
		horizontalLayout_1.setHeight("100.0%");
		horizontalLayout_1.setMargin(false);
		horizontalLayout_1.setSpacing(true);

		cbCor = new ManyToOneCombo<>();
		cbCor.setCaption("Cor");
		horizontalLayout_1.addComponent(cbCor);

		cbMarca = new ManyToOneCombo<>();
		cbMarca.setCaption("Marca");
		horizontalLayout_1.addComponent(cbMarca);

		cbModelo = new ManyToOneCombo<>();
		cbModelo.setCaption("Modelo");
		horizontalLayout_1.addComponent(cbModelo);

		cbCombustivel = new ManyToOneCombo<>();
		cbCombustivel.setCaption("Combustível");
		horizontalLayout_1.addComponent(cbCombustivel);

		return horizontalLayout_1;
	}

	@AutoGenerated
	private HorizontalLayout buildHorizontalLayout_2() {
		// common part: create layout
		horizontalLayout_2 = new HorizontalLayout();
		horizontalLayout_2.setImmediate(false);
		horizontalLayout_2.setWidth("-1px");
		horizontalLayout_2.setHeight("100.0%");
		horizontalLayout_2.setMargin(false);
		horizontalLayout_2.setSpacing(true);

		tfAno = new TextField();
		tfAno.setCaption("Ano");
		horizontalLayout_2.addComponent(tfAno);

		tfChassi = new TextField();
		tfChassi.setCaption("Chassi");
		horizontalLayout_2.addComponent(tfChassi);

		tfChassi = new TextField();
		tfChassi.setCaption("Chassi");
		horizontalLayout_2.addComponent(tfChassi);

		return horizontalLayout_2;
	}

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

	public TextField getTfPlaca() {
		return tfPlaca;
	}

	public void setTfPlaca(TextField tfPlaca) {
		this.tfPlaca = tfPlaca;
	}

	public ManyToOneCombo<Marca> getCbMarca() {
		return cbMarca;
	}

	public void setCbMarca(ManyToOneCombo<Marca> cbMarca) {
		this.cbMarca = cbMarca;
	}

	public ManyToOneCombo<Cor> getCbCor() {
		return cbCor;
	}

	public void setCbCor(ManyToOneCombo<Cor> cbCor) {
		this.cbCor = cbCor;
	}

	public ManyToOneCombo<Modelo> getCbModelo() {
		return cbModelo;
	}

	public void setCbModelo(ManyToOneCombo<Modelo> cbModelo) {
		this.cbModelo = cbModelo;
	}

	public TextField getTfAno() {
		return tfAno;
	}

	public void setTfAno(TextField tfAno) {
		this.tfAno = tfAno;
	}

	public TextField getTfChassi() {
		return tfChassi;
	}

	public void setTfChassi(TextField tfChassi) {
		this.tfChassi = tfChassi;
	}

	public TextArea getTaObservacao() {
		return taObservacao;
	}

	public void setTaObservacao(TextArea taObservacao) {
		this.taObservacao = taObservacao;
	}

	public ManyToOneCombo<Combustivel> getCbCombustivel() {
		return cbCombustivel;
	}

	public void setCbCombustivel(ManyToOneCombo<Combustivel> cbCombustivel) {
		this.cbCombustivel = cbCombustivel;
	}

	public TextField getTfMotorizacao() {
		return tfMotorizacao;
	}

	public void setTfMotorizacao(TextField tfMotorizacao) {
		this.tfMotorizacao = tfMotorizacao;
	}

}

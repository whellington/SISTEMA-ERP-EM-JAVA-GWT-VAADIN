package dc.visao.ordemservico;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import dc.controller.ordemservico.CarroFormController;
import dc.entidade.ordemservico.Combustivel;
import dc.entidade.ordemservico.Cor;
import dc.entidade.ordemservico.Marca;
import dc.entidade.ordemservico.Modelo;
import dc.entidade.pessoal.Cliente;
import dc.visao.framework.component.manytoonecombo.ManyToOneCombo;
import dc.visao.framework.util.ComponentUtil;

public class CarroFormView extends CustomComponent {

	private static final long serialVersionUID = 1L;
	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	@AutoGenerated
	private GridLayout fields;

	@AutoGenerated
	private VerticalLayout mainLayout;

	@AutoGenerated
	private TextField tfRazao;

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
	private ManyToOneCombo<Cliente> cbCliente;

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

	private CarroFormController controller;
	
	public CarroFormView(CarroFormController controller) {
		buildMainLayout();
		setCompositionRoot(mainLayout);
		this.controller = controller;
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
//		fields.setHeight("-1px");
		fields.setMargin(false);
		fields.setSpacing(true);
		fields.setRows(7);
		fields.setColumns(6);

		cbCliente = new ManyToOneCombo<Cliente>();
		cbCliente.setCaption("Cliente");
		cbCliente.addValueChangeListener(new ValueChangeListener() {
			private static final long serialVersionUID = 1L;

			@Override
			public void valueChange(ValueChangeEvent event) {
				Cliente cli = new Cliente();
				cli = cbCliente.getValue();
				tfRazao.setValue(cli.getPessoa().getNome());
			}
			
		});
		fields.addComponent(cbCliente, 0,1,0,1);

		tfRazao = ComponentUtil.buildTextField("Razão");
		fields.addComponent(tfRazao,1,1,2,1);
		
		tfPlaca = ComponentUtil.buildMaskedTextField("Placa", "UUU-####");
		fields.addComponent(tfPlaca,0,2,0,2);
		
		cbMarca = new ManyToOneCombo<Marca>();
		cbMarca.setCaption("Marca");
		cbMarca.addValueChangeListener(new ValueChangeListener() {
			private static final long serialVersionUID = 1L;

			@Override
			public void valueChange(ValueChangeEvent event) {
				controller.getModelo("marca", cbMarca.getValue().getId());
			}
			
		});
		fields.addComponent(cbMarca, 0, 3, 0, 3);

		cbModelo = new ManyToOneCombo<Modelo>();
		cbModelo.setCaption("Modelo");
		fields.addComponent(cbModelo, 1, 3, 1, 3);

		cbCor = new ManyToOneCombo<Cor>();
		cbCor.setCaption("Cor");
		fields.addComponent(cbCor, 0, 4, 0, 4);

		cbCombustivel = new ManyToOneCombo<Combustivel>();
		cbCombustivel.setCaption("Combustível");
		fields.addComponent(cbCombustivel, 1, 4, 1, 4);

		tfAno = new TextField();
		tfAno.setCaption("Ano");
		fields.addComponent(tfAno, 0, 5, 0, 5);

		tfMotorizacao = new TextField();
		tfMotorizacao.setCaption("Motorização");
		fields.addComponent(tfMotorizacao, 1, 5, 1, 5);

		tfChassi = new TextField();
		tfChassi.setCaption("Chassi");
		fields.addComponent(tfChassi,2,5,2,5);
		
		// txtDescricao
		taObservacao = ComponentUtil.buildTextArea("Observação");
		fields.addComponent(taObservacao,0,6);

		return fields;
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

	public ManyToOneCombo<Cliente> getCbCliente() {
		return cbCliente;
	}

	public void setCbCliente(ManyToOneCombo<Cliente> cbCliente) {
		this.cbCliente = cbCliente;
	}
}

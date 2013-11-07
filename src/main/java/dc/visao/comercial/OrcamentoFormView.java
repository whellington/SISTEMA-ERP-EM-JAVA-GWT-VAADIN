package dc.visao.comercial;


import java.util.List;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.data.Container;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Component;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Field;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TableFieldFactory;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import dc.controller.comercial.OrcamentoFormController;
import dc.entidade.comercial.ItemOrcamento;
import dc.entidade.geral.UF;
import dc.entidade.tributario.ICMSCustomizadoDetalhe;
import dc.visao.framework.component.SubFormComponent;
import dc.visao.framework.util.ComponentUtil;
import dc.visao.suprimentos.ContagemEstoqueFormController;

public class OrcamentoFormView extends CustomComponent {

	@AutoGenerated
	private VerticalLayout mainLayout;

	OrcamentoFormController controller;

	@AutoGenerated
	private GridLayout fields;

	ComboBox cmbVendedor,cmbCliente,cmbTransportadora,
	cmbCondicaoPagamento,cmbTipo,cmbFrete;

	TextField txtCodigo;

	PopupDateField dataCadastro,dataEntrega,dataValidade;

	TextField txtValorSubTotal,txtValorFrete,txtTaxaComissao,txtValorComissao,txtTaxaDesconto,
	txtValorDesconto,txtValorTotal;

	TextArea txtDescricao;

	private SubFormComponent<ItemOrcamento, Integer> itensSubForm;

	@AutoGenerated
	private TabSheet subForms;

	public OrcamentoFormView(OrcamentoFormController controller) {
		this.controller = controller;
		buildMainLayout();
		setCompositionRoot(mainLayout);
	}

	@AutoGenerated
	private VerticalLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new VerticalLayout();
		mainLayout.setImmediate(false);
		mainLayout.setSizeFull();
		mainLayout.setMargin(false);
		mainLayout.setSpacing(true);

		fields = buildFields();
		mainLayout.addComponent(fields);

		subForms = new TabSheet();
		subForms.setWidth("100.0%");
		subForms.setHeight("100.0%");
		subForms.setSizeFull();
		subForms.setImmediate(true);

		buildItensSubForm();
		mainLayout.addComponent(subForms);

		return mainLayout;

	}

	@AutoGenerated
	private GridLayout buildFields() {
		// common part: create layout
		fields = new GridLayout(7, 7);
		fields.setImmediate(false);
		fields.setWidth("100.0%");
		fields.setHeight("-1px");
		fields.setMargin(false);
		fields.setSpacing(true);

		cmbVendedor = ComponentUtil.buildComboBox("Vendedor");
		cmbVendedor.setContainerDataSource(controller.carregarVendedores());
		fields.addComponent(cmbVendedor,0,0);

		cmbCliente = ComponentUtil.buildComboBox("Cliente");
		cmbCliente.setContainerDataSource(controller.carregarClientes());
		fields.addComponent(cmbCliente,1,0);

		cmbTransportadora = ComponentUtil.buildComboBox("Transportadora");
		//cmbTransportadora.setContainerDataSource(controller.carregarTransportadoras());
		fields.addComponent(cmbTransportadora,2,0);

		cmbCondicaoPagamento = ComponentUtil.buildComboBox("Condição Pagamento");
		cmbCondicaoPagamento.setContainerDataSource(controller.carregarCondicoes());
		fields.addComponent(cmbCondicaoPagamento,3,0);

		cmbTipo = ComponentUtil.buildComboBox("Tipo");
		fields.addComponent(cmbTipo,0,2);

		cmbFrete = ComponentUtil.buildComboBox("Frete");
		fields.addComponent(cmbFrete,1,2);

		txtCodigo = ComponentUtil.buildTextField("Código");
		fields.addComponent(txtCodigo,2,2);	

		dataCadastro = ComponentUtil.buildPopupDateField("Data Cadastro");
		fields.addComponent(dataCadastro,3,2);

		dataEntrega = ComponentUtil.buildPopupDateField("Data Entrega");
		fields.addComponent(dataEntrega,4,2);

		dataValidade = ComponentUtil.buildPopupDateField("Data Validade");
		fields.addComponent(dataValidade,5,2);

		txtValorSubTotal  = ComponentUtil.buildCurrencyField("Valor SubTotal");
		fields.addComponent(txtValorSubTotal,0,3);

		txtValorFrete = ComponentUtil.buildCurrencyField("Valor Frete");
		fields.addComponent(txtValorFrete,1,3);

		txtTaxaComissao = ComponentUtil.buildNumberField("Taxa Comissão");
		fields.addComponent(txtTaxaComissao,2,3);

		txtValorComissao = ComponentUtil.buildCurrencyField("Valor Comissão");
		fields.addComponent(txtValorComissao,3,3);

		txtTaxaDesconto = ComponentUtil.buildNumberField("Taxa Desconto");
		fields.addComponent(txtTaxaDesconto,4,3);

		txtValorDesconto = ComponentUtil.buildCurrencyField("Valor Desconto");
		fields.addComponent(txtValorDesconto,5,3);

		txtValorTotal = ComponentUtil.buildCurrencyField("Valor Total");
		fields.addComponent(txtValorTotal,6,3);

		txtDescricao = ComponentUtil.buildTextArea("Descrição");
		txtDescricao.setHeight("10%");
		fields.addComponent(txtDescricao,0,4,6,4);

		return fields;

	}

	private void buildItensSubForm() {
		// common part: create layout

		itensSubForm = new SubFormComponent<ItemOrcamento, Integer>(ItemOrcamento.class, new String[] { 
			"produto","quantidade","valorUnitario","valorSubTotal","taxaDesconto","valorDesconto","valorTotal"}, 
			new String[] {"Produto","Quantidade","Valor Unitário","Valor SubTotal","Taxa Desconto","Valor Desconto","Valor Total"}) {


			@Override
			protected TableFieldFactory getFieldFactory() {
				return new TableFieldFactory() {

					@Override
					public Field<?> createField(Container container,
							Object itemId, Object propertyId,
							Component uiContext) {

						//						if ("ufDestino".equals(propertyId)) {
						//							ComboBox cmb = ComponentUtil.buildComboBox("UF");
						//
						//							List<UF> ufs = controller.listarUfs();
						//							BeanItemContainer<String> beanUf = new BeanItemContainer<>(
						//									String.class);
						//							for (UF u : ufs) {
						//								beanUf.addBean(u.getSigla());
						//							}
						//							cmb.setContainerDataSource(beanUf);
						//							return cmb;
						//						}



						if ("produto".equals(propertyId)) {
							ComboBox field = ComponentUtil.buildComboBox("Produto");
							field.setContainerDataSource(controller.carregarProdutos());
							return field;
						}

						if ("quantidade".equals(propertyId)) {
							TextField field = ComponentUtil.buildNumericField("Quantidade");
							return field;
						}

						if ("valorUnitario".equals(propertyId)) {
							TextField field = ComponentUtil.buildCurrencyField("Valor Unitário");
							return field;
						}

						if ("valorSubTotal".equals(propertyId)) {
							TextField field = ComponentUtil.buildCurrencyField("Valor SubTotal");
							return field;
						}

						if ("taxaDesconto".equals(propertyId)) {
							TextField field = ComponentUtil.buildNumberField("Taxa Desconto");
							return field;
						}

						if ("valorDesconto".equals(propertyId)) {
							TextField field = ComponentUtil.buildCurrencyField("Valor Desconto");
							return field;
						}

						if ("valorTotal".equals(propertyId)) {
							TextField field = ComponentUtil.buildCurrencyField("Valor Total");
							return field;
						}




						return null;
					}
				};
			}

			protected ItemOrcamento getNovo() {
				ItemOrcamento item = controller.adicionarItem();
				return item;
			}

			@Override
			public boolean validateItems(List<ItemOrcamento> items) {
				// TODO Auto-generated method stub
				return true;
			}


		};

		GridLayout layout = new GridLayout(1,1);
		layout.setImmediate(false);
		layout.setWidth("100.0%");
		layout.setHeight("100.0%");
		layout.setMargin(true);
		layout.setSpacing(true);
		layout.setSizeFull();
		layout.addComponent(itensSubForm);
		subForms.addTab(layout, "Itens do Orçamento", null);
	}

	public VerticalLayout getMainLayout() {
		return mainLayout;
	}

	public void setMainLayout(VerticalLayout mainLayout) {
		this.mainLayout = mainLayout;
	}

	public OrcamentoFormController getController() {
		return controller;
	}

	public void setController(OrcamentoFormController controller) {
		this.controller = controller;
	}

	public GridLayout getFields() {
		return fields;
	}

	public void setFields(GridLayout fields) {
		this.fields = fields;
	}

	public ComboBox getCmbVendedor() {
		return cmbVendedor;
	}

	public void setCmbVendedor(ComboBox cmbVendedor) {
		this.cmbVendedor = cmbVendedor;
	}

	public ComboBox getCmbCliente() {
		return cmbCliente;
	}

	public void setCmbCliente(ComboBox cmbCliente) {
		this.cmbCliente = cmbCliente;
	}

	public ComboBox getCmbTransportadora() {
		return cmbTransportadora;
	}

	public void setCmbTransportadora(ComboBox cmbTransportadora) {
		this.cmbTransportadora = cmbTransportadora;
	}

	public ComboBox getCmbCondicaoPagamento() {
		return cmbCondicaoPagamento;
	}

	public void setCmbCondicaoPagamento(ComboBox cmbCondicaoPagamento) {
		this.cmbCondicaoPagamento = cmbCondicaoPagamento;
	}

	public ComboBox getCmbTipo() {
		return cmbTipo;
	}

	public void setCmbTipo(ComboBox cmbTipo) {
		this.cmbTipo = cmbTipo;
	}

	public ComboBox getCmbFrete() {
		return cmbFrete;
	}

	public void setCmbFrete(ComboBox cmbFrete) {
		this.cmbFrete = cmbFrete;
	}

	public TextField getTxtCodigo() {
		return txtCodigo;
	}

	public void setTxtCodigo(TextField txtCodigo) {
		this.txtCodigo = txtCodigo;
	}

	public PopupDateField getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(PopupDateField dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public PopupDateField getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(PopupDateField dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public PopupDateField getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(PopupDateField dataValidade) {
		this.dataValidade = dataValidade;
	}

	public TextField getTxtValorSubTotal() {
		return txtValorSubTotal;
	}

	public void setTxtValorSubTotal(TextField txtValorSubTotal) {
		this.txtValorSubTotal = txtValorSubTotal;
	}

	public TextField getTxtValorFrete() {
		return txtValorFrete;
	}

	public void setTxtValorFrete(TextField txtValorFrete) {
		this.txtValorFrete = txtValorFrete;
	}

	public TextField getTxtTaxaComissao() {
		return txtTaxaComissao;
	}

	public void setTxtTaxaComissao(TextField txtTaxaComissao) {
		this.txtTaxaComissao = txtTaxaComissao;
	}

	public TextField getTxtValorComissao() {
		return txtValorComissao;
	}

	public void setTxtValorComissao(TextField txtValorComissao) {
		this.txtValorComissao = txtValorComissao;
	}

	public TextField getTxtTaxaDesconto() {
		return txtTaxaDesconto;
	}

	public void setTxtTaxaDesconto(TextField txtTaxaDesconto) {
		this.txtTaxaDesconto = txtTaxaDesconto;
	}

	public TextField getTxtValorDesconto() {
		return txtValorDesconto;
	}

	public void setTxtValorDesconto(TextField txtValorDesconto) {
		this.txtValorDesconto = txtValorDesconto;
	}

	public TextField getTxtValorTotal() {
		return txtValorTotal;
	}

	public void setTxtValorTotal(TextField txtValorTotal) {
		this.txtValorTotal = txtValorTotal;
	}

	public TextArea getTxtDescricao() {
		return txtDescricao;
	}

	public void setTxtDescricao(TextArea txtDescricao) {
		this.txtDescricao = txtDescricao;
	}

	public SubFormComponent<ItemOrcamento, Integer> getItensSubForm() {
		return itensSubForm;
	}

	public void setItensSubForm(
			SubFormComponent<ItemOrcamento, Integer> itensSubForm) {
		this.itensSubForm = itensSubForm;
	}

	public TabSheet getSubForms() {
		return subForms;
	}

	public void setSubForms(TabSheet subForms) {
		this.subForms = subForms;
	}




}

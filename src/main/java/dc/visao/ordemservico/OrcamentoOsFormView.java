package dc.visao.ordemservico;

import java.math.BigDecimal;
import java.util.List;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.data.Container;
import com.vaadin.data.Item;
import com.vaadin.data.Property;
import com.vaadin.event.FieldEvents.BlurEvent;
import com.vaadin.event.FieldEvents.BlurListener;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Component;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Field;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TableFieldFactory;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import dc.controller.ordemservico.OrcamentoOsFormController;
import dc.entidade.ordemservico.OrcamentoOsItem;
import dc.visao.framework.component.SubFormComponent;
import dc.visao.framework.util.ComponentUtil;

public class OrcamentoOsFormView extends CustomComponent {

	private static final long serialVersionUID = 1L;

	@AutoGenerated
	private VerticalLayout mainLayout;
	
	@AutoGenerated
	private GridLayout fields;
	
	@AutoGenerated
	private PopupDateField calDataCadastro;
	
	@AutoGenerated
	private TextField tfNomeVendedor;
	
	@AutoGenerated
	private TextField tfFormaPagamento;

	@AutoGenerated
	private TextField tfNome;

	@AutoGenerated
	private TextField tfMarca;

	@AutoGenerated
	private TextField tfModelo;

	@AutoGenerated
	private TextField tfCor;

	@AutoGenerated
	private TextField tfEndereco;

	@AutoGenerated
	private TextField tfFone;

	@AutoGenerated
	private TextField tfPlaca;
	
	@AutoGenerated
	private TextField tfAno;

	@AutoGenerated
	private TextField tfCvMotor;

	@AutoGenerated
	private TextField tfMotorizacao;
	
	@AutoGenerated
	private TabSheet tabSheet;
	
	private OrcamentoOsFormController controller;

	private SubFormComponent<OrcamentoOsItem, Integer> orcamentoOsItemSubForm;
	
	public OrcamentoOsFormView(OrcamentoOsFormController controller) {
		buildMainLayout();
		setCompositionRoot(mainLayout);
		this.controller = controller;
	}

	@AutoGenerated
	private VerticalLayout buildMainLayout() {
		// common part: create layout
//		setSizeFull();
		mainLayout = new VerticalLayout();
		mainLayout.setImmediate(false);
		mainLayout.setSizeFull();
		mainLayout.setMargin(false);
		mainLayout.setSpacing(true);

		// top-level component properties
		setWidth("100.0%");
		setHeight("100.0%");

		// fields
		fields = buildFields();
		mainLayout.addComponent(fields);

		tabSheet = new TabSheet();
		tabSheet.setWidth("100.0%");
		tabSheet.setHeight("100.0%");
		tabSheet.setSizeFull();
		tabSheet.setImmediate(true);
		mainLayout.addComponent(tabSheet);
		
		buildSubFormOrcamentoOs();
		
		return mainLayout;
	}

	public PopupDateField getCalDataRequisicao() {
		return calDataCadastro;
	}


	@AutoGenerated
	private GridLayout buildFields() {
		// common part: create layout
		fields = new GridLayout();
		fields.setImmediate(false);
		fields.setWidth("100.0%");
//		fields.setHeight("100.0%");
		fields.setMargin(false);
		fields.setSpacing(true);
		fields.setRows(4);
		fields.setColumns(6);
		
		tfNomeVendedor = ComponentUtil.buildTextField("Nome Atendente");
		fields.addComponent(tfNomeVendedor, 0, 0,1,0);
		
		tfFormaPagamento = ComponentUtil.buildTextField("Forma de pagamento");
		fields.addComponent(tfFormaPagamento, 2, 0,3,0);

		tfNome = ComponentUtil.buildTextField("Nome");
		fields.addComponent(tfNome, 0, 1,1,1);

		tfEndereco = ComponentUtil.buildTextField("Endereço");
		fields.addComponent(tfEndereco, 2, 1,3,1);

		tfFone = ComponentUtil.buildTextField("Telefones");
		fields.addComponent(tfFone, 0, 2,0,2);
		
		tfPlaca = ComponentUtil.buildTextField("Placa");
		fields.addComponent(tfPlaca, 1, 2,1,2);

		tfMarca = ComponentUtil.buildTextField("Marca");
		fields.addComponent(tfMarca, 2, 2,2,2);

		tfModelo = ComponentUtil.buildTextField("Modelo");
		fields.addComponent(tfModelo, 3, 2,3,2);

		tfCor = ComponentUtil.buildTextField("Cor");
		fields.addComponent(tfCor, 0, 3,0,3);

		tfAno = ComponentUtil.buildTextField("Ano");
		fields.addComponent(tfAno, 1, 3, 1, 3);

		tfCvMotor = ComponentUtil.buildTextField("CV do motor");
		fields.addComponent(tfCvMotor, 2, 3, 2, 3);

		tfMotorizacao = ComponentUtil.buildTextField("Motorização");
		fields.addComponent(tfMotorizacao, 3, 3, 3, 3);

		return fields;
	}
	
	@AutoGenerated
	@SuppressWarnings("serial")
	private TabSheet buildSubFormOrcamentoOs() {
		// common part: create layout
		
		//TabSheet sub = new TabSheet();
		
		tabSheet.setWidth("100.0%");
		//tabSheet.setHeight("100.0%");
		tabSheet.setSizeFull();
		tabSheet.setImmediate(true);

		orcamentoOsItemSubForm = new SubFormComponent<OrcamentoOsItem, Integer>(
				OrcamentoOsItem.class, new String[] { "tipo", "descricao", "quantidade", "valorUnitario","valorSubTotal","taxaDesconto","valorDesconto","valorTotal"}, 
				new String[] {"TP","Descrição", "Quantidade", "Valor unitário", "Valor sub total","Taxa desconto","Valor desconto","Valor total" }
				, new String[] { "valorSubTotal", "valorDesconto","valorTotal" }) {

			@Override
			protected TableFieldFactory getFieldFactory() {
				return new TableFieldFactory() {
					@Override
					public Field<?> createField(Container container,
							Object itemId, Object propertyId,
							Component uiContext) {
						
						if("tipo".equals(propertyId)){
							ComboBox combobox = ComponentUtil.buildComboBox(null);
							combobox.removeAllItems();

							combobox.addItem("M");
							combobox.addItem("P");

							return combobox;
						}else if("descricao".equals(propertyId)){
							TextField textField = ComponentUtil.buildTextField(null);
							return textField;
						}else if ("quantidade".equals(propertyId)) {
							TextField textField = ComponentUtil.buildNumberField(null);
							textField.addBlurListener(getBlurListener(container, itemId, propertyId));
							return textField;
						}else if ("valorUnitario".equals(propertyId)) {
							TextField textField = ComponentUtil.buildCurrencyField(null);
							textField.addBlurListener(getBlurListener(container, itemId, propertyId));
							return textField;
						} else if ("valorSubTotal".equals(propertyId)) {
							TextField textField = ComponentUtil.buildCurrencyField(null);
							textField.setReadOnly(true);
							return textField;
						}else if ("taxaDesconto".equals(propertyId)) {
							TextField textField = ComponentUtil.buildPercentageField(null);
							textField.addBlurListener(getBlurListener(container, itemId, propertyId));
							return textField;
						}else if ("valorDesconto".equals(propertyId)) {
							TextField textField = ComponentUtil.buildCurrencyField(null);
							textField.addBlurListener(getBlurListener(container, itemId, propertyId));
							return textField;
						}else if ("valorTotal".equals(propertyId)) {
							TextField textField = ComponentUtil.buildCurrencyField(null);
							return textField;
						}

						return null;
					}
					

					private BlurListener getBlurListener(final Container container, final Object itemId, final Object propertyId) {
						return new BlurListener() {
							@Override
							public void blur(BlurEvent event) {
								Property<BigDecimal> quantidade = get("quantidade");
								Property<BigDecimal> valorSubtotal = get("valorSubTotal");
								Property<BigDecimal> valorDesconto = get("valorDesconto");
								Property<BigDecimal> percentualDesconto = get("taxaDesconto");
								Property<BigDecimal> valorTotal = get("valorTotal");
								Property<BigDecimal> valorUnitario = get("valorUnitario");
								
								if (quantidade.getValue() != null && valorUnitario.getValue() != null) {
									BigDecimal q = quantidade.getValue();
									BigDecimal vu = valorUnitario.getValue();
									valorSubtotal.setValue(q.multiply(vu));
								}
								
								if (valorSubtotal.getValue() != null) {
									BigDecimal vs = valorSubtotal.getValue();
									BigDecimal vd = BigDecimal.ZERO;
									BigDecimal pd = BigDecimal.ZERO;
									BigDecimal vt = BigDecimal.ZERO;
									
									if(percentualDesconto.getValue()!=null){
										pd = percentualDesconto.getValue().divide(new BigDecimal(100));
									}else{
										percentualDesconto.setValue(BigDecimal.ZERO);
									}
									vt = vs.subtract(pd.multiply(vs));
									valorTotal.setValue(vt);
									
									if (valorDesconto.getValue() != null) {
										vd = valorDesconto.getValue();
									} else {
										valorDesconto.setValue(BigDecimal.ZERO);
									}
									valorTotal.setValue(vt.subtract(vd));
								}

							}

							@SuppressWarnings("unchecked")
							private Property<BigDecimal> get(String property) {
								Item item = container.getItem(itemId);
								return item.getItemProperty(property);
							}
						};
					}
					
				};
			}
			protected OrcamentoOsItem getNovo() {
				OrcamentoOsItem orcamentoOsItem = controller.novoOrcamentoOsItem();
				return orcamentoOsItem;
			}
			
	
			protected void getRemoverSelecionados(List<OrcamentoOsItem> values) {
				controller.removerOrcamentoOsItem(values);
			}

			@Override
			public boolean validateItems(List<OrcamentoOsItem> listItens) {
				for (OrcamentoOsItem orcamentoOsItem : listItens) {
					if (orcamentoOsItem.getQuantidade() == null) {
						return false;
					}
				}
				return true;
			}
		};

		tabSheet.addTab(orcamentoOsItemSubForm, "Item de orçamento", null);

		return tabSheet;
	} 

	public PopupDateField getCalDataCadastro() {
		return calDataCadastro;
	}

	public void setCalDataCadastro(PopupDateField calDataCadastro) {
		this.calDataCadastro = calDataCadastro;
	}

	public TextField getTfMarca() {
		return tfMarca;
	}

	public void setTfMarca(TextField tfMarca) {
		this.tfMarca = tfMarca;
	}

	public TextField getTfModelo() {
		return tfModelo;
	}

	public void setTfModelo(TextField tfModelo) {
		this.tfModelo = tfModelo;
	}

	public TextField getTfCor() {
		return tfCor;
	}

	public void setTfCor(TextField tfCor) {
		this.tfCor = tfCor;
	}

	public TextField getTfNomeVendedor() {
		return tfNomeVendedor;
	}

	public void setTfNomeVendedor(TextField tfNomeVendedor) {
		this.tfNomeVendedor = tfNomeVendedor;
	}

	public TextField getTfFormaPagamento() {
		return tfFormaPagamento;
	}

	public void setTfFormaPagamento(TextField tfFormaPagamento) {
		this.tfFormaPagamento = tfFormaPagamento;
	}

	public TextField getTfNome() {
		return tfNome;
	}

	public void setTfNome(TextField tfNome) {
		this.tfNome = tfNome;
	}

	public TextField getTfEndereco() {
		return tfEndereco;
	}

	public void setTfEndereco(TextField tfEndereco) {
		this.tfEndereco = tfEndereco;
	}

	public TextField getTfFone() {
		return tfFone;
	}

	public void setTfFone(TextField tfFone) {
		this.tfFone = tfFone;
	}

	public TextField getTfPlaca() {
		return tfPlaca;
	}

	public void setTfPlaca(TextField tfPlaca) {
		this.tfPlaca = tfPlaca;
	}

	public TextField getTfAno() {
		return tfAno;
	}

	public void setTfAno(TextField tfAno) {
		this.tfAno = tfAno;
	}

	public TextField getTfCvMotor() {
		return tfCvMotor;
	}

	public void setTfCvMotor(TextField tfCvMotor) {
		this.tfCvMotor = tfCvMotor;
	}

	public TextField getTfMotorizacao() {
		return tfMotorizacao;
	}

	public void setTfMotorizacao(TextField tfMotorizacao) {
		this.tfMotorizacao = tfMotorizacao;
	}

	public void preencheSubForm(List<OrcamentoOsItem> detalhes){
		orcamentoOsItemSubForm.fillWith(detalhes);
	}

}

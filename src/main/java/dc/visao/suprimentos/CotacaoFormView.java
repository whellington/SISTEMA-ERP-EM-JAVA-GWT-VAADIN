package dc.visao.suprimentos;

import java.util.List;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.data.Container;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Component;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Field;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TableFieldFactory;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import dc.entidade.geral.Fornecedor;
import dc.entidade.suprimentos.FornecedorCotacao;
import dc.entidade.suprimentos.RequisicaoCotacaoDetalhe;
import dc.entidade.suprimentos.RequisicaoDetalhe;
import dc.visao.framework.component.SubFormComponent;
import dc.visao.framework.util.ComponentUtil;

@SuppressWarnings("serial")
public class CotacaoFormView extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	@AutoGenerated
	private VerticalLayout mainLayout;
	@AutoGenerated
	private TabSheet subForms;
	@AutoGenerated
	private GridLayout fields;
	@AutoGenerated
	private Label lblId;
	@AutoGenerated
	private TextField txtDescricao;
	@AutoGenerated
	private PopupDateField calDataCotacao;

	private CotacaoFormController controller;
	private SubFormComponent<RequisicaoCotacaoDetalhe, Integer> requisicaoDetalheSubForm;
	private SubFormComponent<FornecedorCotacao, Integer> fornecedorSubForm;

	public CotacaoFormView(CotacaoFormController controller) {
		this.controller = controller;
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


		// fields
		fields = buildFields();
		mainLayout.addComponent(fields);
		mainLayout.setExpandRatio(fields, 1);
		return mainLayout;
	}

	@AutoGenerated
	private GridLayout buildFields() {
		// common part: create layout
		fields = new GridLayout(6, 2);
		fields.setImmediate(false);
		fields.setWidth("100.0%");
		fields.setHeight("100.0%");
		fields.setMargin(false);
		fields.setSpacing(true);

		// lblId
		lblId = new Label();
		lblId.setCaption("Id");
		lblId.setImmediate(false);
		lblId.setSizeFull();
		fields.addComponent(lblId, 0, 0);

		// txtDescricao
		txtDescricao = ComponentUtil.buildTextField("Descrição");
		fields.addComponent(txtDescricao, 1, 0, 4, 0);

		// calDataCotacao
		calDataCotacao = new PopupDateField();
		calDataCotacao.setCaption("Data da cotação");
		calDataCotacao.setImmediate(false);
		fields.addComponent(calDataCotacao, 5, 0);

		buildSubForms();
		fields.addComponent(subForms, 0, 1, 5, 1);
		
		fields.setRowExpandRatio(1,1);
		
		return fields;
	}

	public TextField getTxtDescricao() {
		return txtDescricao;
	}

	public PopupDateField getCalDataCotacao() {
		return calDataCotacao;
	}

	@AutoGenerated
	private void buildSubForms() {
		// common part: create layout
		subForms = new TabSheet();
		subForms.setSizeFull();
		subForms.setImmediate(true);

		requisicaoDetalheSubForm = new SubFormComponent<RequisicaoCotacaoDetalhe, Integer>(RequisicaoCotacaoDetalhe.class, new String[] {
				"requisicaoDetalhe", "quantidadeCotada" }, new String[] { "Produto requisitado", "Quantidade a ser cotada" }) {
			@Override
			protected TableFieldFactory getFieldFactory() {
				return new TableFieldFactory() {

					@Override
					public Field<?> createField(Container container, Object itemId, Object propertyId, Component uiContext) {
						if ("requisicaoDetalhe".equals(propertyId)) {
							ComboBox comboBox = ComponentUtil.buildComboBox(null);
							BeanItemContainer<RequisicaoDetalhe> requisicaoDetalheContainer = new BeanItemContainer<>(
									RequisicaoDetalhe.class, controller.buscarRequisicaoProdutos());
							requisicaoDetalheContainer.addNestedContainerProperty("produto.descricao");
							comboBox.setContainerDataSource(requisicaoDetalheContainer);
							comboBox.setItemCaptionPropertyId("produto.descricao");
							return comboBox;
						} else if ("quantidadeCotada".equals(propertyId)) {
							TextField textField = ComponentUtil.buildNumberField(null);
							return textField;
						}
						return null;
					}
				};
			}

			protected RequisicaoCotacaoDetalhe getNovo() {
				RequisicaoCotacaoDetalhe requisicaoDetalhe = controller.novoRequisicaoCotacaoDetalhe();
				return requisicaoDetalhe;
			}

			protected void getRemoverSelecionados(List<RequisicaoCotacaoDetalhe> values) {
				controller.removerRequisicaoCotacaoDetalhes(values);
			}

			@Override
			public boolean validateItems(List<RequisicaoCotacaoDetalhe> items) {
				for (RequisicaoCotacaoDetalhe requisicaoCotacaoDetalhe : items) {
					if (requisicaoCotacaoDetalhe.getRequisicaoDetalhe() == null ||
							requisicaoCotacaoDetalhe.getQuantidadeCotada() == null) {
						return false;
					}
				}
				
				return true;
			}
		};

		fornecedorSubForm = new SubFormComponent<FornecedorCotacao, Integer>(FornecedorCotacao.class, new String[] { "fornecedor" },
				new String[] { "Fornecedor" }) {
			@Override
			protected TableFieldFactory getFieldFactory() {
				return new TableFieldFactory() {

					@Override
					public Field<?> createField(Container container, Object itemId, Object propertyId, Component uiContext) {
						if ("fornecedor".equals(propertyId)) {
							ComboBox comboBox = ComponentUtil.buildComboBox(null);
							BeanItemContainer<Fornecedor> fornecedorContainer = new BeanItemContainer<>(Fornecedor.class,
									controller.buscarFornecedores());
							fornecedorContainer.addNestedContainerProperty("pessoa.nome");
							comboBox.setContainerDataSource(fornecedorContainer);
							comboBox.setItemCaptionPropertyId("pessoa.nome");
							return comboBox;
						}
						return null;
					}
				};
			}

			protected FornecedorCotacao getNovo() {
				FornecedorCotacao requisicaoDetalhe = controller.novoFornecedorCotacao();
				return requisicaoDetalhe;
			}

			protected void getRemoverSelecionados(List<FornecedorCotacao> values) {
				controller.removerFornecedorCotacaos(values);
			}

			@Override
			public boolean validateItems(List<FornecedorCotacao> items) {
				for (FornecedorCotacao fornecedorCotacao : items) {
					if (fornecedorCotacao.getFornecedor() == null) {
						return false;
					}
				}
				return true;
			}
		};

		subForms.addTab(fornecedorSubForm, "Fornecedores", null);
		subForms.addTab(requisicaoDetalheSubForm, "Produtos", null);
	}

	public void fillReqCotacaoDetalhesSubForm(List<RequisicaoCotacaoDetalhe> requisicaoDetalhes) {
		requisicaoDetalheSubForm.fillWith(requisicaoDetalhes);
	}

	public void fillCompraFornecedorCotacoesSubForm(List<FornecedorCotacao> requisicaoDetalhes) {
		fornecedorSubForm.fillWith(requisicaoDetalhes);
	}

	public Label getLblId() {
		return lblId;
	}

}

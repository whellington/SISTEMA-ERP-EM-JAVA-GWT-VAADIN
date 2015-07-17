package dc.visao.geral.tabela;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import dc.controller.geral.tabela.CsosnbFormController;
import dc.visao.framework.util.ComponentUtil;

public class CsosnbFormView extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	private static final long serialVersionUID = 1L;
	
	@AutoGenerated
	private VerticalLayout mainLayout;
	@AutoGenerated
	private GridLayout fields;
	@AutoGenerated
	private TextArea txtObservacao;
	@AutoGenerated
	private TextField txtDescricao;
	@AutoGenerated
	private TextField txtCodigo;
	
	CsosnbFormController controller;
	
	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	public CsosnbFormView(CsosnbFormController controller) {
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
		fields.setHeight("-1px");
		fields.setMargin(false);
		fields.setSpacing(true);
		fields.setRows(4);
		fields.setColumns(4);
		
		// txtCodigo
				txtCodigo = ComponentUtil.buildTextField("Código");
				txtCodigo.setImmediate(false);
				fields.addComponent(txtCodigo, 0, 0);
				
				// txtDescricao
				txtDescricao = ComponentUtil.buildTextField("Descrição");
				txtDescricao.setImmediate(false);
				fields.addComponent(txtDescricao, 0, 1);
				
				// txtObservacao
				txtObservacao = ComponentUtil.buildTextArea("Observação");
				txtObservacao.setImmediate(false);
				fields.addComponent(txtObservacao, 0, 2, 1,2);
		
		return fields;
	}

	public VerticalLayout getMainLayout() {
		return mainLayout;
	}

	public void setMainLayout(VerticalLayout mainLayout) {
		this.mainLayout = mainLayout;
	}

	public GridLayout getfields() {
		return fields;
	}

	public void setfields(GridLayout fields) {
		this.fields = fields;
	}

	public TextArea getTxtObservacao() {
		return txtObservacao;
	}

	public void setTxtObservacao(TextArea txtObservacao) {
		this.txtObservacao = txtObservacao;
	}

	public TextField getTxtDescricao() {
		return txtDescricao;
	}

	public void setTxtDescricao(TextField txtDescricao) {
		this.txtDescricao = txtDescricao;
	}

	public TextField getTxtCodigo() {
		return txtCodigo;
	}

	public void setTxtCodigo(TextField txtCodigo) {
		this.txtCodigo = txtCodigo;
	}
	
}

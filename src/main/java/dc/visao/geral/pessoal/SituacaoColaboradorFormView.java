package dc.visao.geral.pessoal;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import dc.controller.geral.pessoal.SituacaoColaboradorFormController;
import dc.visao.framework.util.ComponentUtil;

public class SituacaoColaboradorFormView extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@AutoGenerated
	private GridLayout fields;

	@AutoGenerated
	private VerticalLayout mainLayout;

	@AutoGenerated
	private TextArea tfDescricao;

	@AutoGenerated
	private TextField tfNome;

	@AutoGenerated
	private TextField tfCodigo;

	private SituacaoColaboradorFormController controller;

	/**
	 * The constructor should first build the main layout, set the composition
	 * root and then do any custom initialization.
	 * 
	 * The constructor will not be automatically regenerated by the visual
	 * editor.
	 */
	public SituacaoColaboradorFormView(
			SituacaoColaboradorFormController controller) {
		buildMainLayout();
		setCompositionRoot(mainLayout);

		// TODO add user code here
		this.controller = controller;
	}

	public TextArea getTfDescricao() {
		return tfDescricao;
	}

	public void setTfDescricao(TextArea tfDescricao) {
		this.tfDescricao = tfDescricao;
	}

	public TextField getTfNome() {
		return tfNome;
	}

	public void setTfNome(TextField tfNome) {
		this.tfNome = tfNome;
	}

	public TextField getTfCodigo() {
		return tfCodigo;
	}

	public void setTfCodigo(TextField tfCodigo) {
		this.tfCodigo = tfCodigo;
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

		// tfCodigo
		tfCodigo = ComponentUtil.buildTextField("Código");
		tfCodigo.setImmediate(false);
		fields.addComponent(tfCodigo, 0, 0);

		// tfNome
		tfNome = ComponentUtil.buildTextField("Nome");
		tfNome.setImmediate(false);
		fields.addComponent(tfNome, 1, 0);

		// tfDescricao
		tfDescricao = ComponentUtil.buildTextArea("Descrição");
		tfDescricao.setImmediate(false);
		fields.addComponent(tfDescricao, 0, 1,1,1);

		return fields;
	}

}
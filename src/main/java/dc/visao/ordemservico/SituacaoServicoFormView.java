package dc.visao.ordemservico;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import dc.controller.ordemservico.SituacaoServicoFormController;
import dc.visao.framework.util.ComponentUtil;

public class SituacaoServicoFormView extends CustomComponent {

	private static final long serialVersionUID = 1L;

	@AutoGenerated
	private GridLayout fields;

	@AutoGenerated
	private VerticalLayout mainLayout;
	
	@AutoGenerated
	private TextField tfDescricao;
	
	SituacaoServicoFormController controller;

	public SituacaoServicoFormView(SituacaoServicoFormController controller) {
		buildMainLayout();
		setCompositionRoot(mainLayout);
		
		this.controller = controller;
	}

	@AutoGenerated
	private VerticalLayout buildMainLayout() {

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
		fields.setRows(1);
		fields.setColumns(3);

		tfDescricao = ComponentUtil.buildTextField("Descricao");
		tfDescricao.setImmediate(false);
		tfDescricao.setWidth("100.0%");
		tfDescricao.setHeight("-1px");
		fields.addComponent(tfDescricao, 0, 0, 1, 0);

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

	public TextField getTfDescricao() {
		return tfDescricao;
	}

	public void setTfDescricao(TextField tfDescricao) {
		this.tfDescricao = tfDescricao;
	}

}


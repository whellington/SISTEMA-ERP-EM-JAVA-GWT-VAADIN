package dc.visao.financeiro;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;

import dc.controller.financeiro.TipoRecebimentoFormController;
import dc.entidade.financeiro.TipoRecebimento;
import dc.visao.framework.util.ComponentUtil;

public class TipoRecebimentoFormView extends CustomComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@AutoGenerated
	private GridLayout mainLayout;
	private TextArea txtDescricao;
	private TextField txtTipo;
	
	TipoRecebimentoFormController controller;

	public TipoRecebimentoFormView(TipoRecebimentoFormController controller) {
		buildMainLayout();
		setCompositionRoot(mainLayout);
		
		this.controller = controller;
	}

	@AutoGenerated
	private GridLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new GridLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("100%");
		mainLayout.setHeight("-1px");
		mainLayout.setMargin(true);
		mainLayout.setSpacing(true);
		mainLayout.setRows(2);

		// top-level component properties
		setWidth("100.0%");
		setHeight("-1px");

		txtTipo = ComponentUtil.buildTextField("Tipo");
		mainLayout.addComponent(txtTipo);
		txtTipo.setMaxLength(2);
		txtTipo.setWidth("50px");

		// txtDescricao
		txtDescricao = ComponentUtil.buildTextArea("Descrição");
		mainLayout.addComponent(txtDescricao);

		return mainLayout;
	}

	public GridLayout getMainLayout() {
		return mainLayout;
	}

	public void setMainLayout(GridLayout mainLayout) {
		this.mainLayout = mainLayout;
	}

	public void preencheBean(TipoRecebimento currentBean) {
		currentBean.setDescricao(getTxtDescricao().getValue());
		currentBean.setTipo(getTxtTipo().getValue());
	}

	public void preencheForm(TipoRecebimento currentBean) {
		getTxtDescricao().setValue(currentBean.getDescricao());
		getTxtTipo().setValue(currentBean.getTipo());
	}

	public TextArea getTxtDescricao() {
		return txtDescricao;
	}

	public void setTxtDescricao(TextArea txtDescricao) {
		this.txtDescricao = txtDescricao;
	}

	public TextField getTxtTipo() {
		return txtTipo;
	}

	public void setTxtTipo(TextField txtTipo) {
		this.txtTipo = txtTipo;
	}

}
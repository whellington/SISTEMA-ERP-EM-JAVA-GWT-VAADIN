package dc.visao.financeiro;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import dc.entidade.financeiro.AgenciaBancoEntity;
import dc.entidade.financeiro.type.TipoType;
import dc.visao.framework.component.manytoonecombo.ManyToOneComboField;
import dc.visao.framework.util.ComponentUtil;

public class ContaCaixaFormView extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@AutoGenerated
	private GridLayout glGeral;

	@AutoGenerated
	private TextArea txtDescricao;

	@AutoGenerated
	private ComboBox cmbTipo;

	@AutoGenerated
	private TextField txtNome;

	@AutoGenerated
	private TextField txtDigito;

	@AutoGenerated
	private TextField txtCodigo;

	@AutoGenerated
	private VerticalLayout mainLayout;

	private ManyToOneComboField<AgenciaBancoEntity> cmbAgenciaBanco;

	// @AutoGenerated
	// private ManyToOneCombo<TipoPagamento> cmbTipo;

	/*
	 * @AutoGenerated private ManyToOneCombo<AgenciaBanco> cmbAgenciaBanco;
	 * 
	 * @AutoGenerated private ManyToOneCombo<ContabilConta> cmbContabilConta;
	 */

	/**
	 * The constructor should first build the main layout, set the composition
	 * root and then do any custom initialization.
	 * 
	 * The constructor will not be automatically regenerated by the visual
	 * editor.
	 */
	public ContaCaixaFormView() {
		buildMainLayout();
		setCompositionRoot(mainLayout);

		// TODO add user code here
	}

	@AutoGenerated
	private void buildMainLayout() {
		// the main layout and components will be created here
		mainLayout = new VerticalLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("100%");
		mainLayout.setHeight("100%");
		mainLayout.setMargin(true);
		mainLayout.setSpacing(true);

		// top-level component properties
		setWidth("100.0%");
		setHeight("100.0%");

		glGeral = bglGeral();
		mainLayout.addComponent(glGeral);
		
		for (TipoType en : TipoType.values()) {
			cmbTipo.addItem(en);
		}

	}

	/**
	 * GERAL
	 */

	@AutoGenerated
	private GridLayout bglGeral() {
		// common part: create layout
		glGeral = new GridLayout(4, 3);
		glGeral.setImmediate(false);
		glGeral.setWidth("100.0%");
		glGeral.setHeight("-1px");
		glGeral.setMargin(false);
		glGeral.setSpacing(true);

		// cmbAgenciaBanco
		cmbAgenciaBanco = new ManyToOneComboField<>(AgenciaBancoEntity.class);
		cmbAgenciaBanco.setCaption("Agência Banco");
		glGeral.addComponent(cmbAgenciaBanco, 0,0);

		// txtCodigo
		txtCodigo = ComponentUtil.buildTextField("Código");
		txtCodigo.setImmediate(false);
		glGeral.addComponent(txtCodigo, 0,1);

		// txtDigito
		txtDigito = ComponentUtil.buildTextField("Dígito");
		txtDigito.setImmediate(false);
		glGeral.addComponent(txtDigito, 1,1);

		// txtNome
		txtNome = ComponentUtil.buildTextField("Nome");
		txtNome.setImmediate(false);
		glGeral.addComponent(txtNome, 2,1);

		// cmbTipo
		cmbTipo = ComponentUtil.buildComboBox("Tipo");
		cmbTipo.setImmediate(false);
		glGeral.addComponent(cmbTipo, 3,1);

		// txtDescricao
		txtDescricao = ComponentUtil.buildTextArea("Descrição");
		txtDescricao.setImmediate(false);
		glGeral.addComponent(txtDescricao, 0,2, 3,2);

		return glGeral;
	}

	public TextArea getTxtDescricao() {
		return txtDescricao;
	}

	public void setTxtDescricao(TextArea txtDescricao) {
		this.txtDescricao = txtDescricao;
	}

	public TextField getTxtNome() {
		return txtNome;
	}

	public void setTxtNome(TextField txtNome) {
		this.txtNome = txtNome;
	}

	public TextField getTxtDigito() {
		return txtDigito;
	}

	public void setTxtDigito(TextField txtDigito) {
		this.txtDigito = txtDigito;
	}

	public TextField getTxtCodigo() {
		return txtCodigo;
	}

	public void setTxtCodigo(TextField txtCodigo) {
		this.txtCodigo = txtCodigo;
	}

	public ComboBox getCmbTipo() {
		return cmbTipo;
	}

	public void setCmbTipo(ComboBox cmbTipo) {
		this.cmbTipo = cmbTipo;
	}

    public ManyToOneComboField<AgenciaBancoEntity> getCmbAgenciaBanco() {
		return cmbAgenciaBanco;
	}

	public void setCmbAgenciaBanco(ManyToOneComboField<AgenciaBancoEntity> cmbAgenciaBanco) {
		this.cmbAgenciaBanco = cmbAgenciaBanco;
	}

}
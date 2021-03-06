package dc.visao.geral.tabela;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class EfdTabela4313FormView extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	@AutoGenerated
	private GridLayout fields;
	@AutoGenerated
	private VerticalLayout mainLayout;
	@AutoGenerated
	private PopupDateField dtFimVigencia;
	@AutoGenerated
	private PopupDateField dtInicioVigencia;
	@AutoGenerated
	private TextField txtObservacao;
	@AutoGenerated
	private TextField txtDescricao;
	@AutoGenerated
	private TextField txtCodigo;
	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	public EfdTabela4313FormView() {
		buildMainLayout();
		setCompositionRoot(mainLayout);

		// TODO add user code here
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
		txtCodigo = new TextField();
		txtCodigo.setCaption("Código");
		txtCodigo.setImmediate(false);
		txtCodigo.setWidth("100px");
		txtCodigo.setHeight("-1px");
		txtCodigo.setSizeFull();
		fields.addComponent(txtCodigo, 0, 0);
		
		// txtDescricao
		txtDescricao = new TextField();
		txtDescricao.setCaption("Descrição");
		txtDescricao.setImmediate(false);
		txtDescricao.setWidth("594px");
		txtDescricao.setHeight("-1px");
		txtDescricao.setSizeFull();
		fields.addComponent(txtDescricao, 1, 0);
		
		// txtObservacao
		txtObservacao = new TextField();
		txtObservacao.setCaption("Observação");
		txtObservacao.setImmediate(false);
		txtObservacao.setWidth("700px");
		txtObservacao.setHeight("-1px");
		txtObservacao.setSizeFull();
		fields.addComponent(txtObservacao, 0, 1);
		
		// dtInicioVigencia
		dtInicioVigencia = new PopupDateField();
		dtInicioVigencia.setCaption("Início da Vigência");
		dtInicioVigencia.setImmediate(false);
		dtInicioVigencia.setWidth("-1px");
		dtInicioVigencia.setHeight("-1px");
		dtInicioVigencia.setSizeFull();
		fields.addComponent(dtInicioVigencia, 0, 2);
		
		// dtFimVigencia
		dtFimVigencia = new PopupDateField();
		dtFimVigencia.setCaption("Fim da Vigência");
		dtFimVigencia.setImmediate(false);
		dtFimVigencia.setWidth("-1px");
		dtFimVigencia.setHeight("-1px");
		dtFimVigencia.setSizeFull();
		fields.addComponent(dtFimVigencia, 1, 2);
		
		return fields;
	}

	public GridLayout getFields() {
		return fields;
	}

	public void setFields(GridLayout fields) {
		this.fields = fields;
	}

	public VerticalLayout getVerticalLayout() {
		return mainLayout;
	}

	public void setVerticalLayout(VerticalLayout mainLayout) {
		this.mainLayout = mainLayout;
	}

	public PopupDateField getDtFimVigencia() {
		return dtFimVigencia;
	}

	public void setDtFimVigencia(PopupDateField dtFimVigencia) {
		this.dtFimVigencia = dtFimVigencia;
	}

	public PopupDateField getDtInicioVigencia() {
		return dtInicioVigencia;
	}

	public void setDtInicioVigencia(PopupDateField dtInicioVigencia) {
		this.dtInicioVigencia = dtInicioVigencia;
	}

	public TextField getTxtObservacao() {
		return txtObservacao;
	}

	public void setTxtObservacao(TextField txtObservacao) {
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

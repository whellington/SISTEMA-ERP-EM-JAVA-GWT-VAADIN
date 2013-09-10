package dc.visao.tabelas;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextField;

public class SpedPis4310FormView extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	@AutoGenerated
	private GridLayout mainLayout;
	@AutoGenerated
	private HorizontalLayout horizontalLayout_3;
	@AutoGenerated
	private PopupDateField dtFimVigencia;
	@AutoGenerated
	private PopupDateField dtInicioVigencia;
	@AutoGenerated
	private HorizontalLayout horizontalLayout_2;
	@AutoGenerated
	private TextField txtObservacao;
	@AutoGenerated
	private HorizontalLayout horizontalLayout_1;
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
	public SpedPis4310FormView() {
		buildMainLayout();
		setCompositionRoot(mainLayout);

		// TODO add user code here
	}

	@AutoGenerated
	private GridLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new GridLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("-1px");
		mainLayout.setHeight("-1px");
		mainLayout.setMargin(true);
		mainLayout.setSpacing(true);
		mainLayout.setRows(3);
		
		// top-level component properties
		setWidth("-1px");
		setHeight("-1px");
		
		// horizontalLayout_1
		horizontalLayout_1 = buildHorizontalLayout_1();
		mainLayout.addComponent(horizontalLayout_1, 0, 0);
		
		// horizontalLayout_2
		horizontalLayout_2 = buildHorizontalLayout_2();
		mainLayout.addComponent(horizontalLayout_2, 0, 1);
		
		// horizontalLayout_3
		horizontalLayout_3 = buildHorizontalLayout_3();
		mainLayout.addComponent(horizontalLayout_3, 0, 2);
		
		return mainLayout;
	}

	@AutoGenerated
	private HorizontalLayout buildHorizontalLayout_1() {
		// common part: create layout
		horizontalLayout_1 = new HorizontalLayout();
		horizontalLayout_1.setImmediate(false);
		horizontalLayout_1.setWidth("-1px");
		horizontalLayout_1.setHeight("-1px");
		horizontalLayout_1.setMargin(false);
		horizontalLayout_1.setSpacing(true);
		
		// txtCodigo
		txtCodigo = new TextField();
		txtCodigo.setCaption("Código");
		txtCodigo.setImmediate(false);
		txtCodigo.setWidth("100px");
		txtCodigo.setHeight("-1px");
		horizontalLayout_1.addComponent(txtCodigo);
		
		// txtDescricao
		txtDescricao = new TextField();
		txtDescricao.setCaption("Descrição");
		txtDescricao.setImmediate(false);
		txtDescricao.setWidth("594px");
		txtDescricao.setHeight("-1px");
		horizontalLayout_1.addComponent(txtDescricao);
		
		return horizontalLayout_1;
	}

	@AutoGenerated
	private HorizontalLayout buildHorizontalLayout_2() {
		// common part: create layout
		horizontalLayout_2 = new HorizontalLayout();
		horizontalLayout_2.setImmediate(false);
		horizontalLayout_2.setWidth("-1px");
		horizontalLayout_2.setHeight("-1px");
		horizontalLayout_2.setMargin(false);
		horizontalLayout_2.setSpacing(true);
		
		// txtObservacao
		txtObservacao = new TextField();
		txtObservacao.setCaption("Observação");
		txtObservacao.setImmediate(false);
		txtObservacao.setWidth("700px");
		txtObservacao.setHeight("-1px");
		horizontalLayout_2.addComponent(txtObservacao);
		
		return horizontalLayout_2;
	}

	@AutoGenerated
	private HorizontalLayout buildHorizontalLayout_3() {
		// common part: create layout
		horizontalLayout_3 = new HorizontalLayout();
		horizontalLayout_3.setImmediate(false);
		horizontalLayout_3.setWidth("-1px");
		horizontalLayout_3.setHeight("-1px");
		horizontalLayout_3.setMargin(false);
		horizontalLayout_3.setSpacing(true);
		
		// dtInicioVigencia
		dtInicioVigencia = new PopupDateField();
		dtInicioVigencia.setCaption("Início da Vigência");
		dtInicioVigencia.setImmediate(false);
		dtInicioVigencia.setWidth("-1px");
		dtInicioVigencia.setHeight("-1px");
		horizontalLayout_3.addComponent(dtInicioVigencia);
		
		// dtFimVigencia
		dtFimVigencia = new PopupDateField();
		dtFimVigencia.setCaption("Fim da Vigência");
		dtFimVigencia.setImmediate(false);
		dtFimVigencia.setWidth("-1px");
		dtFimVigencia.setHeight("-1px");
		horizontalLayout_3.addComponent(dtFimVigencia);
		
		return horizontalLayout_3;
	}

	public GridLayout getMainLayout() {
		return mainLayout;
	}

	public void setMainLayout(GridLayout mainLayout) {
		this.mainLayout = mainLayout;
	}

	public HorizontalLayout getHorizontalLayout_3() {
		return horizontalLayout_3;
	}

	public void setHorizontalLayout_3(HorizontalLayout horizontalLayout_3) {
		this.horizontalLayout_3 = horizontalLayout_3;
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

	public HorizontalLayout getHorizontalLayout_2() {
		return horizontalLayout_2;
	}

	public void setHorizontalLayout_2(HorizontalLayout horizontalLayout_2) {
		this.horizontalLayout_2 = horizontalLayout_2;
	}

	public TextField getTxtObservacao() {
		return txtObservacao;
	}

	public void setTxtObservacao(TextField txtObservacao) {
		this.txtObservacao = txtObservacao;
	}

	public HorizontalLayout getHorizontalLayout_1() {
		return horizontalLayout_1;
	}

	public void setHorizontalLayout_1(HorizontalLayout horizontalLayout_1) {
		this.horizontalLayout_1 = horizontalLayout_1;
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

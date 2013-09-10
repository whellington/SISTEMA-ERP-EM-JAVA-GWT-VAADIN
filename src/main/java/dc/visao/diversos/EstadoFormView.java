package dc.visao.diversos;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import dc.entidade.diversos.Pais;
import dc.visao.framework.component.manytoonecombo.ManyToOneCombo;

public class EstadoFormView extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	@AutoGenerated
	private GridLayout mainLayout;
	@AutoGenerated
	private HorizontalLayout horizontalLayout_1;
	@AutoGenerated
	private TextField txtCodigoIBGE;
	@AutoGenerated
	private TextField txtSigla;
	@AutoGenerated
	private VerticalLayout verticalLayout_1;
	@AutoGenerated
	private TextField txtNome;
	
	private ManyToOneCombo<Pais> cmbPais;
	
	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	public EstadoFormView() {
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
		mainLayout.setRows(2);
		
		// top-level component properties
		setWidth("-1px");
		setHeight("-1px");
		
		// verticalLayout_1
		verticalLayout_1 = buildVerticalLayout_1();
		mainLayout.addComponent(verticalLayout_1, 0, 0);
		
		// horizontalLayout_1
		horizontalLayout_1 = buildHorizontalLayout_1();
		mainLayout.addComponent(horizontalLayout_1, 0, 1);
		
		return mainLayout;
	}

	@AutoGenerated
	private VerticalLayout buildVerticalLayout_1() {
		// common part: create layout
		verticalLayout_1 = new VerticalLayout();
		verticalLayout_1.setImmediate(false);
		verticalLayout_1.setWidth("-1px");
		verticalLayout_1.setHeight("-1px");
		verticalLayout_1.setMargin(false);
		verticalLayout_1.setSpacing(true);
		
		// cmbPais
		cmbPais = new ManyToOneCombo<>();
		cmbPais.setCaption("País");
		cmbPais.setImmediate(false);
		cmbPais.setWidth("600px");
		cmbPais.setHeight("-1px");
		verticalLayout_1.addComponent(cmbPais);
		
		// txtNome
		txtNome = new TextField();
		txtNome.setCaption("Nome");
		txtNome.setImmediate(false);
		txtNome.setWidth("600px");
		txtNome.setHeight("-1px");
		txtNome.setRequired(true);
		verticalLayout_1.addComponent(txtNome);
		
		return verticalLayout_1;
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
		
		// txtSigla
		txtSigla = new TextField();
		txtSigla.setCaption("Sigla");
		txtSigla.setImmediate(false);
		txtSigla.setWidth("340px");
		txtSigla.setHeight("-1px");
		horizontalLayout_1.addComponent(txtSigla);
		
		// txtCodigoIBGE
		txtCodigoIBGE = new TextField();
		txtCodigoIBGE.setCaption("Código IBGE");
		txtCodigoIBGE.setImmediate(false);
		txtCodigoIBGE.setWidth("254px");
		txtCodigoIBGE.setHeight("-1px");
		horizontalLayout_1.addComponent(txtCodigoIBGE);
		
		return horizontalLayout_1;
	}

	public GridLayout getMainLayout() {
		return mainLayout;
	}

	public void setMainLayout(GridLayout mainLayout) {
		this.mainLayout = mainLayout;
	}

	public HorizontalLayout getHorizontalLayout_1() {
		return horizontalLayout_1;
	}

	public void setHorizontalLayout_1(HorizontalLayout horizontalLayout_1) {
		this.horizontalLayout_1 = horizontalLayout_1;
	}

	public TextField getTxtCodigoIBGE() {
		return txtCodigoIBGE;
	}

	public void setTxtCodigoIBGE(TextField txtCodigoIBGE) {
		this.txtCodigoIBGE = txtCodigoIBGE;
	}

	public TextField getTxtSigla() {
		return txtSigla;
	}

	public void setTxtSigla(TextField txtSigla) {
		this.txtSigla = txtSigla;
	}

	public VerticalLayout getVerticalLayout_1() {
		return verticalLayout_1;
	}

	public void setVerticalLayout_1(VerticalLayout verticalLayout_1) {
		this.verticalLayout_1 = verticalLayout_1;
	}

	public TextField getTxtNome() {
		return txtNome;
	}

	public void setTxtNome(TextField txtNome) {
		this.txtNome = txtNome;
	}

	public ManyToOneCombo<Pais> getCmbPais() {
		return cmbPais;
	}

	public void setCmbPais(ManyToOneCombo<Pais> cmbPais) {
		this.cmbPais = cmbPais;
	}
	
}

package dc.visao.financeiro;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.TextField;

import dc.entidade.financeiro.ContaCaixa;
import dc.entidade.financeiro.type.StatusType;
import dc.visao.framework.component.manytoonecombo.ManyToOneCombo;

public class TalonarioChequeFormView extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@AutoGenerated
	private GridLayout mainLayout;
	@AutoGenerated
	private HorizontalLayout horizontalLayout_2;
	@AutoGenerated
	private ComboBox cmbStatus;
	@AutoGenerated
	private TextField txtNumero;
	@AutoGenerated
	private TextField txtTalao;
	@AutoGenerated
	private HorizontalLayout horizontalLayout_1;

	private ManyToOneCombo<ContaCaixa> cmbContaCaixa;

	/**
	 * The constructor should first build the main layout, set the composition
	 * root and then do any custom initialization.
	 * 
	 * The constructor will not be automatically regenerated by the visual
	 * editor.
	 */
	public TalonarioChequeFormView() {
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

		// horizontalLayout_1
		horizontalLayout_1 = buildHorizontalLayout_1();
		mainLayout.addComponent(horizontalLayout_1, 0, 0);

		// horizontalLayout_2
		horizontalLayout_2 = buildHorizontalLayout_2();
		mainLayout.addComponent(horizontalLayout_2, 0, 1);

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

		// cmbContaCaixa
		cmbContaCaixa = new ManyToOneCombo<>();
		cmbContaCaixa.setCaption("Conta Caixa");
		cmbContaCaixa.setImmediate(false);
		cmbContaCaixa.setWidth("500px");
		cmbContaCaixa.setHeight("-1px");
		horizontalLayout_1.addComponent(cmbContaCaixa);

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

		// txtTalao
		txtTalao = new TextField();
		txtTalao.setCaption("Talão");
		txtTalao.setImmediate(false);
		txtTalao.setWidth("180px");
		txtTalao.setHeight("-1px");
		txtTalao.setRequired(true);
		horizontalLayout_2.addComponent(txtTalao);

		// txtNumero
		txtNumero = new TextField();
		txtNumero.setCaption("Número");
		txtNumero.setImmediate(false);
		txtNumero.setWidth("-1px");
		txtNumero.setHeight("-1px");
		txtNumero.setRequired(true);
		horizontalLayout_2.addComponent(txtNumero);

		// cmbStatus
		cmbStatus = new ComboBox();
		cmbStatus.setCaption("Status");
		cmbStatus.setImmediate(false);
		cmbStatus.setWidth("167px");
		cmbStatus.setHeight("-1px");
		cmbStatus.setRequired(true);
		horizontalLayout_2.addComponent(cmbStatus);

		return horizontalLayout_2;
	}

	public void InitCbs() {

		cmbStatus.addItem(StatusType.NORMAL.toString());
		cmbStatus.addItem(StatusType.CANCELADO.toString());
		cmbStatus.addItem(StatusType.EXTRAVIADO.toString());
		cmbStatus.addItem(StatusType.UTILIZADO.toString());

	}

	public String getCbStatus() {
		String cbvalue = new String();
		if (cmbStatus.getValue() == "Normal") {
			cbvalue = "N";
		} else if (cmbStatus.getValue() == "Cancelado") {
			cbvalue = "C";
		} else if (cmbStatus.getValue() == "Extraviado") {

			cbvalue = "E";
		} else if (cmbStatus.getValue() == "Utilizado") {

			cbvalue = "U";
		}
		return cbvalue;
	}

	public void setCbStatus(String cbStatus) {
		if (cbStatus.equalsIgnoreCase("N")) {
			this.cmbStatus.setValue("Normal");
		} else if (cbStatus.equalsIgnoreCase("c")) {
			this.cmbStatus.setValue("Cancelado");
		} else if (cbStatus.equalsIgnoreCase("E")) {

			this.cmbStatus.setValue("Extraviado");
		} else if (cbStatus.equalsIgnoreCase("U")) {

			this.cmbStatus.setValue("Utilizado");
		}
	}

	public GridLayout getMainLayout() {
		return mainLayout;
	}

	public void setMainLayout(GridLayout mainLayout) {
		this.mainLayout = mainLayout;
	}

	public HorizontalLayout getHorizontalLayout_2() {
		return horizontalLayout_2;
	}

	public void setHorizontalLayout_2(HorizontalLayout horizontalLayout_2) {
		this.horizontalLayout_2 = horizontalLayout_2;
	}

	public TextField getTxtNumero() {
		return txtNumero;
	}

	public void setTxtNumero(TextField txtNumero) {
		this.txtNumero = txtNumero;
	}

	public TextField getTxtTalao() {
		return txtTalao;
	}

	public void setTxtTalao(TextField txtTalao) {
		this.txtTalao = txtTalao;
	}

	public HorizontalLayout getHorizontalLayout_1() {
		return horizontalLayout_1;
	}

	public void setHorizontalLayout_1(HorizontalLayout horizontalLayout_1) {
		this.horizontalLayout_1 = horizontalLayout_1;
	}

	public ManyToOneCombo<ContaCaixa> getCmbContaCaixa() {
		return cmbContaCaixa;
	}

	public void setCmbContaCaixa(ManyToOneCombo<ContaCaixa> cmbContaCaixa) {
		this.cmbContaCaixa = cmbContaCaixa;
	}

}
package dc.visao.financeiro;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextField;

import dc.entidade.financeiro.TalonarioCheque;
import dc.entidade.financeiro.type.StatusChequeType;
import dc.visao.framework.component.manytoonecombo.ManyToOneCombo;

public class ChequeFormView extends CustomComponent {

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
	private PopupDateField dtStatus;

	@AutoGenerated
	private ComboBox cmbStatus;

	@AutoGenerated
	private TextField txtNumero;

	@AutoGenerated
	private HorizontalLayout horizontalLayout_1;

	@AutoGenerated
	private ManyToOneCombo<TalonarioCheque> cmbTalonarioCheque;

	/**
	 * The constructor should first build the main layout, set the composition
	 * root and then do any custom initialization.
	 * 
	 * The constructor will not be automatically regenerated by the visual
	 * editor.
	 */
	public ChequeFormView() {
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

		// cmbTalonarioCheque
		cmbTalonarioCheque = new ManyToOneCombo<TalonarioCheque>();
		cmbTalonarioCheque.setCaption("Talonário Cheque");
		cmbTalonarioCheque.setImmediate(false);
		cmbTalonarioCheque.setWidth("480px");
		cmbTalonarioCheque.setHeight("-1px");
		horizontalLayout_1.addComponent(cmbTalonarioCheque);

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
		cmbStatus.setWidth("-1px");
		cmbStatus.setHeight("-1px");
		cmbStatus.setRequired(true);
		horizontalLayout_2.addComponent(cmbStatus);

		// dtStatus
		dtStatus = new PopupDateField();
		dtStatus.setCaption("Data Status");
		dtStatus.setImmediate(false);
		dtStatus.setWidth("-1px");
		dtStatus.setHeight("-1px");
		dtStatus.setRequired(true);
		horizontalLayout_2.addComponent(dtStatus);

		return horizontalLayout_2;
	}

	public void InitCbs() {
		cmbStatus.addItem(StatusChequeType.EMSER.toString());
		cmbStatus.addItem(StatusChequeType.BAIXADO.toString());
		cmbStatus.addItem(StatusChequeType.UTILIZADO.toString());
		cmbStatus.addItem(StatusChequeType.CANCELADO.toString());
		cmbStatus.addItem(StatusChequeType.COMPENSADO.toString());
	}

	public String getCbStatusCheque() {
		String cbvalue = new String();
		if (cmbStatus.getValue() == "Em ser") {
			cbvalue = "E";
		} else if (cmbStatus.getValue() == "Baixado") {
			cbvalue = "B";
		} else if (cmbStatus.getValue() == "Utilizado") {

			cbvalue = "U";
		} else if (cmbStatus.getValue() == "Compensado") {

			cbvalue = "C";
		} else if (cmbStatus.getValue() == "Cancelado") {

			cbvalue = "N";
		}
		return cbvalue;
	}

	public void setCbStatusCheque(String cbStatusCheque) {
		if (cbStatusCheque.equalsIgnoreCase("E")) {
			this.cmbStatus.setValue("Em ser");
		} else if (cbStatusCheque.equalsIgnoreCase("B")) {
			this.cmbStatus.setValue("Baixado");
		} else if (cbStatusCheque.equalsIgnoreCase("U")) {

			this.cmbStatus.setValue("Utilizado");
		} else if (cbStatusCheque.equalsIgnoreCase("C")) {

			this.cmbStatus.setValue("Compensado");
		} else if (cbStatusCheque.equalsIgnoreCase("N")) {

			this.cmbStatus.setValue("Cancelado");
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

	public PopupDateField getDtStatus() {
		return dtStatus;
	}

	public void setDtStatus(PopupDateField dtStatus) {
		this.dtStatus = dtStatus;
	}

	public TextField getTxtNumero() {
		return txtNumero;
	}

	public void setTxtNumero(TextField txtNumero) {
		this.txtNumero = txtNumero;
	}

	public HorizontalLayout getHorizontalLayout_1() {
		return horizontalLayout_1;
	}

	public void setHorizontalLayout_1(HorizontalLayout horizontalLayout_1) {
		this.horizontalLayout_1 = horizontalLayout_1;
	}

	public ManyToOneCombo<TalonarioCheque> getCmbTalonarioCheque() {
		return cmbTalonarioCheque;
	}

	public void setCmbTalonarioCheque(
			ManyToOneCombo<TalonarioCheque> cmbTalonarioCheque) {
		this.cmbTalonarioCheque = cmbTalonarioCheque;
	}

}

package dc.visao.diversos;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class OperadoraCartaoFormView extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	@AutoGenerated
	private VerticalLayout mainLayout;
	@AutoGenerated
	private TextField txtTelefone2;
	@AutoGenerated
	private TextField txtTelefone1;
	@AutoGenerated
	private TextField txtVencimentoAluguel;
	@AutoGenerated
	private TextField txtValorAluguelPosPin;
	@AutoGenerated
	private TextField txtTaxaAdmDebito;
	@AutoGenerated
	private TextField txtTaxaAdm;
	@AutoGenerated
	private TextField txtNome;
	@AutoGenerated
	private TextField txtBandeira;
	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	public OperadoraCartaoFormView() {
		buildMainLayout();
		setCompositionRoot(mainLayout);

		// TODO add user code here
	}

	@AutoGenerated
	private VerticalLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new VerticalLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("100%");
		mainLayout.setHeight("100%");
		mainLayout.setMargin(false);
		
		// top-level component properties
		setWidth("100.0%");
		setHeight("100.0%");
		
		// txtBandeira
		txtBandeira = new TextField();
		txtBandeira.setCaption("Bandeira");
		txtBandeira.setImmediate(false);
		txtBandeira.setWidth("-1px");
		txtBandeira.setHeight("-1px");
		mainLayout.addComponent(txtBandeira);
		
		// txtNome
		txtNome = new TextField();
		txtNome.setCaption("Nome");
		txtNome.setImmediate(false);
		txtNome.setWidth("-1px");
		txtNome.setHeight("-1px");
		mainLayout.addComponent(txtNome);
		
		// txtTaxaAdm
		txtTaxaAdm = new TextField();
		txtTaxaAdm.setCaption("Taxa ADM");
		txtTaxaAdm.setImmediate(false);
		txtTaxaAdm.setWidth("-1px");
		txtTaxaAdm.setHeight("-1px");
		mainLayout.addComponent(txtTaxaAdm);
		
		// txtTaxaAdmDebito
		txtTaxaAdmDebito = new TextField();
		txtTaxaAdmDebito.setCaption("Taxa ADM D�bito");
		txtTaxaAdmDebito.setImmediate(false);
		txtTaxaAdmDebito.setWidth("-1px");
		txtTaxaAdmDebito.setHeight("-1px");
		mainLayout.addComponent(txtTaxaAdmDebito);
		
		// txtValorAluguelPosPin
		txtValorAluguelPosPin = new TextField();
		txtValorAluguelPosPin.setCaption("Valor Aluguel Pos Pin");
		txtValorAluguelPosPin.setImmediate(false);
		txtValorAluguelPosPin.setWidth("-1px");
		txtValorAluguelPosPin.setHeight("-1px");
		mainLayout.addComponent(txtValorAluguelPosPin);
		
		// txtVencimentoAluguel
		txtVencimentoAluguel = new TextField();
		txtVencimentoAluguel.setCaption("Vencimento Aluguel");
		txtVencimentoAluguel.setImmediate(false);
		txtVencimentoAluguel.setWidth("-1px");
		txtVencimentoAluguel.setHeight("-1px");
		mainLayout.addComponent(txtVencimentoAluguel);
		
		// txtTelefone1
		txtTelefone1 = new TextField();
		txtTelefone1.setCaption("Telefone 1");
		txtTelefone1.setImmediate(false);
		txtTelefone1.setWidth("-1px");
		txtTelefone1.setHeight("-1px");
		mainLayout.addComponent(txtTelefone1);
		
		// txtTelefone2
		txtTelefone2 = new TextField();
		txtTelefone2.setCaption("Telefone 2");
		txtTelefone2.setImmediate(false);
		txtTelefone2.setWidth("-1px");
		txtTelefone2.setHeight("-1px");
		mainLayout.addComponent(txtTelefone2);
		
		return mainLayout;
	}

	public TextField getTxtTelefone2() {
		return txtTelefone2;
	}

	public void setTxtTelefone2(TextField txtTelefone2) {
		this.txtTelefone2 = txtTelefone2;
	}

	public TextField getTxtTelefone1() {
		return txtTelefone1;
	}

	public void setTxtTelefone1(TextField txtTelefone1) {
		this.txtTelefone1 = txtTelefone1;
	}

	public TextField getTxtVencimentoAluguel() {
		return txtVencimentoAluguel;
	}

	public void setTxtVencimentoAluguel(TextField txtVencimentoAluguel) {
		this.txtVencimentoAluguel = txtVencimentoAluguel;
	}

	public TextField getTxtValorAluguelPosPin() {
		return txtValorAluguelPosPin;
	}

	public void setTxtValorAluguelPosPin(TextField txtValorAluguelPosPin) {
		this.txtValorAluguelPosPin = txtValorAluguelPosPin;
	}

	public TextField getTxtTaxaAdmDebito() {
		return txtTaxaAdmDebito;
	}

	public void setTxtTaxaAdmDebito(TextField txtTaxaAdmDebito) {
		this.txtTaxaAdmDebito = txtTaxaAdmDebito;
	}

	public TextField getTxtTaxaAdm() {
		return txtTaxaAdm;
	}

	public void setTxtTaxaAdm(TextField txtTaxaAdm) {
		this.txtTaxaAdm = txtTaxaAdm;
	}

	public TextField getTxtNome() {
		return txtNome;
	}

	public void setTxtNome(TextField txtNome) {
		this.txtNome = txtNome;
	}

	public TextField getTxtBandeira() {
		return txtBandeira;
	}

	public void setTxtBandeira(TextField txtBandeira) {
		this.txtBandeira = txtBandeira;
	}
	
}
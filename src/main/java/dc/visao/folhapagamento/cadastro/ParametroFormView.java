package dc.visao.folhapagamento.cadastro;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import dc.controller.folhapagamento.cadastro.ParametroFormController;

public class ParametroFormView extends CustomComponent {

	@AutoGenerated
	private VerticalLayout mainLayout;

	@AutoGenerated
	private Panel panel_1;

	@AutoGenerated
	private VerticalLayout verticalLayout_2;

	@AutoGenerated
	private GridLayout gridLayout_1;

	@AutoGenerated
	private TextField tfCompetencia;

	@AutoGenerated
	private TextField tfContribuiPis;

	@AutoGenerated
	private TextField tfAliquotaPis;

	@AutoGenerated
	private TextField tfDiscriminarDsr;

	@AutoGenerated
	private TextField tfDiaPagamento;

	@AutoGenerated
	private TextField tfCalculoProporcionalidade;

	@AutoGenerated
	private TextField tfDescontarFaltas13;

	@AutoGenerated
	private TextField tfPagarAdicionais13;

	@AutoGenerated
	private TextField tfPagarEstagiarios13;

	@AutoGenerated
	private TextField tfMesAdiantamento13;

	@AutoGenerated
	private TextField tfPercentualAdiantam13;

	@AutoGenerated
	private TextField tfFeriasDescontarFaltas;

	@AutoGenerated
	private TextField tfFeriasPagarAdicionais;

	@AutoGenerated
	private TextField tfFeriasAdiantar13;

	@AutoGenerated
	private TextField tfFeriasPagarEstagiarios;

	@AutoGenerated
	private TextField tfFeriasCalcJustaCausa;

	@AutoGenerated
	private TextField tfFeriasMovimentoMensal;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	private ParametroFormController controller;

	public ParametroFormView(final ParametroFormController controller) {
		this.controller = controller;

		buildMainLayout();
		setCompositionRoot(this.mainLayout);
	}

	public TextField getTfCompetencia() {
		return tfCompetencia;
	}

	public void setTfCompetencia(TextField tfCompetencia) {
		this.tfCompetencia = tfCompetencia;
	}

	public TextField getTfContribuiPis() {
		return tfContribuiPis;
	}

	public void setTfContribuiPis(TextField tfContribuiPis) {
		this.tfContribuiPis = tfContribuiPis;
	}

	public TextField getTfAliquotaPis() {
		return tfAliquotaPis;
	}

	public void setTfAliquotaPis(TextField tfAliquotaPis) {
		this.tfAliquotaPis = tfAliquotaPis;
	}

	public TextField getTfDiscriminarDsr() {
		return tfDiscriminarDsr;
	}

	public void setTfDiscriminarDsr(TextField tfDiscriminarDsr) {
		this.tfDiscriminarDsr = tfDiscriminarDsr;
	}

	public TextField getTfDiaPagamento() {
		return tfDiaPagamento;
	}

	public void setTfDiaPagamento(TextField tfDiaPagamento) {
		this.tfDiaPagamento = tfDiaPagamento;
	}

	public TextField getTfCalculoProporcionalidade() {
		return tfCalculoProporcionalidade;
	}

	public void setTfCalculoProporcionalidade(
			TextField tfCalculoProporcionalidade) {
		this.tfCalculoProporcionalidade = tfCalculoProporcionalidade;
	}

	public TextField getTfDescontarFaltas13() {
		return tfDescontarFaltas13;
	}

	public void setTfDescontarFaltas13(TextField tfDescontarFaltas13) {
		this.tfDescontarFaltas13 = tfDescontarFaltas13;
	}

	public TextField getTfPagarAdicionais13() {
		return tfPagarAdicionais13;
	}

	public void setTfPagarAdicionais13(TextField tfPagarAdicionais13) {
		this.tfPagarAdicionais13 = tfPagarAdicionais13;
	}

	public TextField getTfPagarEstagiarios13() {
		return tfPagarEstagiarios13;
	}

	public void setTfPagarEstagiarios13(TextField tfPagarEstagiarios13) {
		this.tfPagarEstagiarios13 = tfPagarEstagiarios13;
	}

	public TextField getTfMesAdiantamento13() {
		return tfMesAdiantamento13;
	}

	public void setTfMesAdiantamento13(TextField tfMesAdiantamento13) {
		this.tfMesAdiantamento13 = tfMesAdiantamento13;
	}

	public TextField getTfPercentualAdiantam13() {
		return tfPercentualAdiantam13;
	}

	public void setTfPercentualAdiantam13(TextField tfPercentualAdiantam13) {
		this.tfPercentualAdiantam13 = tfPercentualAdiantam13;
	}

	public TextField getTfFeriasDescontarFaltas() {
		return tfFeriasDescontarFaltas;
	}

	public void setTfFeriasDescontarFaltas(TextField tfFeriasDescontarFaltas) {
		this.tfFeriasDescontarFaltas = tfFeriasDescontarFaltas;
	}

	public TextField getTfFeriasPagarAdicionais() {
		return tfFeriasPagarAdicionais;
	}

	public void setTfFeriasPagarAdicionais(TextField tfFeriasPagarAdicionais) {
		this.tfFeriasPagarAdicionais = tfFeriasPagarAdicionais;
	}

	public TextField getTfFeriasAdiantar13() {
		return tfFeriasAdiantar13;
	}

	public void setTfFeriasAdiantar13(TextField tfFeriasAdiantar13) {
		this.tfFeriasAdiantar13 = tfFeriasAdiantar13;
	}

	public TextField getTfFeriasPagarEstagiarios() {
		return tfFeriasPagarEstagiarios;
	}

	public void setTfFeriasPagarEstagiarios(TextField tfFeriasPagarEstagiarios) {
		this.tfFeriasPagarEstagiarios = tfFeriasPagarEstagiarios;
	}

	public TextField getTfFeriasCalcJustaCausa() {
		return tfFeriasCalcJustaCausa;
	}

	public void setTfFeriasCalcJustaCausa(TextField tfFeriasCalcJustaCausa) {
		this.tfFeriasCalcJustaCausa = tfFeriasCalcJustaCausa;
	}

	public TextField getTfFeriasMovimentoMensal() {
		return tfFeriasMovimentoMensal;
	}

	public void setTfFeriasMovimentoMensal(TextField tfFeriasMovimentoMensal) {
		this.tfFeriasMovimentoMensal = tfFeriasMovimentoMensal;
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

		// panel_1
		panel_1 = buildPanel_1();
		mainLayout.addComponent(panel_1);

		return mainLayout;
	}

	@AutoGenerated
	private Panel buildPanel_1() {
		// common part: create layout
		panel_1 = new Panel();
		panel_1.setImmediate(false);
		panel_1.setWidth("100.0%");
		panel_1.setHeight("100.0%");

		// verticalLayout_2
		verticalLayout_2 = buildVerticalLayout_2();
		panel_1.setContent(verticalLayout_2);

		return panel_1;
	}

	@AutoGenerated
	private VerticalLayout buildVerticalLayout_2() {
		// common part: create layout
		verticalLayout_2 = new VerticalLayout();
		verticalLayout_2.setImmediate(false);
		verticalLayout_2.setWidth("100.0%");
		verticalLayout_2.setHeight("100.0%");
		verticalLayout_2.setMargin(false);

		// verticalLayout_2
		verticalLayout_2 = buildVerticalLayout_2();
		panel_1.setContent(verticalLayout_2);

		return verticalLayout_2;
	}

	@AutoGenerated
	private GridLayout buildGridLayout_1() {
		// common part: create layout
		gridLayout_1 = new GridLayout();
		gridLayout_1.setImmediate(false);
		gridLayout_1.setWidth("100.0%");
		// gridLayout_1.setHeight("100.0%");
		gridLayout_1.setMargin(false);
		gridLayout_1.setSpacing(true);
		gridLayout_1.setRows(20);
		gridLayout_1.setColumns(3);

		// tfCompetencia
		tfCompetencia = new TextField();
		tfCompetencia.setCaption("Competência:");
		tfCompetencia.setImmediate(false);
		tfCompetencia.setWidth("175px");
		tfCompetencia.setHeight("-1px");
		gridLayout_1.addComponent(tfCompetencia, 0, 1);

		// tfContribuiPis
		tfContribuiPis = new TextField();
		tfContribuiPis.setCaption("Contrinui PIS:");
		tfContribuiPis.setImmediate(false);
		tfContribuiPis.setWidth("175px");
		tfContribuiPis.setHeight("-1px");
		gridLayout_1.addComponent(tfContribuiPis, 1, 1);

		// tfAliquotaPis
		tfAliquotaPis = new TextField();
		tfAliquotaPis.setCaption("Alíquota PIS:");
		tfAliquotaPis.setImmediate(false);
		tfAliquotaPis.setWidth("175px");
		tfAliquotaPis.setHeight("-1px");
		gridLayout_1.addComponent(tfAliquotaPis, 0, 2);

		// tfDiscriminarDsr
		tfDiscriminarDsr = new TextField();
		tfDiscriminarDsr.setCaption("Discriminar Dsr:");
		tfDiscriminarDsr.setImmediate(false);
		tfDiscriminarDsr.setWidth("175px");
		tfDiscriminarDsr.setHeight("-1px");
		gridLayout_1.addComponent(tfDiscriminarDsr, 1, 2);

		// tfDiaPagamento
		tfDiaPagamento = new TextField();
		tfDiaPagamento.setCaption("Dia do pagamento:");
		tfDiaPagamento.setImmediate(false);
		tfDiaPagamento.setWidth("175px");
		tfDiaPagamento.setHeight("-1px");
		gridLayout_1.addComponent(tfDiaPagamento, 0, 3);

		// tfCalculoProporcionalidade
		tfCalculoProporcionalidade = new TextField();
		tfCalculoProporcionalidade.setCaption("Calcúlo da proporcionalidade:");
		tfCalculoProporcionalidade.setImmediate(false);
		tfCalculoProporcionalidade.setWidth("-1px");
		tfCalculoProporcionalidade.setHeight("-1px");
		gridLayout_1.addComponent(tfDiaPagamento, 1, 3);

		// tfDescontarFaltas13
		tfDescontarFaltas13 = new TextField();
		tfDescontarFaltas13.setCaption("Descontar faltas 13:");
		tfDescontarFaltas13.setImmediate(false);
		tfDescontarFaltas13.setWidth("-1px");
		tfDescontarFaltas13.setHeight("-1px");
		gridLayout_1.addComponent(tfDescontarFaltas13, 0, 4);

		// tfPagarAdicionais13
		tfPagarAdicionais13 = new TextField();
		tfPagarAdicionais13.setCaption("Pagar adicionais 13:");
		tfPagarAdicionais13.setImmediate(false);
		tfPagarAdicionais13.setWidth("-1px");
		tfPagarAdicionais13.setHeight("-1px");
		gridLayout_1.addComponent(tfPagarAdicionais13, 1, 4);

		// tfPagarEstagiarios13
		tfPagarEstagiarios13 = new TextField();
		tfPagarEstagiarios13.setCaption("Pagar estagiários 13:");
		tfPagarEstagiarios13.setImmediate(false);
		tfPagarEstagiarios13.setWidth("-1px");
		tfPagarEstagiarios13.setHeight("-1px");
		gridLayout_1.addComponent(tfPagarEstagiarios13, 0, 5);

		// tfMesAdiantamento13
		tfMesAdiantamento13 = new TextField();
		tfMesAdiantamento13.setCaption("Mês adiantamento 13:");
		tfMesAdiantamento13.setImmediate(false);
		tfMesAdiantamento13.setWidth("-1px");
		tfMesAdiantamento13.setHeight("-1px");
		gridLayout_1.addComponent(tfMesAdiantamento13, 1, 5);

		// tfPercentualAdiantam13
		tfPercentualAdiantam13 = new TextField();
		tfPercentualAdiantam13.setCaption("Percentual de adiantamento 13:");
		tfPercentualAdiantam13.setImmediate(false);
		tfPercentualAdiantam13.setWidth("-1px");
		tfPercentualAdiantam13.setHeight("-1px");
		gridLayout_1.addComponent(tfPercentualAdiantam13, 0, 6);

		// tfFeriasDescontarFaltas
		tfFeriasDescontarFaltas = new TextField();
		tfFeriasDescontarFaltas.setCaption("Férias descontar de faltas 13:");
		tfFeriasDescontarFaltas.setImmediate(false);
		tfFeriasDescontarFaltas.setWidth("-1px");
		tfFeriasDescontarFaltas.setHeight("-1px");
		gridLayout_1.addComponent(tfFeriasDescontarFaltas, 1, 6);

		// tfFeriasPagarAdicionais
		tfFeriasPagarAdicionais = new TextField();
		tfFeriasPagarAdicionais.setCaption("Férias pagar adicionais:");
		tfFeriasPagarAdicionais.setImmediate(false);
		tfFeriasPagarAdicionais.setWidth("-1px");
		tfFeriasPagarAdicionais.setHeight("-1px");
		gridLayout_1.addComponent(tfFeriasPagarAdicionais, 0, 7);

		// tfFeriasAdiantar13
		tfFeriasAdiantar13 = new TextField();
		tfFeriasAdiantar13.setCaption("Férias adiantar 13:");
		tfFeriasAdiantar13.setImmediate(false);
		tfFeriasAdiantar13.setWidth("-1px");
		tfFeriasAdiantar13.setHeight("-1px");
		gridLayout_1.addComponent(tfFeriasAdiantar13, 1, 7);

		// tfFeriasCalcJustaCausa
		tfFeriasCalcJustaCausa = new TextField();
		tfFeriasCalcJustaCausa.setCaption("Férias cálculo justa causa:");
		tfFeriasCalcJustaCausa.setImmediate(false);
		tfFeriasCalcJustaCausa.setWidth("-1px");
		tfFeriasCalcJustaCausa.setHeight("-1px");
		gridLayout_1.addComponent(tfFeriasCalcJustaCausa, 0, 8);

		// tfFeriasMovimentoMensal
		tfFeriasMovimentoMensal = new TextField();
		tfFeriasMovimentoMensal.setCaption("Férias movimento mensal:");
		tfFeriasMovimentoMensal.setImmediate(false);
		tfFeriasMovimentoMensal.setWidth("-1px");
		tfFeriasMovimentoMensal.setHeight("-1px");
		gridLayout_1.addComponent(tfFeriasMovimentoMensal, 1, 8);

		return gridLayout_1;
	}

}
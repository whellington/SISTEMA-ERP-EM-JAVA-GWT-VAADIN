package dc.visao.contabilidade;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextField;

import dc.entidade.contabilidade.ContabilConta;
import dc.entidade.contabilidade.PlanoConta;
import dc.entidade.contabilidade.PlanoContaRefSped;
import dc.visao.framework.component.manytoonecombo.ManyToOneCombo;

public class ContabilContaFormView extends CustomComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@AutoGenerated
	private GridLayout mainLayout;

	private ManyToOneCombo<PlanoConta> cbPlanoConta;
	private ManyToOneCombo<PlanoContaRefSped> cbPlanoContaRefSped;
	private ManyToOneCombo<ContabilConta> cbContabilContaPai;

	private PopupDateField dtDataInclusao;

	private TextField txClassificacao;
	private TextField txDescricao;
	private TextField txOrdem;
	private TextField txCodigoReduzido;

	private ComboBox cbTipo;

	private ComboBox cbSituacao;
	private ComboBox cbNatureza;
	private ComboBox cbPatrimonio;
	private ComboBox cbLivroCaixa;
	private ComboBox cbDemonstracaoFluxoCaixa;
	private ComboBox cbCodigoEFB;

	public ContabilContaFormView() {
		buildMainLayout();
		setCompositionRoot(mainLayout);
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
		mainLayout.setRows(5);
		mainLayout.setColumns(5);

		// top-level component properties
		setWidth("100.0%");
		setHeight("-1px");

		return mainLayout;
	}

	public void preencheBean(ContabilConta currentBean) {

	}

	public void preencheForm(ContabilConta currentBean) {

	}

	public ManyToOneCombo<PlanoConta> getCbPlanoConta() {
		return cbPlanoConta;
	}

	public void setCbPlanoConta(ManyToOneCombo<PlanoConta> cbPlanoConta) {
		this.cbPlanoConta = cbPlanoConta;
	}

	public ManyToOneCombo<PlanoContaRefSped> getCbPlanoContaRefSped() {
		return cbPlanoContaRefSped;
	}

	public void setCbPlanoContaRefSped(ManyToOneCombo<PlanoContaRefSped> cbPlanoContaRefSped) {
		this.cbPlanoContaRefSped = cbPlanoContaRefSped;
	}

	public ManyToOneCombo<ContabilConta> getCbContabilContaPai() {
		return cbContabilContaPai;
	}

	public void setCbContabilContaPai(ManyToOneCombo<ContabilConta> cbContabilContaPai) {
		this.cbContabilContaPai = cbContabilContaPai;
	}

	public PopupDateField getDtDataInclusao() {
		return dtDataInclusao;
	}

	public void setDtDataInclusao(PopupDateField dtDataInclusao) {
		this.dtDataInclusao = dtDataInclusao;
	}

	public TextField getTxClassificacao() {
		return txClassificacao;
	}

	public void setTxClassificacao(TextField txClassificacao) {
		this.txClassificacao = txClassificacao;
	}

	public TextField getTxDescricao() {
		return txDescricao;
	}

	public void setTxDescricao(TextField txDescricao) {
		this.txDescricao = txDescricao;
	}

	public TextField getTxOrdem() {
		return txOrdem;
	}

	public void setTxOrdem(TextField txOrdem) {
		this.txOrdem = txOrdem;
	}

	public TextField getTxCodigoReduzido() {
		return txCodigoReduzido;
	}

	public void setTxCodigoReduzido(TextField txCodigoReduzido) {
		this.txCodigoReduzido = txCodigoReduzido;
	}

	public ComboBox getCbTipo() {
		return cbTipo;
	}

	public void setCbTipo(ComboBox cbTipo) {
		this.cbTipo = cbTipo;
	}

	public ComboBox getCbSituacao() {
		return cbSituacao;
	}

	public void setCbSituacao(ComboBox cbSituacao) {
		this.cbSituacao = cbSituacao;
	}

	public ComboBox getCbNatureza() {
		return cbNatureza;
	}

	public void setCbNatureza(ComboBox cbNatureza) {
		this.cbNatureza = cbNatureza;
	}

	public ComboBox getCbPatrimonio() {
		return cbPatrimonio;
	}

	public void setCbPatrimonio(ComboBox cbPatrimonio) {
		this.cbPatrimonio = cbPatrimonio;
	}

	public ComboBox getCbLivroCaixa() {
		return cbLivroCaixa;
	}

	public void setCbLivroCaixa(ComboBox cbLivroCaixa) {
		this.cbLivroCaixa = cbLivroCaixa;
	}

	public ComboBox getCbDemonstracaoFluxoCaixa() {
		return cbDemonstracaoFluxoCaixa;
	}

	public void setCbDemonstracaoFluxoCaixa(ComboBox cbDemonstracaoFluxoCaixa) {
		this.cbDemonstracaoFluxoCaixa = cbDemonstracaoFluxoCaixa;
	}

	public ComboBox getCbCodigoEFB() {
		return cbCodigoEFB;
	}

	public void setCbCodigoEFB(ComboBox cbCodigoEFB) {
		this.cbCodigoEFB = cbCodigoEFB;
	}

}
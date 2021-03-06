package dc.visao.geral.pessoal;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import dc.controller.geral.pessoal.ClienteFormController;
import dc.entidade.geral.pessoal.AtividadeForCliEntity;
import dc.entidade.geral.pessoal.PessoaEntity;
import dc.entidade.geral.pessoal.SituacaoForCliEntity;
import dc.entidade.tributario.OperacaoFiscalEntity;
import dc.visao.framework.component.manytoonecombo.ManyToOneComboField;
import dc.visao.framework.util.ComponentUtil;

public class ClienteFormView extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@AutoGenerated
	private VerticalLayout mainLayout;

	@AutoGenerated
	private TextArea tfObservacao;

	@AutoGenerated
	private TextField tfLimiteCredito;

	@AutoGenerated
	private TextField tfTaxaDesconto;

	@AutoGenerated
	private ComboBox cbFormaDesconto;

	@AutoGenerated
	private ComboBox cbTipoFrete;

	@AutoGenerated
	private ComboBox cbIndicadorPreco;

	@AutoGenerated
	private ComboBox cbGerarFinanceiro;

	@AutoGenerated
	private TextField tfContaTomador;

	@AutoGenerated
	private PopupDateField pdfDesde;

	@AutoGenerated
	private GridLayout gridLayout_1;

	private ManyToOneComboField<PessoaEntity> mocPessoa;

	private ManyToOneComboField<SituacaoForCliEntity> mocSituacao;

	private ManyToOneComboField<AtividadeForCliEntity> mocAtividade;

	private ManyToOneComboField<OperacaoFiscalEntity> mocOperacaoFiscal;

	/**
	 * The constructor should first build the main layout, set the composition
	 * root and then do any custom initialization.
	 * 
	 * The constructor will not be automatically regenerated by the visual
	 * editor.
	 */

	private ClienteFormController controller;

	public ClienteFormView(ClienteFormController clienteFormController) {
		buildMainLayout();
		setCompositionRoot(mainLayout);

		// TODO add user code here
		this.controller = clienteFormController;
	}
	
	@AutoGenerated
	private VerticalLayout buildMainLayout() {
		setSizeFull();
		mainLayout = new VerticalLayout();
		mainLayout.setImmediate(false);
		mainLayout.setSizeFull();
		mainLayout.setMargin(false);
		mainLayout.setSpacing(true);
		setWidth("100.0%");
	
		gridLayout_1 = buildGridLayout_1();
		mainLayout.addComponent(gridLayout_1);
		
		return mainLayout;
	}

	@AutoGenerated
	private GridLayout buildGridLayout_1() {

		gridLayout_1 = new GridLayout(7, 7);
		gridLayout_1.setImmediate(false);
		gridLayout_1.setWidth("100.0%");
		gridLayout_1.setMargin(true);
		gridLayout_1.setSpacing(true);
		gridLayout_1.setRows(7);
		gridLayout_1.setColumns(7);
		
		// mocPessoa
		mocPessoa = new ManyToOneComboField<>(PessoaEntity.class);
		mocPessoa.setCaption("Pessoa");
		mocPessoa.setImmediate(false);
		gridLayout_1.addComponent(mocPessoa,0,0,1,0);
		
		// mocSituacao
		mocSituacao = new ManyToOneComboField<>(SituacaoForCliEntity.class);
		mocSituacao.setCaption("Situação");
		mocSituacao.setImmediate(false);
		gridLayout_1.addComponent(mocSituacao,2,0);
		
		// mocAtividade
		mocAtividade = new ManyToOneComboField<>(AtividadeForCliEntity.class);
		mocAtividade.setCaption("Atividade");
		mocAtividade.setImmediate(false);
		gridLayout_1.addComponent(mocAtividade, 0,1,1,1);
		
		// mocOperacaoFiscal
		mocOperacaoFiscal = new ManyToOneComboField<>(OperacaoFiscalEntity.class);
		mocOperacaoFiscal.setCaption("Operação fiscal");
		mocOperacaoFiscal.setImmediate(false);
		gridLayout_1.addComponent(mocOperacaoFiscal, 2,1);
		
		// pdfDesde
		pdfDesde = ComponentUtil.buildPopupDateField("Desde");
		pdfDesde.setImmediate(false);
		gridLayout_1.addComponent(pdfDesde, 0,2);

		// tfContaTomador
		tfContaTomador = ComponentUtil.buildTextField("Conta do tomador");
		tfContaTomador.setImmediate(false);
		gridLayout_1.addComponent(tfContaTomador, 1,2);

		// cbGerarFinanceiro
		cbGerarFinanceiro = ComponentUtil.buildComboBox("Gerar financeiro?");
		cbGerarFinanceiro.setImmediate(false);
		gridLayout_1.addComponent(cbGerarFinanceiro, 2,2);

		// cbIndicadorPreco
		cbIndicadorPreco = ComponentUtil.buildComboBox("Indicador de preço");
		cbIndicadorPreco.setImmediate(false);
		gridLayout_1.addComponent(cbIndicadorPreco, 3,2);
			
		// cbTipoFrete
		cbTipoFrete = ComponentUtil.buildComboBox("Tipo de frete");
		cbTipoFrete.setImmediate(false);
		gridLayout_1.addComponent(cbTipoFrete, 0,3);
		
		// cbFormaDesconto
		cbFormaDesconto = ComponentUtil.buildComboBox("Forma de desconto");
		cbFormaDesconto.setImmediate(false);
		gridLayout_1.addComponent(cbFormaDesconto, 1,3);

		// tfTaxaDesconto
		tfTaxaDesconto = ComponentUtil.buildTextField("Taxa de desconto");
		tfTaxaDesconto.setImmediate(false);
		gridLayout_1.addComponent(tfTaxaDesconto, 2,3);

     	// tfLimiteCredito
		tfLimiteCredito = ComponentUtil.buildTextField("Limite de crédito");
		tfLimiteCredito.setImmediate(false);
		gridLayout_1.addComponent(tfLimiteCredito, 3,3);

		tfObservacao = ComponentUtil.buildTextArea("Observação");
		gridLayout_1.addComponent(tfObservacao, 0, 4, 3, 4);

		return gridLayout_1;
	}


	public VerticalLayout getMainLayout() {
		return mainLayout;
	}

	public void setMainLayout(VerticalLayout mainLayout) {
		this.mainLayout = mainLayout;
	}

	public TextArea getTfObservacao() {
		return tfObservacao;
	}

	public void setTfObservacao(TextArea tfObservacao) {
		this.tfObservacao = tfObservacao;
	}

	public TextField getTfLimiteCredito() {
		return tfLimiteCredito;
	}

	public void setTfLimiteCredito(TextField tfLimiteCredito) {
		this.tfLimiteCredito = tfLimiteCredito;
	}

	public TextField getTfTaxaDesconto() {
		return tfTaxaDesconto;
	}

	public void setTfTaxaDesconto(TextField tfTaxaDesconto) {
		this.tfTaxaDesconto = tfTaxaDesconto;
	}

	public TextField getTfContaTomador() {
		return tfContaTomador;
	}

	public void setTfContaTomador(TextField tfContaTomador) {
		this.tfContaTomador = tfContaTomador;
	}

	public PopupDateField getPdfDesde() {
		return pdfDesde;
	}

	public void setPdfDesde(PopupDateField pdfDesde) {
		this.pdfDesde = pdfDesde;
	}

	public ComboBox getCbFormaDesconto() {
		return cbFormaDesconto;
	}

	public void setCbFormaDesconto(ComboBox cbFormaDesconto) {
		this.cbFormaDesconto = cbFormaDesconto;
	}

	public ComboBox getCbTipoFrete() {
		return cbTipoFrete;
	}

	public void setCbTipoFrete(ComboBox cbTipoFrete) {
		this.cbTipoFrete = cbTipoFrete;
	}

	public ComboBox getCbIndicadorPreco() {
		return cbIndicadorPreco;
	}

	public void setCbIndicadorPreco(ComboBox cbIndicadorPreco) {
		this.cbIndicadorPreco = cbIndicadorPreco;
	}

	public ComboBox getCbGerarFinanceiro() {
		return cbGerarFinanceiro;
	}

	public void setCbGerarFinanceiro(ComboBox cbGerarFinanceiro) {
		this.cbGerarFinanceiro = cbGerarFinanceiro;
	}

	public ManyToOneComboField<PessoaEntity> getMocPessoa() {
		return mocPessoa;
	}

	public void setMocPessoa(ManyToOneComboField<PessoaEntity> mocPessoa) {
		this.mocPessoa = mocPessoa;
	}

	public ManyToOneComboField<SituacaoForCliEntity> getMocSituacao() {
		return mocSituacao;
	}

	public void setMocSituacao(ManyToOneComboField<SituacaoForCliEntity> mocSituacao) {
		this.mocSituacao = mocSituacao;
	}

	public ManyToOneComboField<AtividadeForCliEntity> getMocAtividade() {
		return mocAtividade;
	}

	public void setMocAtividade(
			ManyToOneComboField<AtividadeForCliEntity> mocAtividade) {
		this.mocAtividade = mocAtividade;
	}

	public ManyToOneComboField<OperacaoFiscalEntity> getMocOperacaoFiscal() {
		return mocOperacaoFiscal;
	}

	public void setMocOperacaoFiscal(
			ManyToOneComboField<OperacaoFiscalEntity> mocOperacaoFiscal) {
		this.mocOperacaoFiscal = mocOperacaoFiscal;
	}

}
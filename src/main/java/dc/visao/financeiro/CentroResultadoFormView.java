package dc.visao.financeiro;

import java.util.List;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.OptionGroup;
import com.vaadin.ui.TextField;

import dc.controller.financeiro.CentroResultadoFormController;
import dc.entidade.financeiro.CentroResultado;
import dc.entidade.financeiro.PlanoCentroResultado;
import dc.visao.framework.component.manytoonecombo.ManyToOneComboField;
import dc.visao.framework.util.ComponentUtil;

public class CentroResultadoFormView extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@AutoGenerated
	private GridLayout mainLayout;

	@AutoGenerated
	private HorizontalLayout horizontalLayout_1;

	@AutoGenerated
	private TextField txtClassficacao;

	@AutoGenerated
	private TextField txtDescricao;

	@AutoGenerated
	private OptionGroup optSofreRateio;

	// @AutoGenerated
	// private ComboBox cbPlanoCentroResultado;

	@AutoGenerated
	private ManyToOneComboField<PlanoCentroResultado> cmbPlanoCentroResultado;
	
	CentroResultadoFormController controller;

	public ManyToOneComboField<PlanoCentroResultado> getCmbPlanoCentroResultado() {
		return cmbPlanoCentroResultado;
	}

	public void setCmbPlanoCentroResultado(
			ManyToOneComboField<PlanoCentroResultado> cmbPlanoCentroResultado) {
		this.cmbPlanoCentroResultado = cmbPlanoCentroResultado;
	}

	/**
	 * The constructor should first build the main layout, set the composition
	 * root and then do any custom initialization.
	 * 
	 * The constructor will not be automatically regenerated by the visual
	 * editor.
	 */
	public CentroResultadoFormView(CentroResultadoFormController controller) {
		buildMainLayout();
		setCompositionRoot(mainLayout);

		this.controller = controller;
	}

	@AutoGenerated
	private GridLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new GridLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("100%");
		mainLayout.setHeight("-1px");
		mainLayout.setMargin(true);
		mainLayout.setSizeFull();
		mainLayout.setSpacing(true);
		mainLayout.setRows(5);

		// top-level component properties
		setWidth("100.0%");
		setHeight("-1px");

		// comboBox_2
		// cbPlanoCentroResultado =
		// ComponentUtil.buildComboBox("Plano Centro Resultado");
		// cbPlanoCentroResultado.setItemCaptionPropertyId("nome");
		// cbPlanoCentroResultado.setWidth("70%");
		// mainLayout.addComponent(cbPlanoCentroResultado, 0, 0);

		cmbPlanoCentroResultado = new ManyToOneComboField<>(PlanoCentroResultado.class);
		cmbPlanoCentroResultado.setCaption("Plano Centro Resultado");
		mainLayout.addComponent(cmbPlanoCentroResultado, 0, 0);

		// optSofreRateio
		optSofreRateio = new OptionGroup();
		optSofreRateio.setCaption("Sofre Rateio");
		optSofreRateio.setImmediate(false);
		optSofreRateio.setWidth("-1px");
		optSofreRateio.setHeight("-1px");
		optSofreRateio.addItem("S");
		optSofreRateio.setItemCaption("S", "Sim");
		optSofreRateio.addItem("N");
		optSofreRateio.setItemCaption("N", "Não");
		mainLayout.addComponent(optSofreRateio, 0, 1);

		// horizontalLayout_1
		horizontalLayout_1 = buildHorizontalLayout_1();
		mainLayout.addComponent(horizontalLayout_1, 0, 2);

		return mainLayout;
	}

	@AutoGenerated
	private HorizontalLayout buildHorizontalLayout_1() {
		// common part: create layout
		horizontalLayout_1 = new HorizontalLayout();
		horizontalLayout_1.setImmediate(false);
		horizontalLayout_1.setWidth("-1px");
		horizontalLayout_1.setHeight("100.0%");
		horizontalLayout_1.setMargin(false);
		horizontalLayout_1.setSpacing(true);

		// txtDescricao
		txtDescricao = ComponentUtil.buildTextField("Descrição");
		txtDescricao.setWidth("-1px");
		txtDescricao.setHeight("-1px");
		horizontalLayout_1.addComponent(txtDescricao);

		// txtClassficacao
		txtClassficacao = ComponentUtil.buildTextField("Classificação");
		txtClassficacao.setWidth("-1px");
		txtClassficacao.setHeight("-1px");
		horizontalLayout_1.addComponent(txtClassficacao);

		return horizontalLayout_1;
	}

	public void InitCbPlanoCentroResultado(List<PlanoCentroResultado> lista) {
		// BeanItemContainer<PlanoCentroResultado> objects = new
		// BeanItemContainer<PlanoCentroResultado>(PlanoCentroResultado.class,
		// lista);
		// cbPlanoCentroResultado.setContainerDataSource(objects);
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

	public TextField getTxtClassficacao() {
		return txtClassficacao;
	}

	public void setTxtClassficacao(TextField txtClassficacao) {
		this.txtClassficacao = txtClassficacao;
	}

	public TextField getTxtDescricao() {
		return txtDescricao;
	}

	public void setTxtDescricao(TextField txtDescricao) {
		this.txtDescricao = txtDescricao;
	}

	public OptionGroup getOptSofreRateio() {
		return optSofreRateio;
	}

	public void setOptSofreRateio(OptionGroup optSofreRateio) {
		this.optSofreRateio = optSofreRateio;
	}

	/*
	 * public ComboBox getCbPlanoCentroResultado() { return
	 * cbPlanoCentroResultado; }
	 * 
	 * public void setCbPlanoCentroResultado(ComboBox cbPlanoCentroResultado) {
	 * this.cbPlanoCentroResultado = cbPlanoCentroResultado; }
	 */

	public void preencheForm(CentroResultado currentBean) {
		getTxtDescricao().setValue(currentBean.getDescricao());
		getOptSofreRateio().setValue(currentBean.getSofreRateio());
		getTxtClassficacao().setValue(currentBean.getClassificacao());
		// getCbPlanoCentroResultado().setValue(currentBean.getPlanoCentroResultado());
	}

	public void preencheBean(CentroResultado currentBean) {
		currentBean.setDescricao(getTxtDescricao().getValue());
		//currentBean.setSofreRateio(getOptSofreRateio().getValue().toString());
		currentBean.setClassificacao(getTxtClassficacao().getValue());
		// currentBean.setPlanoCentroResultado((PlanoCentroResultado)
		// getCbPlanoCentroResultado().getValue());
	}

}
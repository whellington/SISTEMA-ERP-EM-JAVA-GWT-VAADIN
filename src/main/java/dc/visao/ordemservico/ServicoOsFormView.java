package dc.visao.ordemservico;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.OptionGroup;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import dc.controller.ordemservico.ServicoOsFormController;
import dc.entidade.ordemservico.GrupoOsEntity;
import dc.entidade.ordemservico.SubGrupoOsEntity;
import dc.visao.framework.component.manytoonecombo.ManyToOneComboField;
import dc.visao.framework.util.ComponentUtil;

public class ServicoOsFormView extends CustomComponent {

	private static final long serialVersionUID = 1L;

	@AutoGenerated
	private GridLayout fields;

	@AutoGenerated
	private VerticalLayout mainLayout;
	
	@AutoGenerated
	private TextField tfNome;

	@AutoGenerated
	private ManyToOneComboField<GrupoOsEntity> cbGrupo;
	
	@AutoGenerated
	private ManyToOneComboField<SubGrupoOsEntity> cbSubGrupo;

	@AutoGenerated
	private TextField tfAliquotaIssqn;

	@AutoGenerated
	private OptionGroup optTipoComissaoTecnico;
	
	@AutoGenerated
	private OptionGroup optTipoComissaoVendedor;

	@AutoGenerated
	private TextField tfValorComissaoTecnico;
		
	@AutoGenerated
	private TextField tfValorComissaoVendedor;

	@AutoGenerated
	private TextField tfValorServico;

	@AutoGenerated
	private TextField tfValorMinimoServico;

	@AutoGenerated
	private TextField tfGarantiaDia;

	@AutoGenerated
	private TextField tfRetorno;

	@AutoGenerated
	private TextField tfHoraGasta;

	@AutoGenerated
	private TextField tfValorPromocional;

	@AutoGenerated
	private PopupDateField dtVencimentoPromocao;

	@AutoGenerated
	private TextArea taObservacao;

	private ServicoOsFormController controller;
	
	public ServicoOsFormView(ServicoOsFormController controller) {
		buildMainLayout();
		setCompositionRoot(mainLayout);
		this.controller = controller;
	}

	@AutoGenerated
	private void buildMainLayout() {
		// the main layout and components will be created here
		mainLayout = new VerticalLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("100%");
		mainLayout.setHeight("100%");
		mainLayout.setMargin(true);
		mainLayout.setSpacing(true);

		// top-level component properties
		setWidth("100.0%");
		setHeight("100.0%");

		fields = bglGeral();
		mainLayout.addComponent(fields);
		
	}

	/**
	 * GERAL
	 */

	@AutoGenerated
	private GridLayout bglGeral() {
		// common part: create layout
		fields = new GridLayout(4, 9);
		fields.setImmediate(false);
		fields.setWidth("100.0%");
		fields.setHeight("-1px");
		fields.setMargin(false);
		fields.setSpacing(true);

		tfNome= ComponentUtil.buildTextField("Nome");
		fields.addComponent(tfNome, 0, 0,1,0);
		
		cbGrupo = new ManyToOneComboField<>(GrupoOsEntity.class);
		cbGrupo.setCaption("Grupo");
		/*cbGrupo.addValueChangeListener(new ValueChangeListener() {
			private static final long serialVersionUID = 1L;

			@Override
			public void valueChange(ValueChangeEvent event) {
				controller.getSubgrupo("grupo", cbGrupo.getValue().getId());
			}
			
		});*/
		fields.addComponent(cbGrupo, 0,1, 1,1);

		cbSubGrupo = new ManyToOneComboField<>(SubGrupoOsEntity.class);
		cbSubGrupo.setCaption("SubGrupo");
		fields.addComponent(cbSubGrupo, 2,1,3,1);

		tfAliquotaIssqn = ComponentUtil.buildPercentageField("Aliquto Issqn %");
		fields.addComponent(tfAliquotaIssqn,0,2);

		tfHoraGasta = ComponentUtil.buildNumberField("Hora Gasta");
		fields.addComponent(tfHoraGasta, 1,2);
		
		tfValorServico = ComponentUtil.buildCurrencysField("Valor do serviço");
		fields.addComponent(tfValorServico,2,2);

		tfValorMinimoServico = ComponentUtil.buildCurrencysField("Valor mínimo do serviço");
		fields.addComponent(tfValorMinimoServico,3,2);

		tfValorComissaoTecnico = ComponentUtil.buildCurrencysField("Valor Comissão Técnico");
		fields.addComponent(tfValorComissaoTecnico,0,3);
		
		// tipo de comissão do técnico
		optTipoComissaoTecnico= new OptionGroup();
		optTipoComissaoTecnico.setStyleName("horizontal");
		optTipoComissaoTecnico.setCaption("Tipo comissão");
		optTipoComissaoTecnico.setImmediate(false);
		optTipoComissaoTecnico.setWidth("-1px");
		optTipoComissaoTecnico.setHeight("-1px");
		optTipoComissaoTecnico.addItem("R");
		optTipoComissaoTecnico.setItemCaption("R", "Valor em real");
		optTipoComissaoTecnico.addItem("P");
		optTipoComissaoTecnico.setItemCaption("P", "Porcentagem");
		fields.addComponent(optTipoComissaoTecnico,1,3);

		tfValorComissaoVendedor = ComponentUtil.buildCurrencysField("Valor Comissão Vendedor");
		fields.addComponent(tfValorComissaoVendedor,0,4);

		// tipo de comissão do vendedor
		optTipoComissaoVendedor= new OptionGroup();
		optTipoComissaoVendedor.setStyleName("horizontal");
		optTipoComissaoVendedor.setCaption("Tipo comissão");
		optTipoComissaoVendedor.setImmediate(false);
		optTipoComissaoVendedor.setWidth("-1px");
		optTipoComissaoVendedor.setHeight("-1px");
		optTipoComissaoVendedor.addItem("R");
		optTipoComissaoVendedor.setItemCaption("R", "Valor em real");
		optTipoComissaoVendedor.addItem("P");
		optTipoComissaoVendedor.setItemCaption("P", "Porcentagem");
		fields.addComponent(optTipoComissaoVendedor,1,4);
		
		tfGarantiaDia = ComponentUtil.buildNumericField("Garantia em Dias");
		fields.addComponent(tfGarantiaDia,0,5);

		tfRetorno = ComponentUtil.buildNumericField("Retorno após conclusão do serviço");
		fields.addComponent(tfRetorno,1,5);

//		tfAtiva = new TextField();
//		tfAtiva.setCaption("Ativa");
//		horizontalLayout_7.addComponent(tfAtiva);

		tfValorPromocional = ComponentUtil.buildCurrencysField("Valor promocional");
		fields.addComponent(tfValorPromocional,0,6);

		dtVencimentoPromocao = ComponentUtil.buildPopupDateField("Vencimento promoção");;
		fields.addComponent(dtVencimentoPromocao,1,6,2,6);
		
		taObservacao = ComponentUtil.buildTextArea("Observação");
		taObservacao.setCaption("Observação");
		fields.addComponent(taObservacao,0,7,3,7);

		return fields;
		
	}

	public GridLayout getFields() {
		return fields;
	}

	public void setFields(GridLayout fields) {
		this.fields = fields;
	}

	public VerticalLayout getMainLayout() {
		return mainLayout;
	}

	public void setMainLayout(VerticalLayout mainLayout) {
		this.mainLayout = mainLayout;
	}

	public TextField getTfNome() {
		return tfNome;
	}

	public void setTfNome(TextField tfNome) {
		this.tfNome = tfNome;
	}

	public ManyToOneComboField<GrupoOsEntity> getCbGrupo() {
		return cbGrupo;
	}

	public void setCbGrupo(ManyToOneComboField<GrupoOsEntity> cbGrupo) {
		this.cbGrupo = cbGrupo;
	}

	public ManyToOneComboField<SubGrupoOsEntity> getCbSubGrupo() {
		return cbSubGrupo;
	}

	public void setCbSubGrupo(ManyToOneComboField<SubGrupoOsEntity> cbSubGrupo) {
		this.cbSubGrupo = cbSubGrupo;
	}

	public TextField getTfAliquotaIssqn() {
		return tfAliquotaIssqn;
	}

	public void setTfAliquotaIssqn(TextField tfAliquotaIssqn) {
		this.tfAliquotaIssqn = tfAliquotaIssqn;
	}

	public TextField getTfValorComissaoTecnico() {
		return tfValorComissaoTecnico;
	}

	public void setTfValorComissaoTecnico(TextField tfValorComissaoTecnico) {
		this.tfValorComissaoTecnico = tfValorComissaoTecnico;
	}

	public TextField getTfValorComissaoVendedor() {
		return tfValorComissaoVendedor;
	}

	public void setTfValorComissaoVendedor(TextField tfValorComissaoVendedor) {
		this.tfValorComissaoVendedor = tfValorComissaoVendedor;
	}

	public TextField getTfGarantiaDia() {
		return tfGarantiaDia;
	}

	public void setTfGarantiaDia(TextField tfGarantiaDia) {
		this.tfGarantiaDia = tfGarantiaDia;
	}

	public TextField getTfRetorno() {
		return tfRetorno;
	}

	public void setTfRetorno(TextField tfRetorno) {
		this.tfRetorno = tfRetorno;
	}

	public TextField getTfHoraGasta() {
		return tfHoraGasta;
	}

	public void setTfHoraGasta(TextField tfHoraGasta) {
		this.tfHoraGasta = tfHoraGasta;
	}

	public TextField getTfValorPromocional() {
		return tfValorPromocional;
	}

	public void setTfValorPromocional(TextField tfValorPromocional) {
		this.tfValorPromocional = tfValorPromocional;
	}

	public PopupDateField getDtVencimentoPromocao() {
		return dtVencimentoPromocao;
	}

	public void setDtVencimentoPromocao(PopupDateField dtVencimentoPromocao) {
		this.dtVencimentoPromocao = dtVencimentoPromocao;
	}

	public TextArea getTaObservacao() {
		return taObservacao;
	}

	public void setTaObservacao(TextArea taObservacao) {
		this.taObservacao = taObservacao;
	}

	public TextField getTfValorServico() {
		return tfValorServico;
	}

	public void setTfValorServico(TextField tfValorServico) {
		this.tfValorServico = tfValorServico;
	}

	public TextField getTfValorMinimoServico() {
		return tfValorMinimoServico;
	}

	public void setTfValorMinimoServico(TextField tfValorMinimoServico) {
		this.tfValorMinimoServico = tfValorMinimoServico;
	}

	public OptionGroup getOptTipoComissaoTecnico() {
		return optTipoComissaoTecnico;
	}

	public void setOptTipoComissaoTecnico(OptionGroup optTipoComissaoTecnico) {
		this.optTipoComissaoTecnico = optTipoComissaoTecnico;
	}

	public OptionGroup getOptTipoComissaoVendedor() {
		return optTipoComissaoVendedor;
	}

	public void setOptTipoComissaoVendedor(OptionGroup optTipoComissaoVendedor) {
		this.optTipoComissaoVendedor = optTipoComissaoVendedor;
	}
}


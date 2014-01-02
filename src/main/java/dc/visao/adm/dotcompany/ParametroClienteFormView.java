package dc.visao.adm.dotcompany;

import org.vaadin.tepi.imageviewer.ImageViewer;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TextField;

import dc.controller.adm.dotcompany.ParametroClienteFormController;
import dc.entidade.framework.Empresa;
import dc.visao.framework.component.manytoonecombo.ManyToOneCombo;

public class ParametroClienteFormView extends CustomComponent {

	@AutoGenerated
	private GridLayout mainLayout;
	@AutoGenerated
	private AbsoluteLayout absoluteLayout_2;
	@AutoGenerated
	private TabSheet tabSheet_1;
	@AutoGenerated
	private AbsoluteLayout absoluteLayout_4;
	
	@AutoGenerated
	private TextField txtAliquotaICms;
	@AutoGenerated
	private TextField txtAliquotaIssqn;
	@AutoGenerated
	private TextField txtLoteEconomicoCompra;
	@AutoGenerated
	private TextField txtPontoPedido;
	@AutoGenerated
	private TextField txtTaxaComissao;
	@AutoGenerated
	private TextField txtPeso;
	@AutoGenerated
	private TextField txtCodigoBalanca;
	@AutoGenerated
	private TextField txtTotalizadorParcial;
	@AutoGenerated
	private ComboBox cmbTipoItemSped;
	@AutoGenerated
	private ComboBox cmbIppt;
	@AutoGenerated
	private ComboBox cmbIat;
	@AutoGenerated
	private ComboBox cmbTipo;
	@AutoGenerated
	private TextField txtExtipi;
	@AutoGenerated
	private TextField txtLst;
	@AutoGenerated
	private ImageViewer imgProduto;
	@AutoGenerated
	private AbsoluteLayout absoluteLayout_3;
	@AutoGenerated
	private TextField txtEstoqueMaximo;
	@AutoGenerated
	private TextField txtEstoqueMinimo;
	@AutoGenerated
	private TextField txtEstoqueIdeal;
	@AutoGenerated
	private TextField txtQuantidadeEstoqueAnterior;
	@AutoGenerated
	private TextField txtQuantidadeEstoque;
	@AutoGenerated
	private TextField txtMarkup;
	@AutoGenerated
	private TextField txtPrecoLucroMaximo;
	@AutoGenerated
	private TextField txtPrecoLucroMinimo;
	@AutoGenerated
	private TextField txtPrecoLucroZero;
	@AutoGenerated
	private TextField txtCustoMedioLiquido;
	@AutoGenerated
	private TextField txtValorSugerido;
	@AutoGenerated
	private TextField txtValorVendaMinimo;
	@AutoGenerated
	private TextField txtValorVenda;
	@AutoGenerated
	private TextField txtValorCompra;
	
	@AutoGenerated
	private PopupDateField dtVencimentoPromocao;
	@AutoGenerated
	private TextField txtValorMensPromocional;
	@AutoGenerated
	private ComboBox cmbMostrandoAvisoCorte;
	@AutoGenerated
	private ComboBox cmbEmpresaBloqueada;
	@AutoGenerated
	private ComboBox cmbEmpresaLiberada;
	@AutoGenerated
	private PopupDateField dtDataEntrada;
	@AutoGenerated
	private TextField txtValorEntrada;
	
	///////////////////////////////////////////////////// INFORMAÇÃO //////////////////////////////////////////////////////////////////
	@AutoGenerated
	private HorizontalLayout horizontalLayout_2;
	@AutoGenerated
	private ComboBox cmbTipoSistema;
	@AutoGenerated
	private ComboBox cmbUsaNfe;
	@AutoGenerated
	private TextField txtLiberadoPorQuem;
	@AutoGenerated
	private TextField txtCaminhoBanco;
	@AutoGenerated
	private ComboBox cmbVendedor;
	@AutoGenerated
	private TextField txtComissaoVendedor;
	@AutoGenerated
	private ComboBox cmbAgente;
	@AutoGenerated
	private TextField txtComissaoAgente;
	
	private ManyToOneCombo<Empresa> cmbEmpresa;
	
	@AutoGenerated
	private HorizontalLayout horizontalLayout_1;
	
	private ParametroClienteFormController controller;
	
	
	@AutoGenerated
	private TabSheet subForms;

	GridLayout fields;
	
	

	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	public ParametroClienteFormView(ParametroClienteFormController controller) {
		this.controller = controller;
		buildMainLayout();
		setCompositionRoot(mainLayout);

		// TODO add user code here
	}

	@AutoGenerated
	private GridLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new GridLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("100%");
		mainLayout.setHeight("100%");
		mainLayout.setMargin(false);
		mainLayout.setSpacing(true);

		// top-level component properties
		setHeight("100%");
		setWidth("100%");

		fields = buildFields();
		mainLayout.addComponent(fields);

		subForms = new TabSheet();
		subForms.setWidth("100.0%");
		subForms.setHeight("100.0%");
		subForms.setSizeFull();
		subForms.setImmediate(true);

		buildInformacaoSubForm();
		buildFinanceiroSubForm();
		//buildStatisticaSubForm();
		//buildComplementarSubForm();
		mainLayout.addComponent(subForms);

		// // horizontalLayout_1
		// horizontalLayout_1 = buildHorizontalLayout_1();
		// mainLayout.addComponent(horizontalLayout_1, 0, 0);
		//
		// // horizontalLayout_2
		// horizontalLayout_2 = buildHorizontalLayout_2();
		// mainLayout.addComponent(horizontalLayout_2, 0, 1);
		//
		// // absoluteLayout_2
		// absoluteLayout_2 = buildAbsoluteLayout_2();
		// mainLayout.addComponent(absoluteLayout_2, 0, 2);

		return mainLayout;
	}

	@AutoGenerated
	private GridLayout buildFields() {
		// common part: create layout
		fields = new GridLayout(7, 7);
		fields.setImmediate(false);
		fields.setWidth("100%");
		fields.setHeight("100%");
		fields.setMargin(false);
		fields.setSpacing(true);

		cmbEmpresa= new ManyToOneCombo<Empresa>();
		cmbEmpresa.setCaption("Empresa ");
		cmbEmpresa.setWidth("456px");
		cmbEmpresa.setHeight("-1px");
		// //
		// cmbUsaNfe
			/*	cmbUsaNfe = new ComboBox();
				cmbUsaNfe.setCaption("USA NFE");
				cmbUsaNfe.setImmediate(false);
				cmbUsaNfe.setWidth("100px");
				cmbUsaNfe.setHeight("-1px");
				carregarIcms();
				cmbUsaNfe.setValue(SIM_NAO.NAO);

				cmbUsaNfe.addValueChangeListener(new Property.ValueChangeListener() {
					@Override
					public void valueChange(ValueChangeEvent event) {
						SIM_NAO obj = (SIM_NAO) event.getProperty().getValue();

						if (obj.equals(SIM_NAO.SIM)) {
							fields.addComponent(cmbUsaNfe, 1, 0);
						}

						if (obj.equals(SIM_NAO.NAO)) {
							fields.addComponent(cmbUsaNfe, 1, 0);
						}
					}
				});*/
		// //
		fields.addComponent(cmbEmpresa, 0, 0);
		//fields.addComponent(cmbUnidadeProduto, 1, 0);
		// //
		/*txtLiberadoPorQuem = new TextField();
		txtLiberadoPorQuem.setCaption("Liberador por Quem?");
		txtLiberadoPorQuem.setImmediate(false);
		txtLiberadoPorQuem.setWidth("456px");
		txtLiberadoPorQuem.setHeight("-1px");
		// //
		// // // cmbAlmoxarifado
		txtCaminhoBanco = new TextField();
		txtCaminhoBanco.setCaption("Caminho do Banco");
		txtCaminhoBanco.setImmediate(false);
		txtCaminhoBanco.setWidth("456px");
		txtCaminhoBanco.setHeight("-1px");

		fields.addComponent(txtLiberadoPorQuem, 0, 1);
		fields.addComponent(txtCaminhoBanco, 1, 1);*/
		// //
		return fields;

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

		// cmbUsaNfe
		cmbUsaNfe = new ComboBox();
		cmbUsaNfe.setCaption("Usa NFE");
		cmbUsaNfe.setImmediate(false);
		cmbUsaNfe.setWidth("494px");
		cmbUsaNfe.setHeight("-1px");
		horizontalLayout_1.addComponent(cmbUsaNfe);

		// cmbTipoSistema
		cmbTipoSistema= new ComboBox();
		cmbTipoSistema.setCaption("Tipo de Sistema");
		cmbTipoSistema.setImmediate(false);
		cmbTipoSistema.setWidth("456px");
		cmbTipoSistema.setHeight("-1px");
		horizontalLayout_1.addComponent(cmbTipoSistema);

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

		// txtLiberadoPorQuem
		txtLiberadoPorQuem = new TextField();
		txtLiberadoPorQuem.setCaption("Liberado por Quem?");
		txtLiberadoPorQuem.setImmediate(false);
		txtLiberadoPorQuem.setWidth("320px");
		txtLiberadoPorQuem.setHeight("-1px");
		horizontalLayout_2.addComponent(txtLiberadoPorQuem);

		// txtCaminhoBanco
		txtCaminhoBanco = new TextField();
		txtCaminhoBanco.setCaption("Caminho do Banco");
		txtCaminhoBanco.setImmediate(false);
		txtCaminhoBanco.setWidth("254px");
		txtCaminhoBanco.setHeight("-1px");
		horizontalLayout_2.addComponent(txtCaminhoBanco);


		return horizontalLayout_2;
	}

	@AutoGenerated
	private AbsoluteLayout buildAbsoluteLayout_2() {
		// common part: create layout
		absoluteLayout_2 = new AbsoluteLayout();
		absoluteLayout_2.setImmediate(false);
		absoluteLayout_2.setWidth("100.0%");
		absoluteLayout_2.setHeight("100.0%");

		// tabSheet_1
		tabSheet_1 = buildTabSheet_1();
		absoluteLayout_2.addComponent(tabSheet_1, "top:-3.0px;left:20.0px;");

		return absoluteLayout_2;
	}

	@AutoGenerated
	private TabSheet buildTabSheet_1() {
		// common part: create layout
		tabSheet_1 = new TabSheet();
		tabSheet_1.setImmediate(true);
		tabSheet_1.setWidth("100.0%");
		tabSheet_1.setHeight("100.0%");

		// absoluteLayout_3

		// absoluteLayout_4
		//absoluteLayout_4 = buildAbsoluteLayout_4();
		tabSheet_1.addTab(absoluteLayout_4, "Tab", null);

		return tabSheet_1;
	}
	
	/////////////////////////////////////////////////////////////////////// INFORMAÇÃO //////////////////////////////////////////////////////////
	
	public void buildInformacaoSubForm() {
		final GridLayout layout = new GridLayout(7, 7);
		layout.setImmediate(false);
		layout.setWidth("100.0%");
		layout.setHeight("100.0%");
		layout.setMargin(true);
		layout.setSpacing(true);
		layout.setSizeFull();
		
		cmbTipoSistema= new ComboBox();
		cmbTipoSistema.setCaption("Tipo de Sistema ");
		cmbTipoSistema.setWidth("456px");
		cmbTipoSistema.setHeight("-1px");
		// //
		// cmbUsaNfe
				cmbUsaNfe = new ComboBox(); 
				cmbUsaNfe.setCaption("USA NFE");
				cmbUsaNfe.setImmediate(false);
				cmbUsaNfe.setWidth("100px");
				cmbUsaNfe.setHeight("-1px");
				carregarIcms();
				cmbUsaNfe.setValue(SIM_NAO.NAO);

				cmbUsaNfe.addValueChangeListener(new Property.ValueChangeListener() {
					@Override
					public void valueChange(ValueChangeEvent event) {
						SIM_NAO obj = (SIM_NAO) event.getProperty().getValue();

						if (obj.equals(SIM_NAO.SIM)) {
							layout.addComponent(cmbUsaNfe, 1, 0);
						}

						if (obj.equals(SIM_NAO.NAO)) {
							layout.addComponent(cmbUsaNfe, 1, 0);
						}
					}
				});
		// //
				layout.addComponent(cmbTipoSistema, 0, 0);
				layout.addComponent(cmbUsaNfe, 1,0);
		//fields.addComponent(cmbUnidadeProduto, 1, 0);
		// //
		txtLiberadoPorQuem = new TextField();
		txtLiberadoPorQuem.setCaption("Liberado por Quem?");
		txtLiberadoPorQuem.setImmediate(false);
		txtLiberadoPorQuem.setWidth("456px");
		txtLiberadoPorQuem.setHeight("-1px");
		// //
		// // // cmbAlmoxarifado
		txtCaminhoBanco = new TextField();
		txtCaminhoBanco.setCaption("Caminho do Banco");
		txtCaminhoBanco.setImmediate(false);
		txtCaminhoBanco.setWidth("456px");
		txtCaminhoBanco.setHeight("-1px");

		layout.addComponent(txtLiberadoPorQuem, 0, 1);
		layout.addComponent(txtCaminhoBanco, 1, 1);
		
		cmbVendedor = new ComboBox();
		cmbVendedor.setCaption("Vendedor");
		cmbVendedor.setWidth("256px");
		cmbVendedor.setHeight("-1px");
		
		txtComissaoVendedor = new TextField();
		txtComissaoVendedor.setCaption("Comissão");
		txtComissaoVendedor.setImmediate(false);
		txtComissaoVendedor.setWidth("456px");
		txtComissaoVendedor.setHeight("-1px");
		
		layout.addComponent(cmbVendedor, 0,2);
		layout.addComponent(txtComissaoVendedor, 2,2);
		
		cmbAgente = new ComboBox();
		cmbAgente.setCaption("Agente");
		cmbAgente.setWidth("256px");
		cmbAgente.setHeight("-1px");
		
		txtComissaoAgente = new TextField();
		txtComissaoAgente.setCaption("Comissão");
		txtComissaoAgente.setImmediate(false);
		txtComissaoAgente.setWidth("456px");
		txtComissaoAgente.setHeight("-1px");
		
		layout.addComponent(cmbAgente, 0,3);
		layout.addComponent(txtComissaoAgente, 3,2);
		
		
		subForms.addTab(layout, "Informação", null);
		
	}
	
	/////////////////////////////////////////////////////////////////////////// FINANCEIRO ///////////////////////////////////////////////////////////////
	
	public void buildFinanceiroSubForm() {
		GridLayout layout = new GridLayout(7, 7);
		layout.setImmediate(false);
		layout.setWidth("100.0%");
		layout.setHeight("100.0%");
		layout.setMargin(true);
		layout.setSpacing(true);
		layout.setSizeFull();

		txtValorEntrada = new TextField();
		txtValorEntrada.setMaxLength(60);
		txtValorEntrada.setCaption("Valor Entrada");
		txtValorEntrada.setImmediate(false);
		txtValorEntrada.setWidth("-1px");
		txtValorEntrada.setHeight("-1px");

		// dtDataEntrada
		dtDataEntrada = new PopupDateField();
		dtDataEntrada.setCaption("Data Entrada");
		dtDataEntrada.setImmediate(false);
		dtDataEntrada.setWidth("-1px");
		dtDataEntrada.setHeight("-1px");

		cmbEmpresaLiberada = new ComboBox();
		cmbEmpresaLiberada.setCaption("Empresa Liberada");
		cmbEmpresaLiberada.setImmediate(false);
		cmbEmpresaLiberada.setWidth("220px");
		cmbEmpresaLiberada.setHeight("-1px");
		carregarEmpresaLiberada();

		// cmbEmpresaBloqueada
		cmbEmpresaBloqueada= new ComboBox();
		cmbEmpresaBloqueada.setCaption("Empresa Bloqueada");
		cmbEmpresaBloqueada.setImmediate(false);
		cmbEmpresaBloqueada.setWidth("-1px");
		cmbEmpresaBloqueada.setHeight("-1px");
		carregarEmpresaBloqueada();

		// cmbMostrandoAvisoCorte
		cmbMostrandoAvisoCorte = new ComboBox();
		cmbMostrandoAvisoCorte.setCaption("Mostrando Aviso de Corte");
		cmbMostrandoAvisoCorte.setImmediate(false);
		cmbMostrandoAvisoCorte.setWidth("220px");
		cmbMostrandoAvisoCorte.setHeight("-1px");
		carregarAvisoCorte();

		layout.addComponent(txtValorEntrada, 0, 0);
		layout.addComponent(dtDataEntrada, 1, 0);
		layout.addComponent(cmbEmpresaLiberada, 2, 0);
		layout.addComponent(cmbEmpresaBloqueada, 3, 0);
		layout.addComponent(cmbMostrandoAvisoCorte, 4, 0);

		txtValorMensPromocional = new TextField();
		txtValorMensPromocional.setMaxLength(60);
		txtValorMensPromocional.setCaption("Valor Mens. Promocional");
		txtValorMensPromocional.setImmediate(false);
		txtValorMensPromocional.setWidth("-1px");
		txtValorMensPromocional.setHeight("-1px");

		// dtDataVencimentoPromocao
		dtVencimentoPromocao = new PopupDateField();
		dtVencimentoPromocao.setCaption("Vencimento Promoção");
		dtVencimentoPromocao.setImmediate(false);
		dtVencimentoPromocao.setWidth("-1px");
		dtVencimentoPromocao.setHeight("-1px");;

		//
		layout.addComponent(txtValorMensPromocional, 0, 1);
		layout.addComponent(dtVencimentoPromocao, 1, 1);

		subForms.addTab(layout, "Geral", null);
	}
	
	public void carregarIcms() {
		cmbUsaNfe.removeAllItems();
		cmbUsaNfe.addItem(SIM_NAO.NAO);
		cmbUsaNfe.addItem(SIM_NAO.SIM);
	}
	
	public void carregarEmpresaLiberada() {
		cmbEmpresaLiberada.removeAllItems();
		cmbEmpresaLiberada.addItem(SIM_NAO.NAO);
		cmbEmpresaLiberada.addItem(SIM_NAO.SIM);
	}
	
	public void carregarEmpresaBloqueada() {
		cmbEmpresaBloqueada.removeAllItems();
		cmbEmpresaBloqueada.addItem(SIM_NAO.NAO);
		cmbEmpresaBloqueada.addItem(SIM_NAO.SIM);
	}
	
	public void carregarAvisoCorte() {
		cmbMostrandoAvisoCorte.removeAllItems();
		cmbMostrandoAvisoCorte.addItem(SIM_NAO.NAO);
		cmbMostrandoAvisoCorte.addItem(SIM_NAO.SIM);
	}
	
	public enum SIM_NAO {

		NAO("Não", "0"), SIM("Sim", "1");

		private SIM_NAO(String label, String codigo) {
			this.label = label;
			this.codigo = codigo;
		}

		private String label;
		private String codigo;

		public static SIM_NAO getValor(String codigo) {
			if (codigo.equals("0")) {
				return NAO;
			}
			if (codigo.equals("1")) {
				return SIM;
			}
			return null;
		}

		public String getCodigo() {
			return codigo;
		}

		public String getLabel() {
			return label;
		}

		@Override
		public String toString() {
			return label;
		}
	}

	public GridLayout getMainLayout() {
		return mainLayout;
	}

	public void setMainLayout(GridLayout mainLayout) {
		this.mainLayout = mainLayout;
	}

	public AbsoluteLayout getAbsoluteLayout_2() {
		return absoluteLayout_2;
	}

	public void setAbsoluteLayout_2(AbsoluteLayout absoluteLayout_2) {
		this.absoluteLayout_2 = absoluteLayout_2;
	}

	public TabSheet getTabSheet_1() {
		return tabSheet_1;
	}

	public void setTabSheet_1(TabSheet tabSheet_1) {
		this.tabSheet_1 = tabSheet_1;
	}

	public AbsoluteLayout getAbsoluteLayout_4() {
		return absoluteLayout_4;
	}

	public void setAbsoluteLayout_4(AbsoluteLayout absoluteLayout_4) {
		this.absoluteLayout_4 = absoluteLayout_4;
	}

	public AbsoluteLayout getAbsoluteLayout_3() {
		return absoluteLayout_3;
	}

	public void setAbsoluteLayout_3(AbsoluteLayout absoluteLayout_3) {
		this.absoluteLayout_3 = absoluteLayout_3;
	}

	public PopupDateField getDtVencimentoPromocao() {
		return dtVencimentoPromocao;
	}

	public void setDtVencimentoPromocao(PopupDateField dtVencimentoPromocao) {
		this.dtVencimentoPromocao = dtVencimentoPromocao;
	}

	public TextField getTxtValorMensPromocional() {
		return txtValorMensPromocional;
	}

	public void setTxtValorMensPromocional(TextField txtValorMensPromocional) {
		this.txtValorMensPromocional = txtValorMensPromocional;
	}

	public ComboBox getCmbMostrandoAvisoCorte() {
		return cmbMostrandoAvisoCorte;
	}

	public void setCmbMostrandoAvisoCorte(ComboBox cmbMostrandoAvisoCorte) {
		this.cmbMostrandoAvisoCorte = cmbMostrandoAvisoCorte;
	}

	public ComboBox getCmbEmpresaBloqueada() {
		return cmbEmpresaBloqueada;
	}

	public void setCmbEmpresaBloqueada(ComboBox cmbEmpresaBloqueada) {
		this.cmbEmpresaBloqueada = cmbEmpresaBloqueada;
	}

	public ComboBox getCmbEmpresaLiberada() {
		return cmbEmpresaLiberada;
	}

	public void setCmbEmpresaLiberada(ComboBox cmbEmpresaLiberada) {
		this.cmbEmpresaLiberada = cmbEmpresaLiberada;
	}

	public PopupDateField getDtDataEntrada() {
		return dtDataEntrada;
	}

	public void setDtDataEntrada(PopupDateField dtDataEntrada) {
		this.dtDataEntrada = dtDataEntrada;
	}

	public TextField getTxtValorEntrada() {
		return txtValorEntrada;
	}

	public void setTxtValorEntrada(TextField txtValorEntrada) {
		this.txtValorEntrada = txtValorEntrada;
	}

	public HorizontalLayout getHorizontalLayout_2() {
		return horizontalLayout_2;
	}

	public void setHorizontalLayout_2(HorizontalLayout horizontalLayout_2) {
		this.horizontalLayout_2 = horizontalLayout_2;
	}

	public ComboBox getCmbUsaNfe() {
		return cmbUsaNfe;
	}

	public void setCmbUsaNfe(ComboBox cmbUsaNfe) {
		this.cmbUsaNfe = cmbUsaNfe;
	}

	public TextField getTxtLiberadoPorQuem() {
		return txtLiberadoPorQuem;
	}

	public void setTxtLiberadoPorQuem(TextField txtLiberadoPorQuem) {
		this.txtLiberadoPorQuem = txtLiberadoPorQuem;
	}

	public HorizontalLayout getHorizontalLayout_1() {
		return horizontalLayout_1;
	}

	public void setHorizontalLayout_1(HorizontalLayout horizontalLayout_1) {
		this.horizontalLayout_1 = horizontalLayout_1;
	}

	public ComboBox getCmbTipoSistema() {
		return cmbTipoSistema;
	}

	public void setCmbTipoSistema(ComboBox cmbTipoSistema) {
		this.cmbTipoSistema = cmbTipoSistema;
	}

	public ManyToOneCombo<Empresa> getCmbEmpresa() {
		return cmbEmpresa;
	}

	public void setCmbEmpresa(ManyToOneCombo<Empresa> cmbEmpresa) {
		this.cmbEmpresa = cmbEmpresa;
	}
	
}

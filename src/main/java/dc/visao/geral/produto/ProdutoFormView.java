package dc.visao.geral.produto;

import org.vaadin.tepi.imageviewer.ImageViewer;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import dc.controller.geral.produto.ProdutoFormController;
import dc.entidade.geral.diverso.AlmoxarifadoEntity;
import dc.entidade.geral.produto.GrupoEntity;
import dc.entidade.geral.produto.MarcaEntity;
import dc.entidade.geral.produto.NcmEntity;
import dc.entidade.geral.produto.SubGrupoEntity;
import dc.entidade.geral.produto.UnidadeProdutoEntity;
import dc.entidade.tributario.GrupoTributarioEntity;
import dc.entidade.tributario.IcmsCustomizadoCabecalhoEntity;
import dc.framework.component.CurrencyField;
import dc.framework.component.NumberField;
import dc.visao.framework.component.IntegerConverter;
import dc.visao.framework.component.manytoonecombo.ManyToOneCombo;
import dc.visao.framework.util.ComponentUtil;

public class ProdutoFormView extends CustomComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@AutoGenerated
	private VerticalLayout mainLayout;

	@AutoGenerated
	private TextField tfAliquotaIcms;

	@AutoGenerated
	private TextField tfAliquotaIssqn;

	@AutoGenerated
	private TextField tfLoteEconomicoCompra;

	@AutoGenerated
	private TextField tfPontoPedido;

	@AutoGenerated
	private TextField tfTaxaComissao;

	@AutoGenerated
	private TextField tfPeso;

	@AutoGenerated
	private TextField tfCodigoBalanca;

	@AutoGenerated
	private TextField tfTotalizadorParcial;

	@AutoGenerated
	private TextField tfExtipi;

	@AutoGenerated
	private TextField tfLst;

	@AutoGenerated
	private TextField tfEstoqueMaximo;

	@AutoGenerated
	private TextField tfEstoqueMinimo;

	@AutoGenerated
	private TextField tfEstoqueIdeal;

	@AutoGenerated
	private TextField tfQuantidadeEstoqueAnterior;

	@AutoGenerated
	private NumberField tfQuantidadeEstoque;

	@AutoGenerated
	private CurrencyField cfMarkup;

	@AutoGenerated
	private CurrencyField cfPrecoLucroMaximo;

	@AutoGenerated
	private CurrencyField cfPrecoLucroMinimo;

	@AutoGenerated
	private CurrencyField cfPrecoLucroZero;

	@AutoGenerated
	private CurrencyField cfCustoMedioLiquido;

	@AutoGenerated
	private CurrencyField cfValorSugerido;

	@AutoGenerated
	private CurrencyField cfValorVendaMinimo;

	@AutoGenerated
	private CurrencyField cfValorVenda;

	@AutoGenerated
	private CurrencyField cfValorCompra;

	@AutoGenerated
	private TextField tfDescricao;

	@AutoGenerated
	private TextField tfDescricaoPdv;

	@AutoGenerated
	private TextField tfNome;

	@AutoGenerated
	private TextField tfCodigoInterno;

	@AutoGenerated
	private TextField tfGtin;

	@AutoGenerated
	private ComboBox cbTemIcmsCustomizado;

	@AutoGenerated
	private ComboBox cbClasse;

	@AutoGenerated
	private ComboBox cbInativo;

	@AutoGenerated
	private ComboBox cbTipoItemSped;

	@AutoGenerated
	private ComboBox cbIppt;

	@AutoGenerated
	private ComboBox cbIat;

	@AutoGenerated
	private ComboBox cbTipoVenda;

	@AutoGenerated
	private ImageViewer ivProduto;

	@AutoGenerated
	private GridLayout glGeral;

	@AutoGenerated
	private TabSheet tsGeral;

	@AutoGenerated
	private Panel plInformacaoGeral;

	@AutoGenerated
	private VerticalLayout vlInformacaoGeral;

	@AutoGenerated
	private GridLayout glInformacaoGeral;

	@AutoGenerated
	private VerticalLayout vlInformacaoValor;

	@AutoGenerated
	private Panel plInformacaoValor;

	@AutoGenerated
	private GridLayout glInformacaoValor;

	@AutoGenerated
	private VerticalLayout vlInformacaoComplementar;

	@AutoGenerated
	private Panel plInformacaoComplementar;

	@AutoGenerated
	private GridLayout glInformacaoComplementar;

	@AutoGenerated
	private ManyToOneCombo<SubGrupoEntity> mocSubGrupo;

	@AutoGenerated
	private ManyToOneCombo<UnidadeProdutoEntity> mocUnidadeProduto;

	@AutoGenerated
	private ManyToOneCombo<MarcaEntity> mocMarca;

	@AutoGenerated
	private ManyToOneCombo<AlmoxarifadoEntity> mocAlmoxarifado;

	@AutoGenerated
	private ManyToOneCombo<GrupoEntity> mocGrupo;

	@AutoGenerated
	private ManyToOneCombo<NcmEntity> mocNcm;

	@AutoGenerated
	private ManyToOneCombo<GrupoTributarioEntity> mocGrupoTributario;

	@AutoGenerated
	private ManyToOneCombo<IcmsCustomizadoCabecalhoEntity> mocIcmsCustomizado;

	private ProdutoFormController controller;

	public ProdutoFormView(ProdutoFormController controller) {
		buildMainLayout();
		setCompositionRoot(mainLayout);

		// TODO add user code here
		this.controller = controller;
	}

	public TextField getTfAliquotaIcms() {
		return tfAliquotaIcms;
	}

	public void setTfAliquotaIcms(TextField tfAliquotaIcms) {
		this.tfAliquotaIcms = tfAliquotaIcms;
	}

	public TextField getTfAliquotaIssqn() {
		return tfAliquotaIssqn;
	}

	public void setTfAliquotaIssqn(TextField tfAliquotaIssqn) {
		this.tfAliquotaIssqn = tfAliquotaIssqn;
	}

	public TextField getTfLoteEconomicoCompra() {
		return tfLoteEconomicoCompra;
	}

	public void setTfLoteEconomicoCompra(TextField tfLoteEconomicoCompra) {
		this.tfLoteEconomicoCompra = tfLoteEconomicoCompra;
	}

	public TextField getTfPontoPedido() {
		return tfPontoPedido;
	}

	public void setTfPontoPedido(TextField tfPontoPedido) {
		this.tfPontoPedido = tfPontoPedido;
	}

	public TextField getTfTaxaComissao() {
		return tfTaxaComissao;
	}

	public void setTfTaxaComissao(TextField tfTaxaComissao) {
		this.tfTaxaComissao = tfTaxaComissao;
	}

	public TextField getTfPeso() {
		return tfPeso;
	}

	public void setTfPeso(TextField tfPeso) {
		this.tfPeso = tfPeso;
	}

	public TextField getTfCodigoBalanca() {
		return tfCodigoBalanca;
	}

	public void setTfCodigoBalanca(TextField tfCodigoBalanca) {
		this.tfCodigoBalanca = tfCodigoBalanca;
	}

	public TextField getTfTotalizadorParcial() {
		return tfTotalizadorParcial;
	}

	public void setTfTotalizadorParcial(TextField tfTotalizadorParcial) {
		this.tfTotalizadorParcial = tfTotalizadorParcial;
	}

	public TextField getTfExtipi() {
		return tfExtipi;
	}

	public void setTfExtipi(TextField tfExtipi) {
		this.tfExtipi = tfExtipi;
	}

	public TextField getTfLst() {
		return tfLst;
	}

	public void setTfLst(TextField tfLst) {
		this.tfLst = tfLst;
	}

	public TextField getTfEstoqueMaximo() {
		return tfEstoqueMaximo;
	}

	public void setTfEstoqueMaximo(TextField tfEstoqueMaximo) {
		this.tfEstoqueMaximo = tfEstoqueMaximo;
	}

	public TextField getTfEstoqueMinimo() {
		return tfEstoqueMinimo;
	}

	public void setTfEstoqueMinimo(TextField tfEstoqueMinimo) {
		this.tfEstoqueMinimo = tfEstoqueMinimo;
	}

	public TextField getTfEstoqueIdeal() {
		return tfEstoqueIdeal;
	}

	public void setTfEstoqueIdeal(TextField tfEstoqueIdeal) {
		this.tfEstoqueIdeal = tfEstoqueIdeal;
	}

	public TextField getTfQuantidadeEstoqueAnterior() {
		return tfQuantidadeEstoqueAnterior;
	}

	public void setTfQuantidadeEstoqueAnterior(
			TextField tfQuantidadeEstoqueAnterior) {
		this.tfQuantidadeEstoqueAnterior = tfQuantidadeEstoqueAnterior;
	}

	public NumberField getTfQuantidadeEstoque() {
		return tfQuantidadeEstoque;
	}

	public void setTfQuantidadeEstoque(NumberField tfQuantidadeEstoque) {
		this.tfQuantidadeEstoque = tfQuantidadeEstoque;
	}

	public CurrencyField getCfMarkup() {
		return cfMarkup;
	}

	public void setCfMarkup(CurrencyField cfMarkup) {
		this.cfMarkup = cfMarkup;
	}

	public CurrencyField getCfPrecoLucroMaximo() {
		return cfPrecoLucroMaximo;
	}

	public void setCfPrecoLucroMaximo(CurrencyField cfPrecoLucroMaximo) {
		this.cfPrecoLucroMaximo = cfPrecoLucroMaximo;
	}

	public CurrencyField getCfPrecoLucroMinimo() {
		return cfPrecoLucroMinimo;
	}

	public void setCfPrecoLucroMinimo(CurrencyField cfPrecoLucroMinimo) {
		this.cfPrecoLucroMinimo = cfPrecoLucroMinimo;
	}

	public CurrencyField getCfPrecoLucroZero() {
		return cfPrecoLucroZero;
	}

	public void setCfPrecoLucroZero(CurrencyField cfPrecoLucroZero) {
		this.cfPrecoLucroZero = cfPrecoLucroZero;
	}

	public CurrencyField getCfCustoMedioLiquido() {
		return cfCustoMedioLiquido;
	}

	public void setCfCustoMedioLiquido(CurrencyField cfCustoMedioLiquido) {
		this.cfCustoMedioLiquido = cfCustoMedioLiquido;
	}

	public CurrencyField getCfValorSugerido() {
		return cfValorSugerido;
	}

	public void setCfValorSugerido(CurrencyField cfValorSugerido) {
		this.cfValorSugerido = cfValorSugerido;
	}

	public CurrencyField getCfValorVendaMinimo() {
		return cfValorVendaMinimo;
	}

	public void setTfValorVendaMinimo(CurrencyField cfValorVendaMinimo) {
		this.cfValorVendaMinimo = cfValorVendaMinimo;
	}

	public CurrencyField getCfValorVenda() {
		return cfValorVenda;
	}

	public void setCfValorVenda(CurrencyField cfValorVenda) {
		this.cfValorVenda = cfValorVenda;
	}

	public CurrencyField getCfValorCompra() {
		return cfValorCompra;
	}

	public void setCfValorCompra(CurrencyField cfValorCompra) {
		this.cfValorCompra = cfValorCompra;
	}

	public TextField getTfDescricao() {
		return tfDescricao;
	}

	public void setTfDescricao(TextField tfDescricao) {
		this.tfDescricao = tfDescricao;
	}

	public TextField getTfDescricaoPdv() {
		return tfDescricaoPdv;
	}

	public void setTfDescricaoPdv(TextField tfDescricaoPdv) {
		this.tfDescricaoPdv = tfDescricaoPdv;
	}

	public TextField getTfNome() {
		return tfNome;
	}

	public void setTfNome(TextField tfNome) {
		this.tfNome = tfNome;
	}

	public TextField getTfCodigoInterno() {
		return tfCodigoInterno;
	}

	public void setTfCodigoInterno(TextField tfCodigoInterno) {
		this.tfCodigoInterno = tfCodigoInterno;
	}

	public TextField getTfGtin() {
		return tfGtin;
	}

	public void setTfGtin(TextField tfGtin) {
		this.tfGtin = tfGtin;
	}

	public ComboBox getCbTemIcmsCustomizado() {
		return cbTemIcmsCustomizado;
	}

	public void setCbTemIcmsCustomizado(ComboBox cbTemIcmsCustomizado) {
		this.cbTemIcmsCustomizado = cbTemIcmsCustomizado;
	}

	public ComboBox getCbClasse() {
		return cbClasse;
	}

	public void setCbClasse(ComboBox cbClasse) {
		this.cbClasse = cbClasse;
	}

	public ComboBox getCbInativo() {
		return cbInativo;
	}

	public void setCbInativo(ComboBox cbInativo) {
		this.cbInativo = cbInativo;
	}

	public ComboBox getCbTipoItemSped() {
		return cbTipoItemSped;
	}

	public void setCbTipoItemSped(ComboBox cbTipoItemSped) {
		this.cbTipoItemSped = cbTipoItemSped;
	}

	public ComboBox getCbIppt() {
		return cbIppt;
	}

	public void setCbIppt(ComboBox cbIppt) {
		this.cbIppt = cbIppt;
	}

	public ComboBox getCbIat() {
		return cbIat;
	}

	public void setCbIat(ComboBox cbIat) {
		this.cbIat = cbIat;
	}

	public ComboBox getCbTipoVenda() {
		return cbTipoVenda;
	}

	public void setCbTipoVenda(ComboBox cbTipoVenda) {
		this.cbTipoVenda = cbTipoVenda;
	}

	public ImageViewer getIvProduto() {
		return ivProduto;
	}

	public void setIvProduto(ImageViewer ivProduto) {
		this.ivProduto = ivProduto;
	}

	public GridLayout getGlGeral() {
		return glGeral;
	}

	public void setGlGeral(GridLayout glGeral) {
		this.glGeral = glGeral;
	}

	public ManyToOneCombo<SubGrupoEntity> getMocSubGrupo() {
		return mocSubGrupo;
	}

	public void setMocSubGrupo(ManyToOneCombo<SubGrupoEntity> mocSubGrupo) {
		this.mocSubGrupo = mocSubGrupo;
	}

	public ManyToOneCombo<UnidadeProdutoEntity> getMocUnidadeProduto() {
		return mocUnidadeProduto;
	}

	public void setMocUnidadeProduto(
			ManyToOneCombo<UnidadeProdutoEntity> mocUnidadeProduto) {
		this.mocUnidadeProduto = mocUnidadeProduto;
	}

	public ManyToOneCombo<MarcaEntity> getMocMarca() {
		return mocMarca;
	}

	public void setMocMarca(ManyToOneCombo<MarcaEntity> mocMarca) {
		this.mocMarca = mocMarca;
	}

	public ManyToOneCombo<AlmoxarifadoEntity> getMocAlmoxarifado() {
		return mocAlmoxarifado;
	}

	public void setMocAlmoxarifado(
			ManyToOneCombo<AlmoxarifadoEntity> mocAlmoxarifado) {
		this.mocAlmoxarifado = mocAlmoxarifado;
	}

	public ManyToOneCombo<GrupoEntity> getMocGrupo() {
		return mocGrupo;
	}

	public void setMocGrupo(ManyToOneCombo<GrupoEntity> mocGrupo) {
		this.mocGrupo = mocGrupo;
	}

	public ManyToOneCombo<NcmEntity> getMocNcm() {
		return mocNcm;
	}

	public void setMocNcm(ManyToOneCombo<NcmEntity> mocNcm) {
		this.mocNcm = mocNcm;
	}

	public ManyToOneCombo<GrupoTributarioEntity> getMocGrupoTributario() {
		return mocGrupoTributario;
	}

	public void setMocGrupoTributario(
			ManyToOneCombo<GrupoTributarioEntity> mocGrupoTributario) {
		this.mocGrupoTributario = mocGrupoTributario;
	}

	public ManyToOneCombo<IcmsCustomizadoCabecalhoEntity> getMocIcmsCustomizado() {
		return mocIcmsCustomizado;
	}

	public void setMocIcmsCustomizado(
			ManyToOneCombo<IcmsCustomizadoCabecalhoEntity> mocIcmsCustomizado) {
		this.mocIcmsCustomizado = mocIcmsCustomizado;
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

		glGeral = bglGeral();
		mainLayout.addComponent(glGeral);

		tsGeral = new TabSheet();
		tsGeral.setImmediate(true);
		tsGeral.setSizeFull();

		tsGeral.addTab(bvlInformacaoGeral(), 0);
		tsGeral.addTab(bvlInformacaoValor(), 1);
		tsGeral.addTab(bvlInformacaoComplementar(), 2);

		mainLayout.addComponent(tsGeral);
		mainLayout.setExpandRatio(tsGeral, 1);
	}

	/**
	 * GERAL
	 */

	@AutoGenerated
	private GridLayout bglGeral() {
		// common part: create layout
		glGeral = new GridLayout(6, 3);
		glGeral.setImmediate(false);
		glGeral.setWidth("100.0%");
		glGeral.setHeight("-1px");
		glGeral.setMargin(false);
		glGeral.setSpacing(true);

		mocSubGrupo = new ManyToOneCombo<>();
		mocSubGrupo.setCaption("Subgrupo");
		mocSubGrupo.setRequired(true);
		mocSubGrupo.setImmediate(true);
		mocSubGrupo.setHeight("-1px");
		glGeral.addComponent(mocSubGrupo, 0, 0);

		//
		mocUnidadeProduto = new ManyToOneCombo<>();
		mocUnidadeProduto.setCaption("Unidade do produto");
		mocUnidadeProduto.setRequired(true);
		mocUnidadeProduto.setImmediate(true);
		mocUnidadeProduto.setHeight("-1px");
		glGeral.addComponent(mocUnidadeProduto, 1, 0);

		//
		mocMarca = new ManyToOneCombo<>();
		mocMarca.setCaption("Marca");
		mocMarca.setRequired(true);
		mocMarca.setImmediate(true);
		mocMarca.setHeight("-1px");
		glGeral.addComponent(mocMarca, 0, 1);

		// mocAlmoxarifado
		mocAlmoxarifado = new ManyToOneCombo<>();
		mocAlmoxarifado.setCaption("Almoxarifado");
		mocAlmoxarifado.setRequired(true);
		mocAlmoxarifado.setImmediate(true);
		mocAlmoxarifado.setHeight("-1px");
		glGeral.addComponent(mocAlmoxarifado, 1, 1);

		// mocGrupoTributario
		mocGrupoTributario = new ManyToOneCombo<>();
		mocGrupoTributario.setCaption("Grupo tributário");
		mocGrupoTributario.setImmediate(true);

		// mocIcmsCustomizado
		mocIcmsCustomizado = new ManyToOneCombo<>();
		mocIcmsCustomizado.setCaption("ICMS customizado");
		mocIcmsCustomizado.setImmediate(true);

		// cbIcmsCustomizado
		cbTemIcmsCustomizado = new ComboBox();
		cbTemIcmsCustomizado.setCaption("ICMS customizado?");
		cbTemIcmsCustomizado.setRequired(true);
		cbTemIcmsCustomizado.setImmediate(true);
		cbTemIcmsCustomizado.setNullSelectionAllowed(false);
		cbTemIcmsCustomizado.setHeight("-1px");
		cbTemIcmsCustomizado.addValueChangeListener(event -> controller
				.vceTemIcmsCustomizado(event));
		glGeral.addComponent(cbTemIcmsCustomizado, 0, 2);

		mocGrupo = new ManyToOneCombo<>();
		mocGrupo.setCaption("Grupo");
		mocGrupo.setRequired(true);
		mocGrupo.setImmediate(true);
		mocGrupo.setWidth("150px");
		mocGrupo.setHeight("-1px");
		glGeral.addComponent(mocGrupo, 1, 2);

		return glGeral;
	}

	/**
	 * INFORMAÇÃO GERAL
	 */

	@AutoGenerated
	private VerticalLayout bvlInformacaoGeral() {
		// common part: create layout
		vlInformacaoGeral = new VerticalLayout();
		vlInformacaoGeral.setImmediate(false);
		vlInformacaoGeral.setWidth("100.0%");
		vlInformacaoGeral.setHeight("100.0%");
		vlInformacaoGeral.setMargin(true);
		vlInformacaoGeral.setSpacing(true);
		vlInformacaoGeral.setCaption("Informação geral");

		//
		vlInformacaoGeral.addComponent(bplInformacaoGeral());

		return vlInformacaoGeral;
	}

	@AutoGenerated
	private Panel bplInformacaoGeral() {
		// common part: create layout
		plInformacaoGeral = new Panel();
		plInformacaoGeral.setImmediate(false);
		plInformacaoGeral.setSizeFull();

		plInformacaoGeral.setContent(bglInformacaoGeral());

		return plInformacaoGeral;
	}

	public GridLayout bglInformacaoGeral() {
		// common part: create layout
		glInformacaoGeral = new GridLayout(6, 7);
		glInformacaoGeral.setImmediate(false);
		glInformacaoGeral.setWidth("100.0%");
		glInformacaoGeral.setHeight("-1px");
		glInformacaoGeral.setMargin(true);
		glInformacaoGeral.setSpacing(true);

		tfGtin = ComponentUtil.buildTextField("GTIN");
		tfGtin.setMaxLength(60);
		tfGtin.setImmediate(false);
		tfGtin.setWidth("300px");
		tfGtin.setHeight("-1px");
		glInformacaoGeral.addComponent(tfGtin, 0, 0);

		// txtCodigoInterno
		tfCodigoInterno = ComponentUtil.buildTextField("Código interno");
		tfCodigoInterno.setMaxLength(60);
		tfCodigoInterno.setImmediate(false);
		tfCodigoInterno.setWidth("200px");
		tfCodigoInterno.setHeight("-1px");
		glInformacaoGeral.addComponent(tfCodigoInterno, 1, 0);

		mocNcm = new ManyToOneCombo<>();
		mocNcm.setCaption("NCM");
		mocNcm.setRequired(true);
		mocNcm.setImmediate(true);
		mocNcm.setWidth("250px");
		mocNcm.setHeight("-1px");
		glInformacaoGeral.addComponent(mocNcm, 2, 0);

		// cbInativo
		cbInativo = new ComboBox();
		cbInativo.setCaption("Inativo?");
		cbInativo.setImmediate(true);
		cbInativo.setRequired(true);
		cbInativo.setWidth("100px");
		cbInativo.setHeight("-1px");
		glInformacaoGeral.addComponent(cbInativo, 3, 0);

		// cbClasse
		cbClasse = new ComboBox();
		cbClasse.setCaption("Classe");
		cbClasse.setImmediate(true);
		cbClasse.setRequired(true);
		cbClasse.setWidth("100px");
		cbClasse.setHeight("-1px");
		glInformacaoGeral.addComponent(cbClasse, 4, 0);

		tfNome = ComponentUtil.buildTextField("Nome");
		tfNome.setImmediate(true);
		tfNome.setWidth("300px");
		tfNome.setHeight("-1px");
		glInformacaoGeral.addComponent(tfNome, 0, 1);

		// txtDescricaoPdv
		tfDescricaoPdv = ComponentUtil.buildTextField("Descrição do PDV");
		tfDescricaoPdv.setImmediate(true);
		tfDescricaoPdv.setWidth("300px");
		tfDescricaoPdv.setHeight("-1px");
		glInformacaoGeral.addComponent(tfDescricaoPdv, 1, 1);

		// // txtDescricao
		tfDescricao = ComponentUtil.buildTextField("Descrição");
		tfDescricao.setImmediate(true);
		tfDescricao.setWidth("300px");
		tfDescricao.setHeight("-1px");
		glInformacaoGeral.addComponent(tfDescricao, 0, 2);

		return glInformacaoGeral;
	}

	/**
	 * INFORMAÇÃO DE VALORES
	 */

	@AutoGenerated
	private VerticalLayout bvlInformacaoValor() {
		// common part: create layout
		vlInformacaoValor = new VerticalLayout();
		vlInformacaoValor.setImmediate(false);
		vlInformacaoValor.setWidth("100.0%");
		vlInformacaoValor.setHeight("100.0%");
		vlInformacaoValor.setMargin(true);
		vlInformacaoValor.setSpacing(true);
		vlInformacaoValor.setCaption("Informação de valores");

		//
		vlInformacaoValor.addComponent(bplInformacaoValor());

		return vlInformacaoValor;
	}

	@AutoGenerated
	private Panel bplInformacaoValor() {
		// common part: create layout
		plInformacaoValor = new Panel();
		plInformacaoValor.setImmediate(false);
		plInformacaoValor.setSizeFull();

		plInformacaoValor.setContent(bglInformacaoValor());

		return plInformacaoValor;
	}

	@AutoGenerated
	private GridLayout bglInformacaoValor() {
		// common part: create layout
		glInformacaoValor = new GridLayout(6, 7);
		glInformacaoValor.setImmediate(false);
		glInformacaoValor.setWidth("100.0%");
		glInformacaoValor.setHeight("-1px");
		glInformacaoValor.setMargin(true);
		glInformacaoValor.setSpacing(true);

		// tfValorCompra
		cfValorCompra = new CurrencyField("Valor de compra");
		cfValorCompra.setHeight("-1px");
		cfValorCompra.setWidth("150px");
		glInformacaoValor.addComponent(cfValorCompra, 0, 0);

		// tfValorVenda
		// tfValorVenda = ComponentUtil.buildCurrencyField("Valor de venda");
		cfValorVenda = new CurrencyField("Valor de venda");
		cfValorVenda.setHeight("-1px");
		cfValorVenda.setWidth("150px");
		glInformacaoValor.addComponent(cfValorVenda, 1, 0);

		// tfValorVendaMinimo
		// tfValorVendaMinimo = ComponentUtil
		// .buildCurrencyField("Valor de venda mínimo");
		cfValorVendaMinimo = new CurrencyField("Valor de venda mínimo");
		cfValorVendaMinimo.setHeight("-1px");
		cfValorVendaMinimo.setWidth("150px");
		glInformacaoValor.addComponent(cfValorVendaMinimo, 2, 0);

		// tfValorSugerido
		// tfValorSugerido = ComponentUtil.buildCurrencyField("Valor sugerido");
		cfValorSugerido = new CurrencyField("Valor sugerido");
		cfValorSugerido.setHeight("-1px");
		cfValorSugerido.setWidth("150px");
		glInformacaoValor.addComponent(cfValorSugerido, 3, 0);

		// tfCustoMedioLiquido
		// tfCustoMedioLiquido = ComponentUtil
		// .buildCurrencyField("Custo médio líquido");
		cfCustoMedioLiquido = new CurrencyField("Custo médio líquido");
		cfCustoMedioLiquido.setHeight("-1px");
		cfCustoMedioLiquido.setWidth("150px");
		glInformacaoValor.addComponent(cfCustoMedioLiquido, 4, 0);

		// tfPrecoLucroZero
		// tfPrecoLucroZero = ComponentUtil
		// .buildCurrencyField("Preço de lucro zero");
		cfPrecoLucroZero = new CurrencyField("Preço de lucro zero");
		cfPrecoLucroZero.setHeight("-1px");
		cfPrecoLucroZero.setWidth("150px");
		glInformacaoValor.addComponent(cfPrecoLucroZero, 0, 1);

		// tfPrecoLucroMinimo
		// tfPrecoLucroMinimo = ComponentUtil
		// .buildCurrencyField("Preço de lucro mínimo");
		cfPrecoLucroMinimo = new CurrencyField("Preço de lucro mínimo");
		cfPrecoLucroMinimo.setHeight("-1px");
		cfPrecoLucroMinimo.setWidth("150px");
		glInformacaoValor.addComponent(cfPrecoLucroMinimo, 1, 1);

		// tfPrecoLucroMaximo
		// tfPrecoLucroMaximo = ComponentUtil
		// .buildCurrencyField("Preço de lucro máximo");
		cfPrecoLucroMaximo = new CurrencyField("Preço de lucro máximo");
		cfPrecoLucroMaximo.setHeight("-1px");
		cfPrecoLucroMaximo.setWidth("150px");
		glInformacaoValor.addComponent(cfPrecoLucroMaximo, 2, 1);

		// tfMarkup
		// tfMarkup = ComponentUtil.buildCurrencyField("Markup");
		cfMarkup = new CurrencyField("Markup");
		cfMarkup.setHeight("-1px");
		cfMarkup.setWidth("150px");
		glInformacaoValor.addComponent(cfMarkup, 3, 1);

		// tfQuantidadeEstoque
		// tfQuantidadeEstoque = ComponentUtil
		// .buildNumberField("Quantidade de estoque");
		tfQuantidadeEstoque = new NumberField("Quantidade de estoque");
		tfQuantidadeEstoque.setHeight("-1px");
		tfQuantidadeEstoque.setWidth("150px");
		glInformacaoValor.addComponent(tfQuantidadeEstoque, 4, 1);

		// tfQuantidadeEstoqueAnterior
		tfQuantidadeEstoqueAnterior = ComponentUtil
				.buildNumberField("Qtde de estoque anterior");
		tfQuantidadeEstoqueAnterior.setHeight("-1px");
		tfQuantidadeEstoqueAnterior.setHeight("-1px");
		tfQuantidadeEstoqueAnterior.setWidth("150px");
		glInformacaoValor.addComponent(tfQuantidadeEstoqueAnterior, 0, 2);

		// tfEstoqueIdeal
		tfEstoqueIdeal = ComponentUtil.buildNumberField("Estoque ideal");
		tfEstoqueIdeal.setHeight("-1px");
		tfEstoqueIdeal.setHeight("-1px");
		tfEstoqueIdeal.setWidth("150px");
		glInformacaoValor.addComponent(tfEstoqueIdeal, 1, 2);

		// tfEstoqueMinimo
		tfEstoqueMinimo = ComponentUtil.buildNumberField("Estoque mínimo");
		tfEstoqueMinimo.setHeight("-1px");
		tfEstoqueMinimo.setHeight("-1px");
		tfEstoqueMinimo.setWidth("150px");
		glInformacaoValor.addComponent(tfEstoqueMinimo, 2, 2);

		// tfEstoqueMaximo
		tfEstoqueMaximo = ComponentUtil.buildNumberField("Estoque máximo");
		tfEstoqueMaximo.setHeight("-1px");
		tfEstoqueMaximo.setHeight("-1px");
		tfEstoqueMaximo.setWidth("150px");
		glInformacaoValor.addComponent(tfEstoqueMaximo, 3, 2);

		return glInformacaoValor;
	}

	/**
	 * INFORMAÇÃO COMPLEMENTAR
	 */

	@AutoGenerated
	private VerticalLayout bvlInformacaoComplementar() {
		// common part: create layout
		vlInformacaoComplementar = new VerticalLayout();
		vlInformacaoComplementar.setImmediate(false);
		vlInformacaoComplementar.setWidth("100.0%");
		vlInformacaoComplementar.setHeight("100.0%");
		vlInformacaoComplementar.setMargin(true);
		vlInformacaoComplementar.setSpacing(true);
		vlInformacaoComplementar.setCaption("Informação complementar");

		//
		vlInformacaoComplementar.addComponent(bplInformacaoComplementar());

		return vlInformacaoComplementar;
	}

	@AutoGenerated
	private Panel bplInformacaoComplementar() {
		// common part: create layout
		plInformacaoComplementar = new Panel();
		plInformacaoComplementar.setImmediate(false);
		plInformacaoComplementar.setSizeFull();

		plInformacaoComplementar.setContent(bglInformacaoComplementar());

		return plInformacaoComplementar;
	}

	@AutoGenerated
	private GridLayout bglInformacaoComplementar() {
		// common part: create layout
		glInformacaoComplementar = new GridLayout(6, 7);
		glInformacaoComplementar.setImmediate(false);
		glInformacaoComplementar.setWidth("100.0%");
		glInformacaoComplementar.setHeight("-1px");
		glInformacaoComplementar.setMargin(true);
		glInformacaoComplementar.setSpacing(true);

		tfLst = new TextField("LST");
		tfLst.setRequired(true);
		tfLst.setMaxLength(4);
		glInformacaoComplementar.addComponent(tfLst, 0, 0);

		tfExtipi = new TextField("EXTIPI");
		tfExtipi.setRequired(true);
		tfExtipi.setMaxLength(3);
		glInformacaoComplementar.addComponent(tfExtipi, 1, 0);

		cbTipoVenda = ComponentUtil.buildComboBox("Tipo de venda");
		cbTipoVenda.setRequired(true);
		cbTipoVenda.setHeight("-1px");
		cbTipoVenda.setWidth("150px");
		glInformacaoComplementar.addComponent(cbTipoVenda, 2, 0);

		cbIat = ComponentUtil.buildComboBox("IAT");
		cbIat.setRequired(true);
		cbIat.setHeight("-1px");
		cbIat.setWidth("150px");
		glInformacaoComplementar.addComponent(cbIat, 3, 0);

		cbIppt = ComponentUtil.buildComboBox("IPPT");
		cbIppt.setRequired(true);
		cbIppt.setHeight("-1px");
		cbIppt.setWidth("150px");
		glInformacaoComplementar.addComponent(cbIppt, 4, 0);

		cbTipoItemSped = ComponentUtil.buildComboBox("Tipo do item SPED");
		cbTipoItemSped.setRequired(true);
		cbTipoItemSped.setHeight("-1px");
		cbTipoItemSped.setWidth("150px");
		glInformacaoComplementar.addComponent(cbTipoItemSped, 5, 0);

		tfTotalizadorParcial = ComponentUtil
				.buildCurrencyField("Totalizador parcial");
		tfTotalizadorParcial.setHeight("-1px");
		tfTotalizadorParcial.setWidth("150px");
		glInformacaoComplementar.addComponent(tfTotalizadorParcial, 0, 1);

		tfCodigoBalanca = ComponentUtil.buildNumericField("Código da balança");
		tfCodigoBalanca.setRequired(true);
		tfCodigoBalanca.setConverter(new IntegerConverter());
		tfCodigoBalanca.setHeight("-1px");
		tfCodigoBalanca.setWidth("150px");
		glInformacaoComplementar.addComponent(tfCodigoBalanca, 1, 1);

		tfPeso = ComponentUtil.buildNumberField("Peso");
		tfPeso.setHeight("-1px");
		tfPeso.setWidth("150px");
		glInformacaoComplementar.addComponent(tfPeso, 2, 1);

		tfTaxaComissao = ComponentUtil.buildPercentageField("Taxa da comissão");
		tfTaxaComissao.setHeight("-1px");
		tfTaxaComissao.setWidth("150px");
		glInformacaoComplementar.addComponent(tfTaxaComissao, 3, 1);

		tfPontoPedido = ComponentUtil.buildNumberField("Ponto do pedido");
		tfPontoPedido.setHeight("-1px");
		tfPontoPedido.setWidth("150px");
		glInformacaoComplementar.addComponent(tfPontoPedido, 0, 2);

		tfLoteEconomicoCompra = ComponentUtil
				.buildNumberField("Lote econômico de compra");
		tfLoteEconomicoCompra.setHeight("-1px");
		tfLoteEconomicoCompra.setWidth("150px");
		glInformacaoComplementar.addComponent(tfLoteEconomicoCompra, 1, 2);

		tfAliquotaIcms = ComponentUtil.buildPercentageField("Alíquota ICMS");
		tfAliquotaIcms.setHeight("-1px");
		tfAliquotaIcms.setWidth("150px");
		glInformacaoComplementar.addComponent(tfAliquotaIcms, 2, 2);

		tfAliquotaIssqn = ComponentUtil.buildPercentageField("Alíquota ISSQN");
		tfAliquotaIssqn.setHeight("-1px");
		tfAliquotaIssqn.setWidth("150px");
		glInformacaoComplementar.addComponent(tfAliquotaIssqn, 3, 2);

		return glInformacaoComplementar;
	}

	/**
	 * 
	 */

	@AutoGenerated
	private AbsoluteLayout buildAbsoluteLayout_2() {
		// common part: create layout
		AbsoluteLayout absoluteLayout_2 = new AbsoluteLayout();
		absoluteLayout_2.setImmediate(false);
		absoluteLayout_2.setWidth("100.0%");
		absoluteLayout_2.setHeight("100.0%");

		// tabSheet_1
		TabSheet tabSheet_1 = buildTabSheet_1();
		absoluteLayout_2.addComponent(tabSheet_1, "top:-3.0px;left:20.0px;");

		return absoluteLayout_2;
	}

	@AutoGenerated
	private TabSheet buildTabSheet_1() {
		// common part: create layout
		TabSheet tabSheet_1 = new TabSheet();
		tabSheet_1.setImmediate(true);
		tabSheet_1.setWidth("100.0%");
		tabSheet_1.setHeight("100.0%");

		// absoluteLayout_3

		// absoluteLayout_4
		AbsoluteLayout absoluteLayout_4 = buildAbsoluteLayout_4();
		tabSheet_1.addTab(absoluteLayout_4, "Tab", null);

		return tabSheet_1;
	}

	@AutoGenerated
	private AbsoluteLayout buildAbsoluteLayout_4() {
		// common part: create layout
		AbsoluteLayout absoluteLayout_4 = new AbsoluteLayout();
		absoluteLayout_4.setImmediate(false);
		absoluteLayout_4.setWidth("100.0%");
		absoluteLayout_4.setHeight("100.0%");

		// imgProduto
		ivProduto = new ImageViewer();
		ivProduto.setCaption("Imagem do produto");
		ivProduto.setImmediate(false);
		ivProduto.setWidth("-1px");
		ivProduto.setHeight("130px");
		absoluteLayout_4.addComponent(ivProduto, "top:12.0px;left:9.0px;");

		// txtLst
		tfLst = new TextField();
		tfLst.setCaption("LST");
		tfLst.setImmediate(false);
		tfLst.setWidth("40px");
		tfLst.setHeight("-1px");
		absoluteLayout_4.addComponent(tfLst, "top:12.0px;left:159.0px;");

		// txtExtipi
		tfExtipi = new TextField();
		tfExtipi.setCaption("EXTIPI");
		tfExtipi.setImmediate(false);
		tfExtipi.setWidth("-1px");
		tfExtipi.setHeight("-1px");
		absoluteLayout_4.addComponent(tfExtipi, "top:12.0px;left:219.0px;");

		// cbTipoVenda
		cbTipoVenda = new ComboBox();
		cbTipoVenda.setCaption("Tipo de venda");
		cbTipoVenda.setImmediate(false);
		cbTipoVenda.setWidth("80px");
		cbTipoVenda.setHeight("-1px");
		absoluteLayout_4.addComponent(cbTipoVenda, "top:12.0px;left:379.0px;");

		// cbIat
		cbIat = new ComboBox();
		cbIat.setCaption("IAT");
		cbIat.setImmediate(false);
		cbIat.setWidth("100.0%");
		cbIat.setHeight("-1px");
		absoluteLayout_4.addComponent(cbIat,
				"top:12.0px;right:426.0px;left:479.0px;");

		// cbIppt
		cbIppt = new ComboBox();
		cbIppt.setCaption("IPPT");
		cbIppt.setImmediate(false);
		cbIppt.setWidth("106px");
		cbIppt.setHeight("-1px");
		absoluteLayout_4.addComponent(cbIppt, "top:12.0px;left:599.0px;");

		// cbTipoItemSped
		cbTipoItemSped = new ComboBox();
		cbTipoItemSped.setCaption("Tipo do item SPED");
		cbTipoItemSped.setImmediate(false);
		cbTipoItemSped.setWidth("-1px");
		cbTipoItemSped.setHeight("-1px");
		absoluteLayout_4.addComponent(cbTipoItemSped,
				"top:12.0px;left:726.0px;");

		// txtTotalizadorParcial
		tfTotalizadorParcial = new TextField();
		tfTotalizadorParcial.setCaption("Totalizador parcial");
		tfTotalizadorParcial.setImmediate(false);
		tfTotalizadorParcial.setWidth("-1px");
		tfTotalizadorParcial.setHeight("-1px");
		absoluteLayout_4.addComponent(tfTotalizadorParcial,
				"top:54.0px;left:158.0px;");

		// txtCodigoBalanca
		tfCodigoBalanca = new TextField();
		tfCodigoBalanca.setCaption("Código da balança");
		tfCodigoBalanca.setImmediate(false);
		tfCodigoBalanca.setWidth("-1px");
		tfCodigoBalanca.setHeight("-1px");
		absoluteLayout_4.addComponent(tfCodigoBalanca,
				"top:54.0px;left:319.0px;");

		// txtPeso
		tfPeso = new TextField();
		tfPeso.setCaption("Peso");
		tfPeso.setImmediate(false);
		tfPeso.setWidth("140px");
		tfPeso.setHeight("-1px");
		absoluteLayout_4.addComponent(tfPeso, "top:98.0px;left:159.0px;");

		// txtTaxaComissao
		tfTaxaComissao = new TextField();
		tfTaxaComissao.setCaption("Taxa de comissão");
		tfTaxaComissao.setImmediate(false);
		tfTaxaComissao.setWidth("-1px");
		tfTaxaComissao.setHeight("-1px");
		absoluteLayout_4.addComponent(tfTaxaComissao,
				"top:98.0px;left:319.0px;");

		// txtPontoPedido
		tfPontoPedido = new TextField();
		tfPontoPedido.setCaption("Ponto de pedido");
		tfPontoPedido.setImmediate(false);
		tfPontoPedido.setWidth("-1px");
		tfPontoPedido.setHeight("-1px");
		absoluteLayout_4
				.addComponent(tfPontoPedido, "top:98.0px;left:479.0px;");

		// txtLoteEconomicoCompra
		tfLoteEconomicoCompra = new TextField();
		tfLoteEconomicoCompra.setCaption("Lote econômico da compra");
		tfLoteEconomicoCompra.setImmediate(false);
		tfLoteEconomicoCompra.setWidth("-1px");
		tfLoteEconomicoCompra.setHeight("-1px");
		absoluteLayout_4.addComponent(tfLoteEconomicoCompra,
				"top:98.0px;left:639.0px;");

		// txtAliquotaIssqn
		tfAliquotaIssqn = new TextField();
		tfAliquotaIssqn.setCaption("Alíquota ISSQN");
		tfAliquotaIssqn.setImmediate(false);
		tfAliquotaIssqn.setWidth("-1px");
		tfAliquotaIssqn.setHeight("-1px");
		absoluteLayout_4.addComponent(tfAliquotaIssqn,
				"top:139.0px;left:319.0px;");

		// txtAliquotaICms
		tfAliquotaIcms = new TextField();
		tfAliquotaIcms.setCaption("Alíquota ICMS");
		tfAliquotaIcms.setImmediate(false);
		tfAliquotaIcms.setWidth("-1px");
		tfAliquotaIcms.setHeight("-1px");
		absoluteLayout_4.addComponent(tfAliquotaIcms,
				"top:137.0px;left:158.0px;");

		return absoluteLayout_4;
	}

}
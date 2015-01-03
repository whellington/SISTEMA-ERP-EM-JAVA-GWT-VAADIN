package dc.visao.geral.pessoal;

import java.util.List;

import org.vaadin.addons.maskedtextfield.MaskedTextField;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.data.Container;
import com.vaadin.data.Property;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Component;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Field;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.OptionGroup;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TableFieldFactory;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import dc.controller.geral.pessoal.PessoaFormController;
import dc.entidade.geral.PessoaContatoEntity;
import dc.entidade.geral.PessoaEnderecoEntity;
import dc.entidade.geral.UfEntity;
import dc.entidade.geral.pessoal.EstadoCivilEntity;
import dc.visao.framework.component.IntegerConverter;
import dc.visao.framework.component.SubFormComponent;
import dc.visao.framework.component.manytoonecombo.ManyToOneCombo;
import dc.visao.framework.util.ComponentUtil;

public class PessoaFormView extends CustomComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@AutoGenerated
	private VerticalLayout mainLayout;

	@AutoGenerated
	private GridLayout fields;

	@AutoGenerated
	private TabSheet tsGeral;

	@AutoGenerated
	private Panel plGeralPessoaFisica;

	@AutoGenerated
	private VerticalLayout vlGeralPessoaFisica;

	@AutoGenerated
	private GridLayout glGeralPessoaFisica;

	@AutoGenerated
	private Panel plGeralPessoaJuridica;

	@AutoGenerated
	private VerticalLayout vlGeralPessoaJuridica;

	@AutoGenerated
	private GridLayout glGeralPessoaJuridica;

	@AutoGenerated
	private VerticalLayout vlPessoaContato;

	@AutoGenerated
	private Panel plPessoaContato;

	@AutoGenerated
	private VerticalLayout vlPessoaEndereco;

	@AutoGenerated
	private Panel plPessoaEndereco;

	@AutoGenerated
	private VerticalLayout vlCliente;

	@AutoGenerated
	private Panel plCliente;

	@AutoGenerated
	private GridLayout glCliente;

	@AutoGenerated
	private VerticalLayout vlColaborador;

	@AutoGenerated
	private Panel plColaborador;

	@AutoGenerated
	private GridLayout glColaborador;

	@AutoGenerated
	private VerticalLayout vlFornecedor;

	@AutoGenerated
	private Panel plFornecedor;

	@AutoGenerated
	private GridLayout glFornecedor;

	@AutoGenerated
	private VerticalLayout vlTransporte;

	@AutoGenerated
	private Panel plTransporte;

	@AutoGenerated
	private GridLayout glTransporte;

	@AutoGenerated
	private ComboBox cbTipoPessoa;

	@AutoGenerated
	private ComboBox cbRaca;

	@AutoGenerated
	private ComboBox cbTipoSanguineo;

	@AutoGenerated
	private ComboBox cbTipoRegime;

	@AutoGenerated
	private ComboBox cbCrt;

	@AutoGenerated
	private ComboBox cbCategoriaReservista;

	@AutoGenerated
	private ComboBox cbCategoriaCnh;

	@AutoGenerated
	private TextField tfNome;

	@AutoGenerated
	private TextField tfEmail;

	@AutoGenerated
	private TextField tfSite;

	@AutoGenerated
	private MaskedTextField mtfCpf;

	@AutoGenerated
	private PopupDateField pdfDataNascimento;

	@AutoGenerated
	private TextField tfNaturalidade;

	@AutoGenerated
	private TextField tfNacionalidade;

	@AutoGenerated
	private TextField tfNomePai;

	@AutoGenerated
	private TextField tfNomeMae;

	@AutoGenerated
	private TextField tfFantasia;

	@AutoGenerated
	private TextField tfCnpj;

	@AutoGenerated
	private TextField tfInscricaoEstadual;

	@AutoGenerated
	private TextField tfInscricaoMunicipal;

	@AutoGenerated
	private PopupDateField pdfDataConstituicao;

	@AutoGenerated
	private TextField tfSuframa;

	@AutoGenerated
	private TextField tfNumeroRg;

	@AutoGenerated
	private TextField tfEmissorRg;

	@AutoGenerated
	private TextField tfOrgaoEmissor;

	@AutoGenerated
	private TextField tfCnh;

	@AutoGenerated
	private TextField tfTituloEleitor;

	@AutoGenerated
	private TextField tfTituloZona;

	@AutoGenerated
	private TextField tfTituloSecao;

	@AutoGenerated
	private PopupDateField pdfDataCnhEmissao;

	@AutoGenerated
	private TextField tfNumeroReservista;

	@AutoGenerated
	private PopupDateField pdfDataEmissaoRg;

	@AutoGenerated
	private OptionGroup ogSexo;

	// @AutoGenerated
	// private OptionGroup ogCategoriaPessoa;

	@AutoGenerated
	private CheckBox ckCliente;

	@AutoGenerated
	private CheckBox ckFornecedor;

	@AutoGenerated
	private CheckBox ckColaborador;

	@AutoGenerated
	private CheckBox ckTransportadora;

	@AutoGenerated
	private ManyToOneCombo<EstadoCivilEntity> mocEstadoCivil;

	private SubFormComponent<PessoaContatoEntity, Integer> sfPessoaContato;

	private SubFormComponent<PessoaEnderecoEntity, Integer> sfPessoaEndereco;

	private PessoaFormController controller;

	/**
	 * The constructor should first build the main layout, set the composition
	 * root and then do any custom initialization.
	 * 
	 * The constructor will not be automatically regenerated by the visual
	 * editor.
	 */
	public PessoaFormView(PessoaFormController controller) {
		buildMainLayout();
		setCompositionRoot(mainLayout);

		// TODO add user code here
		this.controller = controller;
	}

	public TabSheet getTsGeral() {
		return tsGeral;
	}

	public void setTsGeral(TabSheet tsGeral) {
		this.tsGeral = tsGeral;
	}

	public ComboBox getCbTipoPessoa() {
		return cbTipoPessoa;
	}

	public void setCbTipoPessoa(ComboBox cbTipoPessoa) {
		this.cbTipoPessoa = cbTipoPessoa;
	}

	public ComboBox getCbRaca() {
		return cbRaca;
	}

	public void setCbRaca(ComboBox cbRaca) {
		this.cbRaca = cbRaca;
	}

	public ComboBox getCbTipoSanguineo() {
		return cbTipoSanguineo;
	}

	public void setCbTipoSanguineo(ComboBox cbTipoSanguineo) {
		this.cbTipoSanguineo = cbTipoSanguineo;
	}

	public ComboBox getCbTipoRegime() {
		return cbTipoRegime;
	}

	public void setCbTipoRegime(ComboBox cbTipoRegime) {
		this.cbTipoRegime = cbTipoRegime;
	}

	public ComboBox getCbCrt() {
		return cbCrt;
	}

	public void setCbCrt(ComboBox cbCrt) {
		this.cbCrt = cbCrt;
	}

	public ComboBox getCbCategoriaReservista() {
		return cbCategoriaReservista;
	}

	public void setCbCategoriaReservista(ComboBox cbCategoriaReservista) {
		this.cbCategoriaReservista = cbCategoriaReservista;
	}

	public ComboBox getCbCategoriaCnh() {
		return cbCategoriaCnh;
	}

	public void setCbCategoriaCnh(ComboBox cbCategoriaCnh) {
		this.cbCategoriaCnh = cbCategoriaCnh;
	}

	public TextField getTfNome() {
		return tfNome;
	}

	public void setTfNome(TextField tfNome) {
		this.tfNome = tfNome;
	}

	public TextField getTfEmail() {
		return tfEmail;
	}

	public void setTfEmail(TextField tfEmail) {
		this.tfEmail = tfEmail;
	}

	public TextField getTfSite() {
		return tfSite;
	}

	public void setTfSite(TextField tfSite) {
		this.tfSite = tfSite;
	}

	public MaskedTextField getMtfCpf() {
		return mtfCpf;
	}

	public void setMtfCpf(MaskedTextField mtfCpf) {
		this.mtfCpf = mtfCpf;
	}

	public PopupDateField getPdfDataNascimento() {
		return pdfDataNascimento;
	}

	public void setPdfDataNascimento(PopupDateField pdfDataNascimento) {
		this.pdfDataNascimento = pdfDataNascimento;
	}

	public TextField getTfNaturalidade() {
		return tfNaturalidade;
	}

	public void setTfNaturalidade(TextField tfNaturalidade) {
		this.tfNaturalidade = tfNaturalidade;
	}

	public TextField getTfNacionalidade() {
		return tfNacionalidade;
	}

	public void setTfNacionalidade(TextField tfNacionalidade) {
		this.tfNacionalidade = tfNacionalidade;
	}

	public TextField getTfNomePai() {
		return tfNomePai;
	}

	public void setTfNomePai(TextField tfNomePai) {
		this.tfNomePai = tfNomePai;
	}

	public TextField getTfNomeMae() {
		return tfNomeMae;
	}

	public void setTfNomeMae(TextField tfNomeMae) {
		this.tfNomeMae = tfNomeMae;
	}

	public TextField getTfFantasia() {
		return tfFantasia;
	}

	public void setTfFantasia(TextField tfFantasia) {
		this.tfFantasia = tfFantasia;
	}

	public TextField getTfCnpj() {
		return tfCnpj;
	}

	public void setTfCnpj(TextField tfCnpj) {
		this.tfCnpj = tfCnpj;
	}

	public TextField getTfInscricaoEstadual() {
		return tfInscricaoEstadual;
	}

	public void setTfInscricaoEstadual(TextField tfInscricaoEstadual) {
		this.tfInscricaoEstadual = tfInscricaoEstadual;
	}

	public TextField getTfInscricaoMunicipal() {
		return tfInscricaoMunicipal;
	}

	public void setTfInscricaoMunicipal(TextField tfInscricaoMunicipal) {
		this.tfInscricaoMunicipal = tfInscricaoMunicipal;
	}

	public PopupDateField getPdfDataConstituicao() {
		return pdfDataConstituicao;
	}

	public void setPdfDataConstituicao(PopupDateField pdfDataConstituicao) {
		this.pdfDataConstituicao = pdfDataConstituicao;
	}

	public TextField getTfSuframa() {
		return tfSuframa;
	}

	public void setTfSuframa(TextField tfSuframa) {
		this.tfSuframa = tfSuframa;
	}

	public TextField getTfNumeroRg() {
		return tfNumeroRg;
	}

	public void setTfNumeroRg(TextField tfNumeroRg) {
		this.tfNumeroRg = tfNumeroRg;
	}

	public TextField getTfEmissorRg() {
		return tfEmissorRg;
	}

	public void setTfEmissorRg(TextField tfEmissorRg) {
		this.tfEmissorRg = tfEmissorRg;
	}

	public TextField getTfOrgaoEmissor() {
		return tfOrgaoEmissor;
	}

	public void setTfOrgaoEmissor(TextField tfOrgaoEmissor) {
		this.tfOrgaoEmissor = tfOrgaoEmissor;
	}

	public TextField getTfCnh() {
		return tfCnh;
	}

	public void setTfCnh(TextField tfCnh) {
		this.tfCnh = tfCnh;
	}

	public TextField getTfTituloEleitor() {
		return tfTituloEleitor;
	}

	public void setTfTituloEleitor(TextField tfTituloEleitor) {
		this.tfTituloEleitor = tfTituloEleitor;
	}

	public TextField getTfTituloZona() {
		return tfTituloZona;
	}

	public void setTfTituloZona(TextField tfTituloZona) {
		this.tfTituloZona = tfTituloZona;
	}

	public TextField getTfTituloSecao() {
		return tfTituloSecao;
	}

	public void setTfTituloSecao(TextField tfTituloSecao) {
		this.tfTituloSecao = tfTituloSecao;
	}

	public PopupDateField getPdfDataCnhEmissao() {
		return pdfDataCnhEmissao;
	}

	public void setPdfDataCnhEmissao(PopupDateField pdfDataCnhEmissao) {
		this.pdfDataCnhEmissao = pdfDataCnhEmissao;
	}

	public TextField getTfNumeroReservista() {
		return tfNumeroReservista;
	}

	public void setTfNumeroReservista(TextField tfNumeroReservista) {
		this.tfNumeroReservista = tfNumeroReservista;
	}

	public PopupDateField getPdfDataEmissaoRg() {
		return pdfDataEmissaoRg;
	}

	public void setPdfDataEmissaoRg(PopupDateField pdfDataEmissaoRg) {
		this.pdfDataEmissaoRg = pdfDataEmissaoRg;
	}

	public OptionGroup getOgSexo() {
		return ogSexo;
	}

	public void setOgSexo(OptionGroup ogSexo) {
		this.ogSexo = ogSexo;
	}

	public CheckBox getCkCliente() {
		return ckCliente;
	}

	public void setCkCliente(CheckBox ckCliente) {
		this.ckCliente = ckCliente;
	}

	public CheckBox getCkFornecedor() {
		return ckFornecedor;
	}

	public void setCkFornecedor(CheckBox ckFornecedor) {
		this.ckFornecedor = ckFornecedor;
	}

	public CheckBox getCkColaborador() {
		return ckColaborador;
	}

	public void setCkColaborador(CheckBox ckColaborador) {
		this.ckColaborador = ckColaborador;
	}

	public CheckBox getCkTransportadora() {
		return ckTransportadora;
	}

	public void setCkTransportadora(CheckBox ckTransportadora) {
		this.ckTransportadora = ckTransportadora;
	}

	public ManyToOneCombo<EstadoCivilEntity> getMocEstadoCivil() {
		return mocEstadoCivil;
	}

	public void setMocEstadoCivil(
			ManyToOneCombo<EstadoCivilEntity> mocEstadoCivil) {
		this.mocEstadoCivil = mocEstadoCivil;
	}

	public SubFormComponent<PessoaContatoEntity, Integer> getSfPessoaContato() {
		return sfPessoaContato;
	}

	public void setSfPessoaContato(
			SubFormComponent<PessoaContatoEntity, Integer> sfPessoaContato) {
		this.sfPessoaContato = sfPessoaContato;
	}

	public SubFormComponent<PessoaEnderecoEntity, Integer> getSfPessoaEndereco() {
		return sfPessoaEndereco;
	}

	public void setSfPessoaEndereco(
			SubFormComponent<PessoaEnderecoEntity, Integer> sfPessoaEndereco) {
		this.sfPessoaEndereco = sfPessoaEndereco;
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

		fields = buildFields();
		mainLayout.addComponent(fields);

		tsGeral = new TabSheet();
		tsGeral.setImmediate(true);
		tsGeral.setSizeFull();

		tsGeral.addTab(bvlGeralPessoaFisica(), 0);
		tsGeral.addTab(bvlGeralPessoaJuridica(), 1);
		tsGeral.addTab(bvlPessoaContato(), 2);
		tsGeral.addTab(bvlPessoaEndereco(), 3);
		tsGeral.addTab(bvlCliente(), 4);
		tsGeral.addTab(bvlColaborador(), 5);
		tsGeral.addTab(bvlFornecedor(), 6);
		tsGeral.addTab(bvlTransporte(), 7);

		mainLayout.addComponent(tsGeral);
		mainLayout.setExpandRatio(tsGeral, 1);
	}

	/**
	 * PESSOA FÍSICA
	 */

	@AutoGenerated
	private VerticalLayout bvlGeralPessoaFisica() {
		// common part: create layout
		vlGeralPessoaFisica = new VerticalLayout();
		vlGeralPessoaFisica.setImmediate(false);
		vlGeralPessoaFisica.setWidth("100.0%");
		vlGeralPessoaFisica.setHeight("100.0%");
		vlGeralPessoaFisica.setMargin(true);
		vlGeralPessoaFisica.setSpacing(true);
		vlGeralPessoaFisica.setCaption("Informação geral");

		//
		vlGeralPessoaFisica.addComponent(bplGeralPessoaFisica());

		return vlGeralPessoaFisica;
	}

	@AutoGenerated
	private Panel bplGeralPessoaFisica() {
		// common part: create layout
		plGeralPessoaFisica = new Panel();
		plGeralPessoaFisica.setImmediate(false);
		plGeralPessoaFisica.setSizeFull();

		plGeralPessoaFisica.setContent(bglGeralPessoaFisica());

		return plGeralPessoaFisica;
	}

	@AutoGenerated
	private GridLayout bglGeralPessoaFisica() {
		// common part: create layout
		glGeralPessoaFisica = new GridLayout(6, 7);
		glGeralPessoaFisica.setImmediate(false);
		glGeralPessoaFisica.setWidth("100.0%");
		glGeralPessoaFisica.setHeight("-1px");
		glGeralPessoaFisica.setMargin(true);
		glGeralPessoaFisica.setSpacing(true);

		mtfCpf = ComponentUtil.buildMaskedTextField("CPF", "###.###.###-##");
		pdfDataNascimento = ComponentUtil
				.buildPopupDateField("Data de nascimento");
		pdfDataNascimento.setWidth("112px");
		cbRaca = ComponentUtil.buildComboBox("Raça");
		mocEstadoCivil = new ManyToOneCombo<>();
		mocEstadoCivil.setCaption("Estado civil");
		cbTipoSanguineo = ComponentUtil.buildComboBox("Tipo sanguíneo");

		tfNaturalidade = ComponentUtil.buildTextField("Naturalidade");
		tfNacionalidade = ComponentUtil.buildTextField("Nacionalidade");

		tfNomePai = ComponentUtil.buildTextField("Nome do pai");
		tfNomeMae = ComponentUtil.buildTextField("Nome da mãe");

		glGeralPessoaFisica.addComponent(mtfCpf, 0, 0);
		glGeralPessoaFisica.addComponent(pdfDataNascimento, 1, 0);
		glGeralPessoaFisica.addComponent(mocEstadoCivil, 2, 0);
		glGeralPessoaFisica.addComponent(cbRaca, 3, 0);
		glGeralPessoaFisica.addComponent(cbTipoSanguineo, 4, 0);

		glGeralPessoaFisica.addComponent(tfNaturalidade, 0, 1, 1, 1);
		glGeralPessoaFisica.addComponent(tfNacionalidade, 2, 1, 3, 1);

		glGeralPessoaFisica.addComponent(tfNomePai, 0, 2, 1, 2);
		glGeralPessoaFisica.addComponent(tfNomeMae, 2, 2, 3, 2);

		GridLayout layoutRG = buildContentRg();
		glGeralPessoaFisica.addComponent(layoutRG, 0, 3, 1, 3);

		GridLayout layoutReservista = buildContentReservista();
		glGeralPessoaFisica.addComponent(layoutReservista, 2, 3, 3, 3);

		ogSexo = new OptionGroup("Sexo");
		glGeralPessoaFisica.addComponent(ogSexo, 4, 3);

		GridLayout layoutCNH = buildContentCnh();
		glGeralPessoaFisica.addComponent(layoutCNH, 0, 4, 1, 4);

		GridLayout layoutTitulo = buildContentTituloEleitor();
		glGeralPessoaFisica.addComponent(layoutTitulo, 2, 4, 3, 4);

		return glGeralPessoaFisica;
	}

	/**
	 * PESSOA JURÍDICA
	 */

	@AutoGenerated
	private VerticalLayout bvlGeralPessoaJuridica() {
		// common part: create layout
		vlGeralPessoaJuridica = new VerticalLayout();
		vlGeralPessoaJuridica.setImmediate(false);
		vlGeralPessoaJuridica.setWidth("100.0%");
		vlGeralPessoaJuridica.setHeight("100.0%");
		vlGeralPessoaJuridica.setMargin(true);
		vlGeralPessoaJuridica.setSpacing(true);
		vlGeralPessoaJuridica.setCaption("Informação geral");

		//
		vlGeralPessoaJuridica.addComponent(bplGeralPessoaJuridica());

		return vlGeralPessoaJuridica;
	}

	@AutoGenerated
	private Panel bplGeralPessoaJuridica() {
		// common part: create layout
		plGeralPessoaJuridica = new Panel();
		plGeralPessoaJuridica.setImmediate(false);
		plGeralPessoaJuridica.setSizeFull();

		plGeralPessoaJuridica.setContent(bglGeralPessoaJuridica());

		return plGeralPessoaJuridica;
	}

	@AutoGenerated
	private GridLayout bglGeralPessoaJuridica() {
		glGeralPessoaJuridica = new GridLayout(8, 7);
		glGeralPessoaJuridica.setImmediate(false);
		glGeralPessoaJuridica.setWidth("100.0%");
		glGeralPessoaJuridica.setHeight("-1px");
		glGeralPessoaJuridica.setMargin(true);
		glGeralPessoaJuridica.setSpacing(true);

		tfFantasia = ComponentUtil.buildTextField("Nome fantasia");
		glGeralPessoaJuridica.addComponent(tfFantasia, 0, 0, 5, 0);

		tfCnpj = ComponentUtil.buildTextField("CNPJ");
		tfInscricaoEstadual = ComponentUtil
				.buildTextField("Inscrição estadual");
		tfInscricaoMunicipal = ComponentUtil
				.buildTextField("Inscrição municipal");
		pdfDataConstituicao = ComponentUtil
				.buildPopupDateField("Data da constituição");
		tfSuframa = ComponentUtil.buildTextField("Suframa");

		glGeralPessoaJuridica.addComponent(tfCnpj, 0, 1);
		glGeralPessoaJuridica.addComponent(tfInscricaoEstadual, 1, 1, 2, 1);
		glGeralPessoaJuridica.addComponent(tfInscricaoMunicipal, 3, 1);
		glGeralPessoaJuridica.addComponent(pdfDataConstituicao, 4, 1);
		glGeralPessoaJuridica.addComponent(tfSuframa, 5, 1);

		cbTipoRegime = ComponentUtil.buildComboBox("Tipo de regime");
		cbCrt = ComponentUtil.buildComboBox("CRT");

		glGeralPessoaJuridica.addComponent(cbTipoRegime, 0, 2, 2, 2);
		glGeralPessoaJuridica.addComponent(cbCrt, 3, 2, 4, 2);

		return glGeralPessoaJuridica;
	}

	/**
	 * @@@@@@@
	 */

	@AutoGenerated
	private VerticalLayout bvlPessoaContato() {
		// common part: create layout
		vlPessoaContato = new VerticalLayout();
		vlPessoaContato.setImmediate(false);
		vlPessoaContato.setWidth("100.0%");
		vlPessoaContato.setHeight("100.0%");
		vlPessoaContato.setMargin(true);
		vlPessoaContato.setSpacing(true);
		vlPessoaContato.setCaption("Contato");

		//
		vlPessoaContato.addComponent(bplPessoaContato());

		return vlPessoaContato;
	}

	@AutoGenerated
	private Panel bplPessoaContato() {
		// common part: create layout
		plPessoaContato = new Panel();
		plPessoaContato.setImmediate(false);
		plPessoaContato.setSizeFull();

		plPessoaContato.setContent(buildPessoaContatoSubForm());

		return plPessoaContato;
	}

	/**
	 * 
	 */

	@AutoGenerated
	private VerticalLayout bvlPessoaEndereco() {
		// common part: create layout
		vlPessoaEndereco = new VerticalLayout();
		vlPessoaEndereco.setImmediate(false);
		vlPessoaEndereco.setWidth("100.0%");
		vlPessoaEndereco.setHeight("100.0%");
		vlPessoaEndereco.setMargin(true);
		vlPessoaEndereco.setSpacing(true);
		vlPessoaEndereco.setCaption("Endereço");

		//
		vlPessoaEndereco.addComponent(bplPessoaEndereco());

		return vlPessoaEndereco;
	}

	@AutoGenerated
	private Panel bplPessoaEndereco() {
		// common part: create layout
		plPessoaEndereco = new Panel();
		plPessoaEndereco.setImmediate(false);
		plPessoaEndereco.setSizeFull();

		plPessoaEndereco.setContent(buildPessoaEnderecoSubForm());

		return plPessoaEndereco;
	}

	/**
	 * CLIENTE
	 */

	@AutoGenerated
	private VerticalLayout bvlCliente() {
		// common part: create layout
		vlCliente = new VerticalLayout();
		vlCliente.setImmediate(false);
		vlCliente.setWidth("100.0%");
		vlCliente.setHeight("100.0%");
		// vlCliente.setSizeFull();
		vlCliente.setMargin(true);
		vlCliente.setSpacing(true);
		vlCliente.setCaption("Cliente");

		//
		vlCliente.addComponent(bplCliente());

		return vlCliente;
	}

	@AutoGenerated
	private Panel bplCliente() {
		// common part: create layout
		plCliente = new Panel();
		plCliente.setImmediate(false);
		plCliente.setSizeFull();

		plCliente.setContent(bglCliente());

		return plCliente;
	}

	@AutoGenerated
	private GridLayout bglCliente() {
		glCliente = new GridLayout(8, 7);
		glCliente.setImmediate(false);
		glCliente.setWidth("100.0%");
		glCliente.setHeight("-1px");
		glCliente.setMargin(true);
		glCliente.setSpacing(true);

		return glCliente;
	}

	/**
	 * COLABORADOR
	 */

	@AutoGenerated
	private VerticalLayout bvlColaborador() {
		// common part: create layout
		vlColaborador = new VerticalLayout();
		vlColaborador.setImmediate(false);
		vlColaborador.setWidth("100.0%");
		vlColaborador.setHeight("100.0%");
		// vlColaborador.setSizeFull();
		vlColaborador.setMargin(true);
		vlColaborador.setSpacing(true);
		vlColaborador.setCaption("Colaborador");

		//
		vlColaborador.addComponent(bplColaborador());

		return vlColaborador;
	}

	@AutoGenerated
	private Panel bplColaborador() {
		// common part: create layout
		plColaborador = new Panel();
		plColaborador.setImmediate(false);
		plColaborador.setSizeFull();

		plColaborador.setContent(bglColaborador());

		return plColaborador;
	}

	@AutoGenerated
	private GridLayout bglColaborador() {
		glColaborador = new GridLayout(8, 7);
		glColaborador.setImmediate(false);
		glColaborador.setWidth("100.0%");
		glColaborador.setHeight("-1px");
		glColaborador.setMargin(true);
		glColaborador.setSpacing(true);

		return glColaborador;
	}

	/**
	 * FORNECEDOR
	 */

	@AutoGenerated
	private VerticalLayout bvlFornecedor() {
		// common part: create layout
		vlFornecedor = new VerticalLayout();
		vlFornecedor.setImmediate(false);
		vlFornecedor.setWidth("100.0%");
		vlFornecedor.setHeight("100.0%");
		// vlFornecedor.setSizeFull();
		vlFornecedor.setMargin(true);
		vlFornecedor.setSpacing(true);
		vlFornecedor.setCaption("Fornecedor");

		//
		vlFornecedor.addComponent(bplFornecedor());

		return vlFornecedor;
	}

	@AutoGenerated
	private Panel bplFornecedor() {
		// common part: create layout
		plFornecedor = new Panel();
		plFornecedor.setImmediate(false);
		plFornecedor.setSizeFull();

		plFornecedor.setContent(bglFornecedor());

		return plFornecedor;
	}

	@AutoGenerated
	private GridLayout bglFornecedor() {
		glFornecedor = new GridLayout(8, 7);
		glFornecedor.setImmediate(false);
		glFornecedor.setWidth("100.0%");
		glFornecedor.setHeight("-1px");
		glFornecedor.setMargin(true);
		glFornecedor.setSpacing(true);

		return glFornecedor;
	}

	/**
	 * TRANSPORTE
	 */

	@AutoGenerated
	private VerticalLayout bvlTransporte() {
		// common part: create layout
		vlTransporte = new VerticalLayout();
		vlTransporte.setImmediate(false);
		vlTransporte.setWidth("100.0%");
		vlTransporte.setHeight("100.0%");
		// vlTransporte.setSizeFull();
		vlTransporte.setMargin(true);
		vlTransporte.setSpacing(true);
		vlTransporte.setCaption("Transporte");

		//
		// vlNfeCabecalho.addComponent(bplNfeCabecalho());

		return vlTransporte;
	}

	@AutoGenerated
	private Panel bplTransporte() {
		// common part: create layout
		plTransporte = new Panel();
		plTransporte.setImmediate(false);
		plTransporte.setSizeFull();

		plTransporte.setContent(bglTransporte());

		return plTransporte;
	}

	@AutoGenerated
	private GridLayout bglTransporte() {
		glTransporte = new GridLayout(8, 7);
		glTransporte.setImmediate(false);
		glTransporte.setWidth("100.0%");
		glTransporte.setHeight("-1px");
		glTransporte.setMargin(true);
		glTransporte.setSpacing(true);

		return glTransporte;
	}

	// private TabSheet buildContatosSubForm() {
	// // common part: create layout
	// TabSheet sub = new TabSheet();
	// sub.setWidth("100.0%");
	// sub.setHeight("100.0%");
	// sub.setSizeFull();
	// sub.setImmediate(true);
	// sub.addTab(null, "Contatos", null);
	// return sub;
	// }

	private GridLayout buildContentTituloEleitor() {
		GridLayout layoutTitulo = new GridLayout(3, 2);
		layoutTitulo.setImmediate(false);
		layoutTitulo.setWidth("100.0%");
		layoutTitulo.setHeight("-1px");
		layoutTitulo.setMargin(false);
		layoutTitulo.setSpacing(true);

		tfTituloEleitor = ComponentUtil.buildTextField("Número");
		tfTituloZona = ComponentUtil.buildNumericField("Zona");
		tfTituloSecao = ComponentUtil.buildNumericField("Seção");
		tfTituloZona.setConverter(new IntegerConverter());
		tfTituloZona.setMaxLength(10);
		tfTituloSecao.setConverter(new IntegerConverter());
		tfTituloSecao.setMaxLength(10);

		Label lblTitulo = new Label("Título de eleitor");
		layoutTitulo.addComponent(lblTitulo, 0, 0, 1, 0);
		layoutTitulo.addComponent(tfTituloEleitor, 0, 1);
		layoutTitulo.addComponent(tfTituloZona, 1, 1);
		layoutTitulo.addComponent(tfTituloSecao, 2, 1);

		return layoutTitulo;
	}

	private GridLayout buildContentCnh() {
		GridLayout layoutCnh = new GridLayout(3, 2);
		layoutCnh.setImmediate(false);
		layoutCnh.setWidth("100.0%");
		layoutCnh.setHeight("-1px");
		layoutCnh.setMargin(false);
		layoutCnh.setSpacing(true);

		tfCnh = ComponentUtil.buildTextField("Número da CNH");
		pdfDataCnhEmissao = ComponentUtil.buildPopupDateField("Emissão da CNH");
		cbCategoriaCnh = ComponentUtil.buildComboBox("Categoria da CNH");
		Label lblCnh = new Label("CNH");
		layoutCnh.addComponent(lblCnh, 0, 0);
		layoutCnh.addComponent(tfCnh, 0, 1);
		layoutCnh.addComponent(cbCategoriaCnh, 1, 1);
		layoutCnh.addComponent(pdfDataCnhEmissao, 2, 1);

		return layoutCnh;
	}

	private GridLayout buildContentReservista() {
		GridLayout layoutReservista = new GridLayout(2, 2);
		layoutReservista.setImmediate(false);
		layoutReservista.setWidth("100.0%");
		layoutReservista.setHeight("-1px");
		layoutReservista.setMargin(false);
		layoutReservista.setSpacing(true);

		tfNumeroReservista = ComponentUtil.buildTextField("Número");
		cbCategoriaReservista = ComponentUtil.buildComboBox("Categoria");
		Label lblReservista = new Label("Reservista");
		layoutReservista.addComponent(lblReservista, 0, 0);
		layoutReservista.addComponent(tfNumeroReservista, 0, 1);
		layoutReservista.addComponent(cbCategoriaReservista, 1, 1);

		return layoutReservista;
	}

	private GridLayout buildContentRg() {
		GridLayout layoutRg = new GridLayout(3, 2);
		layoutRg.setImmediate(false);
		layoutRg.setWidth("100.0%");
		layoutRg.setHeight("-1px");
		layoutRg.setMargin(false);
		layoutRg.setSpacing(true);

		tfNumeroRg = ComponentUtil.buildTextField("Número do RG");
		pdfDataEmissaoRg = ComponentUtil.buildPopupDateField("Emissão do RG");
		tfOrgaoEmissor = ComponentUtil.buildTextField("Órgão emissor");
		Label lblRg = new Label("RG");
		layoutRg.addComponent(lblRg, 0, 0);
		layoutRg.addComponent(tfNumeroRg, 0, 1);
		layoutRg.addComponent(tfOrgaoEmissor, 1, 1);
		layoutRg.addComponent(pdfDataEmissaoRg, 2, 1);

		return layoutRg;
	}

	@AutoGenerated
	private GridLayout buildFields() {
		// common part: create layout
		fields = new GridLayout(6, 3);
		fields.setImmediate(false);
		fields.setWidth("100.0%");
		fields.setHeight("-1px");
		fields.setMargin(false);
		fields.setSpacing(true);

		tfNome = ComponentUtil.buildTextField("Nome");
		tfNome.setRequired(true);
		fields.addComponent(tfNome, 0, 0, 2, 0);

		cbTipoPessoa = new ComboBox("Tipo de pessoa");
		cbTipoPessoa.setNullSelectionAllowed(false);
		// cmbTipoPessoa.setValue(cmbTipoPessoa.getItemIds().iterator().next());
		// cmbTipoPessoa.setItemCaptionPropertyId("label");
		cbTipoPessoa.setRequired(true);
		cbTipoPessoa.setImmediate(true);
		cbTipoPessoa.addValueChangeListener(new Property.ValueChangeListener() {

			@Override
			public void valueChange(ValueChangeEvent event) {
				controller.vceVisibleTabSheet(event, null);
			}

		});

		fields.addComponent(cbTipoPessoa, 3, 0);

		tfEmail = ComponentUtil.buildTextField("Email");
		tfEmail.setHeight("30");
		fields.addComponent(tfEmail, 0, 1, 2, 1);

		tfSite = ComponentUtil.buildTextField("Site");
		tfSite.setHeight("30");
		fields.addComponent(tfSite, 3, 1);

		// ogCategoriaPessoa = new OptionGroup("");
		// ogCategoriaPessoa.setMultiSelect(true);
		// ogCategoriaPessoa.setStyleName("v-select-optiongroup-horizontal");
		// ogCategoriaPessoa.addItem(ckCliente);
		// ogCategoriaPessoa.addItem(ckColaborador);
		// ogCategoriaPessoa.addItem(ckFornecedor);
		// ogCategoriaPessoa.addItem(ckTransportadora);
		fields.addComponent(buildCategoriaCliente(), 0, 2, 5, 2);

		return fields;
	}

	@AutoGenerated
	private GridLayout buildCategoriaCliente() {
		// common part: create layout
		GridLayout fields = new GridLayout(4, 1);
		fields.setImmediate(false);
		fields.setWidth("100.0%");
		fields.setHeight("-1px");
		fields.setMargin(false);
		fields.setSpacing(true);

		// ckCliente = ComponentUtil.buildCheckBox("Cliente");
		ckCliente = new CheckBox();
		ckCliente.setCaption("Cliente");
		ckCliente.setImmediate(true);
		ckCliente.setSizeFull();
		ckCliente.addValueChangeListener(new ValueChangeListener() {

			@Override
			public void valueChange(ValueChangeEvent event) {
				controller.vceVisibleTabSheet(event, 4);
			}

		});
		// ckCliente.addValueChangeListener(event -> controller.teste());
		fields.addComponent(ckCliente, 0, 0);

		// ckColaborador = ComponentUtil.buildCheckBox("Colaborador");
		ckColaborador = new CheckBox();
		ckColaborador.setCaption("Colaborador");
		ckColaborador.setImmediate(true);
		ckColaborador.setSizeFull();
		ckColaborador.addValueChangeListener(new ValueChangeListener() {

			@Override
			public void valueChange(ValueChangeEvent event) {
				controller.vceVisibleTabSheet(event, 5);
			}

		});
		fields.addComponent(ckColaborador, 1, 0);

		// ckFornecedor = ComponentUtil.buildCheckBox("Fornecedor");
		ckFornecedor = new CheckBox();
		ckFornecedor.setCaption("Fornecedor");
		ckFornecedor.setImmediate(true);
		ckFornecedor.setSizeFull();
		ckFornecedor.addValueChangeListener(new ValueChangeListener() {

			@Override
			public void valueChange(ValueChangeEvent event) {
				controller.vceVisibleTabSheet(event, 6);
			}

		});
		fields.addComponent(ckFornecedor, 2, 0);

		// ckTransportadora = ComponentUtil.buildCheckBox("Transportadora");
		ckTransportadora = new CheckBox();
		ckTransportadora.setCaption("Transportadora");
		ckTransportadora.setImmediate(true);
		ckTransportadora.setSizeFull();
		ckTransportadora.addValueChangeListener(new ValueChangeListener() {

			@Override
			public void valueChange(ValueChangeEvent event) {
				controller.vceVisibleTabSheet(event, 7);
			}

		});
		fields.addComponent(ckTransportadora, 3, 0);

		return fields;
	}

	/**
	 * SUBFORM
	 */

	private SubFormComponent<PessoaContatoEntity, Integer> buildPessoaContatoSubForm() {
		// common part: create layout

		sfPessoaContato = new SubFormComponent<PessoaContatoEntity, Integer>(
				PessoaContatoEntity.class, new String[] { "nome", "email",
						"foneComercial", "foneResidencial", "foneCelular" },
				new String[] { "Nome", "E-mail", "Telefone comercial",
						"Telefone residencial", "Celular" }) {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			protected TableFieldFactory getFieldFactory() {
				return new TableFieldFactory() {

					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					@Override
					public Field<?> createField(Container container,
							Object itemId, Object propertyId,
							Component uiContext) {
						if ("nome".equals(propertyId)) {
							TextField textField = ComponentUtil
									.buildTextField("Nome");

							return textField;
						}

						if ("email".equals(propertyId)) {
							TextField textField = ComponentUtil
									.buildTextField("Email");

							return textField;
						}

						if ("foneComercial".equals(propertyId)) {
							MaskedTextField textField = ComponentUtil
									.buildMaskedTextField("Telefone comercial",
											"(##) #####-####");
							textField.setMaskClientOnly(true);

							return textField;
						}

						if ("foneResidencial".equals(propertyId)) {
							MaskedTextField textField = ComponentUtil
									.buildMaskedTextField(
											"Telefone residencial",
											"(##) #####-####");
							textField.setMaskClientOnly(true);

							return textField;
						}

						if ("foneCelular".equals(propertyId)) {
							MaskedTextField textField = ComponentUtil
									.buildMaskedTextField("Celular",
											"(##) #####-####");
							textField.setMaskClientOnly(true);

							return textField;
						}

						return null;
					}

				};
			}

			@Override
			public boolean validateItems(List<PessoaContatoEntity> items) {
				// TODO Auto-generated method stub
				return true;
			}

			protected PessoaContatoEntity getNovo() {
				PessoaContatoEntity detalhe = controller.aderirPessoaContato();

				return detalhe;
			}

			@Override
			protected void getRemoverSelecionados(
					List<PessoaContatoEntity> values) {
				// TODO Auto-generated method stub
				controller.removerPessoaContato(values);
			}

		};

		return sfPessoaContato;
	}

	private SubFormComponent<PessoaEnderecoEntity, Integer> buildPessoaEnderecoSubForm() {
		// common part: create layout
		String[] atributos = new String[] { "cep", "logradouro", "numero",
				"complemento", "bairro", "cidade", "uf", "municipioIbge",
				"fone", "fax", "principal", "entrega", "cobranca",
				"correspondencia" };

		String[] headers = new String[] { "CEP", "Logradouro", "Nº",
				"Complemento", "Bairro", "Cidade", "UF", "Município IBGE",
				"Telefone", "Fax", "Principal", "Entrega", "Cobrança",
				"Correspondência" };

		sfPessoaEndereco = new SubFormComponent<PessoaEnderecoEntity, Integer>(
				PessoaEnderecoEntity.class, atributos, headers) {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			protected TableFieldFactory getFieldFactory() {
				return new TableFieldFactory() {

					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					@Override
					public Field<?> createField(Container container,
							Object itemId, Object propertyId,
							Component uiContext) {
						if ("cep".equals(propertyId)) {
							MaskedTextField mtf = ComponentUtil
									.buildMaskedTextField("CEP", "#####-###");
							mtf.setMaskClientOnly(true);

							return mtf;
						}

						if ("logradouro".equals(propertyId)) {
							TextField tf = ComponentUtil
									.buildTextField("Logradouro");

							return tf;
						}

						if ("numero".equals(propertyId)) {
							TextField tf = ComponentUtil
									.buildTextField("Número");
							tf.setMaxLength(6);
							tf.setConverter(new IntegerConverter());

							return tf;
						}

						if ("complemento".equals(propertyId)) {
							TextField tf = ComponentUtil
									.buildTextField("Complemento");

							return tf;
						}

						if ("bairro".equals(propertyId)) {
							TextField tf = ComponentUtil
									.buildTextField("Bairro");

							return tf;
						}

						if ("cidade".equals(propertyId)) {
							TextField tf = ComponentUtil
									.buildTextField("Cidade");

							return tf;
						}

						if ("municipioIbge".equals(propertyId)) {
							TextField tf = ComponentUtil
									.buildNumericField("Município IBGE");
							tf.setConverter(new IntegerConverter());
							tf.setMaxLength(10);

							return tf;
						}

						if ("uf".equals(propertyId)) {
							ComboBox cb = ComponentUtil.buildComboBox("UF");

							BeanItemContainer<UfEntity> bic = controller
									.getUfBic();
							cb.setContainerDataSource(bic);
							cb.setItemCaptionPropertyId("nome");

							return cb;
						}

						if ("fone".equals(propertyId)) {
							MaskedTextField mtf = ComponentUtil
									.buildMaskedTextField("Telefone",
											"(##) #####-####");
							mtf.setMaskClientOnly(true);

							return mtf;
						}

						if ("fax".equals(propertyId)) {
							MaskedTextField mtf = ComponentUtil
									.buildMaskedTextField("Fax",
											"(##) #####-####");
							mtf.setMaskClientOnly(true);

							return mtf;
						}

						if ("principal".equals(propertyId)) {
							CheckBox check = ComponentUtil.buildCheckBox(null);

							return check;
						}

						if ("entrega".equals(propertyId)) {
							CheckBox check = ComponentUtil.buildCheckBox(null);

							return check;
						}

						if ("cobranca".equals(propertyId)) {
							CheckBox check = ComponentUtil.buildCheckBox(null);

							return check;
						}

						if ("correspondencia".equals(propertyId)) {
							CheckBox check = ComponentUtil.buildCheckBox(null);

							return check;
						}

						return null;
					}

				};
			}

			@Override
			public boolean validateItems(List<PessoaEnderecoEntity> items) {
				// TODO Auto-generated method stub
				return true;
			}

			protected PessoaEnderecoEntity getNovo() {
				PessoaEnderecoEntity endereco = controller
						.aderirPessoaEndereco();

				return endereco;
			}

			@Override
			protected void getRemoverSelecionados(
					List<PessoaEnderecoEntity> values) {
				// TODO Auto-generated method stub
				controller.removerPessoaEndereco(values);
			}

		};

		return sfPessoaEndereco;
	}

}
package dc.visao.financeiro;

import java.util.List;

import org.vaadin.addons.maskedtextfield.MaskedTextField;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.data.Container;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Component;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Field;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TableFieldFactory;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import dc.controller.financeiro.EmpresaFormController;
import dc.entidade.framework.Empresa;
import dc.entidade.geral.Contato;
import dc.entidade.geral.Endereco;
import dc.entidade.pessoal.Contador;
import dc.visao.framework.component.SubFormComponent;
import dc.visao.framework.util.ComponentUtil;

public class EmpresaFormView extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@AutoGenerated
	private VerticalLayout mainLayout;

	@AutoGenerated
	private Panel panel_1;

	@AutoGenerated
	private VerticalLayout verticalLayout_2;
	@AutoGenerated
	private AbsoluteLayout absoluteLayout_1;
	@AutoGenerated
	private TabSheet tabForm;
	@AutoGenerated
	private AbsoluteLayout absoluteLayout_6;
	@AutoGenerated
	private AbsoluteLayout absoluteLayout_4;
	@AutoGenerated
	private AbsoluteLayout absoluteLayout_2;
	@AutoGenerated
	private AbsoluteLayout absoluteLayout_5;
	@AutoGenerated
	private TextField txtEmail;
	@AutoGenerated
	private TextField txtCnaePrincipal;
	@AutoGenerated
	private ComboBox cmbCnaePrincipal;
	@AutoGenerated
	private TextField txtCodigoGps;
	@AutoGenerated
	private TextField txtUf;
	@AutoGenerated
	private TextField txtMunicipio;
	@AutoGenerated
	private TextField txtAliquotaSat;
	@AutoGenerated
	private TextField txtAliquotaCofins;
	@AutoGenerated
	private TextField txtAliquotaPis;
	@AutoGenerated
	private TextField txtCei;
	@AutoGenerated
	private TextField txtCodigoTerceiros;
	@AutoGenerated
	private TextField txtContato;
	@AutoGenerated
	private ComboBox cmbCrt;
	@AutoGenerated
	private TextField txtSuframa;
	@AutoGenerated
	private ComboBox cmbTipoRegime;
	@AutoGenerated
	private ComboBox cmbTipo;
	@AutoGenerated
	private PopupDateField dtInscricaoJuntaComercial;
	@AutoGenerated
	private TextField txtInscricaoJuntaComercial;
	@AutoGenerated
	private TextField txtInscricaoMunicipal;
	@AutoGenerated
	private TextField txtInscricaoEstadualSt;
	@AutoGenerated
	private TextField txtInscricaoEstadual;
	@AutoGenerated
	private MaskedTextField txtCnpj;
	@AutoGenerated
	private PopupDateField dtInicioAtividades;
	@AutoGenerated
	private HorizontalLayout horizontalLayout_3;
	//	@AutoGenerated
	//	private ManyToOneCombo<Fpas> cmbFpas;
	private ComboBox cmbFpas;
	@AutoGenerated
	//private ManyToOneCombo<Sindicato> cmbSindicato;
	private ComboBox cmbSindicato;
	@AutoGenerated
	private HorizontalLayout horizontalLayout_2;
	@AutoGenerated
	private ComboBox cmbContador;
	@AutoGenerated
	private ComboBox cmbMatriz;
	@AutoGenerated
	private HorizontalLayout horizontalLayout_1;
	@AutoGenerated
	private TextField txtNomeFantasia;
	@AutoGenerated
	private TextField txtRazaoSocial;

	private EmpresaFormController controller;

	@AutoGenerated
	private SubFormComponent<Contato, Integer> contatoSubForm;

	@AutoGenerated
	private SubFormComponent<Endereco, Integer> enderecoSubForm;

	TabSheet subForms;

	/**
	 * The constructor should first build the main layout, set the composition
	 * root and then do any custom initialization.
	 * 
	 * The constructor will not be automatically regenerated by the visual
	 * editor.
	 */
	public EmpresaFormView(EmpresaFormController controller) {
		this.controller = controller;
		buildMainLayout();
		setCompositionRoot(mainLayout);

		// TODO add user code here
	}

	@AutoGenerated
	private VerticalLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new VerticalLayout();
		// top-level component properties

		setWidth("100%");
		setHeight("100%");

		//montaAbaEndereco();
		//montaAbaContatos();
		TabSheet aba = buildTabForm();
		

		
		mainLayout.addComponent(aba);
		mainLayout.setExpandRatio(aba, 1);
		return mainLayout;
	}

	public VerticalLayout montaAbaDadosGerais() {

		txtRazaoSocial = ComponentUtil.buildTextField("Razão Social");

		txtNomeFantasia = ComponentUtil.buildTextField("Nome Fantasia");
		VerticalLayout layout = new VerticalLayout();
		layout.setMargin(true);
		layout.addComponent(buildHorizontalLayout_1());
		layout.addComponent(buildHorizontalLayout_2());
		layout.addComponent(buildHorizontalLayout_3());
		layout.addComponent(montaLayout());
		return layout;

	}

	public void montaAbaEndereco() {

		GridLayout layout = new GridLayout(1, 1);
		layout.setImmediate(false);
		layout.setWidth("100.0%");
		layout.setHeight("100.0%");
		layout.setMargin(true);
		layout.setSpacing(true);
		layout.setSizeFull();

		txtRazaoSocial = ComponentUtil.buildTextField("Razão Social");
		layout.addComponent(txtRazaoSocial, 0, 0);
		subForms.addTab(layout, "Endereço", null);
	}

	public void montaAbaContatos() {

		GridLayout layout = new GridLayout(1, 1);
		layout.setImmediate(false);
		layout.setWidth("100.0%");
		layout.setHeight("100.0%");
		layout.setMargin(true);
		layout.setSpacing(true);
		layout.setSizeFull();

		txtRazaoSocial = ComponentUtil.buildTextField("Razão Social");
		layout.addComponent(txtRazaoSocial, 0, 0);
		subForms.addTab(layout, "Contatos", null);
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

		// gridLayout_1
		// gridLayout_1 = buildGridLayout_1();
		verticalLayout_2.addComponent(new TextField());

		return verticalLayout_2;
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

		// txtRazaoSocial
		txtRazaoSocial = new TextField();
		txtRazaoSocial.setRequired(true);
		txtRazaoSocial.setCaption("Razão Social");
		txtRazaoSocial.setImmediate(false);
		txtRazaoSocial.setWidth("400px");
		txtRazaoSocial.setHeight("-1px");
		horizontalLayout_1.addComponent(txtRazaoSocial);

		// txtNomeFantasia
		txtNomeFantasia = new TextField();
		txtNomeFantasia.setRequired(true);
		txtNomeFantasia.setCaption("Nome Fantasia");
		txtNomeFantasia.setImmediate(false);
		txtNomeFantasia.setWidth("454px");
		txtNomeFantasia.setHeight("-1px");
		horizontalLayout_1.addComponent(txtNomeFantasia);

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

		// cmbMatriz
		cmbMatriz = new ComboBox();
		cmbMatriz.setCaption("Matriz");
		cmbMatriz.setImmediate(false);
		cmbMatriz.setWidth("400px");
		cmbMatriz.setHeight("-1px");
		horizontalLayout_2.addComponent(cmbMatriz);

		// cmbContador
		cmbContador = new ComboBox();
		cmbContador.setCaption("Contador");
		cmbContador.setContainerDataSource(controller.carregarContadores());
		cmbContador.setImmediate(false);
		cmbContador.setWidth("454px");
		cmbContador.setHeight("-1px");
		horizontalLayout_2.addComponent(cmbContador);

		return horizontalLayout_2;
	}

	@AutoGenerated
	private HorizontalLayout buildHorizontalLayout_3() {
		// common part: create layout
		horizontalLayout_3 = new HorizontalLayout();
		horizontalLayout_3.setImmediate(false);
		horizontalLayout_3.setWidth("-1px");
		horizontalLayout_3.setHeight("-1px");
		horizontalLayout_3.setMargin(false);
		horizontalLayout_3.setSpacing(true);

		// cmbSindicato
		//		cmbSindicato = new ManyToOneCombo<Sindicato>();
		//		cmbSindicato.setCaption("Sindicato");
		//		cmbSindicato.setImmediate(false);
		//		cmbSindicato.setWidth("400px");
		//		cmbSindicato.setHeight("-1px");
		//		horizontalLayout_3.addComponent(cmbSindicato);

		cmbSindicato = new ComboBox();
		cmbSindicato.setCaption("Sindicato");
		cmbSindicato.setImmediate(false);
		cmbSindicato.setWidth("400px");
		cmbSindicato.setHeight("-1px");
		cmbSindicato.setContainerDataSource(controller.carregarSindicatos());
		horizontalLayout_3.addComponent(cmbSindicato);

		// cmbFpas
		cmbFpas =  new ComboBox();
		cmbFpas.setCaption("Fpas");
		cmbFpas.setImmediate(false);
		cmbFpas.setWidth("454px");
		cmbFpas.setHeight("-1px");
		cmbFpas.setContainerDataSource(controller.carregarFpas());
		horizontalLayout_3.addComponent(cmbFpas);

		return horizontalLayout_3;
	}

	@AutoGenerated
	private AbsoluteLayout buildAbsoluteLayout_1() {
		// common part: create layout
		absoluteLayout_1 = new AbsoluteLayout();
		absoluteLayout_1.setImmediate(false);
		absoluteLayout_1.setWidth("100.0%");
		absoluteLayout_1.setHeight("100.0%");

		// tabForm
		tabForm = buildTabForm();
		absoluteLayout_1.addComponent(tabForm, "top:0.0px;left:20.0px;");

		return absoluteLayout_1;
	}

	@AutoGenerated
	private TabSheet buildTabForm() {
		// common part: create layout
		tabForm = new TabSheet();
		tabForm.setImmediate(true);
		tabForm.setSizeFull();
		// absoluteLayout_2

		tabForm.addTab(montaAbaDadosGerais(), "Dados Gerais", null);
		contatoSubForm = buildContatoSubForm();
		enderecoSubForm = buildEnderecoSubForm();
		tabForm.addTab(contatoSubForm, "Contato", null);
		tabForm.addTab(enderecoSubForm, "Endereço", null);

		return tabForm;
	}

	private SubFormComponent<Contato, Integer> buildContatoSubForm() {
		contatoSubForm = new SubFormComponent<Contato, Integer>(
				Contato.class, new String[] { "nome", "email", "foneComercial",
					"foneResidencial", "foneCelular" }, new String[] {
					"Nome", "Email", "Fone Comercial", "Fone Residencial",
				"Celular" }) {
			String mascaraFone = "(##)####-####";

			@Override
			protected TableFieldFactory getFieldFactory() {
				return new TableFieldFactory() {

					@Override
					public Field<?> createField(Container container,
							Object itemId, Object propertyId,
							Component uiContext) {

						if ("nome".equals(propertyId)) {
							TextField textField = ComponentUtil.buildTextField("Nome");
							return textField;
						} else if ("email".equals(propertyId)) {
							TextField textField = ComponentUtil.buildTextField("Email");
							textField.setSizeFull();
							return textField;
						} else if ("foneComercial".equals(propertyId)) {
							MaskedTextField textField = ComponentUtil.buildMaskedTextField("Fone Comercial",mascaraFone);
							return textField;
						} else if ("foneResidencial".equals(propertyId)) {
							MaskedTextField textField = ComponentUtil.buildMaskedTextField("Fone Residencial",mascaraFone);
							return textField;
						} else if ("foneCelular".equals(propertyId)) {
							TextField textField = ComponentUtil.buildMaskedTextField("Fone Celular",mascaraFone);
							return textField;
						}

						return null;
					}

				};
			}

			protected Contato getNovo() {
				Contato contato = controller.novoContato();
				return contato;
			}

			protected void getRemoverSelecionados(List<Contato> values) {
				controller.removerContato(values);
			}

			@Override
			public boolean validateItems(List<Contato> items) {
				return true;
			}
		};
		contatoSubForm.setWidth("100%");
		contatoSubForm.setHeight("100%");
		contatoSubForm.setSizeFull();
		return contatoSubForm;
	}

	private SubFormComponent<Endereco, Integer> buildEnderecoSubForm() {
		enderecoSubForm = new SubFormComponent<Endereco, Integer>(
				Endereco.class, new String[] { "logradouro", "numero",
					"complemento", "bairro", "cidade", "cep",
					"municipioIbge", "fone"  }, new String[] {
					"Logradouro", "Número", "Complemento", "Bairro",
					"Cidade", "Cep", "Município Ibge", "Telefone" }) {
			@Override
			protected TableFieldFactory getFieldFactory() {
				return new TableFieldFactory() {

					@Override
					public Field<?> createField(Container container,
							Object itemId, Object propertyId,
							Component uiContext) {

						if ("logradouro".equals(propertyId)) {
							TextField textField = ComponentUtil.buildTextField("Logradouro");
							return textField;
						} else if ("numero".equals(propertyId)) {
							TextField textField = ComponentUtil.buildTextField("Número");
							return textField;
						} else if ("complemento".equals(propertyId)) {
							TextField textField = ComponentUtil.buildTextField("Complemento");
							return textField;
						} else if ("bairro".equals(propertyId)) {
							TextField textField = ComponentUtil.buildTextField("Bairro");
							return textField;
						} else if ("cidade".equals(propertyId)) {
							TextField textField = ComponentUtil.buildTextField("Cidade");
							return textField;
						} else if ("cep".equals(propertyId)) {
							MaskedTextField textField = ComponentUtil.buildMaskedTextField("CEP","##.###-###");
							return textField;
						}else if ("municipioIbge".equals(propertyId)) {
							TextField textField = ComponentUtil.buildTextField("Código Municipio");
							return textField;
						} else if ("fone".equals(propertyId)) {
							MaskedTextField textField = ComponentUtil.buildMaskedTextField("Telefone","(##)####-####");
							return textField;
						}

						return null;
					}

				};
			}

			protected Endereco getNovo() {
				Endereco endereco = controller.novoEndereco();
				return endereco;
			}

			protected void getRemoverSelecionados(List<Endereco> values) {
				controller.removerEndereco(values);
			}

			@Override
			public boolean validateItems(List<Endereco> items) {
				// TODO Auto-generated method stub
				return true;
			}
		};

		return enderecoSubForm;
	}

	@AutoGenerated
	private AbsoluteLayout buildAbsoluteLayout_2() {
		// common part: create layout
		absoluteLayout_2 = new AbsoluteLayout();
		absoluteLayout_2.setCaption("Dados");
		absoluteLayout_2.setImmediate(false);
		absoluteLayout_2.setWidth("100.0%");
		absoluteLayout_2.setHeight("100.0%");

		// absoluteLayout_5
		absoluteLayout_5 = buildAbsoluteLayout_5();
		absoluteLayout_2.addComponent(absoluteLayout_5,
				"top:-2.0px;left:-1.0px;");

		return absoluteLayout_2;
	}

	@AutoGenerated
	private AbsoluteLayout buildAbsoluteLayout_5() {
		// common part: create layout
		absoluteLayout_5 = new AbsoluteLayout();
		absoluteLayout_5.setImmediate(false);
		absoluteLayout_5.setWidth("100.0%");
		absoluteLayout_5.setHeight("100.0%");
		absoluteLayout_5.setVisible(true);
		// dtInicioAtividades
		dtInicioAtividades = new PopupDateField();
		dtInicioAtividades.setCaption("Início Atividades");
		dtInicioAtividades.setImmediate(false);
		dtInicioAtividades.setWidth("135px");
		dtInicioAtividades.setHeight("-1px");
		absoluteLayout_5.addComponent(dtInicioAtividades,
				"top:20.0px;left:25.0px;");

		// txtCnpj
		//		txtCnpj = ComponentUtil.buildMaskedTextField("CNPJ", "##.###.###/####-##");
		//		txtCnpj.setCaption("CNPJ");
		//		txtCnpj.setImmediate(false);
		//		txtCnpj.setWidth("160px");
		//		txtCnpj.setHeight("-1px");
		absoluteLayout_5.addComponent(txtCnpj, "top:19.0px;left:180.0px;");

		// txtInscricaoEstadual
		txtInscricaoEstadual = new TextField();
		txtInscricaoEstadual.setCaption("Inscrição Estadual");
		txtInscricaoEstadual.setImmediate(false);
		txtInscricaoEstadual.setWidth("-1px");
		txtInscricaoEstadual.setHeight("-1px");
		absoluteLayout_5.addComponent(txtInscricaoEstadual,
				"top:19.0px;left:360.0px;");

		// txtInscricaoEstadualSt
		txtInscricaoEstadualSt = new TextField();
		txtInscricaoEstadualSt.setCaption("Inscrição Estadual ST");
		txtInscricaoEstadualSt.setImmediate(false);
		txtInscricaoEstadualSt.setWidth("-1px");
		txtInscricaoEstadualSt.setHeight("-1px");
		absoluteLayout_5.addComponent(txtInscricaoEstadualSt,
				"top:19.0px;left:520.0px;");

		// txtInscricaoMunicipal
		txtInscricaoMunicipal = new TextField();
		txtInscricaoMunicipal.setCaption("Inscrição Municipal");
		txtInscricaoMunicipal.setImmediate(false);
		txtInscricaoMunicipal.setWidth("-1px");
		txtInscricaoMunicipal.setHeight("-1px");
		absoluteLayout_5.addComponent(txtInscricaoMunicipal,
				"top:19.0px;left:680.0px;");

		// txtInscricaoJuntaComercial
		txtInscricaoJuntaComercial = new TextField();
		txtInscricaoJuntaComercial.setCaption("Inscrição Junta Comercial");
		txtInscricaoJuntaComercial.setImmediate(false);
		txtInscricaoJuntaComercial.setWidth("-1px");
		txtInscricaoJuntaComercial.setHeight("-1px");
		absoluteLayout_5.addComponent(txtInscricaoJuntaComercial,
				"top:20.0px;left:839.0px;");

		// dtInscricaoJuntaComercial
		dtInscricaoJuntaComercial = new PopupDateField();
		dtInscricaoJuntaComercial.setCaption("Inscrição Junta Comercial");
		dtInscricaoJuntaComercial.setImmediate(false);
		dtInscricaoJuntaComercial.setWidth("160px");
		dtInscricaoJuntaComercial.setHeight("-1px");
		absoluteLayout_5.addComponent(dtInscricaoJuntaComercial,
				"top:21.0px;left:1000.0px;");

		// cmbTipo
		cmbTipo = new ComboBox();
		cmbTipo.setCaption("Tipo");
		cmbTipo.setImmediate(false);
		cmbTipo.setWidth("135px");
		cmbTipo.setHeight("-1px");
		absoluteLayout_5.addComponent(cmbTipo, "top:60.0px;left:25.0px;");

		// cmbTipoRegime
		cmbTipoRegime = new ComboBox();
		cmbTipoRegime.setCaption("Tipo Regime");
		cmbTipoRegime.setImmediate(false);
		cmbTipoRegime.setWidth("160px");
		cmbTipoRegime.setHeight("-1px");
		absoluteLayout_5
		.addComponent(cmbTipoRegime, "top:60.0px;left:180.0px;");

		// txtSuframa
		txtSuframa = new TextField();
		txtSuframa.setCaption("Suframa");
		txtSuframa.setImmediate(false);
		txtSuframa.setWidth("-1px");
		txtSuframa.setHeight("-1px");
		absoluteLayout_5.addComponent(txtSuframa, "top:56.0px;left:360.0px;");



		// txtContato
		txtContato = new TextField();
		txtContato.setCaption("Contato");
		txtContato.setImmediate(false);
		txtContato.setWidth("320px");
		txtContato.setHeight("-1px");
		absoluteLayout_5.addComponent(txtContato, "top:56.0px;left:840.0px;");

		// txtCodigoTerceiros
		txtCodigoTerceiros = new TextField();
		txtCodigoTerceiros.setCaption("Código Terceiros");
		txtCodigoTerceiros.setImmediate(false);
		txtCodigoTerceiros.setWidth("135px");
		txtCodigoTerceiros.setHeight("-1px");
		absoluteLayout_5.addComponent(txtCodigoTerceiros,
				"top:96.0px;left:25.0px;");

		// txtCei
		txtCei = new TextField();
		txtCei.setCaption("CEI");
		txtCei.setImmediate(false);
		txtCei.setWidth("160px");
		txtCei.setHeight("-1px");
		absoluteLayout_5.addComponent(txtCei, "top:96.0px;left:180.0px;");

		// txtAliquotaPis
		txtAliquotaPis = new TextField();
		txtAliquotaPis.setCaption("Alíquota PIS");
		txtAliquotaPis.setImmediate(false);
		txtAliquotaPis.setWidth("-1px");
		txtAliquotaPis.setHeight("-1px");
		absoluteLayout_5.addComponent(txtAliquotaPis,
				"top:96.0px;left:360.0px;");

		// txtAliquotaCofins
		txtAliquotaCofins = new TextField();
		txtAliquotaCofins.setCaption("Alíquota COFINS");
		txtAliquotaCofins.setImmediate(false);
		txtAliquotaCofins.setWidth("-1px");
		txtAliquotaCofins.setHeight("-1px");
		absoluteLayout_5.addComponent(txtAliquotaCofins,
				"top:96.0px;left:520.0px;");

		// txtAliquotaSat
		txtAliquotaSat = new TextField();
		txtAliquotaSat.setCaption("Alíquota SAT");
		txtAliquotaSat.setImmediate(false);
		txtAliquotaSat.setWidth("-1px");
		txtAliquotaSat.setHeight("-1px");
		absoluteLayout_5.addComponent(txtAliquotaSat,
				"top:96.0px;left:680.0px;");

		// txtMunicipio
		txtMunicipio = new TextField();
		txtMunicipio.setCaption("Código IBGE Município");
		txtMunicipio.setImmediate(false);
		txtMunicipio.setWidth("-1px");
		txtMunicipio.setHeight("-1px");
		absoluteLayout_5.addComponent(txtMunicipio, "top:96.0px;left:839.0px;");

		// txtUf
		txtUf = new TextField();
		txtUf.setCaption("Código IBGE UF");
		txtUf.setImmediate(false);
		txtUf.setWidth("160px");
		txtUf.setHeight("-1px");
		absoluteLayout_5.addComponent(txtUf, "top:96.0px;left:1000.0px;");

		// txtCodigoCps
		txtCodigoGps = new TextField();
		txtCodigoGps.setCaption("Código GPS");
		txtCodigoGps.setImmediate(false);
		txtCodigoGps.setWidth("135px");
		txtCodigoGps.setHeight("-1px");
		absoluteLayout_5.addComponent(txtCodigoGps, "top:146.0px;left:25.0px;");

		// txtCnaePrincipal
		txtCnaePrincipal = new TextField();
		txtCnaePrincipal.setCaption("CNAE Principal");
		txtCnaePrincipal.setImmediate(false);
		txtCnaePrincipal.setWidth("480px");
		txtCnaePrincipal.setHeight("-1px");
		absoluteLayout_5.addComponent(txtCnaePrincipal,
				"top:146.0px;left:180.0px;");

		// txtEmail
		txtEmail = new TextField();
		txtEmail.setCaption("Email");
		txtEmail.setImmediate(false);
		txtEmail.setWidth("480px");
		txtEmail.setHeight("-1px");
		absoluteLayout_5.addComponent(txtEmail, "top:146.0px;left:680.0px;");

		return absoluteLayout_5;
	}



	@AutoGenerated
	private GridLayout montaLayout() {
		// common part: create layout

		GridLayout layout = new GridLayout(7,7);
		layout.setSpacing(true);
		// dtInicioAtividades
		dtInicioAtividades =ComponentUtil.buildPopupDateField("Inicio Atividades");
		layout.addComponent(dtInicioAtividades,0,0);

		// txtCnpj
		txtCnpj = ComponentUtil.buildMaskedTextField("CNPJ","##.###.###/####-##");
		layout.addComponent(txtCnpj,1,0);

		txtInscricaoEstadual = ComponentUtil.buildTextField("Inscrição Estadual");
		layout.addComponent(txtInscricaoEstadual,2,0);

		// txtInscricaoEstadualSt
		txtInscricaoEstadualSt = ComponentUtil.buildTextField("Inscrição Estadual ST");
		layout.addComponent(txtInscricaoEstadualSt,3,0);

		// txtInscricaoMunicipal
		txtInscricaoMunicipal = ComponentUtil.buildTextField("Inscrição Municipal");
		layout.addComponent(txtInscricaoMunicipal,4,0);

		// txtInscricaoJuntaComercial
		txtInscricaoJuntaComercial = ComponentUtil.buildTextField("Inscrição Junta Comercial");
		layout.addComponent(txtInscricaoJuntaComercial,5,0);


		// dtInscricaoJuntaComercial
		dtInscricaoJuntaComercial = ComponentUtil.buildPopupDateField("Data Inscrição Junta Comercial");
		layout.addComponent(dtInscricaoJuntaComercial,0,1);

		// cmbTipo
		cmbTipo = ComponentUtil.buildComboBox("Tipo");
		layout.addComponent(cmbTipo,1,1);

		// cmbTipoRegime
		cmbTipoRegime = ComponentUtil.buildComboBox("Tipo Regime");
		layout.addComponent(cmbTipoRegime,2,1);

		// txtSuframa
		txtSuframa = ComponentUtil.buildTextField("SUFRAMA");
		layout.addComponent(txtSuframa,3,1);



		txtContato = ComponentUtil.buildTextField("Contato");
		layout.addComponent(txtContato,4,1,5,1);

		// txtCodigoTerceiros
		txtCodigoTerceiros = ComponentUtil.buildTextField("Código Terceiros");
		layout.addComponent(txtCodigoTerceiros,0,2);

		txtCei = ComponentUtil.buildTextField("CEI");
		layout.addComponent(txtCei,1,2);

		// txtAliquotaPis
		txtAliquotaPis = ComponentUtil.buildTextField("Aliquota PIS");
		layout.addComponent(txtAliquotaPis,2,2);

		// txtAliquotaCofins
		txtAliquotaCofins = ComponentUtil.buildTextField("Aliquota COFINS");
		layout.addComponent(txtAliquotaCofins,3,2);

		// txtAliquotaSat
		txtAliquotaSat = ComponentUtil.buildTextField("Aliquota SAT");
		layout.addComponent(txtAliquotaSat,4,2);

		// txtCodigoCps
		txtCodigoGps = ComponentUtil.buildTextField("Código GPS");
		layout.addComponent(txtCodigoGps,0,3);

		// txtCnaePrincipal
		//		txtCnaePrincipal = ComponentUtil.buildTextField("CNAE Principal");
		//		layout.addComponent(txtCnaePrincipal,1,3);

		cmbCnaePrincipal = ComponentUtil.buildComboBox("CNAE Principal");
		cmbCnaePrincipal.setContainerDataSource(controller.carregarEmpresaCnae());
		layout.addComponent(cmbCnaePrincipal,1,3);

		txtMunicipio = ComponentUtil.buildTextField("Código IBGE Municipio");
		layout.addComponent(txtMunicipio,2,3);

		// txtUf
		txtUf = ComponentUtil.buildTextField("Código IBGE UF");
		layout.addComponent(txtUf,3,3);

		// cmbCrt
		cmbCrt = ComponentUtil.buildComboBox("CRT");
		layout.addComponent(cmbCrt,0,4);

		return layout;

	}



	public GridLayout getMainLayout() {
		return null;
	}

	public void setMainLayout(GridLayout mainLayout) {
		// this.mainLayout = mainLayout;
	}

	public AbsoluteLayout getAbsoluteLayout_1() {
		return absoluteLayout_1;
	}

	public void setAbsoluteLayout_1(AbsoluteLayout absoluteLayout_1) {
		this.absoluteLayout_1 = absoluteLayout_1;
	}

	public TabSheet getTabForm() {
		return tabForm;
	}

	public void setTabForm(TabSheet tabForm) {
		this.tabForm = tabForm;
	}

	public AbsoluteLayout getAbsoluteLayout_6() {
		return absoluteLayout_6;
	}

	public void setAbsoluteLayout_6(AbsoluteLayout absoluteLayout_6) {
		this.absoluteLayout_6 = absoluteLayout_6;
	}

	public AbsoluteLayout getAbsoluteLayout_4() {
		return absoluteLayout_4;
	}

	public void setAbsoluteLayout_4(AbsoluteLayout absoluteLayout_4) {
		this.absoluteLayout_4 = absoluteLayout_4;
	}

	public AbsoluteLayout getAbsoluteLayout_2() {
		return absoluteLayout_2;
	}

	public void setAbsoluteLayout_2(AbsoluteLayout absoluteLayout_2) {
		this.absoluteLayout_2 = absoluteLayout_2;
	}

	public AbsoluteLayout getAbsoluteLayout_5() {
		return absoluteLayout_5;
	}

	public void setAbsoluteLayout_5(AbsoluteLayout absoluteLayout_5) {
		this.absoluteLayout_5 = absoluteLayout_5;
	}

	public TextField getTxtEmail() {
		return txtEmail;
	}

	public void setTxtEmail(TextField txtEmail) {
		this.txtEmail = txtEmail;
	}

	public TextField getTxtCnaePrincipal() {
		return txtCnaePrincipal;
	}

	public void setTxtCnaePrincipal(TextField txtCnaePrincipal) {
		this.txtCnaePrincipal = txtCnaePrincipal;
	}

	public TextField getTxtCodigoGps() {
		return txtCodigoGps;
	}

	public void setTxtCodigoCps(TextField txtCodigoGps) {
		this.txtCodigoGps = txtCodigoGps;
	}

	public TextField getTxtUf() {
		return txtUf;
	}

	public void setTxtUf(TextField txtUf) {
		this.txtUf = txtUf;
	}

	public TextField getTxtMunicipio() {
		return txtMunicipio;
	}

	public void setTxtMunicipio(TextField txtMunicipio) {
		this.txtMunicipio = txtMunicipio;
	}

	public TextField getTxtAliquotaSat() {
		return txtAliquotaSat;
	}

	public void setTxtAliquotaSat(TextField txtAliquotaSat) {
		this.txtAliquotaSat = txtAliquotaSat;
	}

	public TextField getTxtAliquotaCofins() {
		return txtAliquotaCofins;
	}

	public void setTxtAliquotaCofins(TextField txtAliquotaCofins) {
		this.txtAliquotaCofins = txtAliquotaCofins;
	}

	public TextField getTxtAliquotaPis() {
		return txtAliquotaPis;
	}

	public void setTxtAliquotaPis(TextField txtAliquotaPis) {
		this.txtAliquotaPis = txtAliquotaPis;
	}

	public TextField getTxtCei() {
		return txtCei;
	}

	public void setTxtCei(TextField txtCei) {
		this.txtCei = txtCei;
	}

	public TextField getTxtCodigoTerceiros() {
		return txtCodigoTerceiros;
	}

	public void setTxtCodigoTerceiros(TextField txtCodigoTerceiros) {
		this.txtCodigoTerceiros = txtCodigoTerceiros;
	}

	public TextField getTxtContato() {
		return txtContato;
	}

	public void setTxtContato(TextField txtContato) {
		this.txtContato = txtContato;
	}

	public ComboBox getCmbCrt() {
		return cmbCrt;
	}

	public void setCmbCrt(ComboBox cmbCrt) {
		this.cmbCrt = cmbCrt;
	}

	public TextField getTxtSuframa() {
		return txtSuframa;
	}

	public void setTxtSuframa(TextField txtSuframa) {
		this.txtSuframa = txtSuframa;
	}

	public ComboBox getCmbTipoRegime() {
		return cmbTipoRegime;
	}

	public void setCmbTipoRegime(ComboBox cmbTipoRegime) {
		this.cmbTipoRegime = cmbTipoRegime;
	}

	public ComboBox getCmbTipo() {
		return cmbTipo;
	}

	public void setCmbTipo(ComboBox cmbTipo) {
		this.cmbTipo = cmbTipo;
	}

	public PopupDateField getDtInscricaoJuntaComercial() {
		return dtInscricaoJuntaComercial;
	}

	public void setDtInscricaoJuntaComercial(
			PopupDateField dtInscricaoJuntaComercial) {
		this.dtInscricaoJuntaComercial = dtInscricaoJuntaComercial;
	}

	public TextField getTxtInscricaoJuntaComercial() {
		return txtInscricaoJuntaComercial;
	}

	public void setTxtInscricaoJuntaComercial(
			TextField txtInscricaoJuntaComercial) {
		this.txtInscricaoJuntaComercial = txtInscricaoJuntaComercial;
	}

	public TextField getTxtInscricaoMunicipal() {
		return txtInscricaoMunicipal;
	}

	public void setTxtInscricaoMunicipal(TextField txtInscricaoMunicipal) {
		this.txtInscricaoMunicipal = txtInscricaoMunicipal;
	}

	public TextField getTxtInscricaoEstadualSt() {
		return txtInscricaoEstadualSt;
	}

	public void setTxtInscricaoEstadualSt(TextField txtInscricaoEstadualSt) {
		this.txtInscricaoEstadualSt = txtInscricaoEstadualSt;
	}

	public TextField getTxtInscricaoEstadual() {
		return txtInscricaoEstadual;
	}

	public void setTxtInscricaoEstadual(TextField txtInscricaoEstadual) {
		this.txtInscricaoEstadual = txtInscricaoEstadual;
	}



	public MaskedTextField getTxtCnpj() {
		return txtCnpj;
	}

	public void setTxtCnpj(MaskedTextField txtCnpj) {
		this.txtCnpj = txtCnpj;
	}

	public PopupDateField getDtInicioAtividades() {
		return dtInicioAtividades;
	}

	public void setDtInicioAtividades(PopupDateField dtInicioAtividades) {
		this.dtInicioAtividades = dtInicioAtividades;
	}

	public HorizontalLayout getHorizontalLayout_3() {
		return horizontalLayout_3;
	}

	public void setHorizontalLayout_3(HorizontalLayout horizontalLayout_3) {
		this.horizontalLayout_3 = horizontalLayout_3;
	}








	public ComboBox getCmbFpas() {
		return cmbFpas;
	}

	public void setCmbFpas(ComboBox cmbFpas) {
		this.cmbFpas = cmbFpas;
	}

	public ComboBox getCmbSindicato() {
		return cmbSindicato;
	}

	public void setCmbSindicato(ComboBox cmbSindicato) {
		this.cmbSindicato = cmbSindicato;
	}

	public HorizontalLayout getHorizontalLayout_2() {
		return horizontalLayout_2;
	}

	public void setHorizontalLayout_2(HorizontalLayout horizontalLayout_2) {
		this.horizontalLayout_2 = horizontalLayout_2;
	}

	public ComboBox getCmbContador() {
		return cmbContador;
	}

	public void setCmbContador(ComboBox cmbContador) {
		this.cmbContador = cmbContador;
	}

	public ComboBox getCmbMatriz() {
		return cmbMatriz;
	}

	public void setCmbMatriz(ComboBox cmbMatriz) {
		this.cmbMatriz = cmbMatriz;
	}

	public HorizontalLayout getHorizontalLayout_1() {
		return horizontalLayout_1;
	}

	public void setHorizontalLayout_1(HorizontalLayout horizontalLayout_1) {
		this.horizontalLayout_1 = horizontalLayout_1;
	}

	public TextField getTxtNomeFantasia() {
		return txtNomeFantasia;
	}

	public void setTxtNomeFantasia(TextField txtNomeFantasia) {
		this.txtNomeFantasia = txtNomeFantasia;
	}

	public TextField getTxtRazaoSocial() {
		return txtRazaoSocial;
	}

	public void setTxtRazaoSocial(TextField txtRazaoSocial) {
		this.txtRazaoSocial = txtRazaoSocial;
	}

	public EmpresaFormController getController() {
		return controller;
	}

	public void setController(EmpresaFormController controller) {
		this.controller = controller;
	}

	public SubFormComponent<Contato, Integer> getContatoSubForm() {
		return contatoSubForm;
	}

	public void setContatoSubForm(
			SubFormComponent<Contato, Integer> contatoSubForm) {
		this.contatoSubForm = contatoSubForm;
	}

	public SubFormComponent<Endereco, Integer> getEnderecoSubForm() {
		return enderecoSubForm;
	}

	public void setEnderecoSubForm(
			SubFormComponent<Endereco, Integer> enderecoSubForm) {
		this.enderecoSubForm = enderecoSubForm;
	}

	/*
	 * public void carregaComboMatriz(List<Matriz> matrizes) {
	 * this.cmbMatriz.removeAllItems(); for (Matriz matriz : matrizes) {
	 * this.cmbMatriz.addItem(matriz); } }
	 */

	public void carregaComboContador(List<Contador> contadores) {
		this.cmbContador.removeAllItems();
		for (Contador contador : contadores) {
			this.cmbContador.addItem(contador);
		}
	}

	//	public void carregaComboFpas(List<Fpas> fpass) {
	//		this.cmbFpas.removeAllItems();
	//		for (Fpas fpas : fpass) {
	//			this.cmbFpas.addItem(fpas);
	//		}
	//	}

	public void fillEnderecoSubForm(List<Endereco> enderecos) {
		this.enderecoSubForm.fillWith(enderecos);

	}

	public void fillContatoSubForm(List<Contato> contatos) {
		this.contatoSubForm.fillWith(contatos);
	}

	public void preencheEmpresa(Empresa empresa) {

		/*
		 * empresa.setMatriz((Matriz) getCbmMatriz().getValue());
		 * empresa.setContador((Contador) getCmbContador().getValue());
		 * empresa.setSindicato((Sindicato) getCmbSindicato().getValue());
		 * empresa.setFpas((Fpas) getCmbFpas().getValue());
		 */
		empresa.setDataInicioAtividades(getDtInicioAtividades().getValue());
		empresa.setCnpj(getTxtCnpj().getValue());
		empresa.setInscricaoEstadual(getTxtInscricaoEstadual().getValue());
		empresa.setInscricaoEstadualSt(getTxtInscricaoEstadualSt().getValue());
		empresa.setInscricaoMunicipal(getTxtInscricaoMunicipal().getValue());
		empresa.setInscricaoJuntaComercial(getTxtInscricaoJuntaComercial()
				.getValue());

	}

	public void preencheEmpresaForm(Empresa empresa) {
		/* getCbmMatriz().setValue(empresa.getMatriz()); */
		/*
		 * getCmbContador().setValue(empresa.getContador());
		 * getCmbSindicato().setValue(empresa.getSindicato());
		 * getCmbFpas().setValue(empresa.getFpas());
		 */
		getDtInicioAtividades().setValue(empresa.getDataInicioAtividades());
		getTxtCnpj().setValue(empresa.getCnpj());
		getTxtInscricaoEstadual().setValue(empresa.getInscricaoEstadual());
		getTxtInscricaoEstadualSt().setValue(empresa.getInscricaoEstadualSt());
		getTxtInscricaoMunicipal().setValue(empresa.getInscricaoMunicipal());
		getTxtInscricaoJuntaComercial().setValue(
				empresa.getInscricaoJuntaComercial());

		this.fillEnderecoSubForm(empresa.getEnderecos());

		this.fillContatoSubForm(empresa.getContatos());

	}

	public ComboBox getCmbCnaePrincipal() {
		return cmbCnaePrincipal;
	}

	public void setCmbCnaePrincipal(ComboBox cmbCnaePrincipal) {
		this.cmbCnaePrincipal = cmbCnaePrincipal;
	}

	public void setTxtCodigoGps(TextField txtCodigoGps) {
		this.txtCodigoGps = txtCodigoGps;
	}

	public void carregarCRT() {
		this.cmbCrt.removeAllItems();
		this.cmbCrt.addItem(CRT.SIMPLES_NACIONAL);
		this.cmbCrt.addItem(CRT.SIMPLES_EXCESSO);
		this.cmbCrt.addItem(CRT.REGIME_NORMAL);
	}
	
	public void carregarTipoRegime() {
		this.cmbTipoRegime.removeAllItems();
		this.cmbTipoRegime.addItem(TIPO_REGIME.LUCRO_REAL);
		this.cmbTipoRegime.addItem(TIPO_REGIME.LUCRO_PRESUMIDO);
		this.cmbTipoRegime.addItem(TIPO_REGIME.SIMPLES_NACIONAL);
	}
	
	public void carregarTipo() {
		this.cmbTipo.removeAllItems();
		this.cmbTipo.addItem(TIPO.MATRIZ);
		this.cmbTipo.addItem(TIPO.FILIAL);
		this.cmbTipo.addItem(TIPO.DEPOSITO);
	}


	public enum CRT {

		SIMPLES_NACIONAL("Simples Nacional", "1"), SIMPLES_EXCESSO("Simples Nacional - excesso de sublimite de receita bruta", "2"),
		REGIME_NORMAL("Regime Normal. (v2.0)", "3");

		private CRT(String label, String codigo) {
			this.label = label;
			this.codigo = codigo;
		}

		private String label;
		private String codigo;

		public static CRT getCRT(String codigo) {
			if (codigo.equals("1")) {
				return SIMPLES_NACIONAL;
			} else if (codigo.equals("2")) {
				return SIMPLES_EXCESSO;
			}else if (codigo.equals("3")) {
				return REGIME_NORMAL;
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
	
	public enum TIPO {

		MATRIZ("Matriz", "1"), FILIAL("Filial", "2"),
		DEPOSITO("Depósito", "3");

		private TIPO(String label, String codigo) {
			this.label = label;
			this.codigo = codigo;
		}

		private String label;
		private String codigo;

		public static TIPO getTipo(String codigo) {
			if (codigo.equals("1")) {
				return MATRIZ;
			} else if (codigo.equals("2")) {
				return FILIAL;
			}else if (codigo.equals("3")) {
				return DEPOSITO;
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


	
	public enum TIPO_REGIME {

		LUCRO_REAL("Lucro Real", "1"), LUCRO_PRESUMIDO("Lucro Presumido", "2"),
		SIMPLES_NACIONAL("Simples Nacional", "3");

		private TIPO_REGIME(String label, String codigo) {
			this.label = label;
			this.codigo = codigo;
		}

		private String label;
		private String codigo;

		public static TIPO_REGIME getTipoRegime(String codigo) {
			if (codigo.equals("1")) {
				return LUCRO_REAL;
			} else if (codigo.equals("2")) {
				return LUCRO_PRESUMIDO;
			}else if (codigo.equals("3")) {
				return SIMPLES_NACIONAL;
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






}

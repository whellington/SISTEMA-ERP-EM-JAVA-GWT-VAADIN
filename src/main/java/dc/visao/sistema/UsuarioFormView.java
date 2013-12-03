package dc.visao.sistema;

import java.util.Date;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import dc.controller.sistema.UsuarioFormController;
import dc.entidade.framework.Papel;
import dc.entidade.geral.Usuario;
import dc.entidade.pessoal.Colaborador;
import dc.framework.CharBoolConverter;
import dc.visao.framework.component.manytoonecombo.ManyToOneCombo;
import dc.visao.framework.component.manytoonecombo.ManyToOneCombo.ItemValue;

public class UsuarioFormView extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	/**
	 * 
	 */
	private static final long serialVersionUID = 4979914690069507879L;

	@AutoGenerated
	private VerticalLayout mainLayout;
	@AutoGenerated
	private HorizontalLayout horizontalLayout_1;
	@AutoGenerated
	private PopupDateField dataCadastroDateField;
	@AutoGenerated
	private PasswordField senhaPasswordField;
	@AutoGenerated
	private TextField loginTxtField;
	@AutoGenerated
	private HorizontalLayout horizontalLayout_2;
	@AutoGenerated
	private CheckBox checkBoxAdm;
	@AutoGenerated
	private ManyToOneCombo<Papel> comboPapeis;
	@AutoGenerated
	private ManyToOneCombo<Colaborador> comboColaborador;
	private BeanFieldGroup<Usuario> binder;

	/**
	 * The constructor should first build the main layout, set the composition
	 * root and then do any custom initialization.
	 * 
	 * The constructor will not be automatically regenerated by the visual
	 * editor.
	 */

	public UsuarioFormView(final UsuarioFormController controller) {
		buildMainLayout();
		setCompositionRoot(mainLayout);

		binder = new BeanFieldGroup<Usuario>(Usuario.class);
		binder.setItemDataSource(controller.getCurrentBean());
		binder.setFieldFactory(new CustomFieldFactory());

		this.comboColaborador.addValueChangeListener(new ValueChangeListener() {

			@Override
			public void valueChange(ValueChangeEvent event) {

				try {

					if (event.getProperty() != null && event.getProperty().getValue() != null) {
						Colaborador colaborador = comboColaborador.getItemValueBean((ItemValue) event.getProperty().getValue());
						controller.alteraFormBaseadoEmColaborador(colaborador);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});

		this.loginTxtField.setNullRepresentation("");
		this.senhaPasswordField.setNullRepresentation("");
		this.checkBoxAdm.setConverter(new CharBoolConverter());

		// binder.bind(dataCadastroDateField, "dataCadastro");

		binder.bind(loginTxtField, "login");
		binder.bind(senhaPasswordField, "senha");

		binder.bind(checkBoxAdm, "administrador");

		this.dataCadastroDateField.setEnabled(false);

	}

	public BeanFieldGroup<Usuario> getBinder() {
		return this.binder;
	}

	public TextField getLoginTxtField() {
		return this.loginTxtField;
	}

	public PasswordField getSenhaPasswordField() {
		return this.senhaPasswordField;
	}

	@AutoGenerated
	private VerticalLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new VerticalLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("100%");
		mainLayout.setHeight("100%");
		mainLayout.setMargin(true);
		mainLayout.setSpacing(true);

		// top-level component properties
		setWidth("100.0%");
		setHeight("100.0%");

		// comboColaborador
		comboColaborador = new ManyToOneCombo<>();
		comboColaborador.setCaption("Colaborador");
		comboColaborador.setImmediate(false);
		comboColaborador.setWidth("100.0%");
		comboColaborador.setHeight("-1px");
		mainLayout.addComponent(comboColaborador);

		// horizontalLayout_2
		horizontalLayout_2 = buildHorizontalLayout_2();
		mainLayout.addComponent(horizontalLayout_2);

		// horizontalLayout_1
		horizontalLayout_1 = buildHorizontalLayout_1();
		mainLayout.addComponent(horizontalLayout_1);

		return mainLayout;
	}

	@AutoGenerated
	private HorizontalLayout buildHorizontalLayout_2() {
		// common part: create layout
		horizontalLayout_2 = new HorizontalLayout();
		horizontalLayout_2.setImmediate(false);
		horizontalLayout_2.setWidth("100.0%");
		horizontalLayout_2.setHeight("-1px");
		horizontalLayout_2.setMargin(false);
		horizontalLayout_2.setSpacing(true);

		// comboPapeis
		comboPapeis = new ManyToOneCombo<>();
		comboPapeis.setCaption("Papel");
		comboPapeis.setImmediate(false);
		comboPapeis.setWidth("100.0%");
		comboPapeis.setHeight("-1px");
		horizontalLayout_2.addComponent(comboPapeis);
		horizontalLayout_2.setExpandRatio(comboPapeis, 7.0f);

		// checkBoxAdm
		checkBoxAdm = new CheckBox();
		checkBoxAdm.setCaption("Administrador");
		checkBoxAdm.setImmediate(false);
		checkBoxAdm.setWidth("100.0%");
		checkBoxAdm.setHeight("-1px");
		horizontalLayout_2.addComponent(checkBoxAdm);
		horizontalLayout_2.setExpandRatio(checkBoxAdm, 3.0f);
		horizontalLayout_2.setComponentAlignment(checkBoxAdm, new Alignment(10));

		return horizontalLayout_2;
	}

	@AutoGenerated
	private HorizontalLayout buildHorizontalLayout_1() {
		// common part: create layout
		horizontalLayout_1 = new HorizontalLayout();
		horizontalLayout_1.setImmediate(false);
		horizontalLayout_1.setWidth("100.0%");
		horizontalLayout_1.setHeight("-1px");
		horizontalLayout_1.setMargin(false);
		horizontalLayout_1.setSpacing(true);

		// loginTxtField
		loginTxtField = new TextField();
		loginTxtField.setCaption("Login");
		loginTxtField.setImmediate(false);
		loginTxtField.setWidth("100.0%");
		loginTxtField.setHeight("-1px");
		horizontalLayout_1.addComponent(loginTxtField);
		horizontalLayout_1.setExpandRatio(loginTxtField, 1.0f);

		// senhaPasswordField
		senhaPasswordField = new PasswordField();
		senhaPasswordField.setCaption("Senha");
		senhaPasswordField.setImmediate(false);
		senhaPasswordField.setWidth("100.0%");
		senhaPasswordField.setHeight("-1px");
		horizontalLayout_1.addComponent(senhaPasswordField);
		horizontalLayout_1.setExpandRatio(senhaPasswordField, 1.0f);

		// dataCadastroDateField
		dataCadastroDateField = new PopupDateField();
		dataCadastroDateField.setCaption("Data de cadastro");
		dataCadastroDateField.setImmediate(false);
		dataCadastroDateField.setWidth("100.0%");
		dataCadastroDateField.setHeight("-1px");
		horizontalLayout_1.addComponent(dataCadastroDateField);
		horizontalLayout_1.setExpandRatio(dataCadastroDateField, 1.0f);

		return horizontalLayout_1;
	}

	public void carregaDataCadastro(Date dataCadastro) {
		this.dataCadastroDateField.setValue(dataCadastro);
	}

	public ManyToOneCombo<Papel> getComboPapeis() {
		return comboPapeis;
	}

	public void setComboPapeis(ManyToOneCombo<Papel> comboPapeis) {
		this.comboPapeis = comboPapeis;
	}

	public void setComboColaborador(ManyToOneCombo<Colaborador> comboColaborador) {
		this.comboColaborador = comboColaborador;
	}

	public ManyToOneCombo<Colaborador> getComboColaborador() {
		return comboColaborador;
	}

}

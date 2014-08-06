package dc.visao.nfe;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import dc.control.validator.ObjectValidator;
import dc.controller.nfe.ProdutoServicoFormController;

/**
 * 
 * @author Gutemberg A. Da Silva
 * 
 */

public class NfeDetalheImpostoIiFormView extends CustomComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ProdutoServicoFormController controller;

	/**
	 * NFEDESTINATARIO
	 */

	@AutoGenerated
	private String titulo = "II";

	@AutoGenerated
	private VerticalLayout vlNdiIi;

	@AutoGenerated
	private Panel plNdiIi;

	@AutoGenerated
	private GridLayout glNdiIi;

	@AutoGenerated
	private TextField tfBaseCalculoBcImpostoImportacao;

	@AutoGenerated
	private TextField tfDespesasAduaneirasImpostoImportacao;

	@AutoGenerated
	private TextField tfValorImpostoImportacao;

	@AutoGenerated
	private TextField tfIofImpostoImportacao;

	public String getTitulo() {
		return titulo;
	}

	public TextField getTfBaseCalculoBcImpostoImportacao() {
		return tfBaseCalculoBcImpostoImportacao;
	}

	public void setTfBaseCalculoBcImpostoImportacao(
			TextField tfBaseCalculoBcImpostoImportacao) {
		this.tfBaseCalculoBcImpostoImportacao = tfBaseCalculoBcImpostoImportacao;
	}

	public TextField getTfDespesasAduaneirasImpostoImportacao() {
		return tfDespesasAduaneirasImpostoImportacao;
	}

	public void setTfDespesasAduaneirasImpostoImportacao(
			TextField tfDespesasAduaneirasImpostoImportacao) {
		this.tfDespesasAduaneirasImpostoImportacao = tfDespesasAduaneirasImpostoImportacao;
	}

	public TextField getTfValorImpostoImportacao() {
		return tfValorImpostoImportacao;
	}

	public void setTfValorImpostoImportacao(TextField tfValorImpostoImportacao) {
		this.tfValorImpostoImportacao = tfValorImpostoImportacao;
	}

	public TextField getTfIofImpostoImportacao() {
		return tfIofImpostoImportacao;
	}

	public void setTfIofImpostoImportacao(TextField tfIofImpostoImportacao) {
		this.tfIofImpostoImportacao = tfIofImpostoImportacao;
	}

	/**
	 * CONSTRUTOR
	 * 
	 * @param controller
	 */

	public NfeDetalheImpostoIiFormView(ProdutoServicoFormController controller) {
		this.controller = controller;
	}

	/**
	 * GET / SET
	 */

	@AutoGenerated
	public VerticalLayout bvlNdiIi() {
		// common part: create layout
		vlNdiIi = new VerticalLayout();
		vlNdiIi.setImmediate(false);
		vlNdiIi.setWidth("100.0%");
		vlNdiIi.setHeight("100.0%");
		vlNdiIi.setMargin(true);
		vlNdiIi.setSpacing(true);

		// panel_2
		vlNdiIi.addComponent(bplNdiIi());

		return vlNdiIi;
	}

	@AutoGenerated
	private Panel bplNdiIi() {
		// common part: create layout
		plNdiIi = new Panel();
		plNdiIi.setImmediate(false);
		plNdiIi.setSizeFull();

		plNdiIi.setContent(bglIi());

		return plNdiIi;
	}

	@AutoGenerated
	private GridLayout bglIi() {
		// common part: create layout
		glNdiIi = new GridLayout();
		glNdiIi.setImmediate(false);
		// glImpostoImportacao.setWidth("100.0%");
		// glImpostoImportacao.setHeight("100.0%");
		glNdiIi.setSizeUndefined();
		glNdiIi.setMargin(true);
		glNdiIi.setSpacing(true);
		glNdiIi.setRows(4);
		glNdiIi.setColumns(4);
		glNdiIi.setEnabled(false);

		// tfBaseCalculoBcImpostoImportacao
		tfBaseCalculoBcImpostoImportacao = new TextField(
				"Base de cálculo (BC):");
		tfBaseCalculoBcImpostoImportacao.setWidth("-1px");
		tfBaseCalculoBcImpostoImportacao.setHeight("-1px");
		tfBaseCalculoBcImpostoImportacao.setSizeFull();
		tfBaseCalculoBcImpostoImportacao.setNullRepresentation("");
		tfBaseCalculoBcImpostoImportacao.setImmediate(true);
		tfBaseCalculoBcImpostoImportacao
				.setId("tfBaseCalculoBcImpostoImportacao");
		tfBaseCalculoBcImpostoImportacao
				.addValueChangeListener(new ValueChangeListener() {
					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					@Override
					public void valueChange(ValueChangeEvent event) {
						// TODO Auto-generated method stub
						if (ObjectValidator.validateEventValue(event)) {
							if (ObjectValidator.validateValue(event)) {
								controller.ndiIiSetarValor(
										tfBaseCalculoBcImpostoImportacao
												.getId(), event.getProperty()
												.getValue());
							}
						}
					}
				});
		glNdiIi.addComponent(tfBaseCalculoBcImpostoImportacao, 0, 0);

		// tfDespesasAduaneirasImpostoImportacao
		tfDespesasAduaneirasImpostoImportacao = new TextField(
				"Despesas aduaneiras:");
		tfDespesasAduaneirasImpostoImportacao.setWidth("-1px");
		tfDespesasAduaneirasImpostoImportacao.setHeight("-1px");
		tfDespesasAduaneirasImpostoImportacao.setSizeFull();
		tfDespesasAduaneirasImpostoImportacao.setNullRepresentation("");
		tfDespesasAduaneirasImpostoImportacao.setImmediate(true);
		tfDespesasAduaneirasImpostoImportacao
				.setId("tfDespesasAduaneirasImpostoImportacao");
		tfDespesasAduaneirasImpostoImportacao
				.addValueChangeListener(new ValueChangeListener() {
					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					@Override
					public void valueChange(ValueChangeEvent event) {
						// TODO Auto-generated method stub
						if (ObjectValidator.validateEventValue(event)) {
							if (ObjectValidator.validateValue(event)) {
								controller.ndiIiSetarValor(
										tfDespesasAduaneirasImpostoImportacao
												.getId(), event.getProperty()
												.getValue());
							}
						}
					}
				});
		glNdiIi.addComponent(tfDespesasAduaneirasImpostoImportacao, 1, 0);

		// tfValorImpostoImportacao
		tfValorImpostoImportacao = new TextField("Valor:");
		tfValorImpostoImportacao.setWidth("-1px");
		tfValorImpostoImportacao.setHeight("-1px");
		tfValorImpostoImportacao.setSizeFull();
		tfValorImpostoImportacao.setNullRepresentation("");
		tfValorImpostoImportacao.setImmediate(true);
		tfValorImpostoImportacao.setId("tfValorImpostoImportacao");
		tfValorImpostoImportacao
				.addValueChangeListener(new ValueChangeListener() {
					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					@Override
					public void valueChange(ValueChangeEvent event) {
						// TODO Auto-generated method stub
						if (ObjectValidator.validateEventValue(event)) {
							if (ObjectValidator.validateValue(event)) {
								controller.ndiIiSetarValor(
										tfValorImpostoImportacao.getId(), event
												.getProperty().getValue());
							}
						}
					}
				});
		glNdiIi.addComponent(tfValorImpostoImportacao, 2, 0);

		// tfIofImpostoImportacao
		tfIofImpostoImportacao = new TextField("IOF:");
		tfIofImpostoImportacao.setWidth("-1px");
		tfIofImpostoImportacao.setHeight("-1px");
		tfIofImpostoImportacao.setSizeFull();
		tfIofImpostoImportacao.setNullRepresentation("tfIofImpostoImportacao");
		tfIofImpostoImportacao.setImmediate(true);
		tfIofImpostoImportacao.setId("tfIofImpostoImportacao");
		tfIofImpostoImportacao
				.addValueChangeListener(new ValueChangeListener() {
					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					@Override
					public void valueChange(ValueChangeEvent event) {
						// TODO Auto-generated method stub
						if (ObjectValidator.validateEventValue(event)) {
							if (ObjectValidator.validateValue(event)) {
								controller.ndiIiSetarValor(
										tfIofImpostoImportacao.getId(), event
												.getProperty().getValue());
							}
						}
					}
				});
		glNdiIi.addComponent(tfIofImpostoImportacao, 3, 0);

		return glNdiIi;
	}

}
package dc.visao.tributario;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import dc.controller.tributario.GrupoTributarioFormController;
import dc.entidade.tributario.GrupoTributario;
import dc.visao.framework.util.ComponentUtil;

@SuppressWarnings("serial")
public class GrupoTributarioFormView extends CustomComponent {

	@AutoGenerated
	private VerticalLayout mainLayout;

	@AutoGenerated
	private GridLayout fields;

	GrupoTributarioFormController controller;

	GrupoTributario currentBean;

	TextField descricao;

	@AutoGenerated
	ComboBox cmbOrigemMercadoria;

	TextArea observacao;

	public GrupoTributarioFormView(GrupoTributarioFormController controller) {
		this.controller = controller;
		buildMainLayout();
		setCompositionRoot(mainLayout);
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

		// calDataRequisicao


		descricao = ComponentUtil.buildTextField("Descrição");
		descricao.setRequired(true);
		fields.addComponent(descricao, 0, 0,3,0);

		cmbOrigemMercadoria = new ComboBox("Origem Mercadoria");
		cmbOrigemMercadoria.setRequired(true);
		carregarOrigemMercadoria();
		fields.addComponent(cmbOrigemMercadoria,4,0);

		observacao = new TextArea("Observações");
		observacao.setWidth("800");
		fields.addComponent(observacao, 0, 1,4,1);
		return fields;
	}

	@AutoGenerated
	private VerticalLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new VerticalLayout();
		mainLayout.setImmediate(false);
		mainLayout.setSizeFull();
		mainLayout.setMargin(false);
		mainLayout.setSpacing(true);

		// top-level component properties
		setWidth("100.0%");
		setHeight("70.0%");

		// fields
		fields = buildFields();
		mainLayout.addComponent(fields);



		return mainLayout;
	}

	public VerticalLayout getMainLayout() {
		return mainLayout;
	}

	public TextField getDescricao() {
		return descricao;
	}

	public void setDescricao(TextField descricao) {
		this.descricao = descricao;
	}

	public TextArea getObservacao() {
		return observacao;
	}

	public void setObservacao(TextArea observacao) {
		this.observacao = observacao;
	}

	public enum ORIGEM_MERCADORIA {

		NACIONAL("Nacional", "0"), ESTRANGEIRA("Estrangeira", "1");

		private ORIGEM_MERCADORIA(String label, String codigo) {
			this.label = label;
			this.codigo = codigo;
		}

		private String label;
		private String codigo;

		public static ORIGEM_MERCADORIA getOrigemMercadoria(String codigo) {
			if (codigo.equals("0")) {
				return NACIONAL;
			}
			if (codigo.equals("1")) {
				return ESTRANGEIRA;
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


	public void carregarOrigemMercadoria() {
		this.cmbOrigemMercadoria.removeAllItems();
		this.cmbOrigemMercadoria.addItem(ORIGEM_MERCADORIA.NACIONAL);
		this.cmbOrigemMercadoria.addItem(ORIGEM_MERCADORIA.ESTRANGEIRA);

	}

	public ComboBox getCmbOrigemMercadoria() {
		return cmbOrigemMercadoria;
	}

	public void setCmbOrigemMercadoria(ComboBox cmbOrigemMercadoria) {
		this.cmbOrigemMercadoria = cmbOrigemMercadoria;
	}


	public void preencherForm(GrupoTributario bean){
		carregarOrigemMercadoria();
		getDescricao().setValue(bean.getDescricao());
		getCmbOrigemMercadoria().setValue(ORIGEM_MERCADORIA.getOrigemMercadoria(bean.getOrigemMercadoria()));
		getObservacao().setValue(bean.getObservacao());
	}




}

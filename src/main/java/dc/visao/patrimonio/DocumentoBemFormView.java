package dc.visao.patrimonio;

import java.util.List;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import dc.controller.patrimonio.DocumentoBemFormController;
import dc.entidade.patrimonio.BemEntity;

/**
 * 
 * @author Gutemberg A. Da Silva
 * 
 */

public class DocumentoBemFormView extends CustomComponent {

	@AutoGenerated
	private VerticalLayout mainLayout;

	@AutoGenerated
	private Panel panel_1;

	@AutoGenerated
	private VerticalLayout verticalLayout_2;

	@AutoGenerated
	private GridLayout gridLayout_1;

	@AutoGenerated
	private TextField tfImagem;

	@AutoGenerated
	private TextField tfNome;

	@AutoGenerated
	private TextField tfDescricao;

	@AutoGenerated
	private ComboBox cbBem;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	private DocumentoBemFormController controller;

	public DocumentoBemFormView(final DocumentoBemFormController controller) {
		this.controller = controller;

		buildMainLayout();
		setCompositionRoot(this.mainLayout);
	}

	public TextField getTfImagem() {
		return tfImagem;
	}

	public void setTfImagem(TextField tfImagem) {
		this.tfImagem = tfImagem;
	}

	public TextField getTfNome() {
		return tfNome;
	}

	public void setTfNome(TextField tfNome) {
		this.tfNome = tfNome;
	}

	public TextField getTfDescricao() {
		return tfDescricao;
	}

	public void setTfDescricao(TextField tfDescricao) {
		this.tfDescricao = tfDescricao;
	}

	public ComboBox getCbBem() {
		return cbBem;
	}

	public void setCbBem(ComboBox cbBem) {
		this.cbBem = cbBem;
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

		// panel_1
		panel_1 = buildPanel_1();
		mainLayout.addComponent(panel_1);

		return mainLayout;
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
		gridLayout_1 = buildGridLayout_1();
		verticalLayout_2.addComponent(gridLayout_1);

		return verticalLayout_2;
	}

	@AutoGenerated
	private GridLayout buildGridLayout_1() {
		// common part: create layout
		gridLayout_1 = new GridLayout();
		gridLayout_1.setImmediate(false);
		gridLayout_1.setWidth("100.0%");
		gridLayout_1.setHeight("100.0%");
		gridLayout_1.setMargin(false);
		gridLayout_1.setRows(20);
		gridLayout_1.setColumns(3);

		// cbBem
		cbBem = new ComboBox();
		cbBem.setCaption("Bem:");
		cbBem.setImmediate(false);
		cbBem.setWidth("160px");
		cbBem.setHeight("-1px");
		cbBem.setRequired(true);
		gridLayout_1.addComponent(cbBem, 0, 1);

		// tfDescricaoMovimentacaoBemFormViewjava
		tfDescricao = new TextField();
		tfDescricao.setCaption("Descrição:");
		tfDescricao.setNullRepresentation("");
		tfDescricao.setImmediate(false);
		tfDescricao.setWidth("160px");
		tfDescricao.setHeight("-1px");
		gridLayout_1.addComponent(tfDescricao, 1, 1);

		// tfNome
		tfNome = new TextField();
		tfNome.setCaption("Nome:");
		tfNome.setNullRepresentation("");
		tfNome.setImmediate(false);
		tfNome.setWidth("160px");
		tfNome.setHeight("-1px");
		gridLayout_1.addComponent(tfNome, 0, 2);

		// tfImagem
		tfImagem = new TextField();
		tfImagem.setCaption("Imagem:");
		tfImagem.setNullRepresentation("");
		tfImagem.setImmediate(false);
		tfImagem.setWidth("160px");
		tfImagem.setHeight("-1px");
		gridLayout_1.addComponent(tfImagem, 1, 2);

		return gridLayout_1;
	}

	/**
	 * COMBOS
	 */

	public void carregarCmbBem(List<BemEntity> lista) {
		BeanItemContainer<BemEntity> bic = new BeanItemContainer<BemEntity>(
				BemEntity.class, lista);
		this.cbBem.setContainerDataSource(bic);
		this.cbBem.setItemCaptionPropertyId("nome");
	}

}
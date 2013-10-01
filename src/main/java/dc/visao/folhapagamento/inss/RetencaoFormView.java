package dc.visao.folhapagamento.inss;

import java.util.List;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import dc.controller.folhapagamento.inss.RetencaoFormController;
import dc.entidade.folhapagamento.inss.InssEntity;
import dc.entidade.folhapagamento.inss.ServicoEntity;

public class RetencaoFormView extends CustomComponent {

	@AutoGenerated
	private VerticalLayout mainLayout;

	@AutoGenerated
	private Panel panel_1;

	@AutoGenerated
	private VerticalLayout verticalLayout_2;

	@AutoGenerated
	private GridLayout gridLayout_1;

	@AutoGenerated
	private TextField tfValor13;

	@AutoGenerated
	private TextField tfValorMensal;

	@AutoGenerated
	private ComboBox cbInss;

	@AutoGenerated
	private ComboBox cbServico;

	/*
	 * @AutoGenerated private ManyToOneCombo<InssEntity> cbInss;
	 * 
	 * @AutoGenerated private ManyToOneCombo<ServicoEntity> cbServico;
	 */

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	private RetencaoFormController controller;

	public RetencaoFormView(final RetencaoFormController controller) {
		this.controller = controller;

		buildMainLayout();
		setCompositionRoot(this.mainLayout);
	}

	public TextField getTfValorMensal() {
		return tfValorMensal;
	}

	public void setTfValorMensal(TextField tfValorMensal) {
		this.tfValorMensal = tfValorMensal;
	}

	public TextField getTfValor13() {
		return tfValor13;
	}

	public void setTfValor13(TextField tfValor13) {
		this.tfValor13 = tfValor13;
	}

	public ComboBox getCbInss() {
		return cbInss;
	}

	public void setCbInss(ComboBox cbInss) {
		this.cbInss = cbInss;
	}

	public ComboBox getCbServico() {
		return cbServico;
	}

	public void setCbServico(ComboBox cbServico) {
		this.cbServico = cbServico;
	}

	@AutoGenerated
	private VerticalLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new VerticalLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("100%");
		mainLayout.setHeight("100%");
		mainLayout.setMargin(false);

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
		// gridLayout_1.setHeight("100.0%");
		gridLayout_1.setMargin(false);
		gridLayout_1.setRows(20);
		gridLayout_1.setColumns(3);

		// tfValorMensal
		tfValorMensal = new TextField();
		tfValorMensal.setCaption("Valor mensal:");
		tfValorMensal.setNullRepresentation("");
		tfValorMensal.setImmediate(false);
		tfValorMensal.setWidth("175px");
		tfValorMensal.setHeight("-1px");
		gridLayout_1.addComponent(tfValorMensal, 0, 1);

		// tfValor13
		tfValor13 = new TextField();
		tfValor13.setCaption("Valor do 13:");
		tfValor13.setNullRepresentation("");
		tfValor13.setImmediate(false);
		tfValor13.setWidth("175px");
		tfValor13.setHeight("-1px");
		gridLayout_1.addComponent(tfValor13, 1, 1);

		// cbInss
		cbInss = new ComboBox();
		cbInss.setCaption("INSS");
		cbInss.setImmediate(false);
		cbInss.setWidth("-1px");
		cbInss.setHeight("-1px");
		gridLayout_1.addComponent(cbInss, 0, 2);

		// cbServico
		cbServico = new ComboBox();
		cbServico.setCaption("Serviço");
		cbServico.setImmediate(false);
		cbServico.setWidth("-1px");
		cbServico.setHeight("-1px");
		gridLayout_1.addComponent(cbServico, 1, 2);

		return gridLayout_1;
	}

	/**
	 * COMBOS
	 */

	public void carregarCmbInss(List<InssEntity> lista) {
		BeanItemContainer<InssEntity> bic = new BeanItemContainer<InssEntity>(
				InssEntity.class, lista);
		this.cbInss.setContainerDataSource(bic);
		this.cbInss.setItemCaptionPropertyId("competencia");
	}

	public void carregarCmbServico(List<ServicoEntity> lista) {
		BeanItemContainer<ServicoEntity> bic = new BeanItemContainer<ServicoEntity>(
				ServicoEntity.class, lista);
		this.cbServico.setContainerDataSource(bic);
		this.cbServico.setItemCaptionPropertyId("nome");
	}

}
package dc.visao.ponto;

import java.util.List;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextField;

import dc.entidade.pessoal.ColaboradorEntity;
import dc.entidade.ponto.PontoBancoHoras;
import dc.visao.framework.util.ComponentUtil;

public class PontoBancoHorasFormView extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@AutoGenerated
	private VerticalLayout mainLayout;
	@AutoGenerated
	private GridLayout gridLayout_1;
	@AutoGenerated
	private ComboBox cmbSituacao;
	@AutoGenerated
	private TextField txQuantidade;
	@AutoGenerated
	private PopupDateField dtDataTrabalho;
	@AutoGenerated
	private ComboBox cmbColaborador;

	public PontoBancoHorasFormView() {
		buildMainLayout();
		setCompositionRoot(mainLayout);
	}

	public void preencheForm(PontoBancoHoras currentBean) {
		cmbColaborador.setValue(currentBean.getColaborador());
		txQuantidade.setValue(currentBean.getQuantidade());
		cmbSituacao.setValue(SituacaoBancoHoras.getSituacao(currentBean.getSituacao()));
		dtDataTrabalho.setValue(currentBean.getDataTrabalho());
	}

	public void preencheBean(PontoBancoHoras currentBean) {
		currentBean.setColaborador((ColaboradorEntity) cmbColaborador.getValue());
		currentBean.setQuantidade(txQuantidade.getValue());
		currentBean.setSituacao(((SituacaoBancoHoras) cmbSituacao.getValue()).getCodigo());
		currentBean.setDataTrabalho(dtDataTrabalho.getValue());
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
		setHeight("100.0%");

		// gridLayout_1
		gridLayout_1 = buildGridLayout_1();
		mainLayout.addComponent(gridLayout_1);
		mainLayout.setExpandRatio(gridLayout_1, 1);

		return mainLayout;
	}

	@AutoGenerated
	private GridLayout buildGridLayout_1() {
		// common part: create layout
		gridLayout_1 = new GridLayout();
		gridLayout_1.setImmediate(false);
		gridLayout_1.setSpacing(true);
		gridLayout_1.setWidth("100%");
		gridLayout_1.setColumns(3);
		gridLayout_1.setRows(3);

		// cmbColaborador
		cmbColaborador = ComponentUtil.buildComboBox("Colaborador");
		gridLayout_1.addComponent(cmbColaborador, 0, 0);

		// txQuantidade
		txQuantidade = ComponentUtil.buildTextField("Quantidade");
		gridLayout_1.addComponent(txQuantidade, 0, 1);
		
		// dtDataTrabalho
		dtDataTrabalho = ComponentUtil.buildPopupDateField("Data Trabalho");
		gridLayout_1.addComponent(dtDataTrabalho, 1, 1);

		// cmbSituacao
		cmbSituacao = ComponentUtil.buildComboBox("Situação");
		gridLayout_1.addComponent(cmbSituacao, 0, 2);

		return gridLayout_1;
	}

	public void carregarColaboradores(List<ColaboradorEntity> colaboradores) {
		this.cmbColaborador.removeAllItems();
		for (ColaboradorEntity colaborador : colaboradores) {
			this.cmbColaborador.addItem(colaborador);
		}
	}

	public void carregarSituacao() {
		this.cmbSituacao.removeAllItems();
		for (SituacaoBancoHoras e : SituacaoBancoHoras.values()) {
			this.cmbSituacao.addItem(e);
		}
	}

	public enum SituacaoBancoHoras {
		UTILIZADO_PARCIALMENTE("Utilizado Parcialmente", "P"), UTILIZADO("Utilizado", "U"), NAO_UTILIZADO("não Utilizado", "N");

		private SituacaoBancoHoras(String label, String codigo) {
			this.label = label;
			this.codigo = codigo;
		}

		private String label;
		private String codigo;

		public static SituacaoBancoHoras getSituacao(String codigo) {
			for (SituacaoBancoHoras e : SituacaoBancoHoras.values()) {
				if (e.getCodigo().equalsIgnoreCase(codigo)) {
					return e;
				}
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

	public ComboBox getCmbSituacao() {
		return cmbSituacao;
	}

	public void setCmbSituacao(ComboBox cmbSituacao) {
		this.cmbSituacao = cmbSituacao;
	}

	public TextField getTxQuantidade() {
		return txQuantidade;
	}

	public void setTxQuantidade(TextField txQuantidade) {
		this.txQuantidade = txQuantidade;
	}

	public PopupDateField getDtDataTrabalho() {
		return dtDataTrabalho;
	}

	public void setDtDataTrabalho(PopupDateField dtDataTrabalho) {
		this.dtDataTrabalho = dtDataTrabalho;
	}

	public ComboBox getCmbColaborador() {
		return cmbColaborador;
	}

	public void setCmbColaborador(ComboBox cmbColaborador) {
		this.cmbColaborador = cmbColaborador;
	}
}
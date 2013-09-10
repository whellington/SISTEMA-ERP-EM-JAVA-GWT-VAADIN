package dc.visao.contratos;

import java.util.List;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.VerticalLayout;

import dc.entidade.contratos.ContratoSolicitacaoServico;
import dc.entidade.contratos.ContratoTipoServico;
import dc.entidade.diversos.Setor;
import dc.entidade.geral.Fornecedor;
import dc.entidade.pessoal.Cliente;
import dc.entidade.pessoal.Colaborador;
import dc.visao.framework.util.ComponentUtil;

public class ContratoSolicitacaoServicoFormView extends CustomComponent {

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
	private ComboBox cmbFornecedor;
	@AutoGenerated
	private TextArea txaDescricao;
	@AutoGenerated
	private ComboBox cmbStatusSituacao;
	@AutoGenerated
	private ComboBox cmbUrgente;
	@AutoGenerated
	private PopupDateField dtDesejadaInicio;
	@AutoGenerated
	private PopupDateField dtSolicitacao;
	@AutoGenerated
	private ComboBox cmbTipoServico;
	@AutoGenerated
	private ComboBox cmbColaborador;
	@AutoGenerated
	private ComboBox cmbSetor;
	@AutoGenerated
	private ComboBox cmbCliente;

	/**
	 * The constructor should first build the main layout, set the composition
	 * root and then do any custom initialization.
	 * 
	 * The constructor will not be automatically regenerated by the visual
	 * editor.
	 */
	public ContratoSolicitacaoServicoFormView() {
		buildMainLayout();
		setCompositionRoot(mainLayout);

		// TODO add user code here
	}

	public ComboBox getCmbStatusSituacao() {
		return cmbStatusSituacao;
	}

	public void setCmbStatusSituacao(ComboBox cmbStatusSituacao) {
		this.cmbStatusSituacao = cmbStatusSituacao;
	}

	public ComboBox getCmbUrgente() {
		return cmbUrgente;
	}

	public void setCmbUrgente(ComboBox cmbUrgente) {
		this.cmbUrgente = cmbUrgente;
	}

	public PopupDateField getDtDesejadaInicio() {
		return dtDesejadaInicio;
	}

	public void setDtDesejadaInicio(PopupDateField dtDesejadaInicio) {
		this.dtDesejadaInicio = dtDesejadaInicio;
	}

	public PopupDateField getDtSolicitacao() {
		return dtSolicitacao;
	}

	public void setDtSolicitacao(PopupDateField dtSolicitacao) {
		this.dtSolicitacao = dtSolicitacao;
	}

	public ComboBox getCmbTipoServico() {
		return cmbTipoServico;
	}

	public void setCmbTipoServico(ComboBox cmbTipoServico) {
		this.cmbTipoServico = cmbTipoServico;
	}

	public ComboBox getCmbColaborador() {
		return cmbColaborador;
	}

	public void setCmbColaborador(ComboBox cmbColaborador) {
		this.cmbColaborador = cmbColaborador;
	}

	public ComboBox getCmbSetor() {
		return cmbSetor;
	}

	public void setCmbSetor(ComboBox cmbSetor) {
		this.cmbSetor = cmbSetor;
	}

	public ComboBox getCmbCliente() {
		return cmbCliente;
	}

	public void setCmbCliente(ComboBox cmbCliente) {
		this.cmbCliente = cmbCliente;
	}

	public ComboBox getCmbFornecedor() {
		return cmbFornecedor;
	}

	public void setCmbFornecedor(ComboBox cmbFornecedor) {
		this.cmbFornecedor = cmbFornecedor;
	}

	public void carregarView(ContratoSolicitacaoServico currentBean) {
		cmbFornecedor.setValue(currentBean.getFornecedor());
		cmbCliente.setValue(currentBean.getCliente());
		cmbSetor.setValue(currentBean.getSetor());
		cmbColaborador.setValue(currentBean.getColaborador());
		dtSolicitacao.setValue(currentBean.getDataSolicitacao());
		dtDesejadaInicio.setValue(currentBean.getDataDesejadaInicio());
		cmbUrgente.setValue(Urgente.getUrgente(currentBean.getUrgente()));
		cmbStatusSituacao.setValue(StatusSolicitacaoServico.getSituacao(currentBean.getStatusSolicitacao()));
		cmbTipoServico.setValue(currentBean.getContratoTipoServico());
		txaDescricao.setValue(currentBean.getDescricao());
	}

	public void preencherObjeto(final ContratoSolicitacaoServico currentBean) {
		currentBean.setFornecedor((Fornecedor) cmbFornecedor.getValue());
		currentBean.setCliente((Cliente) cmbCliente.getValue());
		currentBean.setSetor((Setor) cmbSetor.getValue());
		currentBean.setColaborador((Colaborador) cmbColaborador.getValue());
		currentBean.setContratoTipoServico((ContratoTipoServico) cmbTipoServico.getValue());
		currentBean.setDataSolicitacao(dtSolicitacao.getValue());
		currentBean.setDataDesejadaInicio(dtDesejadaInicio.getValue());
		currentBean.setUrgente(((Urgente) cmbUrgente.getValue()).getCodigo());
		currentBean.setStatusSolicitacao(((StatusSolicitacaoServico) cmbStatusSituacao.getValue()).getCodigo());
		currentBean.setDescricao(txaDescricao.getValue());
	}

	public void carregarFornecedores(List<Fornecedor> fornecedores) {
		this.cmbFornecedor.removeAllItems();
		for (Fornecedor fornecedor : fornecedores) {
			this.cmbFornecedor.addItem(fornecedor);
		}
	}

	public void carregarClientes(List<Cliente> clientes) {
		this.cmbCliente.removeAllItems();
		for (Cliente cliente : clientes) {
			this.cmbCliente.addItem(cliente);
		}
	}

	public void carregarSetores(List<Setor> setores) {
		this.cmbSetor.removeAllItems();
		for (Setor setor : setores) {
			this.cmbSetor.addItem(setor);
		}
	}

	public void carregarColaboradores(List<Colaborador> colaboradores) {
		this.cmbColaborador.removeAllItems();
		for (Colaborador colaborador : colaboradores) {
			this.cmbColaborador.addItem(colaborador);
		}
	}

	public void carregarTipoServicos(List<ContratoTipoServico> tipos) {
		this.cmbTipoServico.removeAllItems();
		for (ContratoTipoServico tipo : tipos) {
			this.cmbTipoServico.addItem(tipo);
		}
	}

	public void carregarUrgente() {
		this.cmbUrgente.removeAllItems();
		this.cmbUrgente.addItem(Urgente.SIM);
		this.cmbUrgente.addItem(Urgente.NAO);
	}

	public void carregarStatusSituacao() {
		this.cmbStatusSituacao.removeAllItems();
		this.cmbStatusSituacao.addItem(StatusSolicitacaoServico.AGUARDANDO);
	}

	public enum StatusSolicitacaoServico {
		AGUARDANDO("Aguardando", "A"), DEFERIDO("Deferido", "D"), INDEFERIDO("Indeferido", "I");

		private StatusSolicitacaoServico(String label, String codigo) {
			this.label = label;
			this.codigo = codigo;
		}

		private String label;
		private String codigo;

		public static StatusSolicitacaoServico getSituacao(String codigo) {

			for (StatusSolicitacaoServico e : StatusSolicitacaoServico.values()) {
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

	public enum Urgente {
		SIM("Sim", "S"), NAO("Não", "N");

		private Urgente(String label, String codigo) {
			this.label = label;
			this.codigo = codigo;
		}

		private String label;
		private String codigo;

		public static Urgente getUrgente(String codigo) {
			for (Urgente e : Urgente.values()) {
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

	public TextArea getTxaDescricao() {
		return txaDescricao;
	}

	public void setTxaDescricao(TextArea txaDescricao) {
		this.txaDescricao = txaDescricao;
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
		gridLayout_1 = new GridLayout(4, 7);
		gridLayout_1.setImmediate(false);
		gridLayout_1.setSpacing(true);

		// cmbFornecedor
		cmbFornecedor = ComponentUtil.buildComboBox("Fornecedor");
		gridLayout_1.addComponent(cmbFornecedor, 0, 0, 3, 0);

		// cmbCliente
		cmbCliente = ComponentUtil.buildComboBox("Cliente");
		gridLayout_1.addComponent(cmbCliente, 0, 1, 3, 1);

		// cmbSetor
		cmbSetor = ComponentUtil.buildComboBox("Setor");
		gridLayout_1.addComponent(cmbSetor, 0, 2, 3, 2);

		// cmbColaborador
		cmbColaborador = ComponentUtil.buildComboBox("Colaborador");
		gridLayout_1.addComponent(cmbColaborador, 0, 3, 3, 3);

		// cmbTipoServico
		cmbTipoServico = ComponentUtil.buildComboBox("Tipo serviço");
		gridLayout_1.addComponent(cmbTipoServico, 0, 4, 3, 4);

		// dtSolicitacao
		dtSolicitacao = ComponentUtil.buildPopupDateField("DataSolicitação");
		gridLayout_1.addComponent(dtSolicitacao, 0, 5);

		// dtDesejadaInicio
		dtDesejadaInicio = ComponentUtil.buildPopupDateField("Data Desejada Início");
		gridLayout_1.addComponent(dtDesejadaInicio, 1, 5);

		// cmbUrgente
		cmbUrgente = ComponentUtil.buildComboBox("Urgente");
		gridLayout_1.addComponent(cmbUrgente, 2, 5);

		// cmbStatusSituacao
		cmbStatusSituacao = ComponentUtil.buildComboBox("Status Situação");
		gridLayout_1.addComponent(cmbStatusSituacao, 3, 5);

		// txaDescricao
		txaDescricao = ComponentUtil.buildTextArea("Descrição");
		gridLayout_1.addComponent(txaDescricao, 0, 6, 3, 6);

		return gridLayout_1;
	}
}
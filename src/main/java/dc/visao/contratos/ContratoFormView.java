package dc.visao.contratos;

import java.math.BigDecimal;
import java.util.List;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.data.Container;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.DateField;
import com.vaadin.ui.Field;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.PopupDateField;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.Table;
import com.vaadin.ui.TableFieldFactory;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import dc.controller.contratos.ContratoFormController;
import dc.entidade.contabilidade.ContabilConta;
import dc.entidade.contratos.Contrato;
import dc.entidade.contratos.ContratoHistFaturamento;
import dc.entidade.contratos.ContratoHistoricoReajuste;
import dc.entidade.contratos.ContratoPrevFaturamento;
import dc.entidade.contratos.ContratoSolicitacaoServico;
import dc.entidade.contratos.TipoContrato;
import dc.entidade.ged.Documento;
import dc.entidade.geral.Pessoa;
import dc.framework.StringToBigDecimalConverter;
import dc.visao.framework.component.SubFormComponent;
import dc.visao.framework.component.manytoonecombo.ManyToOneCombo;
import dc.visao.framework.util.ComponentUtil;

@SuppressWarnings("serial")
public class ContratoFormView extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	@AutoGenerated
	private VerticalLayout mainLayout;
	@AutoGenerated
	private TabSheet tabSheet_2;
	@AutoGenerated
	private AbsoluteLayout absoluteLayout_6;
	@AutoGenerated
	private AbsoluteLayout absoluteLayout_4;
	@AutoGenerated
	private AbsoluteLayout absoluteLayout_3;
	@AutoGenerated
	private Table table_2;
	@AutoGenerated
	private TabSheet tabSheet_1;
	@AutoGenerated
	private GridLayout gridLayout_2;
	@AutoGenerated
	private TextArea txaObservacoes;
	@AutoGenerated
	private TextArea txaDescricao;
	@AutoGenerated
	private Button btnGerarParcelas;
	@AutoGenerated
	private TextField txtIntervaloParcelas;
	@AutoGenerated
	private TextField txtQuantidadeParcelas;
	@AutoGenerated
	private TextField txtValor;
	@AutoGenerated
	private TextField txtDiaFaturamento;
	@AutoGenerated
	private PopupDateField dtFimVigencia;
	@AutoGenerated
	private PopupDateField dtVigencia;
	@AutoGenerated
	private PopupDateField dtCadastro;
	@AutoGenerated
	private GridLayout gridLayout_1;
	@AutoGenerated
	private ManyToOneCombo<ContratoSolicitacaoServico> cmbSolicitacaoServico;
	@AutoGenerated
	private TextField txtNome;
	@AutoGenerated
	private TextField txtNumero;
	@AutoGenerated
	private ManyToOneCombo<Pessoa> cbmPessoa;
	@AutoGenerated
	private ManyToOneCombo<ContabilConta> cbmContabilConta;
	@AutoGenerated
	private ManyToOneCombo<TipoContrato> cbmTipoContrato;
	@AutoGenerated
	private ManyToOneCombo<Documento> cbmDocumento;
	@AutoGenerated
	private SubFormComponent<ContratoHistFaturamento, Integer> historicoFaturamentoSubForm;
	@AutoGenerated
	private SubFormComponent<ContratoHistoricoReajuste, Integer> historicoReajustesSubForm;
	@AutoGenerated
	private SubFormComponent<ContratoPrevFaturamento, Integer> previsaoFaturamentoSubForm;
	@AutoGenerated
	private Button btnGerarContrato;

	private ContratoFormController controller;

	public ContratoFormView(ContratoFormController contratoFormController) {
		buildMainLayout();
		setCompositionRoot(mainLayout);
		this.controller = contratoFormController;
	}

	public VerticalLayout getMainLayout() {
		return mainLayout;
	}

	public void setMainLayout(VerticalLayout mainLayout) {
		this.mainLayout = mainLayout;
	}

	public Table getTable_2() {
		return table_2;
	}

	public void setTable_2(Table table_2) {
		this.table_2 = table_2;
	}

	public TextArea getTxaObservacoes() {
		return txaObservacoes;
	}

	public void setTxaObservacoes(TextArea txaObservacoes) {
		this.txaObservacoes = txaObservacoes;
	}

	public TextArea getTxaDescricao() {
		return txaDescricao;
	}

	public void setTxaDescricao(TextArea txaDescricao) {
		this.txaDescricao = txaDescricao;
	}

	public TextField getTxtIntervaloParcelas() {
		return txtIntervaloParcelas;
	}

	public void setTxtIntervaloParcelas(TextField txtIntervaloParcelas) {
		this.txtIntervaloParcelas = txtIntervaloParcelas;
	}

	public TextField getTxtQuantidadeParcelas() {
		return txtQuantidadeParcelas;
	}

	public void setTxtQuantidadeParcelas(TextField txtQuantidadeParcelas) {
		this.txtQuantidadeParcelas = txtQuantidadeParcelas;
	}

	public TextField getTxtValor() {
		return txtValor;
	}

	public void setTxtValor(TextField txtValor) {
		this.txtValor = txtValor;
	}

	public TextField getTxtDiaFaturamento() {
		return txtDiaFaturamento;
	}

	public void setTxtDiaFaturamento(TextField txtDiaFaturamento) {
		this.txtDiaFaturamento = txtDiaFaturamento;
	}

	public PopupDateField getDtFimVigencia() {
		return dtFimVigencia;
	}

	public void setDtFimVigencia(PopupDateField dtFimVigencia) {
		this.dtFimVigencia = dtFimVigencia;
	}

	public PopupDateField getDtVigencia() {
		return dtVigencia;
	}

	public void setDtVigencia(PopupDateField dtVigencia) {
		this.dtVigencia = dtVigencia;
	}

	public PopupDateField getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(PopupDateField dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public TextField getTxtNome() {
		return txtNome;
	}

	public void setTxtNome(TextField txtNome) {
		this.txtNome = txtNome;
	}

	public TextField getTxtNumero() {
		return txtNumero;
	}

	public void setTxtNumero(TextField txtNumero) {
		this.txtNumero = txtNumero;
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

		// tabSheet_1
		tabSheet_1 = buildTabSheet_1();
		mainLayout.addComponent(tabSheet_1);

		// tabSheet_2
		tabSheet_2 = buildTabSheet_2();
		mainLayout.addComponent(tabSheet_2);
		mainLayout.setExpandRatio(tabSheet_2, 1.0f);

		return mainLayout;
	}

	@AutoGenerated
	private TabSheet buildTabSheet_1() {
		// common part: create layout
		tabSheet_1 = new TabSheet();
		tabSheet_1.setImmediate(false);
		tabSheet_1.setWidth("100%");

		// absoluteLayout_5
		gridLayout_1 = buildGridLayout1();
		tabSheet_1.addTab(gridLayout_1, "Dados Básicos", null);

		// absoluteLayout_2
		gridLayout_2 = buildGridLayout_2();
		tabSheet_1.addTab(gridLayout_2, "Dados Complementares", null);

		return tabSheet_1;
	}

	@AutoGenerated
	private GridLayout buildGridLayout1() {
		// common part: create layout
		gridLayout_1 = new GridLayout();
		gridLayout_1.setImmediate(false);
		gridLayout_1.setMargin(true);
		gridLayout_1.setSpacing(true);
		gridLayout_1.setRows(4);
		gridLayout_1.setColumns(2);
		gridLayout_1.setWidth("100%");

		// cbmPessoa
		cbmPessoa = new ManyToOneCombo<>();
		cbmPessoa.setCaption("Pessoa");
		gridLayout_1.addComponent(cbmPessoa, 0, 0);
		
		// cbmTipoContrato
		cbmTipoContrato = new ManyToOneCombo<>();
		cbmTipoContrato.setCaption("Tipo de Contrato");
		gridLayout_1.addComponent(cbmTipoContrato, 1, 0);

		// cbmContabilConta
		cbmContabilConta = new ManyToOneCombo<>();
		cbmContabilConta.setCaption("Conta Contábil");
		gridLayout_1.addComponent(cbmContabilConta, 0, 1);

		// cmbSolicitacaoServico
		cmbSolicitacaoServico = new ManyToOneCombo<>();
		cmbSolicitacaoServico.setCaption("Solicitação de serviço");
		gridLayout_1.addComponent(cmbSolicitacaoServico, 1, 1);

		// txtNumero
		txtNumero = ComponentUtil.buildTextField("Número");
		gridLayout_1.addComponent(txtNumero, 0, 2);

		// txtNome
		txtNome = ComponentUtil.buildTextField("Nome");
		gridLayout_1.addComponent(txtNome, 1, 2);

		cbmDocumento = new ManyToOneCombo<>();
		cbmDocumento.setCaption("Modelo Documento");
		gridLayout_1.addComponent(cbmDocumento, 0, 3);

		btnGerarContrato = new Button("Gerar Contrato");
		btnGerarContrato.setVisible(false);
		gridLayout_1.addComponent(btnGerarContrato, 1, 3);

		return gridLayout_1;
	}

	@AutoGenerated
	private GridLayout buildGridLayout_2() {
		// common part: create layout
		gridLayout_2 = new GridLayout();
		gridLayout_2.setRows(4);
		gridLayout_2.setColumns(4);
		gridLayout_2.setImmediate(false);
		gridLayout_2.setMargin(true);
		gridLayout_2.setSpacing(true);
		gridLayout_2.setWidth("100%");

		// dtCadastro
		dtCadastro = ComponentUtil.buildPopupDateField("Data Cadastro");
		gridLayout_2.addComponent(dtCadastro, 0, 0);

		// dtVigencia
		dtVigencia = ComponentUtil.buildPopupDateField("Data Vigência");
		gridLayout_2.addComponent(dtVigencia, 1, 0);

		// dtFimVigencia
		dtFimVigencia = ComponentUtil.buildPopupDateField("Data Fim Vigência");
		gridLayout_2.addComponent(dtFimVigencia, 2, 0);
		// txtDiaFaturamento
		txtDiaFaturamento = ComponentUtil.buildMaskedTextField("Dia de Faturamento", "##");
		gridLayout_2.addComponent(txtDiaFaturamento, 3, 0);

		// txtValor
		//txtValor = ComponentUtil.buildCurrencyField("Valor");
		txtValor = new TextField("Valor");
		gridLayout_2.addComponent(txtValor, 0, 1);

		// txtQuantidadeParcelas
		txtQuantidadeParcelas = ComponentUtil.buildMaskedTextField("Quantidade de Parcelas", "##");
		gridLayout_2.addComponent(txtQuantidadeParcelas, 1, 1);

		// txtIntervaloParcelas
		txtIntervaloParcelas = ComponentUtil.buildTextField("Intervalo entre Parcelas");
		gridLayout_2.addComponent(txtIntervaloParcelas, 2, 1);
		
		btnGerarParcelas = new Button("Gerar Parcelas");
		gridLayout_2.addComponent(btnGerarParcelas, 3, 1);

		// txaDescricao
		txaDescricao = ComponentUtil.buildTextArea("Descrição");
		gridLayout_2.addComponent(txaDescricao, 0, 2);

		// txaObservacoes
		txaObservacoes = ComponentUtil.buildTextArea("Observações");
		gridLayout_2.addComponent(txaObservacoes, 1, 2);

		return gridLayout_2;
	}

	@AutoGenerated
	private TabSheet buildTabSheet_2() {
		// common part: create layout
		tabSheet_2 = new TabSheet();
		tabSheet_2.setImmediate(false);
		tabSheet_2.setWidth("100%");
		tabSheet_2.setHeight("100%");

		historicoFaturamentoSubForm = buildHistoricoFaturaSubForm();
		historicoReajustesSubForm = buildHistoricoReajustesSubForm();
		previsaoFaturamentoSubForm = buildPrevisaoFaturamentoSubForm();

		historicoFaturamentoSubForm.setHeight("100%");
		historicoReajustesSubForm.setHeight("100%");
		previsaoFaturamentoSubForm.setHeight("100%");

		tabSheet_2.addTab(historicoFaturamentoSubForm, "Histórico Faturamento", null);

		tabSheet_2.addTab(historicoReajustesSubForm, "Histórico de Reajustes", null);

		tabSheet_2.addTab(previsaoFaturamentoSubForm, "Previsão de Faturamento", null);

		return tabSheet_2;
	}

	public SubFormComponent<ContratoPrevFaturamento, Integer> buildPrevisaoFaturamentoSubForm() {
		SubFormComponent<ContratoPrevFaturamento, Integer> subForm = new SubFormComponent<ContratoPrevFaturamento, Integer>(
				ContratoPrevFaturamento.class, new String[] { "dataPrevista", "valor" }, new String[] { "Data Prevista", "Valor" }) {
			@Override
			protected TableFieldFactory getFieldFactory() {
				return new TableFieldFactory() {

					@Override
					public Field<?> createField(Container container, Object itemId, Object propertyId, Component uiContext) {

						if ("dataPrevista".equals(propertyId)) {
							DateField dateField = new DateField();
							dateField.setSizeFull();
							return dateField;
						} else if ("valor".equals(propertyId)) {
							TextField textField = new TextField();
							textField.setSizeFull();
							textField.setConverter(new StringToBigDecimalConverter());
							return textField;
						}

						return null;
					}

				};
			}

			protected ContratoPrevFaturamento getNovo() {
				ContratoPrevFaturamento contratoPrevFaturamento = controller.novoContratoPrevFaturamento();
				return contratoPrevFaturamento;
			}

			protected void getRemoverSelecionados(List<ContratoPrevFaturamento> values) {
				controller.removerContratoPrevFaturamento(values);
			}

			@Override
			public boolean validateItems(List<ContratoPrevFaturamento> items) {
				return true;
			}
		};

		return subForm;
	}

	private SubFormComponent<ContratoHistoricoReajuste, Integer> buildHistoricoReajustesSubForm() {
		SubFormComponent<ContratoHistoricoReajuste, Integer> subForm = new SubFormComponent<ContratoHistoricoReajuste, Integer>(
				ContratoHistoricoReajuste.class, new String[] { "indice", "valorAnterior", "valorAtual", "dataReajuste", "observacao" },
				new String[] { "Índice", "Valor Anterior", "Valor Atual", "Data Reajuste", "Observação" }) {
			@Override
			protected TableFieldFactory getFieldFactory() {
				return new TableFieldFactory() {

					@Override
					public Field<?> createField(Container container, Object itemId, Object propertyId, Component uiContext) {

						if ("indice".equals(propertyId)) {
							TextField textField = new TextField();
							textField.setSizeFull();
							textField.setConverter(new StringToBigDecimalConverter());
							return textField;
						} else if ("valorAnterior".equals(propertyId)) {
							TextField textField = new TextField();
							textField.setSizeFull();
							textField.setConverter(new StringToBigDecimalConverter());
							return textField;
						} else if ("valorAtual".equals(propertyId)) {
							TextField textField = new TextField();
							textField.setSizeFull();
							textField.setConverter(new StringToBigDecimalConverter());
							return textField;
						} else if ("observacao".equals(propertyId)) {
							TextField textField = new TextField();
							textField.setSizeFull();

							return textField;
						} else if ("dataReajuste".equals(propertyId)) {
							DateField dateField = new DateField();
							dateField.setSizeFull();
							return dateField;
						}

						return null;
					}

				};
			}

			protected ContratoHistoricoReajuste getNovo() {
				ContratoHistoricoReajuste contratoHistoricoReajuste = controller.novoContratoHistoricoReajuste();
				return contratoHistoricoReajuste;
			}

			protected void getRemoverSelecionados(List<ContratoHistoricoReajuste> values) {
				controller.removerContratoHistoricoReajuste(values);
			}

			@Override
			public boolean validateItems(List<ContratoHistoricoReajuste> items) {
				// TODO Auto-generated method stub
				return true;
			}
		};

		return subForm;
	}

	private SubFormComponent<ContratoHistFaturamento, Integer> buildHistoricoFaturaSubForm() {
		SubFormComponent<ContratoHistFaturamento, Integer> subForm = new SubFormComponent<ContratoHistFaturamento, Integer>(
				ContratoHistFaturamento.class, new String[] { "dataFatura", "valor" }, new String[] { "Data Fatura", "Valor" }) {
			@Override
			protected TableFieldFactory getFieldFactory() {
				return new TableFieldFactory() {

					@Override
					public Field<?> createField(Container container, Object itemId, Object propertyId, Component uiContext) {

						if ("dataFatura".equals(propertyId)) {
							DateField dateField = new DateField();
							dateField.setSizeFull();
							return dateField;
						} else if ("valor".equals(propertyId)) {
							TextField textField = new TextField();
							textField.setSizeFull();
							textField.setConverter(new StringToBigDecimalConverter());
							return textField;
						}

						return null;
					}

				};
			}

			protected ContratoHistFaturamento getNovo() {
				ContratoHistFaturamento contratoHistFaturamento = controller.novoContratoHistFaturamento();
				return contratoHistFaturamento;
			}

			protected void getRemoverSelecionados(List<ContratoHistFaturamento> values) {
				controller.removerContratoHistFaturamento(values);
			}

			@Override
			public boolean validateItems(List<ContratoHistFaturamento> items) {

				return true;
			}
		};

		return subForm;
	}

	public void preencherHistoricoFaturamento(List<ContratoHistFaturamento> historicosFaturamentos) {
		historicoFaturamentoSubForm.fillWith(historicosFaturamentos);
	}

	public void fillContratoHistoricoFaturamentoSubForm(List<ContratoHistFaturamento> contratosHistoricosFaturamentos) {
		this.historicoFaturamentoSubForm.fillWith(contratosHistoricosFaturamentos);

	}

	public void fillContratoHistoricosReajustesSubForm(List<ContratoHistoricoReajuste> contratosHistoricosReajustes) {
		this.historicoReajustesSubForm.fillWith(contratosHistoricosReajustes);

	}

	public void fillContratosPrevisoesFaturamentosSubForm(List<ContratoPrevFaturamento> contratosPrevisoesFaturamentos) {
		this.previsaoFaturamentoSubForm.fillWith(contratosPrevisoesFaturamentos);

	}

	public void preencheContrato(Contrato contrato) {

		contrato.setContabilConta(getCbmContabilConta().getValue());
		contrato.setContratoSolicitacaoServico(getCmbSolicitacaoServico().getValue());
		contrato.setDataCadastro(getDtCadastro().getValue());
		contrato.setDataFimVigencia(getDtFimVigencia().getValue());
		contrato.setDataInicioVigencia(getDtVigencia().getValue());
		contrato.setDescricao(getTxaDescricao().getValue());
		contrato.setDiaFaturamento(getTxtDiaFaturamento().getValue());
		contrato.setIntervaloEntreParcelas(Integer.parseInt(getTxtIntervaloParcelas().getValue()));
		contrato.setNome(getTxtNome().getValue());
		contrato.setNumero(getTxtNumero().getValue());
		contrato.setObservacao(getTxaObservacoes().getValue());
		contrato.setQuantidadeParcelas(Integer.parseInt(getTxtQuantidadeParcelas().getValue()));
		contrato.setTipoContrato((TipoContrato) getCbmTipoContrato().getValue());
		contrato.setValor(new BigDecimal(getTxtValor().getValue()));

	}

	public void preencheContratoForm(Contrato contrato) {
		getCbmContabilConta().setValue(contrato.getContabilConta());
		getCmbSolicitacaoServico().setValue(contrato.getContratoSolicitacaoServico());
		getDtCadastro().setValue(contrato.getDataCadastro());
		getDtFimVigencia().setValue(contrato.getDataFimVigencia());
		getDtVigencia().setValue(contrato.getDataInicioVigencia());
		getTxaDescricao().setValue(contrato.getDescricao());
		getTxtDiaFaturamento().setValue(contrato.getDiaFaturamento());
		getTxtIntervaloParcelas().setValue(String.valueOf(contrato.getIntervaloEntreParcelas()));
		getTxtNome().setValue(contrato.getNome());
		getTxtNumero().setValue(contrato.getNumero());
		getTxaObservacoes().setValue(contrato.getObservacao());
		getTxtQuantidadeParcelas().setValue(String.valueOf(contrato.getQuantidadeParcelas()));
		getCbmTipoContrato().setValue(contrato.getTipoContrato());
		getTxtValor().setValue(contrato.getValor().toString());

		this.fillContratoHistoricoFaturamentoSubForm(contrato.getContratosHistoricosFaturamentos());

		this.fillContratoHistoricosReajustesSubForm(contrato.getContratosHistoricosReajustes());

		this.fillContratosPrevisoesFaturamentosSubForm(contrato.getContratosPrevisoesFaturamentos());

	}

	public Button getBtnGerarContrato() {
		return btnGerarContrato;
	}

	public void setBtnGerarContrato(Button btnGerarContrato) {
		this.btnGerarContrato = btnGerarContrato;
	}

	public ManyToOneCombo<ContratoSolicitacaoServico> getCmbSolicitacaoServico() {
		return cmbSolicitacaoServico;
	}

	public void setCmbSolicitacaoServico(ManyToOneCombo<ContratoSolicitacaoServico> cmbSolicitacaoServico) {
		this.cmbSolicitacaoServico = cmbSolicitacaoServico;
	}

	public ManyToOneCombo<ContabilConta> getCbmContabilConta() {
		return cbmContabilConta;
	}

	public void setCbmContabilConta(ManyToOneCombo<ContabilConta> cbmContabilConta) {
		this.cbmContabilConta = cbmContabilConta;
	}
	
	public ManyToOneCombo<Pessoa> getCbmPessoa() {
		return cbmPessoa;
	}

	public void setCbmPessoa(ManyToOneCombo<Pessoa> cbmPessoa) {
		this.cbmPessoa = cbmPessoa;
	}

	public ManyToOneCombo<TipoContrato> getCbmTipoContrato() {
		return cbmTipoContrato;
	}

	public void setCbmTipoContrato(ManyToOneCombo<TipoContrato> cbmTipoContrato) {
		this.cbmTipoContrato = cbmTipoContrato;
	}

	public void setCbmDocumento(ManyToOneCombo<Documento> cbmDocumento) {
		this.cbmDocumento = cbmDocumento;
	}

	public ManyToOneCombo<Documento> getCbmDocumento() {
		return cbmDocumento;
	}

	public Button getBtnGerarParcelas() {
		return btnGerarParcelas;
	}

	public void setBtnGerarParcelas(Button btnGerarParcelas) {
		this.btnGerarParcelas = btnGerarParcelas;
	}

	public SubFormComponent<ContratoPrevFaturamento, Integer> getPrevisaoFaturamentoSubForm() {
		return previsaoFaturamentoSubForm;
	}

	public void setPrevisaoFaturamentoSubForm(
			SubFormComponent<ContratoPrevFaturamento, Integer> previsaoFaturamentoSubForm) {
		this.previsaoFaturamentoSubForm = previsaoFaturamentoSubForm;
	}
	
}

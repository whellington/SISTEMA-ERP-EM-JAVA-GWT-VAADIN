package dc.visao.financeiro;

import java.math.BigDecimal;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Component;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.TextField;

import dc.entidade.financeiro.ConfiguracaoBoleto;
import dc.entidade.financeiro.ContaCaixa;
import dc.visao.framework.component.manytoonecombo.ManyToOneCombo;
import dc.visao.framework.util.ComponentUtil;

public class ConfiguracaoBoletoFormView extends CustomComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@AutoGenerated
	private GridLayout mainLayout;
	private GridLayout gridLayout;

	private ManyToOneCombo<ContaCaixa> cbContaCaixa;
	private TextField txMensagem;
	private TextField txLocalPagamento;
	private TextField txInstrucao01;
	private TextField txInstrucao02;
	private ComboBox cbLayoutRemessa;
	private ComboBox cbAceite;
	private ComboBox cbEspecie;
	private TextField txCarteira;
	private TextField txCodigoConvenio;
	private TextField txCodigoCedente;
	private TextField txTaxaMulta;

	public ConfiguracaoBoletoFormView() {
		buildMainLayout();
		setCompositionRoot(mainLayout);
	}

	@AutoGenerated
	private GridLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new GridLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("100%");
		mainLayout.setHeight("-1px");
		mainLayout.setMargin(true);
		mainLayout.setSpacing(true);
		mainLayout.setRows(6);
		mainLayout.setColumns(1);

		// top-level component properties
		setWidth("100.0%");
		setHeight("-1px");

		cbContaCaixa = new ManyToOneCombo<>();
		cbContaCaixa.setCaption("Conta Caixa");
		mainLayout.addComponent(cbContaCaixa, 0, 0);

		txMensagem = ComponentUtil.buildTextField("Mensagem");
		mainLayout.addComponent(txMensagem, 0, 1);

		txLocalPagamento = ComponentUtil.buildTextField("Local Pagamento");
		mainLayout.addComponent(txLocalPagamento, 0, 2);

		txInstrucao01 = ComponentUtil.buildTextField("Instrução01");
		mainLayout.addComponent(txInstrucao01, 0, 3);

		txInstrucao02 = ComponentUtil.buildTextField("Instrução02");
		mainLayout.addComponent(txInstrucao02, 0, 4);

		mainLayout.addComponent(buildGridLayout(), 0, 5);

		for (SimNao value : SimNao.values()) {
			cbAceite.addItem(value);
		}

		for (LayoutRemessa value : LayoutRemessa.values()) {
			cbLayoutRemessa.addItem(value);
		}

		for (EspecieCobranca value : EspecieCobranca.values()) {
			cbEspecie.addItem(value);
		}

		return mainLayout;
	}

	private Component buildGridLayout() {
		gridLayout = new GridLayout(7, 1);
		gridLayout.setImmediate(false);
		gridLayout.setWidth("100%");
		gridLayout.setHeight("-1px");
		gridLayout.setMargin(false);
		gridLayout.setSpacing(true);

		cbLayoutRemessa = ComponentUtil.buildComboBox("Layout Remessa");
		gridLayout.addComponent(cbLayoutRemessa, 0, 0);

		cbAceite = ComponentUtil.buildComboBox("Aceite");
		gridLayout.addComponent(cbAceite, 1, 0);

		cbEspecie = ComponentUtil.buildComboBox("Especie");
		gridLayout.addComponent(cbEspecie, 2, 0);

		txCarteira = ComponentUtil.buildMaskedTextField("Carteira", "***");
		gridLayout.addComponent(txCarteira, 3, 0);

		txCodigoConvenio = ComponentUtil.buildTextField("Código Convênio");
		gridLayout.addComponent(txCodigoConvenio, 4, 0);

		txCodigoCedente = ComponentUtil.buildTextField("Código Cedente");
		gridLayout.addComponent(txCodigoCedente, 5, 0);

		txTaxaMulta = ComponentUtil.buildPercentageField("Taxa Multa");
		gridLayout.addComponent(txTaxaMulta, 6, 0);

		return gridLayout;
	}

	public void preencheBean(ConfiguracaoBoleto currentBean) {
		currentBean.setAceite(((SimNao) cbAceite.getValue()).getCodigo());
		currentBean.setCarteira(txCarteira.getValue());
		currentBean.setCodigoCedente(txCodigoCedente.getValue());
		currentBean.setCodigoConvenio(txCodigoConvenio.getValue());
		currentBean.setContaCaixa(cbContaCaixa.getValue());
		currentBean.setEspecie(((EspecieCobranca) cbEspecie.getValue()).getCodigo());
		currentBean.setInstrucao01(txInstrucao01.getValue());
		currentBean.setInstrucao02(txInstrucao02.getValue());
		currentBean.setLayoutRemessa(((LayoutRemessa) cbLayoutRemessa.getValue()).getCodigo());
		currentBean.setLocalPagamento(txLocalPagamento.getValue());
		currentBean.setMensagem(txMensagem.getValue());
		currentBean.setTaxaMulta((BigDecimal) txTaxaMulta.getConvertedValue());
	}

	public void preencheForm(ConfiguracaoBoleto currentBean) {

		cbAceite.setValue(SimNao.getSimNao(currentBean.getAceite()));
		txCarteira.setValue(currentBean.getCarteira());
		txCodigoCedente.setValue(currentBean.getCodigoCedente());
		txCodigoConvenio.setValue(currentBean.getCodigoConvenio());
		cbContaCaixa.setValue(currentBean.getContaCaixa());
		cbEspecie.setValue(EspecieCobranca.getEspecieCobranca(currentBean.getEspecie()));
		txInstrucao01.setValue(currentBean.getInstrucao01());
		txInstrucao02.setValue(currentBean.getInstrucao02());
		cbLayoutRemessa.setValue(LayoutRemessa.getLayoutRemessa(currentBean.getLayoutRemessa()));
		txLocalPagamento.setValue(currentBean.getLocalPagamento());
		txMensagem.setValue(currentBean.getMensagem());
		txTaxaMulta.setConvertedValue(currentBean.getTaxaMulta());
	}

	public ManyToOneCombo<ContaCaixa> getCbContaCaixa() {
		return cbContaCaixa;
	}

	public void setCbContaCaixa(ManyToOneCombo<ContaCaixa> cbContaCaixa) {
		this.cbContaCaixa = cbContaCaixa;
	}

	public TextField getTxMensagem() {
		return txMensagem;
	}

	public void setTxMensagem(TextField txMensagem) {
		this.txMensagem = txMensagem;
	}

	public TextField getTxLocalPagamento() {
		return txLocalPagamento;
	}

	public void setTxLocalPagamento(TextField txLocalPagamento) {
		this.txLocalPagamento = txLocalPagamento;
	}

	public TextField getTxInstrucao01() {
		return txInstrucao01;
	}

	public void setTxInstrucao01(TextField txInstrucao01) {
		this.txInstrucao01 = txInstrucao01;
	}

	public TextField getTxInstrucao02() {
		return txInstrucao02;
	}

	public void setTxInstrucao02(TextField txInstrucao02) {
		this.txInstrucao02 = txInstrucao02;
	}

	public ComboBox getCbLayoutRemessa() {
		return cbLayoutRemessa;
	}

	public void setCbLayoutRemessa(ComboBox cbLayoutRemessa) {
		this.cbLayoutRemessa = cbLayoutRemessa;
	}

	public ComboBox getCbAceite() {
		return cbAceite;
	}

	public void setCbAceite(ComboBox cbAceite) {
		this.cbAceite = cbAceite;
	}

	public ComboBox getCbEspecie() {
		return cbEspecie;
	}

	public void setCbEspecie(ComboBox cbEspecie) {
		this.cbEspecie = cbEspecie;
	}

	public TextField getTxCarteira() {
		return txCarteira;
	}

	public void setTxCarteira(TextField txCarteira) {
		this.txCarteira = txCarteira;
	}

	public TextField getTxCodigoConvenio() {
		return txCodigoConvenio;
	}

	public void setTxCodigoConvenio(TextField txCodigoConvenio) {
		this.txCodigoConvenio = txCodigoConvenio;
	}

	public TextField getTxCodigoCedente() {
		return txCodigoCedente;
	}

	public void setTxCodigoCedente(TextField txCodigoCedente) {
		this.txCodigoCedente = txCodigoCedente;
	}

	public TextField getTxTaxaMulta() {
		return txTaxaMulta;
	}

	public void setTxTaxaMulta(TextField txTaxaMulta) {
		this.txTaxaMulta = txTaxaMulta;
	}

	public enum LayoutRemessa {

		DUZENTOS_QUARENTA("240", "240"), QUATROCENTOS("400", "400");

		private LayoutRemessa(String label, String codigo) {
			this.label = label;
			this.codigo = codigo;
		}

		private String label;
		private String codigo;

		public static LayoutRemessa getLayoutRemessa(String codigo) {
			for (LayoutRemessa e : LayoutRemessa.values()) {
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

	public enum SimNao {

		SIM("Sim", "S"), NAO("Não", "N");

		private SimNao(String label, String codigo) {
			this.label = label;
			this.codigo = codigo;
		}

		private String label;
		private String codigo;

		public static SimNao getSimNao(String codigo) {
			for (SimNao e : SimNao.values()) {
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

	public enum EspecieCobranca {

		DUPLICATA_MERCANTIL("Duplicata Mercantil", "DM"), DUPLICATA_SERVICOS("Duplicata de Serviços", "DS"), RECIBO("Recibo", "RC"), NOTA_PROMISSORIA(
				"Nota Promissória", "NP");

		private EspecieCobranca(String label, String codigo) {
			this.label = label;
			this.codigo = codigo;
		}

		private String label;
		private String codigo;

		public static EspecieCobranca getEspecieCobranca(String codigo) {
			for (EspecieCobranca e : EspecieCobranca.values()) {
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

}
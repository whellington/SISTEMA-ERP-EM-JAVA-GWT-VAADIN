package dc.entidade.ordemservico;

import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.lucene.analysis.br.BrazilianAnalyzer;
import org.hibernate.search.annotations.Analyzer;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;

import dc.anotacoes.Caption;
import dc.entidade.framework.AbstractMultiEmpresaModel;
import dc.entidade.framework.ComboCode;
import dc.entidade.geral.produto.ProdutoEntity;
import dc.entidade.pessoal.ColaboradorEntity;

@Entity
@Table(name = "os_material_servico")
@Indexed
@Analyzer(impl = BrazilianAnalyzer.class)
public class MaterialServico extends AbstractMultiEmpresaModel<Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "ID")
	@ComboCode
	@Analyzer(definition = "dc_combo_analyzer")
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "id_ordem_servico", referencedColumnName = "id")
	private OrdemServico ordemServico;

	@ManyToOne
	@JoinColumn(name = "id_tecnico", referencedColumnName = "id")
	private ColaboradorEntity tecnico;

	@ManyToOne
	@JoinColumn(name = "id_produto", referencedColumnName = "id")
	private ProdutoEntity produto;

	@Field
	@Caption("QUANTIDADE PRODUTO")
	@Column(name = "quantidade_produto")
	private BigDecimal quantidadeProduto;

	@Column(name = "valor_unitario")
	private BigDecimal valorUnitario;

	@Column(name = "valor_total")
	private BigDecimal valorTotal;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public OrdemServico getOrdemServico() {
		return ordemServico;
	}

	public void setOrdemServico(OrdemServico ordemServico) {
		this.ordemServico = ordemServico;
	}

	public ColaboradorEntity getTecnico() {
		return tecnico;
	}

	public void setTecnico(ColaboradorEntity tecnico) {
		this.tecnico = tecnico;
	}

	public ProdutoEntity getProduto() {
		return produto;
	}

	public void setProduto(ProdutoEntity produto) {
		this.produto = produto;
	}

	public BigDecimal getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public void setQuantidadeProduto(BigDecimal quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}

	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

}
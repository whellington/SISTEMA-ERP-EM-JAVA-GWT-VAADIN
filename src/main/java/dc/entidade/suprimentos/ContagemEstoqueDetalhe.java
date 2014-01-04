package dc.entidade.suprimentos;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import dc.anotacoes.Caption;
import dc.entidade.framework.AbstractMultiEmpresaModel;
import dc.entidade.produto.Produto;

@Entity   // esse aqui e o nome da tabelam 
@Table(name = "estoque_contagem_detalhe")
@SuppressWarnings("serial")
public class ContagemEstoqueDetalhe extends AbstractMultiEmpresaModel<Integer> {

//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Caption("Id")
//	@Field
//	private Integer id;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cnd")
	@SequenceGenerator(name = "cnd", sequenceName = "estoque_contagem_detalhe_id_seq", allocationSize = 1)
	private Integer id;

	@Caption("Acuracidade")
	BigDecimal acuracidade;

	@Caption("Divergencia")
	BigDecimal divergencia;
	
	@ManyToOne
	@JoinColumn(name="id_produto")
	private Produto produto;
	
	@Column(name="quantidade_contada")
	private BigDecimal quantidadeContada;
	
	@Column(name="quantidade_sistema")
	private BigDecimal quantidadeSistema;

	@ManyToOne
	@JoinColumn(name = "id_estoque_contagem_cabecalho")
	private ContagemEstoque contagem;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public BigDecimal getAcuracidade() {
		return acuracidade;
	}

	public void setAcuracidade(BigDecimal acuracidade) {
		this.acuracidade = acuracidade;
	}

	public BigDecimal getDivergencia() {
		return divergencia;
	}

	public void setDivergencia(BigDecimal divergencia) {
		this.divergencia = divergencia;
	}

	public ContagemEstoque getContagem() {
		return contagem;
	}

	public void setContagem(ContagemEstoque contagem) {
		this.contagem = contagem;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public BigDecimal getQuantidadeContada() {
		return quantidadeContada;
	}

	public void setQuantidadeContada(BigDecimal quantidadeContada) {
		this.quantidadeContada = quantidadeContada;
	}

	public BigDecimal getQuantidadeSistema() {
		return quantidadeSistema;
	}

	public void setQuantidadeSistema(BigDecimal quantidadeSistema) {
		this.quantidadeSistema = quantidadeSistema;
	}
	
	
		
}

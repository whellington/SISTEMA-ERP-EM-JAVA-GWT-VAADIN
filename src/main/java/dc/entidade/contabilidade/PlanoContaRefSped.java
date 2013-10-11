package dc.entidade.contabilidade;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.lucene.analysis.br.BrazilianAnalyzer;
import org.hibernate.search.annotations.Analyzer;
import org.hibernate.search.annotations.Indexed;

import dc.entidade.framework.AbstractMultiEmpresaModel;
import dc.entidade.framework.ComboCode;
import dc.entidade.framework.ComboValue;

@Entity
@Table(name = "PLANO_CONTA_REF_SPED")
@XmlRootElement
@Indexed
@Analyzer(impl = BrazilianAnalyzer.class)
public class PlanoContaRefSped extends AbstractMultiEmpresaModel<Integer> implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "ID")
	@Analyzer(definition = "dc_combo_analyzer")
	@ComboCode
	private Integer id;
	@Column(name = "COD_CTA_REF")
	@Analyzer(definition = "dc_combo_analyzer")
	private String codCtaRef;
	@Column(name = "DESCRICAO")
	@Analyzer(definition = "dc_combo_analyzer")
	@ComboValue
	private String descricao;
	@Column(name = "ORIENTACOES")
	@Analyzer(definition = "dc_combo_analyzer")
	private String orientacoes;
	@Temporal(TemporalType.DATE)
	@Column(name = "INICIO_VALIDADE")
	@Analyzer(definition = "dc_combo_analyzer")
	private Date inicioValidade;
	@Temporal(TemporalType.DATE)
	@Column(name = "FIM_VALIDADE")
	@Analyzer(definition = "dc_combo_analyzer")
	private Date fimValidade;
	@Column(name = "TIPO")
	@Analyzer(definition = "dc_combo_analyzer")
	private String tipo;

	public PlanoContaRefSped() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodCtaRef() {
		return codCtaRef;
	}

	public void setCodCtaRef(String codCtaRef) {
		this.codCtaRef = codCtaRef;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getOrientacoes() {
		return orientacoes;
	}

	public void setOrientacoes(String orientacoes) {
		this.orientacoes = orientacoes;
	}

	public Date getInicioValidade() {
		return inicioValidade;
	}

	public void setInicioValidade(Date inicioValidade) {
		this.inicioValidade = inicioValidade;
	}

	public Date getFimValidade() {
		return fimValidade;
	}

	public void setFimValidade(Date fimValidade) {
		this.fimValidade = fimValidade;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "PlanoContaRefSpedVO[id=" + id + "]";
	}

}

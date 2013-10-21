package dc.entidade.contabilidade.cadastro;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.lucene.analysis.br.BrazilianAnalyzer;
import org.hibernate.search.annotations.Analyzer;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;

import dc.anotacoes.Caption;
import dc.entidade.framework.AbstractMultiEmpresaModel;
import dc.entidade.framework.ComboCode;
import dc.entidade.framework.ComboValue;

/**
 * 
 * @author Gutemberg A. Da Silva
 * 
 */

@Entity
@Table(name = "contabil_indice_valor")
@XmlRootElement
@Indexed
@Analyzer(impl = BrazilianAnalyzer.class)
public class IndiceValorEntity extends AbstractMultiEmpresaModel<Integer>
		implements Serializable {

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contabil_indice_valor_id_seq")
	@SequenceGenerator(name = "contabil_indice_valor_id_seq", sequenceName = "contabil_indice_valor_id_seq", allocationSize = 1, initialValue = 0)
	@Basic(optional = false)
	@ComboCode
	@Analyzer(definition = "dc_combo_analyzer")
	private Integer id;

	@Field
	@Column(name = "data_indice")
	@ComboValue
	@Analyzer(definition = "dc_combo_analyzer")
	@Caption(value = "Data do índice")
	private Date dataIndice;

	@Field
	@Column(name = "valor")
	@ComboValue
	@Analyzer(definition = "dc_combo_analyzer")
	@Caption(value = "Valor")
	private Double valor = new Double(0.0);

	/**
	 * REFERENCIA - FK
	 */

	// id_empresa integer,

	// id_contabil_indice integer NOT NULL,

	@ManyToOne
	@JoinColumn(name = "id_contabil_indice", nullable = false)
	@Caption("Índice")
	@javax.validation.constraints.NotNull(message = "Não pode estar vazio.")
	private IndiceEntity indice;

	/**
	 * REFERENCIA - LIST
	 */

	/**
	 * CONSTRUTOR
	 */

	public IndiceValorEntity() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * GETS AND SETS
	 */

	@Override
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataIndice() {
		return dataIndice;
	}

	public void setDataIndice(Date dataIndice) {
		this.dataIndice = dataIndice;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = (valor == null ? new Double(0.0) : valor);
		;
	}

	public IndiceEntity getIndice() {
		return indice;
	}

	public void setIndice(IndiceEntity indice) {
		this.indice = indice;
	}

	/**
	 * TO STRING
	 */

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
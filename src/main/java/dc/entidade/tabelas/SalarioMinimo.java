package dc.entidade.tabelas;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.lucene.analysis.br.BrazilianAnalyzer;
import org.hibernate.search.annotations.Analyzer;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;

import dc.anotacoes.Caption;
import dc.entidade.framework.AbstractModel;
import dc.entidade.framework.ComboCode;
import dc.entidade.framework.ComboValue;


/**
 * 
 * @author Wesley Jr /*
 */

@Entity
@Table(name = "salario_minimo")
@XmlRootElement
@Indexed
@Analyzer(impl = BrazilianAnalyzer.class)
public class SalarioMinimo extends AbstractModel<Integer> implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "salario_minimo_id_seq")
	@SequenceGenerator(name = "salario_minimo_id_seq", sequenceName = "salario_minimo_id_seq", allocationSize = 1)
	@ComboCode
	@Analyzer(definition = "dc_combo_analyzer")
	private Integer id;

	@Field
	@Caption("Vigencia")
	@Column(name = "VIGENCIA")
	@ComboValue
	@Analyzer(definition = "dc_combo_analyzer")
	private Date vigencia;
	
	@Field
	@Caption("Valor Mensal")
	@ComboValue
	@Analyzer(definition = "dc_combo_analyzer")
	@Column(name = "VALOR_MENSAL", precision = 18, scale = 6)
	private BigDecimal valorMensal;
	
	@Field
	@Caption("Valor Diario")
	@ComboValue
	@Analyzer(definition = "dc_combo_analyzer")
	@Column(name = "VALOR_DIARIO", precision = 18, scale = 6)
	private BigDecimal valorDiario;
	
	@Field
	@Caption("Valor Hora")
	@ComboValue
	@Analyzer(definition = "dc_combo_analyzer")
	@Column(name = "VALOR_HORA", precision = 18, scale = 6)
	private BigDecimal valorHora;
	
	@Field
	@Caption("Norma Legal")
	@Column(name = "NORMA_LEGAL", length = 100)
	@ComboValue
	@Analyzer(definition = "dc_combo_analyzer")
	private String normaLegal;
	
	@Column(name = "DOU")
	@ComboValue
	@Analyzer(definition = "dc_combo_analyzer")
	private Date dou;
	
	@Column(name = "ID_EMPRESA")
	private Integer idEmpresa;
	
	public SalarioMinimo() {

	}

	public SalarioMinimo(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getVigencia() {
		return vigencia;
	}

	public void setVigencia(Date vigencia) {
		this.vigencia = vigencia;
	}

	public BigDecimal getValorMensal() {
		return valorMensal;
	}

	public void setValorMensal(BigDecimal valorMensal) {
		this.valorMensal = valorMensal;
	}

	public BigDecimal getValorDiario() {
		return valorDiario;
	}

	public void setValorDiario(BigDecimal valorDiario) {
		this.valorDiario = valorDiario;
	}

	public BigDecimal getValorHora() {
		return valorHora;
	}

	public void setValorHora(BigDecimal valorHora) {
		this.valorHora = valorHora;
	}

	public String getNormaLegal() {
		return normaLegal;
	}

	public void setNormaLegal(String normaLegal) {
		this.normaLegal = normaLegal;
	}

	public Date getDou() {
		return dou;
	}

	public void setDou(Date dou) {
		this.dou = dou;
	}
	
	public Integer getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
}

package dc.entidade.folhapagamento.cadastro;

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
import dc.entidade.diversos.OperadoraPlanoSaude;
import dc.entidade.framework.AbstractModel;
import dc.entidade.pessoal.Colaborador;

/**
 * 
 * @author Gutemberg A. Da Silva
 * 
 */

@Entity
@Table(name = "folha_plano_saude")
@XmlRootElement
@Indexed
@Analyzer(impl = BrazilianAnalyzer.class)
public class PlanoSaudeEntity extends AbstractModel<Integer> implements
		Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "folha_plano_saude_id_seq")
	@SequenceGenerator(name = "folha_plano_saude_id_seq", sequenceName = "folha_plano_saude_id_seq", allocationSize = 1, initialValue = 0)
	@Basic(optional = false)
	private Integer id;

	@Column(name = "data_inicio")
	@Field
	@Caption("Data início")
	private Date dataInicio;

	@Column(name = "beneficiario")
	@Field
	@Caption("Beneficiário")
	private String beneficiario = "";

	/**
	 * REFERENCIA - FK
	 */

	/*
	 * id_operadora_plano_saude integer NOT NULL, id_colaborador integer NOT
	 * NULL,
	 */

	@ManyToOne
	@JoinColumn(name = "id_colaborador", nullable = false)
	@Caption("Colaborador")
	@javax.validation.constraints.NotNull(message = "Não pode estar vazio.")
	private Colaborador colaborador;

	@ManyToOne
	@JoinColumn(name = "id_operadora_plano_saude", nullable = false)
	@Caption("Operadora do plano de saúde")
	@javax.validation.constraints.NotNull(message = "Não pode estar vazio.")
	private OperadoraPlanoSaude operadoraPlanoSaude;

	/**
	 * REFERENCIA - LIST
	 */

	/**
	 * CONSTRUTOR
	 */

	public PlanoSaudeEntity() {
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

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getBeneficiario() {
		return beneficiario;
	}

	public void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
	}

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public OperadoraPlanoSaude getOperadoraPlanoSaude() {
		return operadoraPlanoSaude;
	}

	public void setOperadoraPlanoSaude(OperadoraPlanoSaude operadoraPlanoSaude) {
		this.operadoraPlanoSaude = operadoraPlanoSaude;
	}

	/**
	 * TO STRING
	 */

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
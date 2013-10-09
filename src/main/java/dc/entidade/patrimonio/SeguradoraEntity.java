package dc.entidade.patrimonio;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.lucene.analysis.br.BrazilianAnalyzer;
import org.hibernate.search.annotations.Analyzer;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;

import dc.anotacoes.Caption;
import dc.entidade.framework.AbstractMultiEmpresaModel;

/**
 * 
 * @author Gutemberg A. Da Silva
 * 
 */

@Entity
@Table(name = "seguradora")
@XmlRootElement
@Indexed
@Analyzer(impl = BrazilianAnalyzer.class)
public class SeguradoraEntity extends AbstractMultiEmpresaModel<Integer>
		implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seguradora_id_seq")
	@SequenceGenerator(name = "seguradora_id_seq", sequenceName = "seguradora_id_seq", allocationSize = 1, initialValue = 0)
	@Basic(optional = false)
	private Integer id;

	@Column(name = "nome")
	@Field
	@Caption("Nome")
	@Size(max = 50, message = "Tamanho inválido.")
	private String nome = "";

	@Column(name = "contato")
	@Field
	@Caption("Contato")
	@Size(max = 50, message = "Tamanho inválido.")
	private String contato = "";

	@Column(name = "telefone")
	@Field
	@Caption("Telefone")
	@Size(max = 14, message = "Tamanho inválido.")
	private String telefone = "";

	/**
	 * REFERENCIA - FK
	 */

	// @ManyToOne
	// @JoinColumn(name = "ID_EMPRESA", nullable = false)
	// @Caption("Empresa")
	// @javax.validation.constraints.NotNull(message = "Não pode estar vazio.")
	// private Empresa empresa;

	/**
	 * REFERENCIA - LIST
	 */

	@OneToMany(mappedBy = "seguradora", fetch = FetchType.LAZY)
	private List<ApoliceSeguroEntity> apoliceSeguroList;

	/**
	 * CONSTRUTOR
	 */

	public SeguradoraEntity() {

	}

	public SeguradoraEntity(Integer id) {
		this.id = id;
	}

	public SeguradoraEntity(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	/**
	 * GETS E SETS
	 */

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = (nome == null ? "" : nome.toUpperCase());
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = (contato == null ? "" : contato.toUpperCase());
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = (telefone == null ? "" : telefone.toUpperCase());
	}

	// public Empresa getEmpresa() {
	// return empresa;
	// }
	//
	// public void setEmpresa(Empresa empresa) {
	// this.empresa = empresa;
	// }

	public List<ApoliceSeguroEntity> getApoliceSeguroList() {
		return apoliceSeguroList;
	}

	public void setApoliceSeguroList(List<ApoliceSeguroEntity> apoliceSeguroList) {
		this.apoliceSeguroList = apoliceSeguroList;
	}

	// /**
	// * HASH E EQUALS
	// */
	//
	// @Override
	// public int hashCode() {
	// return HashCodeBuilder.reflectionHashCode(this, new String[] { "id" });
	// }
	//
	// @Override
	// public boolean equals(Object object) {
	// if (object instanceof SeguradoraEntity == false)
	// return false;
	//
	// if (this == object)
	// return true;
	//
	// final SeguradoraEntity other = (SeguradoraEntity) object;
	//
	// return EqualsBuilder.reflectionEquals(this, other);
	// }

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
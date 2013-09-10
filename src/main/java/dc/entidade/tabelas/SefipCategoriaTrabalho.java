package dc.entidade.tabelas;

import java.io.Serializable;

import javax.persistence.Basic;
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



/**
*
* @author Wesley Jr
*/

@Entity
@Table(name = "sefip_categoria_trabalho")
@XmlRootElement
@Indexed
@Analyzer(impl=BrazilianAnalyzer.class)
public class SefipCategoriaTrabalho extends AbstractModel<Integer> implements Serializable {
	
    private static final long serialVersionUID = 1L;
    
    @Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sefip_categoria_trabalho_id_seq")
	@SequenceGenerator(name = "sefip_categoria_trabalho_id_seq", sequenceName = "sefip_categoria_trabalho_id_seq", allocationSize = 1, initialValue = 0)
	@Basic(optional = false)
	private Integer id;
    
    @Field
    @Caption("Codigo")
    @Column(name = "Codigo")
    private Integer codigo;
    
    @Field
    @Caption("Nome")
    @Column(name = "NOME")
    private String nome;
    
    public SefipCategoriaTrabalho() {
    }

    public SefipCategoriaTrabalho(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

    @Override
    public String toString() {
    	return ToStringBuilder.reflectionToString(this);
    }

}

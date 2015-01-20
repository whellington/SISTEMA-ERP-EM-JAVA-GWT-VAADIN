package dc.entidade.geral.outro;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.lucene.analysis.br.BrazilianAnalyzer;
import org.hibernate.annotations.Type;
import org.hibernate.search.annotations.Analyzer;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;

import dc.anotacoes.Caption;
import dc.entidade.framework.AbstractMultiEmpresaModel;
import dc.entidade.framework.ComboCode;
import dc.entidade.framework.ComboValue;
import dc.entidade.geral.pessoal.PessoaEntity;

@Entity
@Table(name = "convenio")
@XmlRootElement
@Indexed
@Analyzer(impl = BrazilianAnalyzer.class)
public class ConvenioEntity extends AbstractMultiEmpresaModel<Integer>
		implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "convenio_id_seq")
	@SequenceGenerator(name = "convenio_id_seq", sequenceName = "convenio_id_seq", allocationSize = 1, initialValue = 0)
	@Basic(optional = false)
	@ComboCode
	@Analyzer(definition = "dc_combo_analyzer")
	private Integer id;

	@Field
	@Caption("Desconto")
	@Column(name = "DESCONTO", precision = 11, scale = 2)
	@ComboValue
	@Analyzer(definition = "dc_combo_analyzer")
	private Double desconto;

	@Temporal(TemporalType.DATE)
	@Field
	@Caption("Data do vencimento")
	@Column(name = "DATA_VENCIMENTO")
	@ComboValue
	@Analyzer(definition = "dc_combo_analyzer")
	private Date dataVencimento;

	@Field
	@Caption("Logradouro")
	@Column(name = "LOGRADOURO", length = 100)
	@ComboValue
	@Analyzer(definition = "dc_combo_analyzer")
	private String logradouro;

	@Field
	@Caption("Número")
	@Column(name = "NUMERO", length = 10)
	private String numero;

	@Field
	@Caption("Bairro")
	@Column(name = "BAIRRO", length = 60)
	@ComboValue
	@Analyzer(definition = "dc_combo_analyzer")
	private String bairro;

	@Field
	@Caption("Município IBGE")
	@Column(name = "MUNICIPIO_IBGE")
	@ComboCode
	@Analyzer(definition = "dc_combo_analyzer")
	private Integer municipioIbge;

	@Field
	@Caption("Uf")
	@Column(name = "UF")
	@ComboValue
	@Analyzer(definition = "dc_combo_analyzer")
	private String uf;

	@Field
	@Caption("Contato")
	@Column(name = "CONTATO", length = 30)
	@ComboValue
	@Analyzer(definition = "dc_combo_analyzer")
	private String contato;

	@Field
	@Caption("Telefone")
	@Column(name = "TELEFONE", length = 14)
	@ComboValue
	@Analyzer(definition = "dc_combo_analyzer")
	private String telefone;

	@Temporal(TemporalType.DATE)
	@Field
	@Caption("Data de cadastro")
	@Column(name = "DATA_CADASTRO")
	@ComboValue
	@Analyzer(definition = "dc_combo_analyzer")
	private Date dataCadastro;

	@Lob
	@Type(type = "text")
	@Field
	@Caption("Descrição")
	@Column(name = "DESCRICAO", length = 65535)
	@ComboValue
	@Analyzer(definition = "dc_combo_analyzer")
	private String descricao;

	@Field
	@Caption("CEP")
	@Column(name = "CEP", length = 8)
	@ComboValue
	@Analyzer(definition = "dc_combo_analyzer")
	private String cep;

	@Field
	@Caption("Nome")
	@Column(name = "NOME", length = 150)
	@ComboValue
	@Analyzer(definition = "dc_combo_analyzer")
	private String nome;

	@Field
	@Caption("CNPJ")
	@Column(name = "CNPJ", length = 100)
	@ComboValue
	@Analyzer(definition = "dc_combo_analyzer")
	private String cnpj;

	@Field
	@Caption("Site")
	@Column(name = "SITE", length = 150)
	@ComboValue
	@Analyzer(definition = "dc_combo_analyzer")
	private String site;

	@Field
	@Caption("Email")
	@Column(name = "EMAIL", length = 150)
	@ComboValue
	@Analyzer(definition = "dc_combo_analyzer")
	private String email;

	/**
	 * REFERENCIA - FK
	 */

	@Caption("Pessoa")
	@ManyToOne
	@JoinColumn(name = "id_pessoa")
	private PessoaEntity pessoa;

	/**
	 * REFERENCIA - LIST
	 */

	/*
	 * Mapeamento Empresa-Convenio
	 */
	// @ManyToOne(fetch = FetchType.EAGER)
	// @JoinColumn(name = "ID_EMPRESA", insertable = true, updatable = true)
	// @Fetch(FetchMode.JOIN)
	// private EmpresaEntity idEmpresa;

	/**
	 * TRANSIENT
	 */

	/**
	 * CONSTRUTOR
	 */

	public ConvenioEntity() {

	}

	public ConvenioEntity(Integer id) {
		this.id = id;
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

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Integer getMunicipioIbge() {
		return municipioIbge;
	}

	public void setMunicipioIbge(Integer municipioIbge) {
		this.municipioIbge = municipioIbge;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public PessoaEntity getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaEntity pessoa) {
		this.pessoa = pessoa;
	}

	/**
	 * TO STRING
	 */

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
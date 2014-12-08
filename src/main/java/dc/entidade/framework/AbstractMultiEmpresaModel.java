package dc.entidade.framework;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.Version;

import org.apache.solr.analysis.ASCIIFoldingFilterFactory;
import org.apache.solr.analysis.LowerCaseFilterFactory;
import org.apache.solr.analysis.StandardTokenizerFactory;
import org.hibernate.search.annotations.Analyzer;
import org.hibernate.search.annotations.AnalyzerDef;
import org.hibernate.search.annotations.IndexedEmbedded;
import org.hibernate.search.annotations.TokenFilterDef;
import org.hibernate.search.annotations.TokenizerDef;

@SuppressWarnings("serial")
@MappedSuperclass
@AnalyzerDef(name = "id_empresa_analyzer", tokenizer = @TokenizerDef(factory = StandardTokenizerFactory.class), filters = {
		@TokenFilterDef(factory = ASCIIFoldingFilterFactory.class),
		@TokenFilterDef(factory = LowerCaseFilterFactory.class) })
public abstract class AbstractMultiEmpresaModel<ID extends Serializable>
		extends AbstractModel<ID> {

	@OneToOne()
	@JoinColumn(name = "id_empresa")
	@Analyzer(definition = "id_empresa_analyzer")
	@IndexedEmbedded
	private EmpresaEntity empresa;

	@Version
	@Column(name = "versao")
	protected Integer versao;

	public EmpresaEntity getEmpresa() {
		return empresa;
	}

	public void setEmpresa(EmpresaEntity empresa2) {
		this.empresa = empresa2;
	}

	public Integer getVersao() {
		return versao;
	}

	public void setVersao(Integer versao) {
		this.versao = versao;
	}

}
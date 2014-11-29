package dc.servicos.dao.pessoal;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dc.entidade.pessoal.SituacaoColaboradorEntity;
import dc.servicos.dao.framework.geral.AbstractCrudDAO;

@Repository("pessoalSituacaoColaboradorDAO")
public class SituacaoColaboradorDAO extends
		AbstractCrudDAO<SituacaoColaboradorEntity> {

	@Override
	public Class<SituacaoColaboradorEntity> getEntityClass() {
		return SituacaoColaboradorEntity.class;
	}

	@Transactional
	public List<SituacaoColaboradorEntity> listaTodos() {
		return getSession().createQuery("from SituacaoColaborador").list();
	}

	@Transactional
	public List<SituacaoColaboradorEntity> procuraNomeContendo(String query) {
		return getSession()
				.createQuery("from SituacaoColaborador where nome like :q")
				.setParameter("q", "%" + query + "%").list();
	}

	protected String[] getDefaultSearchFields() {
		return new String[] { "codigo", "nome", "descricao" };
	}

	@Transactional
	public List<SituacaoColaboradorEntity> query(String q) {
		q = "%" + q.toLowerCase() + "%";

		return getSession()
				.createQuery(
						"from SituacaoColaborador where lower(nome) like :q")
				.setParameter("q", q).list();
	}

}
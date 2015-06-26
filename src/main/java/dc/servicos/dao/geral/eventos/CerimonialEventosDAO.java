package dc.servicos.dao.geral.eventos;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dc.entidade.geral.eventos.CerimonialEventosEntity;
import dc.servicos.dao.framework.geral.AbstractCrudDAO;

@Repository("cerimonialEventosDAO")
public class CerimonialEventosDAO extends AbstractCrudDAO<CerimonialEventosEntity> {

	@Override
	public Class<CerimonialEventosEntity> getEntityClass() {
		return CerimonialEventosEntity.class;
	}

	@Transactional
	public List<CerimonialEventosEntity> listaTodos() {
		return getSession().createQuery("from CerimonialEventos").list();
	}

	@Transactional
	public List<CerimonialEventosEntity> procuraNomeContendo(String query) {
		return getSession()
				.createQuery("from CerimonialEventosEntity where nome like :q")
				.setParameter("q", "%" + query + "%").list();
	}

	protected String[] getDefaultSearchFields() {
		return new String[] { "nome", "cnpj" };
	}

}

package dc.servicos.dao.ponto;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dc.entidade.ponto.PontoBancoHoras;
import dc.servicos.dao.framework.geral.AbstractCrudDAO;

@Repository
@SuppressWarnings("unchecked")
public class PontoBancoHorasDAO extends AbstractCrudDAO<PontoBancoHoras> {

	@Override
	protected Class<PontoBancoHoras> getEntityClass() {
		return PontoBancoHoras.class;
	}

	@Transactional
	public List<PontoBancoHoras> listaTodos() {
		return getSession().createQuery("from PontoBancoHoras").list();
	}

	@Override
	protected String[] getDefaultSearchFields() {

		return new String[] { "" };
	}

}

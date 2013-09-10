package dc.servicos.dao.empresa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dc.entidade.empresa.TransporteItinerarioEntity;
import dc.servicos.dao.framework.geral.AbstractCrudDAO;

@Repository
@SuppressWarnings("unchecked")
public class TransporteItinerarioDAO extends
		AbstractCrudDAO<TransporteItinerarioEntity> {

	@Override
	protected Class<TransporteItinerarioEntity> getEntityClass() {
		return TransporteItinerarioEntity.class;
	}

	/*
	 * @Transactional public List<AgenciaBanco> listAgencias(Banco banco) {
	 * return
	 * getSession().createQuery("from AgenciaBanco where banco.id = :bid")
	 * .setParameter("bid", banco.getId()).list(); }
	 */

	@Transactional
	public List<TransporteItinerarioEntity> listarTodos() {
		try {
			String sql = "FROM TransporteItinerarioEntity ent WHERE (1 = 1)";

			List<TransporteItinerarioEntity> auxLista = super.getSession()
					.createQuery(sql).list();

			return auxLista;
		} catch (Exception e) {
			return new ArrayList<TransporteItinerarioEntity>();
		}
	}

	@Transactional
	public List<TransporteItinerarioEntity> procuraNomeContendo(String query) {
		try {
			String sql = "FROM TransporteItinerarioEntity ent WHERE (1 = 1) AND ent.nome LIKE :q";

			List<TransporteItinerarioEntity> auxLista = super.getSession()
					.createQuery(sql).setParameter("q", "%" + query + "%")
					.list();

			return auxLista;
		} catch (Exception e) {
			return new ArrayList<TransporteItinerarioEntity>();
		}
	}

	protected String[] getDefaultSearchFields() {
		return new String[] { "Número", "Bem", "Seguradora" };
	}

}
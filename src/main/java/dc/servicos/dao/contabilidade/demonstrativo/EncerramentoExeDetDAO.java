package dc.servicos.dao.contabilidade.demonstrativo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dc.entidade.contabilidade.demonstrativo.EncerramentoExeDetEntity;
import dc.servicos.dao.framework.geral.AbstractCrudDAO;

/**
 * 
 * @author Gutemberg A. Da Silva
 * 
 */

@Repository
@SuppressWarnings("unchecked")
public class EncerramentoExeDetDAO extends
		AbstractCrudDAO<EncerramentoExeDetEntity> {

	@Override
	public Class<EncerramentoExeDetEntity> getEntityClass() {
		return EncerramentoExeDetEntity.class;
	}

	@Transactional
	public List<EncerramentoExeDetEntity> listarTodos() {
		try {
			String sql = "FROM EncerramentoExeDetEntity ent WHERE (1 = 1)";

			List<EncerramentoExeDetEntity> auxLista = super.getSession()
					.createQuery(sql).list();

			return auxLista;
		} catch (Exception e) {
			return new ArrayList<EncerramentoExeDetEntity>();
		}
	}

	@Transactional
	public List<EncerramentoExeDetEntity> procuraNomeContendo(String query) {
		try {
			String sql = "FROM EncerramentoExeDetEntity ent WHERE (1 = 1) AND ent.competencia LIKE :q";

			List<EncerramentoExeDetEntity> auxLista = super.getSession()
					.createQuery(sql).setParameter("q", "%" + query + "%")
					.list();

			return auxLista;
		} catch (Exception e) {
			return new ArrayList<EncerramentoExeDetEntity>();
		}
	}

	protected String[] getDefaultSearchFields() {
		return new String[] { "Competência" };
	}

}
package dc.servicos.dao.nfe;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dc.entidade.nfe.NfeCabecalhoEntity;
import dc.entidade.nfe.NfeDetEspecificoArmamentoEntity;
import dc.entidade.nfe.NfeDetEspecificoMedicamentoEntity;
import dc.entidade.nfe.NfeDetalheEntity;
import dc.servicos.dao.framework.geral.AbstractCrudDAO;

/**
 * 
 * @author Gutemberg A. Da Silva
 * 
 */

@Repository
@SuppressWarnings("unchecked")
public class NfeDetalheDAO extends AbstractCrudDAO<NfeDetalheEntity> {

	/**
	 * DAOS
	 */

	@Autowired
	private NfeDetEspecificoMedicamentoDAO ndeMedicamentoDAO;

	@Autowired
	private NfeDetEspecificoArmamentoDAO ndeArmamentoDAO;

	/**
	 * 
	 */

	@Override
	public Class<NfeDetalheEntity> getEntityClass() {
		return NfeDetalheEntity.class;
	}

	@Transactional
	public List<NfeDetalheEntity> listarTodos() {
		try {
			String sql = "FROM :entity ent WHERE (1 = 1)";
			sql = sql.replace(":entity", getEntityClass().getName());

			Query query = super.getSession().createQuery(sql);

			List<NfeDetalheEntity> auxLista = query.list();

			return auxLista;
		} catch (Exception e) {
			return new ArrayList<NfeDetalheEntity>();
		}
	}

	@Transactional
	public List<NfeDetalheEntity> procuraNomeContendo(String s) {
		try {
			String sql = "FROM :entity ent WHERE (1 = 1) AND ent.servico.nome LIKE :q";
			sql = sql.replace(":entity", getEntityClass().getName());

			Query query = super.getSession().createQuery(sql);
			query.setParameter("q", "%" + s + "%");

			List<NfeDetalheEntity> auxLista = query.list();

			return auxLista;
		} catch (Exception e) {
			return new ArrayList<NfeDetalheEntity>();
		}
	}

	@Transactional
	public NfeDetalheEntity getEntidade(Serializable itemId) {
		try {
			String sql = "FROM :entity ent WHERE (1 = 1) AND ent.nfeDetalhe.id = :itemId";
			sql = sql.replace(":entity", getEntityClass().getName());

			Query query = super.getSession().createQuery(sql);
			query.setParameter("itemId", itemId);

			NfeDetalheEntity entidade = (NfeDetalheEntity) query.uniqueResult();

			return entidade;
		} catch (Exception e) {
			return new NfeDetalheEntity();
		}
	}

	@Transactional
	public List<NfeDetalheEntity> getLista(NfeCabecalhoEntity ent) {
		try {
			String sql = "SELECT ent FROM :entity ent INNER JOIN ent.nfeCabecalho"
					+ " WHERE (1 = 1) AND ent.nfeCabecalho = :ent";
			sql = sql.replace(":entity", getEntityClass().getName());

			Query query = super.getSession().createQuery(sql);
			query.setParameter("ent", ent);

			List<NfeDetalheEntity> auxLista = query.list();

			// MEDICAMENTO / ARMAMENTO

			for (NfeDetalheEntity ent1 : auxLista) {
				List<NfeDetEspecificoMedicamentoEntity> auxLista1 = this.ndeMedicamentoDAO
						.getLista(ent1);
				List<NfeDetEspecificoArmamentoEntity> auxLista2 = this.ndeArmamentoDAO
						.getLista(ent1);

				ent1.setNdeMedicamentoList(auxLista1);
				ent1.setNdeArmamentoList(auxLista2);
			}

			return auxLista;
		} catch (Exception e) {
			e.printStackTrace();

			return new ArrayList<NfeDetalheEntity>();
		}
	}

	protected String[] getDefaultSearchFields() {
		return new String[] { "Número do item", "Código do produto", "GTIN" };
	}

}
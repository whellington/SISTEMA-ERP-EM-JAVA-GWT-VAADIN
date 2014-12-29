package dc.model.dao.geral.diverso;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sun.istack.logging.Logger;

import dc.entidade.geral.diverso.MunicipioEntity;
import dc.servicos.dao.framework.geral.AbstractCrudDAO;

@Repository
public class MunicipioDAOImpl extends AbstractCrudDAO<MunicipioEntity>
		implements MunicipioDAO<MunicipioEntity> {

	private static Logger logger = Logger.getLogger(MunicipioDAOImpl.class);

	@Override
	public Class<MunicipioEntity> getEntityClass() {
		return MunicipioEntity.class;
	}

	public List<MunicipioEntity> listaTodos() {
		try {
			String sql = "FROM # ent WHERE (1 = 1)";
			sql = sql.replace("#", this.getEntityClass().getName());
			// sql = sql.replace("-", this.getEntityClass().getSimpleName()
			// + "(ent.id, ent.nome, ent.sigla)");

			return getSession().createQuery(sql).list();
		} catch (Exception e) {
			e.printStackTrace();

			throw e;
		}
	}

	public List<MunicipioEntity> procuraNomeContendo(String query) {
		try {
			String sql = "FROM # ent WHERE (1 = 1) AND ent.nome LIKE :q";
			sql = sql.replace("#", this.getEntityClass().getName());

			return getSession().createQuery(sql)
					.setParameter("q", "%" + query + "%").list();
		} catch (Exception e) {
			e.printStackTrace();

			throw e;
		}
	}

	public List<MunicipioEntity> query(String q) {
		try {
			String sql = "FROM # ent WHERE (1 = 1) AND LOWER(nome) LIKE :q";
			sql = sql.replace("#", getEntityClass().getName());

			q = "%" + q.toLowerCase() + "%";

			return getSession().createQuery(sql).setParameter("q", q).list();
		} catch (Exception e) {
			e.printStackTrace();

			throw e;
		}
	}

	public String[] getDefaultSearchFields() {
		return new String[] { "nome", "sigla" };
	}

}
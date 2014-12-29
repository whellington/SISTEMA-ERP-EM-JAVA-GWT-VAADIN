package dc.servicos.dao.ordemservico;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dc.entidade.ordemservico.MarcaOsEntity;
import dc.servicos.dao.framework.geral.AbstractCrudDAO;

@Repository
@SuppressWarnings("unchecked")
public class MarcaDAO extends AbstractCrudDAO<MarcaOsEntity>{

	@Override
	public Class<MarcaOsEntity> getEntityClass() {
		return MarcaOsEntity.class;
	}

	protected String[] getDefaultSearchFields() {
		return new String[] {"nome"};
	}
	
	@Transactional
	public List<MarcaOsEntity> listaTodos() {
		return getSession().createQuery("from MarcaOsEntity").list();
	}
}



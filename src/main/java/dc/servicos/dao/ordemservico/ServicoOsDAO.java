package dc.servicos.dao.ordemservico;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dc.entidade.ordemservico.ServicoOsEntity;
import dc.servicos.dao.framework.geral.AbstractCrudDAO;

@Repository
@SuppressWarnings("unchecked")
public class ServicoOsDAO extends AbstractCrudDAO<ServicoOsEntity> {


	@Override
	public Class<ServicoOsEntity> getEntityClass() {
		return ServicoOsEntity.class;
	}

	protected String[] getDefaultSearchFields() {
		return new String[] {"descricao"};
	}
	
	@Transactional
	public List<ServicoOsEntity> listaTodos() {
		return getSession().createQuery("from ServicoOsEntity").list();
	}
}

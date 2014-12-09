package dc.servicos.dao.tributario;

import org.springframework.stereotype.Repository;
import dc.entidade.tributario.ConfiguracaoTributariaEntity;
import dc.servicos.dao.framework.geral.AbstractCrudDAO;

@Repository
//@SuppressWarnings("unchecked")
public class ConfiguracaoTributariaDAO extends AbstractCrudDAO<ConfiguracaoTributariaEntity> {

	@Override
	public Class<ConfiguracaoTributariaEntity> getEntityClass() {
		return ConfiguracaoTributariaEntity.class;
	}

	protected String[] getDefaultSearchFields() {
		return new String[] {"empresa"};
	}


}
 

package dc.servicos.dao.suprimentos.contrato;

import org.springframework.stereotype.Repository;

import dc.entidade.suprimentos.contrato.TipoContratoEntity;
import dc.servicos.dao.framework.geral.AbstractCrudDAO;

@Repository("suprimentosContratoTipoContratoDAO")
public class TipoContratoDAO extends AbstractCrudDAO<TipoContratoEntity> {

	@Override
	public Class<TipoContratoEntity> getEntityClass() {
		return TipoContratoEntity.class;
	}

	@Override
	protected String[] getDefaultSearchFields() {
		return new String[] { "nome", "descricao" };
	}

}
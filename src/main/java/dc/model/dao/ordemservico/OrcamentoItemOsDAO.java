package dc.model.dao.ordemservico;

import java.util.List;

import dc.entidade.ordemservico.OrcamentoOsEntity;
import dc.entidade.ordemservico.OrcamentoOsItemEntity;
import dc.model.dao.AbstractDAO;

/**
 * 
 * @author Paulo Sérgio Ferreira
 * 
 */
public interface OrcamentoItemOsDAO<T> extends AbstractDAO<T> {

	List<OrcamentoOsItemEntity> findByOrcamentoOs(OrcamentoOsEntity orcamentoOs);

}
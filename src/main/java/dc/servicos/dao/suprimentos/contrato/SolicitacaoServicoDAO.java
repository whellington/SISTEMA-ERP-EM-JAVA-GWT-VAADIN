package dc.servicos.dao.suprimentos.contrato;

import org.springframework.stereotype.Repository;

import dc.entidade.suprimentos.contrato.SolicitacaoServicoEntity;
import dc.servicos.dao.framework.geral.AbstractCrudDAO;

@Repository("suprimentosContratoSolicitacaoServicoDAO")
public class SolicitacaoServicoDAO extends
		AbstractCrudDAO<SolicitacaoServicoEntity> {

	@Override
	public Class<SolicitacaoServicoEntity> getEntityClass() {
		return SolicitacaoServicoEntity.class;
	}

	@Override
	protected String[] getDefaultSearchFields() {

		return new String[] {"fornecedor","cliente","setor","colaborador","dataSolicitacao", "urgente", "descricao", "statusSolicitacao" };
	}

}
package dc.servicos.dao.suprimentos.compra;

import org.springframework.stereotype.Repository;

import dc.entidade.suprimentos.compra.TipoPedidoEntity;
import dc.servicos.dao.framework.geral.AbstractCrudDAO;

/**
 * 
 * @author Alberto Anderick Jr Nessa classe temos a Extensão a classe principal
 *         abstractCrudDao e dela herdamos alguns métodos, fazemos uma Conexão
 *         com o Banco, uma listagem E aqui herdamos também o Método do
 *         pesquisar, onde nela colocamos os campos que colocamos as anotações
 *         lá no TO (ENTIDADE), que vai ser pesquisado na Tela quando rodar o
 *         projeto.
 * 
 */
@Repository
public class TipoPedidoDAO extends AbstractCrudDAO<TipoPedidoEntity> {

	@Override
	public Class<TipoPedidoEntity> getEntityClass() {
		return TipoPedidoEntity.class;
	}

	protected String[] getDefaultSearchFields() {
		return new String[] { "codigo", "descricao", "nome" };
	}

}
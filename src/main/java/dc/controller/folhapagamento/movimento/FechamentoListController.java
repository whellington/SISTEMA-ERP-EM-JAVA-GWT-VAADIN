package dc.controller.folhapagamento.movimento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import dc.entidade.folhapagamento.movimento.FechamentoEntity;
import dc.servicos.dao.folhapagamento.movimento.FechamentoDAO;
import dc.visao.framework.geral.CRUDFormController;
import dc.visao.framework.geral.CRUDListController;

/**
 * 
 * @author Gutemberg A. Da Silva
 * 
 */

@Controller
@Scope("prototype")
public class FechamentoListController extends
		CRUDListController<FechamentoEntity> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * DAO'S
	 */

	@Autowired
	private FechamentoDAO pDAO;

	/**
	 * CONTROLLER'S
	 */

	@Autowired
	private FechamentoFormController pController;

	@Override
	protected String[] getColunas() {
		return new String[] { "fechamentoAtual", "proximoFechamento" };
	}

	@Override
	protected Class<? super FechamentoEntity> getEntityClass() {
		return FechamentoEntity.class;
	}

	@Override
	protected String getTitulo() {
		return "Fechamento";
	}

	@Override
	protected List<FechamentoEntity> pesquisa(String valor) {
		List<FechamentoEntity> auxLista = this.pDAO.procuraNomeContendo(valor);

		return auxLista;
	}

	@Override
	protected CRUDFormController<FechamentoEntity> getFormController() {
		return this.pController;
	}

	// Identificador da VIEW, para posterior uso nas urls de navegacao
	@Override
	public String getViewIdentifier() {
		return "folhapagamento_movimento_fechamento_lc";
	}

	@Override
	protected boolean deletaEmCascata() {
		return false;
	}

	@Override
	protected List<FechamentoEntity> pesquisaDefault() {
		List<FechamentoEntity> auxLista = this.pDAO.listarTodos();

		return auxLista;
	}

}
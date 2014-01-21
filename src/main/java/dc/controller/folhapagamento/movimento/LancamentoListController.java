package dc.controller.folhapagamento.movimento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import dc.entidade.folhapagamento.movimento.LancamentoEntity;
import dc.servicos.dao.folhapagamento.movimento.LancamentoDAO;
import dc.visao.framework.geral.CRUDFormController;
import dc.visao.framework.geral.CRUDListController;

/**
 * 
 * @author Gutemberg A. Da Silva
 * 
 */

@Controller
@Scope("prototype")
public class LancamentoListController extends CRUDListController<LancamentoEntity> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * DAO'S
	 */

	@Autowired
	private LancamentoDAO pDAO;

	/**
	 * CONTROLLER'S
	 */

	@Autowired
	private LancamentoFormController pController;

	@Override
	public String[] getColunas() {
		return new String[] { "numero", "bem.nome", "seguradora.nome" };
	}

	@Override
	public Class<? super LancamentoEntity> getEntityClass() {
		return LancamentoEntity.class;
	}

	@Override
	protected String getTitulo() {
		return "Servico";
	}

	@Override
	protected List<LancamentoEntity> pesquisa(String valor) {
		List<LancamentoEntity> auxLista = this.pDAO.procuraNomeContendo(valor);

		return auxLista;
	}

	@Override
	protected CRUDFormController<LancamentoEntity> getFormController() {
		return this.pController;
	}

	// Identificador da VIEW, para posterior uso nas urls de navegacao
	@Override
	public String getViewIdentifier() {
		return "folhapagamento_movimento_lancamento_lc";
	}

	@Override
	protected boolean deletaEmCascata() {
		return false;
	}

	@Override
	protected List<LancamentoEntity> pesquisaDefault() {
		List<LancamentoEntity> auxLista = this.pDAO.listarTodos();

		return auxLista;
	}

}
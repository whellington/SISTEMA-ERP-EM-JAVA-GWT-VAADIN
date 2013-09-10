package dc.controller.folhapagamento.movimento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import dc.entidade.folhapagamento.movimento.PppAtividadeEntity;
import dc.servicos.dao.folhapagamento.movimento.PppAtividadeDAO;
import dc.visao.framework.geral.CRUDFormController;
import dc.visao.framework.geral.CRUDListController;

/**
 * 
 * @author Gutemberg A. Da Silva
 * 
 */

@Controller
@Scope("prototype")
public class PppAtividadeListController extends
		CRUDListController<PppAtividadeEntity> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * DAO'S
	 */

	@Autowired
	private PppAtividadeDAO pDAO;

	/**
	 * CONTROLLER'S
	 */

	@Autowired
	private PppAtividadeFormController pController;

	@Override
	protected String[] getColunas() {
		return new String[] { "dataInicio", "dataTermino", "ppp.observacao" };
	}

	@Override
	protected Class<? super PppAtividadeEntity> getEntityClass() {
		return PppAtividadeEntity.class;
	}

	@Override
	protected String getTitulo() {
		return "PPP atividade";
	}

	@Override
	protected List<PppAtividadeEntity> pesquisa(String valor) {
		List<PppAtividadeEntity> auxLista = this.pDAO
				.procuraNomeContendo(valor);

		return auxLista;
	}

	@Override
	protected CRUDFormController<PppAtividadeEntity> getFormController() {
		return this.pController;
	}

	// Identificador da VIEW, para posterior uso nas urls de navegacao
	@Override
	public String getViewIdentifier() {
		return "folhapagamento_movimento_ppp_atividade_lc";
	}

	@Override
	protected boolean deletaEmCascata() {
		return false;
	}

	@Override
	protected List<PppAtividadeEntity> pesquisaDefault() {
		List<PppAtividadeEntity> auxLista = this.pDAO.listarTodos();

		return auxLista;
	}

}
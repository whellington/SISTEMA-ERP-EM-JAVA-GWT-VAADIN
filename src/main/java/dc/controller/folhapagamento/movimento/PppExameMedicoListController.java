package dc.controller.folhapagamento.movimento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import dc.entidade.folhapagamento.movimento.PppExameMedicoEntity;
import dc.servicos.dao.folhapagamento.movimento.PppExameMedicoDAO;
import dc.visao.framework.geral.CRUDFormController;
import dc.visao.framework.geral.CRUDListController;

/**
 * 
 * @author Gutemberg A. Da Silva
 * 
 */

@Controller
@Scope("prototype")
public class PppExameMedicoListController extends
		CRUDListController<PppExameMedicoEntity> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * DAO'S
	 */

	@Autowired
	private PppExameMedicoDAO pDAO;

	/**
	 * CONTROLLER'S
	 */

	@Autowired
	private PppExameMedicoFormController pController;

	@Override
	protected String[] getColunas() {
		return new String[] { "dataUltimo", "tipo", "natureza",
				"ppp.observacao" };
	}

	@Override
	protected Class<? super PppExameMedicoEntity> getEntityClass() {
		return PppExameMedicoEntity.class;
	}

	@Override
	protected String getTitulo() {
		return "PPP exame médico";
	}

	@Override
	protected List<PppExameMedicoEntity> pesquisa(String valor) {
		List<PppExameMedicoEntity> auxLista = this.pDAO
				.procuraNomeContendo(valor);

		return auxLista;
	}

	@Override
	protected CRUDFormController<PppExameMedicoEntity> getFormController() {
		return this.pController;
	}

	// Identificador da VIEW, para posterior uso nas urls de navegacao
	@Override
	public String getViewIdentifier() {
		return "folhapagamento_movimento_ppp_exame_medico_lc";
	}

	@Override
	protected boolean deletaEmCascata() {
		return false;
	}

	@Override
	protected List<PppExameMedicoEntity> pesquisaDefault() {
		List<PppExameMedicoEntity> auxLista = this.pDAO.listarTodos();

		return auxLista;
	}

}
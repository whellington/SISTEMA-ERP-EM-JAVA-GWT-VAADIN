package dc.controller.patrimonio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import dc.entidade.patrimonio.MovimentacaoBemEntity;
import dc.servicos.dao.patrimonio.MovimentacaoBemDAO;
import dc.visao.framework.geral.CRUDFormController;
import dc.visao.framework.geral.CRUDListController;

/**
 * 
 * @author Gutemberg A. Da Silva
 * 
 */

@Controller
@Scope("prototype")
public class MovimentacaoBemListController extends
		CRUDListController<MovimentacaoBemEntity> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * DAO'S
	 */

	@Autowired
	private MovimentacaoBemDAO pDAO;

	/**
	 * CONTROLLER'S
	 */

	@Autowired
	private MovimentacaoBemFormController pController;

	@Override
	protected String[] getColunas() {
		return new String[] { "responsavel", "bem", "tipoMovimentacao",
				"dataMovimentacao" };
	}

	@Override
	protected Class<? super MovimentacaoBemEntity> getEntityClass() {
		return MovimentacaoBemEntity.class;
	}

	@Override
	protected String getTitulo() {
		return "Movimentação do bem";
	}

	@Override
	protected List<MovimentacaoBemEntity> pesquisa(String valor) {
		List<MovimentacaoBemEntity> auxLista = this.pDAO
				.procuraNomeContendo(valor);

		return auxLista;
	}

	@Override
	protected CRUDFormController<MovimentacaoBemEntity> getFormController() {
		return this.pController;
	}

	// Identificador da VIEW, para posterior uso nas urls de navegacao
	@Override
	public String getViewIdentifier() {
		return "patrimonio_movimentacao_bem_lc";
	}

	@Override
	protected boolean deletaEmCascata() {
		return false;
	}

	@Override
	protected List<MovimentacaoBemEntity> pesquisaDefault() {
		List<MovimentacaoBemEntity> auxLista = this.pDAO.listarTodos();

		return auxLista;
	}

}
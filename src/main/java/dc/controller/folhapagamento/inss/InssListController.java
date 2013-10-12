package dc.controller.folhapagamento.inss;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import dc.entidade.folhapagamento.inss.InssEntity;
import dc.servicos.dao.folhapagamento.inss.InssDAO;
import dc.visao.framework.geral.CRUDFormController;
import dc.visao.framework.geral.CRUDListController;

/**
 * 
 * @author Gutemberg A. Da Silva
 * 
 */

@Controller
@Scope("prototype")
public class InssListController extends CRUDListController<InssEntity> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * DAO'S
	 */

	@Autowired
	private InssDAO pDAO;

	/**
	 * CONTROLLER'S
	 */

	@Autowired
	private InssFormController pController;

	@Override
	protected String[] getColunas() {
		return new String[] { "competencia" };
	}

	@Override
	protected Class<? super InssEntity> getEntityClass() {
		return InssEntity.class;
	}

	@Override
	protected String getTitulo() {
		return "INSS";
	}

	@Override
	protected List<InssEntity> pesquisa(String valor) {
		try {
			List<InssEntity> auxLista = this.pDAO.procuraNomeContendo(valor);

			return auxLista;
		} catch (Exception e) {
			e.printStackTrace();

			return new ArrayList<InssEntity>();
		}
	}

	@Override
	protected CRUDFormController<InssEntity> getFormController() {
		return this.pController;
	}

	// Identificador da VIEW, para posterior uso nas urls de navegacao
	@Override
	public String getViewIdentifier() {
		return "folhapagamento_inss_lc";
	}

	@Override
	protected boolean deletaEmCascata() {
		return false;
	}

	@Override
	protected List<InssEntity> pesquisaDefault() {
		try {
			List<InssEntity> auxLista = this.pDAO.listarTodos();

			return auxLista;
		} catch (Exception e) {
			e.printStackTrace();

			return new ArrayList<InssEntity>();
		}
	}

}
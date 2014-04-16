package dc.controller.contabilidade.cadastro;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import dc.control.util.ClasseUtil;
import dc.entidade.contabilidade.cadastro.IndiceEntity;
import dc.servicos.dao.contabilidade.cadastro.IndiceDAO;
import dc.visao.framework.geral.CRUDFormController;
import dc.visao.framework.geral.CRUDListController;

/**
 * 
 * @author Gutemberg A. Da Silva
 * 
 */

@Controller
@Scope("prototype")
public class IndiceListController extends CRUDListController<IndiceEntity> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * DAO'S
	 */

	@Autowired
	private IndiceDAO pDAO;

	/**
	 * CONTROLLER'S
	 */

	@Autowired
	private IndiceFormController pController;

	@Override
	public String[] getColunas() {
		return new String[] { "periodicidade", "diarioPartirDe", "mensalMesAno" };
	}

	@Override
	public Class<? super IndiceEntity> getEntityClass() {
		return IndiceEntity.class;
	}

	@Override
	protected String getTitulo() {
		return "Índice";
	}

	@Override
	protected List<IndiceEntity> pesquisa(String valor) {
		try {
			List<IndiceEntity> auxLista = this.pDAO.procuraNomeContendo(valor);

			return auxLista;
		} catch (Exception e) {
			e.printStackTrace();

			return new ArrayList<IndiceEntity>();
		}
	}

	@Override
	protected CRUDFormController<IndiceEntity> getFormController() {
		return this.pController;
	}

	// Identificador da VIEW, para posterior uso nas urls de navegacao
	@Override
	public String getViewIdentifier() {
		String sUrl = ClasseUtil.getUrl(this);

		return sUrl;
	}

	@Override
	protected boolean deletaEmCascata() {
		return false;
	}

	@Override
	protected List<IndiceEntity> pesquisaDefault() {
		try {
			List<IndiceEntity> auxLista = this.pDAO.listarTodos();

			return auxLista;
		} catch (Exception e) {
			e.printStackTrace();

			return new ArrayList<IndiceEntity>();
		}
	}

}
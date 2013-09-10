package dc.visao.framework;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import dc.entidade.framework.Empresa;
import dc.entidade.framework.FmMenu;
import dc.servicos.dao.framework.geral.AbstractCrudDAO;
import dc.servicos.dao.framework.geral.FmMenuDAO;
import dc.visao.framework.geral.CRUDFormController;
import dc.visao.framework.geral.CRUDListController;

@Component
@Scope("prototype")
public class FmMenuListController extends CRUDListController<FmMenu> implements Serializable {

	private static final long serialVersionUID = -3824341653741522079L;

	@Autowired
	FmMenuDAO dao;
	
	@Autowired
	FmMenuFormController formController;
	

	@Override
	protected String[] getColunas() {
		return new String[] {"caption", "urlId"};
	}

	@Override
	protected Class<? super FmMenu> getEntityClass() {
		return FmMenu.class;
	}


	@Override
	protected String getTitulo() {
		return "Menu";
	}

	@Override
	protected List<FmMenu> pesquisa(String valor) {
		return dao.fullTextSearch(valor);
	}
	

	@Override
	protected CRUDFormController<FmMenu> getFormController() {
		return formController;
	}

	//Identificador da VIEW, para posterior uso nas urls de navegacao
	@Override
	public String getViewIdentifier() {
		// TODO Auto-generated method stub
		return "listaMenus";
	}

	@Override
	protected boolean deletaEmCascata() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	protected List<FmMenu> pesquisaDefault() {
		// TODO Auto-generated method stub
		return (List<FmMenu>) dao.getAll(getEntityClass());
	}
	
}

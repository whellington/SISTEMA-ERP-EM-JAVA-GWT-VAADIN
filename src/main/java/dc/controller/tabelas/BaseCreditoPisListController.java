package dc.controller.tabelas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import dc.entidade.tabelas.BaseCreditoPis;
import dc.servicos.dao.tabelas.BaseCreditoPisDAO;
import dc.visao.framework.geral.CRUDFormController;
import dc.visao.framework.geral.CRUDListController;



/**
*
* @author Wesley Jr
/*
*/

@Controller
@Scope("prototype")
public class BaseCreditoPisListController extends CRUDListController<BaseCreditoPis>{

	@Autowired
	BaseCreditoPisDAO dao;
	
	@Autowired
	BaseCreditoPisFormController baseCreditoPisFormController;
	

	@Override
	protected String[] getColunas() {
		return new String[] {"codigo","descricao"};
	}

	@Override
	protected Class<? super BaseCreditoPis> getEntityClass() {
		return BaseCreditoPis.class;
	}


	@Override
	protected String getTitulo() {
		return "Base Crédito Pis";
	}

	@Override
	protected List<BaseCreditoPis> pesquisa(String valor) {
		return dao.fullTextSearch(valor);
	}
	

	@Override
	protected CRUDFormController<BaseCreditoPis> getFormController() {
		return baseCreditoPisFormController;
	}

	//Identificador da VIEW, para posterior uso nas urls de navegacao
	@Override
	public String getViewIdentifier() {
		return "listaBaseCreditoPis";
	}

	@Override
	protected boolean deletaEmCascata() {
		return false;
	}

	@Override
	protected List<BaseCreditoPis> pesquisaDefault() {
		return (List<BaseCreditoPis>) dao.getAll(getEntityClass());
	}
}

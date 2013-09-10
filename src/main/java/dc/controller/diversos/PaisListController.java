package dc.controller.diversos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import dc.entidade.diversos.Pais;
import dc.servicos.dao.diversos.PaisDAO;
import dc.visao.framework.geral.CRUDFormController;
import dc.visao.framework.geral.CRUDListController;

/**
*
* @author Wesley Jr
/*
 * Nessa classe temos a Extensão da classe principal que é crudListController
 * Temos alguns métodos que pegamos, temos a configuração do Título da Tela;
 * O m�todo do Button pesquisar, pegando um valor. e também ele pega algumas informações
 * da classe FormController
 *
*/

@Controller
@Scope("prototype")
@SuppressWarnings("unchecked")
public class PaisListController extends CRUDListController<Pais>{

	@Autowired
	PaisDAO dao;
	
	@Autowired
	PaisFormController paisFormController;
	

	@Override
	protected String[] getColunas() {
		return new String[] {"nomeEn", "nomePtbr","sigla2","sigla3"};
	}

	@Override
	protected Class<? super Pais> getEntityClass() {
		return Pais.class;
	}


	@Override
	protected String getTitulo() {
		return "Pais";
	}

	@Override
	protected List<Pais> pesquisa(String valor) {
		return dao.fullTextSearch(valor);
	}
	

	@Override
	protected CRUDFormController<Pais> getFormController() {
		return paisFormController;
	}

	//Identificador da VIEW, para posterior uso nas urls de navegacao
	@Override
	public String getViewIdentifier() {
		return "listaPais";
	}

	@Override
	protected boolean deletaEmCascata() {
		return false;
	}
	
	@Override
	protected List<Pais> pesquisaDefault() {
		return (List<Pais>) dao.getAll(getEntityClass());
	}


}

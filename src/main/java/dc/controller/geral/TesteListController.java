package dc.controller.geral;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import dc.entidade.geral.Teste;
import dc.servicos.dao.geral.testeDAO;
import dc.visao.framework.geral.CRUDFormController;
import dc.visao.framework.geral.CRUDListController;

@Controller
@Scope("prototype")
@SuppressWarnings("unchecked")
public class TesteListController extends CRUDListController<Teste> {

	@Autowired
	testeDAO dao;

	@Autowired
	TesteFormController testeFormController;

	@Override
	public String[] getColunas() {
		return new String[] { "nome", "descricao" };
	}

	@Override
	public Class<? super Teste> getEntityClass() {
		return Teste.class;
	}

	@Override
	protected String getTitulo() {
		return "Teste";
	}

	@Override
	protected List<Teste> pesquisa(String valor) {
		return dao.fullTextSearch(valor);
	}

	@Override
	protected CRUDFormController<Teste> getFormController() {
		return testeFormController;
	}

	// Identificador da VIEW, para posterior uso nas urls de navegacao
	@Override
	public String getViewIdentifier() {
		// TODO Auto-generated method stub
		return "listaTestees";
	}

	@Override
	protected boolean deletaEmCascata() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected List<Teste> pesquisaDefault() {
		return (List<Teste>) dao.getAll(getEntityClass());
	}

}

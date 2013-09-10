package dc.controller.ponto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import dc.entidade.ponto.PontoAbono;
import dc.servicos.dao.ponto.PontoAbonoDAO;
import dc.visao.framework.geral.CRUDFormController;
import dc.visao.framework.geral.CRUDListController;

@Controller
@Scope("prototype")
@SuppressWarnings("unchecked")
public class PontoAbonoListController extends CRUDListController<PontoAbono> {
	@Autowired
	PontoAbonoDAO dao;

	@Autowired
	PontoAbonoFormController pontoAbonoFormController;

	@Override
	protected String[] getColunas() {
		return new String[] { "quantidade", "saldo", "utilizado",
				"dataCadastro", "inicioUtilizacao", "observacao", "colaborador" };
	}

	@Override
	protected Class<? super PontoAbono> getEntityClass() {
		return PontoAbono.class;
	}

	@Override
	protected String getTitulo() {
		return "Ponto Abono";
	}

	@Override
	protected List<PontoAbono> pesquisa(String valor) {
		return dao.fullTextSearch(valor);
	}

	@Override
	protected CRUDFormController<PontoAbono> getFormController() {
		return pontoAbonoFormController;
	}

	// Identificador da VIEW, para posterior uso nas urls de navegacao
	@Override
	public String getViewIdentifier() {
		return "listaPontoAbono";
	}

	@Override
	protected boolean deletaEmCascata() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected List<PontoAbono> pesquisaDefault() {
		return (List<PontoAbono>) dao.getAll(getEntityClass());
	}

}

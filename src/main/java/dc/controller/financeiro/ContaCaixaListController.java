package dc.controller.financeiro;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import dc.entidade.financeiro.ContaCaixa;
import dc.servicos.dao.financeiro.ContaCaixaDAO;
import dc.visao.framework.geral.CRUDFormController;
import dc.visao.framework.geral.CRUDListController;

@Controller
@Scope("prototype")
public class ContaCaixaListController extends CRUDListController<ContaCaixa> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	ContaCaixaDAO dao;

	@Autowired
	ContaCaixaFormController contaCaixaFormController;

	@Override
	protected CRUDFormController<ContaCaixa> getFormController() {
		return contaCaixaFormController;
	}

	@Override
	public String[] getColunas() {
		return new String[] { "nome", "digito", "descricao" };
	}

	@Override
	public String getViewIdentifier() {
		return "listaContaCaixa";
	}

	@Override
	public Class<? super ContaCaixa> getEntityClass() {
		return ContaCaixa.class;
	}

	@Override
	protected List<ContaCaixa> pesquisa(String valor) {
		try {
			List<ContaCaixa> auxLista = (List<ContaCaixa>) this.dao.fullTextSearch(valor);

			return auxLista;
		} catch (Exception e) {
			return new ArrayList<ContaCaixa>();
		}
	}

	@Override
	protected String getTitulo() {
		return "Conta caixa";
	}

	@Override
	protected void actionRemoverSelecionados() {
		super.actionRemoverSelecionados();
	}

	@Override
	protected boolean deletaEmCascata() {
		return false;
	}

	@Override
	protected List<ContaCaixa> pesquisaDefault() {
		try {
			List<ContaCaixa> auxLista = (List<ContaCaixa>) this.dao.getAll(getEntityClass());

			return auxLista;
		} catch (Exception e) {
			return new ArrayList<ContaCaixa>();
		}
	}

}
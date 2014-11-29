package dc.controller.pessoal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import dc.entidade.pessoal.CargoEntity;
import dc.servicos.dao.pessoal.CargoDAO;
import dc.visao.framework.geral.CRUDFormController;
import dc.visao.framework.geral.CRUDListController;

@Controller
@Scope("prototype")
public class CargoListController extends CRUDListController<CargoEntity> {

	@Autowired
	CargoDAO dao;

	@Autowired
	CargoFormController cargoFormController;

	@Override
	protected CRUDFormController<CargoEntity> getFormController() {
		return cargoFormController;
	}

	@Override
	public String[] getColunas() {
		return new String[] { "nome", "descricao" };
	}

	@Override
	public String getViewIdentifier() {
		return "listaCargo";
	}

	@Override
	public Class<? super CargoEntity> getEntityClass() {
		return CargoEntity.class;
	}

	@Override
	protected List<CargoEntity> pesquisa(String valor) {
		return dao.fullTextSearch(valor);
	}

	@Override
	protected String getTitulo() {
		return "Cargo";
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
	protected List<CargoEntity> pesquisaDefault() {
		return (List<CargoEntity>) dao.getAll(getEntityClass());
	}

}

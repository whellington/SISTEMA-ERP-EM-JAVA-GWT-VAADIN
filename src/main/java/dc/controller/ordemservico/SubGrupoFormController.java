package dc.controller.ordemservico;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.ui.Component;

import dc.entidade.ordemservico.SubGrupoOsEntity;
import dc.model.dao.ordemservico.ISubGrupoOsDAO;
import dc.servicos.dao.ordemservico.IGrupoOsDAO;
import dc.visao.framework.DCFieldGroup;
import dc.visao.framework.geral.CRUDFormController;
import dc.visao.ordemservico.SubGrupoFormView;

@Controller("ordemservicoSubGrupoFormController")
@Scope("prototype")
public class SubGrupoFormController extends
		CRUDFormController<SubGrupoOsEntity> {

	private static final long serialVersionUID = 1L;

	SubGrupoFormView subView;

	@Autowired
	private ISubGrupoOsDAO subGrupoDAO;

	@Autowired
	private IGrupoOsDAO grupoDAO;

	private SubGrupoOsEntity currentBean;

	@Override
	protected String getNome() {
		return "SubGrupo";
	}

	@Override
	protected Component getSubView() {
		return subView;
	}

	@Override
	protected void actionSalvar() {
		try {
			subGrupoDAO.saveOrUpdate(currentBean);
			notifiyFrameworkSaveOK(this.currentBean);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void carregar(Serializable id) {
		try {
	        this.currentBean = this.subGrupoDAO.find(id);
	
	        // Atribui a entidade carregada como origem de dados dos campos do formulario no FieldGroup
	        fieldGroup.setItemDataSource(this.currentBean);
	
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}


	@Override
	protected void initSubView() {

		try {
	        this.subView = new SubGrupoFormView(this);
	
	        // Cria o DCFieldGroup
	        this.fieldGroup = new DCFieldGroup<>(SubGrupoOsEntity.class);
	
	        // Mapeia os campos
	        fieldGroup.bind(this.subView.getTxtNome(),"nome");
	        fieldGroup.bind(this.subView.getCbGrupo(),"grupo");
	        
	        this.subView.getCbGrupo().configuraCombo(
	        		"nome", GrupoListController.class, this.grupoDAO, this.getMainController());
	
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	/*
	 * Deve sempre atribuir a current Bean uma nova instancia do bean do
	 * formulario.
	 */
	@Override
	protected void criarNovoBean() {
		try {
	         this.currentBean = new SubGrupoOsEntity();
	 
	         // Atribui a entidade nova como origem de dados dos campos do formulario no FieldGroup
	         fieldGroup.setItemDataSource(this.currentBean);
	 
	     } catch (Exception e) {
	         e.printStackTrace();
	         mensagemErro(e.getMessage());
	     }
	}


	@Override
	protected void remover(List<Serializable> ids) {
		try {
			this.subGrupoDAO.deleteAll(ids);

			mensagemRemovidoOK();
		} catch (Exception e) {
			e.printStackTrace();

			mensagemErro(e.getMessage());
		}
	}

	/* Implementar validacao de campos antes de salvar. */
	@Override
	protected boolean validaSalvar() {

		try {
	        // Commit tenta transferir os dados do View para a entidade , levando em conta os critérios de validação.
	        fieldGroup.commit();
	        return true;
	    } catch (FieldGroup.CommitException ce) {
	        return false;
	    }
	}

	@Override
	protected void removerEmCascata(List<Serializable> ids) {
		for (Serializable id : ids) {
			SubGrupoOsEntity sub = (SubGrupoOsEntity) id;

			try {
				subGrupoDAO.delete(sub);
			} catch (Exception e) {
				e.printStackTrace();
				mensagemErro(e.getMessage());
			}
		}
		
		mensagemRemovidoOK();
	}

	@Override
	public String getViewIdentifier() {
		return "subGrupoForm";
	}

	@Override
	public SubGrupoOsEntity getModelBean() {
		// TODO Auto-generated method stub
		return currentBean;
	}

}
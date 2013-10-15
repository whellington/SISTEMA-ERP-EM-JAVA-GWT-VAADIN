package dc.servicos.dao.geral;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dc.entidade.framework.Empresa;
import dc.entidade.geral.Contato;
import dc.servicos.dao.framework.geral.AbstractCrudDAO;

@Repository
@SuppressWarnings("unchecked")
public class ContatoDAO extends AbstractCrudDAO<Contato>{

	@Override
	public Class<Contato> getEntityClass() {
		return Contato.class;
	}
	
	@Transactional
	public List<Contato> listaTodos() {
		return getSession().createQuery("from Contato").list();
	}
	
	@Transactional
	public List<Contato> listaPorEmpresa(Empresa empresa) {
		return getSession().createQuery("from Contato c where c.empresa = :emp ")
				.setParameter("emp", empresa)
				.list();
	}

	@Override
	protected String[] getDefaultSearchFields() {

		return new String[]{"nome", "email"};
	}

}

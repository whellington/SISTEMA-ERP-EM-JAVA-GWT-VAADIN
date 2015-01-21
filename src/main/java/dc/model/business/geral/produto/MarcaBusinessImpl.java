package dc.model.business.geral.produto;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sun.istack.logging.Logger;
import com.vaadin.data.Container.Filter;

import dc.entidade.geral.produto.MarcaEntity;
import dc.model.dao.geral.produto.MarcaDAO;

/**
 * 
 * @author Gutemberg A Da Silva
 * 
 */

@Service
@Transactional(readOnly = true)
public class MarcaBusinessImpl implements Serializable,
		MarcaBusiness<MarcaEntity> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static Logger logger = Logger.getLogger(GrupoBusinessImpl.class);

	@Autowired
	private MarcaDAO<MarcaEntity> dao;

	/**
	 * **********************************************
	 */

	@Override
	public Class<MarcaEntity> getEntityClass() {
		return MarcaEntity.class;
	}

	@Transactional(readOnly = false)
	@Override
	public void delete(MarcaEntity t) throws Exception {
		// TODO Auto-generated method stub

	}

	@Transactional(readOnly = false)
	@Override
	public void deleteAll(List<Serializable> list) throws Exception {
		// TODO Auto-generated method stub
		try {
			System.out.println(":: [" + getClass().getSimpleName()
					+ "] deleteAll");

			this.dao.deleteAllByIds(list);
		} catch (Exception e) {
			e.printStackTrace();

			throw e;
		}
	}

	@Override
	public MarcaEntity find(Serializable id) throws Exception {
		// TODO Auto-generated method stub
		try {
			System.out.println(":: [" + getClass().getSimpleName() + "] find");

			MarcaEntity ent = this.dao.find(id);

			return ent;
		} catch (Exception e) {
			e.printStackTrace();

			throw e;
		}
	}

	@Override
	public MarcaEntity find(MarcaEntity t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MarcaEntity> find(String s) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MarcaEntity> findAll() throws Exception {
		// TODO Auto-generated method stub
		try {
			List<MarcaEntity> auxLista = this.dao.listaTodos();

			return auxLista;
		} catch (Exception e) {
			e.printStackTrace();

			throw e;
		}
	}

	@Override
	public List<MarcaEntity> findAll(MarcaEntity t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MarcaEntity> fullTextSearch(String valor) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MarcaEntity> fullTextSearch(String valor, int first,
			int pageSize, String[] sortingFields, boolean[] sortingStates,
			List<Filter> filters) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MarcaEntity> fullTextSearch(String valor,
			String[] sortingFields, boolean[] states, List<Filter> filters)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <E> List<E> getAll(Class<E> type) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional(readOnly = false)
	@Override
	public void save(MarcaEntity t) throws Exception {
		// TODO Auto-generated method stub

	}

	@Transactional(readOnly = false)
	@Override
	public <E> void saveOrUpdate(E o) throws Exception {
		// TODO Auto-generated method stub
		try {
			System.out.println(":: [" + getClass().getSimpleName()
					+ "] saveOrUpdate");

			MarcaEntity ent = (MarcaEntity) o;

			this.dao.saveOrUpdate(ent);
		} catch (Exception e) {
			e.printStackTrace();

			throw e;
		}
	}

}
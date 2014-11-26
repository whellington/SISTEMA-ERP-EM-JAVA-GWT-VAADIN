package dc.servicos.dao.suprimentos;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import dc.entidade.suprimentos.CupomFiscalReferenciadoEntity;
import dc.entidade.suprimentos.estoque.NotaFiscal;
import dc.servicos.dao.framework.geral.AbstractCrudDAO;

@Component
public class CupomVinculadoDAO extends AbstractCrudDAO<CupomFiscalReferenciadoEntity> {

	@Override
	public Class<CupomFiscalReferenciadoEntity> getEntityClass() {
		return CupomFiscalReferenciadoEntity.class;
	}

	@Override
	protected String[] getDefaultSearchFields() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public List<CupomFiscalReferenciadoEntity> buscaCuponsPorNota(NotaFiscal nota) {
		List<CupomFiscalReferenciadoEntity> lista = new ArrayList<>();
		Criteria c = getSession().createCriteria(CupomFiscalReferenciadoEntity.class);
		c.add(Restrictions.eq("notaFiscal", nota));
		lista = c.list();

		return lista;
	}

}
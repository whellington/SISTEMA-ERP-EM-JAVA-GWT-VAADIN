package dc.control.util.classes.ordemservico;

import java.util.Date;

import dc.control.util.DateUtils;
import dc.control.util.ObjectUtils;
import dc.control.validator.DotErpException;
import dc.entidade.geral.pessoal.ClienteEntity;
import dc.entidade.ordemservico.CarroEntity;
import dc.visao.ordemservico.OrdemServicoFormView;

public class OrdemServicoUtils {

	public static void validateRequiredFields(OrdemServicoFormView subView)
			throws DotErpException {
		
		CarroEntity carro = subView.getCbPlaca().getValue();
		if (ObjectUtils.isBlank(carro)) {
			throw new DotErpException(subView.getCbPlaca(),
					"::DotERP - Não pode ficar em branco");
		}
		
		ClienteEntity cliente = subView.getCbCliente().getValue();
		if (ObjectUtils.isBlank(cliente)) {
			throw new DotErpException(subView.getCbPlaca(),
					"::DotERP - Não pode ficar em branco");
		}

		Date dataDesde = (Date) subView.getPdfDataEntrada().getValue();

		if (DateUtils.isBlank(dataDesde)) {
			throw new DotErpException(subView.getPdfDataEntrada(),
					"::DotERP - Não pode ficar em branco");
		}
		
	}

	public static void validateFieldValue(OrdemServicoFormView subView)
			throws DotErpException {

	}

	public static void clearFormFields(OrdemServicoFormView subView) {

	}

}
package dc.visao.framework.geral;

import java.util.List;

import com.vaadin.ui.Label;
import com.vaadin.ui.OptionGroup;
import com.vaadin.ui.VerticalLayout;

import dc.entidade.framework.Seguimento;
import dc.entidade.geral.Usuario;
import dc.visao.spring.SecuritySessionProvider;

public class WizardFirstStep extends BaseWizardStep {

	private OptionGroup group;
	private ConfiguraNovaContaController controller;

	public WizardFirstStep(ConfiguraNovaContaController controller) {
		// TODO Auto-generated constructor stub
		this.controller = controller;
	}

	@Override
	protected void fillMainPanel(VerticalLayout mainPanel) {
		Label question = new Label(
				"Que tipo de notas fiscais ELETRÔNICAS (NF-e) Você precisa emitir?");
		question.setSizeUndefined();
		question.addStyleName("h4");

		mainPanel.addComponent(question);

		List<Seguimento> seguimentos = this.controller.getSeguimentoDao()
				.getAll(Seguimento.class);

		group = new OptionGroup("");

		for (Seguimento seguimento : seguimentos) {
			group.addItem(seguimento);
		}
		mainPanel.addComponent(group);

	}

	@Override
	protected boolean validate() {
		System.out.println(group.getValue());
		return group.getValue() != null;
	}

	@Override
	public String getCaption() {
		return "Determine seu tipo de atividade";
	}

	@Override
	protected void saveConfiguration() {
		Usuario u = SecuritySessionProvider.getUsuario();
		Integer contaId = u.getConta().getId();
		controller.salvarPrimeiraPergunta(group.getValue(), contaId);

	}

}

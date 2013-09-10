package dc.visao.framework.geral;

import com.vaadin.ui.Label;
import com.vaadin.ui.OptionGroup;
import com.vaadin.ui.VerticalLayout;

import dc.entidade.geral.Usuario;
import dc.visao.spring.SecuritySessionProvider;

public class WizardSecondStep  extends BaseWizardStep{

	private OptionGroup group;

	private ConfiguraNovaContaController controller;

	public WizardSecondStep(ConfiguraNovaContaController controller) {
		// TODO Auto-generated constructor stub
		this.controller = controller;
	}


	@Override
	public String getCaption() {
		// TODO Auto-generated method stub
		return "Sobre o uso de NF-e";
	}


	@Override
	protected void fillMainPanel(VerticalLayout mainPanel) {
		// TODO Auto-generated method stub
		Label question = new Label("Que tipo de notas fiscais eletr�nicas (NF-e) voc� precisa emitir?");
        question.setSizeUndefined();
        question.addStyleName("h4");
        
        mainPanel.addComponent(question);
        
        
        group = new OptionGroup("");
         
        group.addItem("Apenas de produto (NF-e)");
        group.addItem("não vou emitir notas fiscais eletr�nicas por esse sistema");
        group.addItem("Usarei o sistema somente para emiss�o de NF-e");
        mainPanel.addComponent(group);
		

	}

	@Override
	protected boolean validate() {
		return group.getValue() != null;
	}


	@Override
	protected void saveConfiguration() {
		Usuario u = SecuritySessionProvider.getUsuario();
		Integer contaId = u.getConta().getId();
		controller.salvarSegundaPergunta(group.getValue(),contaId);
	}

}

package dc.visao.nfe;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.data.Property.ValueChangeEvent;
import com.vaadin.data.Property.ValueChangeListener;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.TextField;

import dc.control.validator.ObjectValidator;
import dc.controller.nfe.ProdutoServicoFormController;
import dc.entidade.pessoal.Cliente;
import dc.visao.framework.component.manytoonecombo.ManyToOneCombo;

/**
 * 
 * @author Gutemberg A. Da Silva
 * 
 */

public class NfeDestinatarioFormView extends CustomComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ProdutoServicoFormController controller;

	/**
	 * NFEDESTINATARIO
	 */

	@AutoGenerated
	private String titulo = "NFE Destinatário";

	@AutoGenerated
	private GridLayout glNfeDestinatario;

	@AutoGenerated
	private TextField tfEmailDestinatario;

	@AutoGenerated
	private TextField tfSuframaDestinatario;

	@AutoGenerated
	private TextField tfTelefoneDestinatario;

	@AutoGenerated
	private TextField tfInscricaoEstadualDestinatario;

	@AutoGenerated
	private TextField tfUfDestinatario;

	@AutoGenerated
	private TextField tfCidadeDestinatario;

	@AutoGenerated
	private TextField tfCodigoIbgeDestinatario;

	@AutoGenerated
	private TextField tfBairroLogradouroDestinatario;

	@AutoGenerated
	private TextField tfLogradouroComplementoDestinatario;

	@AutoGenerated
	private TextField tfLogradouroNumeroDestinatario;

	@AutoGenerated
	private TextField tfLogradouroDestinatario;

	@AutoGenerated
	private TextField tfCepDestinatario;

	@AutoGenerated
	private TextField tfRazaoSocialDestinatario;

	@AutoGenerated
	private TextField tfCpfCnpjDestinatario;

	@AutoGenerated
	private ManyToOneCombo<Cliente> mtoCliente;

	public String getTitulo() {
		return titulo;
	}

	public TextField getTfEmailDestinatario() {
		return tfEmailDestinatario;
	}

	public void setTfEmailDestinatario(TextField tfEmailDestinatario) {
		this.tfEmailDestinatario = tfEmailDestinatario;
	}

	public TextField getTfSuframaDestinatario() {
		return tfSuframaDestinatario;
	}

	public void setTfSuframaDestinatario(TextField tfSuframaDestinatario) {
		this.tfSuframaDestinatario = tfSuframaDestinatario;
	}

	public TextField getTfTelefoneDestinatario() {
		return tfTelefoneDestinatario;
	}

	public void setTfTelefoneDestinatario(TextField tfTelefoneDestinatario) {
		this.tfTelefoneDestinatario = tfTelefoneDestinatario;
	}

	public TextField getTfInscricaoEstadualDestinatario() {
		return tfInscricaoEstadualDestinatario;
	}

	public void setTfInscricaoEstadualDestinatario(
			TextField tfInscricaoEstadualDestinatario) {
		this.tfInscricaoEstadualDestinatario = tfInscricaoEstadualDestinatario;
	}

	public TextField getTfUfDestinatario() {
		return tfUfDestinatario;
	}

	public void setTfUfDestinatario(TextField tfUfDestinatario) {
		this.tfUfDestinatario = tfUfDestinatario;
	}

	public TextField getTfCidadeDestinatario() {
		return tfCidadeDestinatario;
	}

	public void setTfCidadeDestinatario(TextField tfCidadeDestinatario) {
		this.tfCidadeDestinatario = tfCidadeDestinatario;
	}

	public TextField getTfCodigoIbgeDestinatario() {
		return tfCodigoIbgeDestinatario;
	}

	public void setTfCodigoIbgeDestinatario(TextField tfCodigoIbgeDestinatario) {
		this.tfCodigoIbgeDestinatario = tfCodigoIbgeDestinatario;
	}

	public TextField getTfBairroLogradouroDestinatario() {
		return tfBairroLogradouroDestinatario;
	}

	public void setTfBairroLogradouroDestinatario(
			TextField tfBairroLogradouroDestinatario) {
		this.tfBairroLogradouroDestinatario = tfBairroLogradouroDestinatario;
	}

	public TextField getTfLogradouroComplementoDestinatario() {
		return tfLogradouroComplementoDestinatario;
	}

	public void setTfLogradouroComplementoDestinatario(
			TextField tfLogradouroComplementoDestinatario) {
		this.tfLogradouroComplementoDestinatario = tfLogradouroComplementoDestinatario;
	}

	public TextField getTfLogradouroNumeroDestinatario() {
		return tfLogradouroNumeroDestinatario;
	}

	public void setTfLogradouroNumeroDestinatario(
			TextField tfLogradouroNumeroDestinatario) {
		this.tfLogradouroNumeroDestinatario = tfLogradouroNumeroDestinatario;
	}

	public TextField getTfLogradouroDestinatario() {
		return tfLogradouroDestinatario;
	}

	public void setTfLogradouroDestinatario(TextField tfLogradouroDestinatario) {
		this.tfLogradouroDestinatario = tfLogradouroDestinatario;
	}

	public TextField getTfCepDestinatario() {
		return tfCepDestinatario;
	}

	public void setTfCepDestinatario(TextField tfCepDestinatario) {
		this.tfCepDestinatario = tfCepDestinatario;
	}

	public TextField getTfRazaoSocialDestinatario() {
		return tfRazaoSocialDestinatario;
	}

	public void setTfRazaoSocialDestinatario(TextField tfRazaoSocialDestinatario) {
		this.tfRazaoSocialDestinatario = tfRazaoSocialDestinatario;
	}

	public TextField getTfCpfCnpjDestinatario() {
		return tfCpfCnpjDestinatario;
	}

	public void setTfCpfCnpjDestinatario(TextField tfCpfCnpjDestinatario) {
		this.tfCpfCnpjDestinatario = tfCpfCnpjDestinatario;
	}

	public ManyToOneCombo<Cliente> getMtoCliente() {
		return mtoCliente;
	}

	public void setMtoCliente(ManyToOneCombo<Cliente> mtoCliente) {
		this.mtoCliente = mtoCliente;
	}

	/**
	 * CONSTRUTOR
	 * 
	 * @param controller
	 */

	public NfeDestinatarioFormView(ProdutoServicoFormController controller) {
		this.controller = controller;
	}

	/**
	 * GET / SET
	 */

	@AutoGenerated
	public GridLayout bglNfeDestinatario() {
		// common part: create layout
		glNfeDestinatario = new GridLayout();
		glNfeDestinatario.setImmediate(false);
		glNfeDestinatario.setSizeUndefined();
		glNfeDestinatario.setMargin(true);
		glNfeDestinatario.setSpacing(true);
		glNfeDestinatario.setRows(6);
		glNfeDestinatario.setColumns(4);

		// tfIdDestinatario
		mtoCliente = new ManyToOneCombo<>();
		mtoCliente.setCaption("Cliente:");
		mtoCliente.setWidth("175px");
		mtoCliente.setHeight("-1px");
		mtoCliente.setSizeFull();
		mtoCliente.setImmediate(true);
		mtoCliente.setId("mtoCliente");
		mtoCliente.addValueChangeListener(new ValueChangeListener() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void valueChange(ValueChangeEvent event) {
				// TODO Auto-generated method stub
				if (ObjectValidator.validateEventValue(event)) {
					// controller.nfeDestinatarioSetarValor(mtoCliente.getId(),
					// event.getProperty().getValue());
				}
			}
		});
		glNfeDestinatario.addComponent(mtoCliente, 0, 0);

		// tfCpfCnpjDestinatario
		tfCpfCnpjDestinatario = new TextField();
		tfCpfCnpjDestinatario.setCaption("CPF / CNPJ:");
		tfCpfCnpjDestinatario.setWidth("-1px");
		tfCpfCnpjDestinatario.setHeight("-1px");
		tfCpfCnpjDestinatario.setSizeFull();
		tfCpfCnpjDestinatario.setNullRepresentation("");
		tfCpfCnpjDestinatario.setImmediate(true);
		tfCpfCnpjDestinatario.setId("tfCpfCnpjDestinatario");
		tfCpfCnpjDestinatario.addValueChangeListener(new ValueChangeListener() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void valueChange(ValueChangeEvent event) {
				// TODO Auto-generated method stub
				if (ObjectValidator.validateEventValue(event)) {
					controller.nfeDestinatarioSetarValor(tfCpfCnpjDestinatario
							.getId(), event.getProperty().getValue());
				}
			}
		});
		glNfeDestinatario.addComponent(tfCpfCnpjDestinatario, 1, 0);

		// tfRazaoSocialDestinatario
		tfRazaoSocialDestinatario = new TextField();
		tfRazaoSocialDestinatario.setCaption("Razão social:");
		tfRazaoSocialDestinatario.setWidth("-1px");
		tfRazaoSocialDestinatario.setHeight("-1px");
		tfRazaoSocialDestinatario.setSizeFull();
		tfRazaoSocialDestinatario.setNullRepresentation("");
		tfRazaoSocialDestinatario.setImmediate(true);
		tfRazaoSocialDestinatario.setId("tfRazaoSocialDestinatario");
		tfRazaoSocialDestinatario
				.addValueChangeListener(new ValueChangeListener() {
					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					@Override
					public void valueChange(ValueChangeEvent event) {
						// TODO Auto-generated method stub
						if (ObjectValidator.validateEventValue(event)) {
							// controller.nfeDestinatarioSetarValor(
							// tfRazaoSocialDestinatario.getId(), event
							// .getProperty().getValue());
						}
					}
				});
		glNfeDestinatario.addComponent(tfRazaoSocialDestinatario, 2, 0);

		// tfCepDestinatario
		tfCepDestinatario = new TextField();
		tfCepDestinatario.setCaption("CEP:");
		tfCepDestinatario.setWidth("-1px");
		tfCepDestinatario.setHeight("-1px");
		tfCepDestinatario.setSizeFull();
		tfCepDestinatario.setNullRepresentation("");
		tfCepDestinatario.setImmediate(true);
		tfCepDestinatario.setId("tfCepDestinatario");
		tfCepDestinatario.addValueChangeListener(new ValueChangeListener() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void valueChange(ValueChangeEvent event) {
				// TODO Auto-generated method stub
				if (ObjectValidator.validateEventValue(event)) {
					// controller.nfeDestinatarioSetarValor(tfCepDestinatario
					// .getId(), event.getProperty().getValue());
				}
			}
		});
		glNfeDestinatario.addComponent(tfCepDestinatario, 0, 1);

		// tfLogradouroDestinatario
		tfLogradouroDestinatario = new TextField();
		tfLogradouroDestinatario.setCaption("Logradouro:");
		tfLogradouroDestinatario.setWidth("-1px");
		tfLogradouroDestinatario.setHeight("-1px");
		tfLogradouroDestinatario.setSizeFull();
		tfLogradouroDestinatario.setNullRepresentation("");
		tfLogradouroDestinatario.setImmediate(true);
		tfLogradouroDestinatario.setId("tfLogradouroDestinatario");
		tfLogradouroDestinatario
				.addValueChangeListener(new ValueChangeListener() {
					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					@Override
					public void valueChange(ValueChangeEvent event) {
						// TODO Auto-generated method stub
						if (ObjectValidator.validateEventValue(event)) {
							// controller.nfeDestinatarioSetarValor(
							// tfLogradouroDestinatario.getId(), event
							// .getProperty().getValue());
						}
					}
				});
		glNfeDestinatario.addComponent(tfLogradouroDestinatario, 1, 1);

		// tfLogradouroNumeroDestinatario
		tfLogradouroNumeroDestinatario = new TextField();
		tfLogradouroNumeroDestinatario.setCaption("Número:");
		tfLogradouroNumeroDestinatario.setWidth("-1px");
		tfLogradouroNumeroDestinatario.setHeight("-1px");
		tfLogradouroNumeroDestinatario.setSizeFull();
		tfLogradouroNumeroDestinatario.setNullRepresentation("");
		tfLogradouroNumeroDestinatario.setImmediate(true);
		tfLogradouroNumeroDestinatario.setId("tfLogradouroNumeroDestinatario");
		tfLogradouroNumeroDestinatario
				.addValueChangeListener(new ValueChangeListener() {
					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					@Override
					public void valueChange(ValueChangeEvent event) {
						// TODO Auto-generated method stub
						if (ObjectValidator.validateEventValue(event)) {
							// controller.nfeDestinatarioSetarValor(
							// tfLogradouroNumeroDestinatario.getId(),
							// event.getProperty().getValue());
						}
					}
				});
		glNfeDestinatario.addComponent(tfLogradouroNumeroDestinatario, 2, 1);

		// tfLogradouroComplementoDestinatario
		tfLogradouroComplementoDestinatario = new TextField();
		tfLogradouroComplementoDestinatario.setCaption("Complemento:");
		tfLogradouroComplementoDestinatario.setWidth("-1px");
		tfLogradouroComplementoDestinatario.setHeight("-1px");
		tfLogradouroComplementoDestinatario.setSizeFull();
		tfLogradouroComplementoDestinatario.setNullRepresentation("");
		tfLogradouroComplementoDestinatario.setImmediate(true);
		tfLogradouroComplementoDestinatario
				.setId("tfLogradouroComplementoDestinatario");
		tfLogradouroComplementoDestinatario
				.addValueChangeListener(new ValueChangeListener() {
					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					@Override
					public void valueChange(ValueChangeEvent event) {
						// TODO Auto-generated method stub
						if (ObjectValidator.validateEventValue(event)) {
							// controller.nfeDestinatarioSetarValor(
							// tfLogradouroComplementoDestinatario.getId(),
							// event.getProperty().getValue());
						}
					}
				});
		glNfeDestinatario.addComponent(tfLogradouroComplementoDestinatario, 3,
				1);

		// tfBairroLogradouroDestinatario
		tfBairroLogradouroDestinatario = new TextField();
		tfBairroLogradouroDestinatario.setCaption("Bairro:");
		tfBairroLogradouroDestinatario.setWidth("-1px");
		tfBairroLogradouroDestinatario.setHeight("-1px");
		tfBairroLogradouroDestinatario.setSizeFull();
		tfBairroLogradouroDestinatario.setNullRepresentation("");
		tfBairroLogradouroDestinatario.setImmediate(true);
		tfBairroLogradouroDestinatario.setId("tfBairroLogradouroDestinatario");
		tfBairroLogradouroDestinatario
				.addValueChangeListener(new ValueChangeListener() {
					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					@Override
					public void valueChange(ValueChangeEvent event) {
						// TODO Auto-generated method stub
						if (ObjectValidator.validateEventValue(event)) {
							// controller.nfeDestinatarioSetarValor(
							// tfBairroLogradouroDestinatario.getId(),
							// event.getProperty().getValue());
						}
					}
				});
		glNfeDestinatario.addComponent(tfBairroLogradouroDestinatario, 0, 2);

		// tfCodigoIbgeDestinatario
		tfCodigoIbgeDestinatario = new TextField();
		tfCodigoIbgeDestinatario.setCaption("Código IBGE:");
		tfCodigoIbgeDestinatario.setWidth("-1px");
		tfCodigoIbgeDestinatario.setHeight("-1px");
		tfCodigoIbgeDestinatario.setSizeFull();
		tfCodigoIbgeDestinatario.setNullRepresentation("");
		tfCodigoIbgeDestinatario.setImmediate(true);
		tfCodigoIbgeDestinatario.setId("tfCodigoIbgeDestinatario");
		tfCodigoIbgeDestinatario
				.addValueChangeListener(new ValueChangeListener() {
					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					@Override
					public void valueChange(ValueChangeEvent event) {
						// TODO Auto-generated method stub
						if (ObjectValidator.validateEventValue(event)) {
							// controller.nfeDestinatarioSetarValor(
							// tfCodigoIbgeDestinatario.getId(), event
							// .getProperty().getValue());
						}
					}
				});
		glNfeDestinatario.addComponent(tfCodigoIbgeDestinatario, 1, 2);

		// tfCidadeDestinatario
		tfCidadeDestinatario = new TextField();
		tfCidadeDestinatario.setCaption("Cidade:");
		tfCidadeDestinatario.setWidth("-1px");
		tfCidadeDestinatario.setHeight("-1px");
		tfCidadeDestinatario.setSizeFull();
		tfCidadeDestinatario.setNullRepresentation("");
		tfCidadeDestinatario.setImmediate(true);
		tfCidadeDestinatario.setId("tfCidadeDestinatario");
		tfCidadeDestinatario.addValueChangeListener(new ValueChangeListener() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void valueChange(ValueChangeEvent event) {
				// TODO Auto-generated method stub
				if (ObjectValidator.validateEventValue(event)) {
					// controller.nfeDestinatarioSetarValor(tfCidadeDestinatario
					// .getId(), event.getProperty().getValue());
				}
			}
		});
		glNfeDestinatario.addComponent(tfCidadeDestinatario, 2, 2);

		// tfUfDestinatario
		tfUfDestinatario = new TextField();
		tfUfDestinatario.setCaption("UF:");
		tfUfDestinatario.setWidth("-1px");
		tfUfDestinatario.setHeight("-1px");
		tfUfDestinatario.setSizeFull();
		tfUfDestinatario.setNullRepresentation("");
		tfUfDestinatario.setImmediate(true);
		tfUfDestinatario.setId("tfUfDestinatario");
		tfUfDestinatario.addValueChangeListener(new ValueChangeListener() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void valueChange(ValueChangeEvent event) {
				// TODO Auto-generated method stub
				if (ObjectValidator.validateEventValue(event)) {
					// controller.nfeDestinatarioSetarValor(tfUfDestinatario
					// .getId(), event.getProperty().getValue());
				}
			}
		});
		glNfeDestinatario.addComponent(tfUfDestinatario, 3, 2);

		// tfInscricaoEstadualDestinatario
		tfInscricaoEstadualDestinatario = new TextField();
		tfInscricaoEstadualDestinatario.setCaption("Inscrição estadual:");
		tfInscricaoEstadualDestinatario.setWidth("-1px");
		tfInscricaoEstadualDestinatario.setHeight("-1px");
		tfInscricaoEstadualDestinatario.setSizeFull();
		tfInscricaoEstadualDestinatario.setNullRepresentation("");
		tfInscricaoEstadualDestinatario.setImmediate(true);
		tfInscricaoEstadualDestinatario
				.setId("tfInscricaoEstadualDestinatario");
		tfInscricaoEstadualDestinatario
				.addValueChangeListener(new ValueChangeListener() {
					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					@Override
					public void valueChange(ValueChangeEvent event) {
						// TODO Auto-generated method stub
						if (ObjectValidator.validateEventValue(event)) {
							// controller.nfeDestinatarioSetarValor(
							// tfInscricaoEstadualDestinatario.getId(),
							// event.getProperty().getValue());
						}
					}
				});
		glNfeDestinatario.addComponent(tfInscricaoEstadualDestinatario, 0, 3);

		// tfTelefoneDestinatario
		tfTelefoneDestinatario = new TextField();
		tfTelefoneDestinatario.setCaption("Telefone:");
		tfTelefoneDestinatario.setWidth("-1px");
		tfTelefoneDestinatario.setHeight("-1px");
		tfTelefoneDestinatario.setSizeFull();
		tfTelefoneDestinatario.setNullRepresentation("");
		tfTelefoneDestinatario.setImmediate(true);
		tfTelefoneDestinatario.setId("tfTelefoneDestinatario");
		tfTelefoneDestinatario
				.addValueChangeListener(new ValueChangeListener() {
					/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

					@Override
					public void valueChange(ValueChangeEvent event) {
						// TODO Auto-generated method stub
						if (ObjectValidator.validateEventValue(event)) {
							// controller.nfeDestinatarioSetarValor(
							// tfTelefoneDestinatario.getId(), event
							// .getProperty().getValue());
						}
					}
				});
		glNfeDestinatario.addComponent(tfTelefoneDestinatario, 1, 3);

		// tfSuframaDestinatario
		tfSuframaDestinatario = new TextField();
		tfSuframaDestinatario.setCaption("SUFRAMA:");
		tfSuframaDestinatario.setWidth("-1px");
		tfSuframaDestinatario.setHeight("-1px");
		tfSuframaDestinatario.setSizeFull();
		tfSuframaDestinatario.setNullRepresentation("");
		tfSuframaDestinatario.setImmediate(true);
		tfSuframaDestinatario.setId("tfSuframaDestinatario");
		tfSuframaDestinatario.addValueChangeListener(new ValueChangeListener() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void valueChange(ValueChangeEvent event) {
				// TODO Auto-generated method stub
				if (ObjectValidator.validateEventValue(event)) {
					// controller.nfeDestinatarioSetarValor(tfSuframaDestinatario
					// .getId(), event.getProperty().getValue());
				}
			}
		});
		glNfeDestinatario.addComponent(tfSuframaDestinatario, 2, 3);

		// tfEmailDestinatario
		tfEmailDestinatario = new TextField();
		tfEmailDestinatario.setCaption("E-mail:");
		tfEmailDestinatario.setWidth("-1px");
		tfEmailDestinatario.setHeight("-1px");
		tfEmailDestinatario.setSizeFull();
		tfEmailDestinatario.setNullRepresentation("");
		tfEmailDestinatario.setImmediate(true);
		tfEmailDestinatario.setId("tfEmailDestinatario");
		tfEmailDestinatario.addValueChangeListener(new ValueChangeListener() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void valueChange(ValueChangeEvent event) {
				// TODO Auto-generated method stub
				if (ObjectValidator.validateEventValue(event)) {
					// controller.nfeDestinatarioSetarValor(tfEmailDestinatario
					// .getId(), event.getProperty().getValue());
				}
			}
		});
		glNfeDestinatario.addComponent(tfEmailDestinatario, 3, 3);

		return glNfeDestinatario;
	}

}
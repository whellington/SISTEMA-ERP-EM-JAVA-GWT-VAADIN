package dc.entidade.relatorio;

import java.util.Map;

import net.sf.jasperreports.engine.JRDataSource;

import com.vaadin.ui.Component;

public interface RelatorioParameterView<E, T> extends Component {

	public Map<E, T> getParametersMap();

	public JRDataSource getJRDataSource();
}

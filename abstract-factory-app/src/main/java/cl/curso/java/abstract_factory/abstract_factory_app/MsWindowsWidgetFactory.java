/**
 * 
 */
package cl.curso.java.abstract_factory.abstract_factory_app;

/**
 * @author {Cristopher Lasalle}
 *
 */
public class MsWindowsWidgetFactory implements AbstractWidgetFactory {

	public Window createWindow() {
		return new MSWindow();
	}

}

/**
 * 
 */
package cl.curso.java.abstract_factory.abstract_factory_app;

/**
 * @author {Cristopher Lasalle}
 *
 */
public class GUIBuilder {

	public Window buildWindow(AbstractWidgetFactory factory) {
		return factory.createWindow();

	}

}

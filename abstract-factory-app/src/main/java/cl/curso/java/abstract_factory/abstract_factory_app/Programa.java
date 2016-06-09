/**
 * 
 */
package cl.curso.java.abstract_factory.abstract_factory_app;

/**
 * @author {Cristopher Lasalle}
 *
 */
public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String plataform = System.getProperty("os.name").toLowerCase();

		System.out.println(plataform);
		GUIBuilder guib = new GUIBuilder();
		if (plataform.startsWith("win")) {
			guib.buildWindow(new MsWindowsWidgetFactory());
		} else {
			guib.buildWindow(new MacOSXWidgetFactory());
		}
	}

}

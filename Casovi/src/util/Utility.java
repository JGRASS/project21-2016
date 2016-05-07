package util;

import java.io.File;
/**
 * Klasa Utility, sadrzi metodu koja vraca putanju do projekta
 * @author Jelena Marjanovic, Milos Ljubisavljevic, Djordje Nestorovic
 *
 */
public class Utility {
	/**
	 * Metoda vraca putanju do projekta.
	 * 
	 */
	public static String getProjectDir() {
		File currentDir = new File(".");
		StringBuffer projectDir = new StringBuffer(currentDir.getAbsolutePath());
		projectDir.deleteCharAt(projectDir.length()-1);
//		System.out.println(projectDir);
		return projectDir.toString();
	}
	/**
	 * Metoda vraca putanju do resources foldera.
	 * 
	 */
	public static String getResourcesDir() {
		return getProjectDir() + "resources\\";
	}
}

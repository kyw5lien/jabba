/**
 * 	Singleton class implementation / example.
 */

// package packageJabba;

/**
 * @author kyw5lien
 *
 */
public class Singleton{

	// Private Static Singleton class
	private static Singleton singleton = new Singleton();

	// Private Constructor: prevents any other class from instantiating.
	private Singleton() {
		// Empty Constructor 
	}

	// Getter(s)
	// getInstance: Static getter for 'instance' method
	public static Singleton getSingleton() {
		return singleton;
	}

}
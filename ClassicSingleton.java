/**
 * 	ClassicSingleton demonstrates the implementation of a Classic Singleton Design-Pattern.
 */

// package jabbaPackage.

/**
 * @author kyw5lien
 *
 */
public class ClassicSingleton {

	/**
	 * 	Classic Singleton Design Pattern
	 */
	
	// Private Static Singleton null instance
	private static ClassicSingleton classicSingleton = null;
	
	// Private Constructor: prevents any other class from instantiating.
	private ClassicSingleton() {
		// Empty Constructor
	}
	
	// Getter(s)
	// getClassicSingleton: static getter for 'instance' method
	public static ClassicSingleton getClassicSingleton() {
		
		// Instantiates a singleton if not previously done.
		// Lazy Instantiation: created only when needed.
		if(classicSingleton == null) {
			classicSingleton = new ClassicSingleton();
		}
		
		return classicSingleton;
		
	}

}

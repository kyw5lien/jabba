/**
 *  GenericsCollectionSample is a brief code sample illustrating generics in the
  	Java Collections Framework.
 */
// package collectionsPackage;

/**
 * @author kyw5lien
 *
 */
public class GenericsCollectionSample {
	
	public static final int arrayListSize = 100;	
	/**
	 * 	Attributes/Fields Declaration
	 */
	/*	Generics ArrayList	*/
	class ArrayList<E> {
		public void add (E arrayList) {
			// Statements to Add elements
		}
		
		public E get(int index) {
			E[] array = (E[]) new Object[arrayListSize]; // Generic Array with Length 100.
			
			// return statement
			return (E) array[index];
		}
	}
	
	/*
	 * Constructor(s)
	 */
	public GenericsCollectionSample() {
		// Default Constructor
	}
}

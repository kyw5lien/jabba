/**
  * The Foo class is a silly example illustrating code comments.
  *
*/

// package jabbaPackage;

public class Foo {

	/**
	* An integer to keep track of, for fun.
	*/
	private Integer count;

	/**
	* Increment a value by delta and return the value.
	*
	* @param 	delta 	the amount the value should be incremented by
	* @return 			the post-incremented value
	*/
	int increment (int delta){

		delta++;		// increments delta arg passed by value

		return delta;

	}

	public static void main (String[] args){

		Foo f = new Foo();		// Instantiation of Foo Class
		Integer v = 0;			// Integer value initialized

		v = f.increment(10);	// Passing Integer by value
		System.out.println(v);	// Post-increment: prints delta + 1.

	}
}
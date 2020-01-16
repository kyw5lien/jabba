/**
 * 
 */
package dataStructuresAlgorithms;

/**
 * @author kyw5lien
 * 
 *	PrimitiveBaseTypes: shows simple example uses of primitive types declaration in Java language.
 *
 */
public class PrimitiveBaseTypes {

	private static final char[] SUCCESS = "PrimitiveBaseTypes COMPILEd.".toCharArray();
	/**
	 *	Attributes: declaration of primitive types.
	 *	Note: Primitive-base types are always given an initial value when an object containing them is created.
	 */
	
	/*	Forms of initializing variables. */
	boolean flag = (boolean) Boolean.FALSE;		// Cyclic redundancy match.
	boolean	bool = true;						// Use of boxing and Boolean class is unneeded -> yet valid.
	
	char ch = 'c';
	
	byte b = 9;
	short s = 13;
	int i = 17;
	
	long l = 302l;				// Equivalent long declaration: long l = 302L.
	
	float f = (float) Math.PI;	// PI as defined in the Math class.
	float f1 = 3.1415f;			// Equivalent float declaration -> float f2 = 3.1415F	
	
	double d = 44;				// Equivalent double declaration -> double d = 44d;
	
	
	public PrimitiveBaseTypes() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimitiveBaseTypes primitiveBaseTypes = new PrimitiveBaseTypes();
		if(primitiveBaseTypes != null)	//	redundant
			System.out.println(SUCCESS);
	}
}

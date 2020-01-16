/**
 * 
 */
package dataStructuresAlgorithms;

/**
 * @author kyw5lien
 *
 *	NumericLiterals illustrates the usage of underscore chars between numeric literals
 *	to improve code readability.
 */
public class NumericLiterals {

	private static final char[] SUCCESS = "NumericLiterals COMPILEd.".toCharArray();
	/**
	 * 	Atributes declaration.
	 */
	
	long creditCardNumber = 8955_3421_1385_3211L;
	long socialSecurityNumber = 135_79_1113L;
	
	float pi = 3.14_15F;	// float pi = (float) Math.PI;
	
	long hexadecimalBytes = 0xF8_A4_32_EB;	// -123456789
	long hexWords = 0x101_CAFFE;			// Jabba Koffee 1x1
	long maxLong = 0x7fff_ffff_ffff_ffffL;	// Max. Long
	
	byte byteNumber = 0b0000_0101;						// byte representation
	long bytes = 0b11010010_01101001_10010100_10010010;	// long byte representation
	
	
	public NumericLiterals() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumericLiterals primitiveBaseTypes = new NumericLiterals();
		if(primitiveBaseTypes != null)	//	redundant
			System.out.println(SUCCESS);
	}

}

/**
 * 
 */
// package packageDateAPI;

import java.time.LocalDate;

/**
 * @author kyw5lien
 *	Retrieves the actual date making use of the DateAPI.
 */
public class ActualDate {

	/**
	 *	Implements code for actual date retrieval.
	 */
	
	// Singleton Declaration
	public static LocalDate actualDate = LocalDate.now();
	
	// Private Constructor: prevents any other class from instantiating.
	private ActualDate() {
		// TODO Auto-generated constructor stub
	}
	
	// getInstance: Static getter for 'instance' method.
	public static LocalDate getSingleton() {
		return actualDate;
	}
	
	public static void main(String[] args) {
		
		LocalDate localDate = getSingleton();
		// e.g: LocallocalDate localDate = LocallocalDate.of(1969, Month.JULY, 11);

		// Outputing LocalDate
		System.out.println("Local Date: "
				+localDate.getDayOfWeek() 
				+ "," + " " + localDate.getYear()
				+ "-" + localDate.getMonth()
				+ "-" + localDate.getDayOfMonth());
		
		System.out.println("Std output: " +localDate);
		
		System.out.println();
		
		// Exploring LocalDate Class & Method(s)
		
		// Day-of-the-week, Day-of-the-month
		System.out.println("Day of the Week: " +localDate.getDayOfWeek());
		System.out.println("Day of the Month: " +localDate.getDayOfMonth());
		
		// Day-of-the-year
		System.out.println();
		System.out.println("Day of the Year: " +localDate.getDayOfYear());
		
		// Month Value, Month-of-year, Year
		System.out.println();
		
		System.out.println("Month-of-Year: " +localDate.getMonth());
		System.out.println("Month Value: " +localDate.getMonthValue());
		System.out.println("Year: " +localDate.getYear());
		
		
		// Equivalent Era and Chronology
		System.out.println();
		
		System.out.println("Equivalent Era: " +localDate.getEra());
		System.out.println("Chronology: " +localDate.getChronology());
		
	}
}

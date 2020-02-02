/**
 * 
 */
package packageDateAPI;

import java.time.Instant;

/**
 * @author kyw5lien
 *
 */
public class ComputingTime{

	// Loop-counter
	static Long limits = -1000000000L;
	
	public ComputingTime() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		// Instantiating Singleton class
		MeasuredElapsedTime measuredElapsedTime;
		measuredElapsedTime = MeasuredElapsedTime.getMeasuredElapsedTime();
	
		/* Measuring Computing Performance while running a Long-loop */
		// Measuring Start ...
		measuredElapsedTime.setStart(Instant.now());
		
		// Block of code to executed and measured.
		for(long i = limits; i <= Math.negateExact(limits); i++)
			System.out.println("Loop-counter:" +i);
		
		// Measuring End ...
		measuredElapsedTime.setEnd(Instant.now());
		
		// Retrieving Duration ...
		measuredElapsedTime.quantizeDuration();
		
		
		// ...
		System.out.println();
		// ...
		
		
		// Directing elapsed time to the Output Stream.
		System.out.println("Time / Start: 	" +measuredElapsedTime.getStart());
		
		System.out.println("Time / End:	" +measuredElapsedTime.getEnd());
		
		// Directing the computed time to the Output Stream.
		System.out.println("Time Elapsed / Duration: "  +measuredElapsedTime.getTimeElapsed());
		
		System.out.println("Time Elapsed (Milliseconds): " +measuredElapsedTime.getTimeElapsed().toMillis() +"ms");
		System.out.println("Time Elapsed (Nanoseconds): " +measuredElapsedTime.getTimeElapsed().toNanos() +"ns");

		System.out.println("Time Elapsed (Seconds): " +measuredElapsedTime.getTimeElapsed().getSeconds() +"s");
		System.out.println("Time Elapsed (Minutes): " +measuredElapsedTime.getTimeElapsed().toMinutes() +"mns");
		System.out.println("Time Elapsed (Hours): " +measuredElapsedTime.getTimeElapsed().toHours() +"hrs");
		
		System.out.println("Time Elapsed (Days): " +measuredElapsedTime.getTimeElapsed().toDays() +" days");
	
	}

}
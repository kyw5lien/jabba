/**
 * 
 */
// package packageDateAPI;

import java.time.Duration;
import java.time.Instant;

/**
 * @author kyw5lien
 *	A class using the DateAPI to measure the elapsed time of executing an algorithm.
 */
public class MeasuredElapsedTime {

	// Private Static Singleton class
	public static MeasuredElapsedTime measuredElapsedTime = new MeasuredElapsedTime();
	
	// "Time" variables
	Instant start;
	Instant end;
	Duration timeElapsed;
	long milliseconds;
	
	// Private Constructor: prevents any other class from instantiating.
	private MeasuredElapsedTime() {
		this.start = null;
		this.end = null;
		this.timeElapsed = null;
		this.milliseconds = 0L;
	}
	
	// getInstance: Static getter for 'instance' method.
	public static MeasuredElapsedTime getMeasuredElapsedTime() {
		return measuredElapsedTime;
	}

	/*	Getter(s) */
	public Instant getStart() {
		return start;
	}

	public Instant getEnd() {
		return end;
	}

	public Duration getTimeElapsed() {
		return timeElapsed;
	}

	public long getMilliseconds() {
		return milliseconds;
	}
	
	/*	Setter(s) */
	public void setStart(Instant start) {
		this.start = start;
	}

	public void setEnd(Instant end) {
		this.end = end;
	}

	protected void setTimeElapsed(Duration timeElapsed) {
		this.timeElapsed = timeElapsed;
	}

	protected void setMilliseconds(long milliseconds) {
		this.milliseconds = milliseconds;
	}
	
	/*	Other Method(s)	*/
	public void quantizeDuration() {
		setTimeElapsed(Duration.between(getStart(), getEnd()));
		setMilliseconds(getTimeElapsed().toMillis());
	}
	
}
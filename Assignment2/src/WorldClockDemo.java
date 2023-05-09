
/** This WorldClockDemo will Tests the Clock and WorldClock Classes.
 */
public class WorldClockDemo 
{
	/**
	 *Args is not doing something 
	 * @param args  Args is not doing something 
	 */
	public static void main(String[] args)
	{
		System.out.println("");
		System.out.println("Testing WorldClock class");
		int offset = 3;
		System.out.println("Offset: " + offset);
		WorldClock wclock = new WorldClock(offset);
		System.out.println("Hours: " + wclock.getHours());
		System.out.println("Minutes: " + wclock.getMinutes());
		System.out.println("Time: " + wclock.getTime());
	}
}

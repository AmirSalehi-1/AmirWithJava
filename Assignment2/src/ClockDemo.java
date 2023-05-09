

/**This is ClockDemo class that just test the clock 
 * 
 */
public class ClockDemo
{
	/**
	 * This is main class that args is not useful here
	 * @param args This is main class that args is not useful here
	 */
	public static void main(String[] args)
	{

		System.out.println("Testing Clock class");
		Clock clock = new Clock();
		System.out.println("Hours: " + clock.getHours());
		System.out.println("Minutes: " + clock.getMinutes());
		System.out.println("Time: " + clock.getTime());
	}
}

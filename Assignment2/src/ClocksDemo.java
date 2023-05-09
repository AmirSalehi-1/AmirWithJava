
/**
 * This is Clocks Demo that Stores all clocks in an array of Clock type and Loop through the array and we use polymorphism to aske a chclock fo rits time,and print thistime along with the clock class name.
 * @author Amir 
 *
 */
public class ClocksDemo {
	/**This is our Main class that contains array of Clock type ;
	 * @param args This is our Main class that contains array of Clock type ;
	 */
	public static void main(String[] args) {
		Clock currentTime = new Clock();
		WorldClock worldClock = new WorldClock(7); 
		AlarmClock alarmClock = new AlarmClock();
		alarmClock.setAlarm(2,18); 
		Clock[] allclocks = {currentTime, worldClock, alarmClock};
		for (int i = 0; i < allclocks.length; i++) {
			Clock allclock =allclocks[i];
			System.out.println(allclock.getClass().getSimpleName() + " "+ allclock.getTime());
		}
	}
}

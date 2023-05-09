
/**
 * this is AlarmClock that inherited from Clock class and we can SetAlarm ; If alarm is exceeded or its like current time
 * It shows current time with Alarm String ; otherwise it shows current time
 * 
 * clock  is  our super class
 */
/**
 *  this is AlarmClock that inherited from Clock class
 * @author Amir
 *
 */
public class AlarmClock extends Clock {
	private int hoursalarm;
	private int minutesalarm;
	private boolean alarmOn=true;

	public void setAlarm(int hoursalarm, int minutesalarm) {
		this.hoursalarm = hoursalarm;
		this.minutesalarm = minutesalarm;
	}
	public String getTime() {
		String currentTimeString = super.getTime();
		String currentHourString = currentTimeString.substring(0, 2);
		String currentMinuteString = currentTimeString.substring(3); 
		int currentHour = Integer.parseInt(currentHourString.trim());
		int currentMinute = Integer.parseInt(currentMinuteString.trim());

		if (alarmOn && (currentHour > hoursalarm || (hoursalarm== currentHour && currentMinute >= minutesalarm))) {
			alarmOn=false;
			return currentTimeString + " Alarm"; // Add "Alarm" to the end of the current time string

		}
		return currentTimeString ;
	}
}




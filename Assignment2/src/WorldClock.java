

import java.time.LocalTime;
/**
 * This i s our WorldClock class that inherited from Clock class ; and It calculate the world clock based on time zone
 *  @author Amir
 *
 */
public class WorldClock extends Clock  {
	private int offset;

	public WorldClock(int offset) {
		this.offset = offset;
	}
	@Override
	public String getTime() {
		String currentTimeString = super.getTime();
		String currentHourString = currentTimeString.substring(0, 2);
		String currentMinuteString = currentTimeString.substring(3); 
		int currentHour = Integer.parseInt(currentHourString.trim()); 
		int currentMinute = Integer.parseInt(currentMinuteString.trim()); 
		currentHour = currentHour+offset;
		if (currentHour >= 24) {
			currentHour=currentHour- 24;
		} else if (currentHour < 0) {
			currentHour =currentHour + 24;
		}
		return String.format("%02d:%02d", currentHour, currentMinute);
	}
}
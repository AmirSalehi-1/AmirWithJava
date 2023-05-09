

import java.time.LocalTime;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
/**
 * 
 * This i s Our clock class that show current time , hour and minutes .
 *
 * @author Amir
 */
public class Clock
{
	/**
	 * This return hour of local time 
	 * @return This return hour of local time 
	 */
	public int  getHours() {

		LocalTime  hours =LocalTime.now();
		return hours.getHour();

	}

	/**
	 * this return Minutes of local time 
	 * @return this return Minutes of local time 
	 */
	public int  getMinutes() {
		LocalTime  Minutes =LocalTime.now();
		return Minutes.getMinute() ;
	}
	/**
	 * This return String format of Time HH:MM
	 * @return return String format of Time HH:MM
	 */
	public String getTime() {
		int hours = getHours();
		int minutes = getMinutes();
		return String.format("%2d:%2d", hours, minutes);

	}





}

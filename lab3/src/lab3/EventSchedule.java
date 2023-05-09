package lab3;

import java.util.Calendar;


/**
 *
 * @see  TestDemo
 * @author Amir Salehi
 * 
 */
/**
 * This program depicts Overloaded constructor calls.
 * It shows the chaining of overloaded constructors using "this" keyword.
 * This lab has been completed for demo by: Amir Salehi
 */

public class EventSchedule {

	/**
	 * year component of the date of EventSchedule.
	 */
	private int year;

	/**
	 * month component of the date of
	 */
	private int month;

	/**
	 * day component of the date of
	 */
	private int day;
	static Calendar cal = Calendar.getInstance();
	/**
	 * The default constructor sets year, month, day to the current date.
	 */
	private String eventName;
	public EventSchedule() {

		this(cal.get(Calendar.YEAR));
		System.out.println("EventSchedule() was called");
	}

	/**
	 * The  constructor sets year to the current year.
	 * @param year the year of this EventSchedule.
	 * 
	 */

	public EventSchedule(int year) {

		this (year,Calendar.MONTH);
		System.out.println("EventSchedule(int) was called");
	}

	/**
	 *  The  constructor sets year, month,to the current date.
	 * @param year The year of this EventSchedule.
	 * @param month of this EventSchedule.

	 */

	public EventSchedule(int year, int month) {
		this (year,month,cal.get(Calendar.DATE));
		System.out.println("EventSchedule(int,int) was called");
	}

	/**
	 * The  constructor sets year, month and date to the current date.
	 * @param year The year of this EventSchedule.
	 * @param month of this EventSchedule.
	 * @param day of this EventSchedule.

	 */

	public EventSchedule(int year, int month, int day) {
		this (year,month,day,"unlisted Event");



		System.out.println("EventSchedule(int,int,int) was called");


	}
	public EventSchedule(int year, int month, int day, String eventName ) {
		this.eventName=eventName;
		this.year=year;
		this.month=month;
		this.day=day;
		System.out.println("EventSchedule(int,int,int,String ) was called");
	}

	/**
	 * Returns the year for this EventSchedule.
	 * @return the year for this EventSchedule.
	 */
	public int getyear() {
		return year;
	}
	/**
	 * Sets the year state for this EventSchedule.
	 * @param year  this is the year to set for EventSchedule.
	 */
	public void setyear(int year) {
		this.year = year;
	}
	/**
	 * Returns true if this EventSchedule is hybrid, false if it is not.
	 * @return true if this EventSchedule is hybrid, false if it is not.
	 */
	public int getMonth() {
		return month;
	}
	/**
	 * Sets the month state for this EventSchedule.
	 * @param month this is the month to set for EventSchedule.
	 */

	public void setyMonth(int month) {
		this.month = month;
	}

	/**
	 * day of this event in EventSchedule.
	 * @return day of this EventSchedule.
	 */
	public double getday() {
		return day;
	}
	/**
	 * Sets the day of this EventSchedule.
	 * @param day The day of this EventSchedule .
	 */
	public void setday(int day) {
		this.day = day;
	}
	/**
	 * 
	 * @return A String representation of this EventSchedule, each field is separated 
	 * by a comma in the order of year, month, day
	 */
	/**
	 * it return Format of report according to year month and date 
	 * @return  String.format
	 */
	public String createReport() {
		return String.format("EventSchedule, " + "year: %d, Month: %d, Day: %d, name:%S%n",year,month,day,eventName);
	}
}

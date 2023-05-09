package lab3;


/**
 * This is the driver class for this program. This means that it just runs the application with a method
 * main.
 * @author Amir Salehi
 */
public class TestDemo {

	/**
	 * @param args Command line arguments are not used by this program.
	 */

	public static void main(String[] args) {


		System.out.println(	"EventSchedule1");
		EventSchedule plan= new  EventSchedule();

		System.out.println(plan.createReport());

		System.out.println(	"EventSchedule2");
		EventSchedule plan2= new  EventSchedule(2025);

		System.out.println(plan2.createReport());


		System.out.println(	"EventSchedule3");
		EventSchedule plan3= new  EventSchedule(2028,12);

		System.out.println(plan3.createReport());

		System.out.println(	"EventSchedule4");
		EventSchedule plan4= new  EventSchedule(2028,12,30);

		System.out.println(plan4.createReport());

		System.out.println(	"event name ");

		EventSchedule plan5= new  EventSchedule(2025,9,14,"unlisted event");
		System.out.println(plan5.createReport());



	}

}

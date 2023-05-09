
import java.util.Scanner;

/**
 * This is our MyHealthDataTest  class that is our main program , we test our Patient class here ;
 * The  program prompt user to input some information about new patient and then it calculates BMI and age of patient in years
 *  and TargetHeartRate and MaximumHeartRate according to Patient class 
 * then shows total result in the screen.
 * @author Amir salehi
 * @see Patient
 */
public class MyHealthDataTest {
	/**
	 * args of an array are not used in the program
	 * @param args of an array are not used in the program
	 */
	public static void main(String[] args) {
		Patient patient=new Patient();
		Scanner keyboard = new Scanner(System.in);
		String FirstName;
		String LastName;
		String Gender;
		int BirthYear;
		int BirthMonth;
		int BirthDay;
		double Height;
		double Weight;
		System.out.println("What is your First name?") ;
		FirstName=keyboard.nextLine();
		patient.setFirstName(FirstName);
		System.out.println("What is your Last name?") ;
		LastName=keyboard.nextLine();
		patient.setLastName(LastName);
		System.out.println("What is your Gender?") ;
		Gender=keyboard.nextLine();
		patient.setGender(Gender);
		System.out.println("What is your BirthYear?") ;
		BirthYear=keyboard.nextInt();
		patient.setBirthYear(BirthYear);
		keyboard.nextLine();
		System.out.println("What is your BirthMonth?") ;
		BirthMonth=keyboard.nextInt();
		patient.setBirthMonth(BirthMonth);
		keyboard.nextLine();
		System.out.println("What is your BirthDay?") ;
		BirthDay=keyboard.nextInt();
		patient.setBirthDay(BirthDay);
		keyboard.nextLine();
		System.out.println("How much is your Height?") ;
		Height=keyboard.nextDouble();
		patient.setHeight(Height);
		keyboard.nextLine();
		System.out.println("How much is your Weight?") ;
		Weight=keyboard.nextDouble();
		patient.setWeight(Weight); 
		keyboard.nextLine();
		patient.displayMyHealthData();
		System.out.printf("Patient ages is:%d  years old %n ",patient.AgeInYears());
		System.out.printf("Your Maximun Heart Rate is: %d%n",patient.MaximumHeartRate());
		System.out.println(patient.TargetHeartRate());

	}

}

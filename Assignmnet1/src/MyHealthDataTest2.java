
/**
 * In this Class we have two test ; one test that we will test the result of BMI with what we expected ; its about a male  patient
 *  that born in 1970/10/9 his height is 60 inch and his weight is 170 pounds ; we will see there is not
 *  any significant  difference between them with tolerance of 0.001 ; thus test 1 has been passed successfully.
 *  For test 2 ; we will give correct input as test 1 and calculation of our BMIError was correct ;but the problem was in the
 *   formula that we had
 *  divided by zero ; because of that our Test2 has been failed.
 * 
 * @author Amir salehi
 * @see Patient
 *
 */
public class MyHealthDataTest2 {
	/**
	 *args of an array are not used in the program
	 * @param args of an array are not used in the program
	 */
	public static void main(String[] args) {

		Patient patienttest1=new Patient("Ali","olu","Male",1970,10,9, 60,170);
		double newBMi;
		newBMi=patienttest1.getBMI();
		double expected=33.197;
		double tolerane =0.001;
		if (newBMi-expected<tolerane) {
			System.out.println("Test1 has passed successfully.");
		} else {
			System.out.println("Tes has failed.");
		}

		Patient patienttest2=new Patient("Ali","olu","Male",1970,10,9, 60,170);
		double newBMi2;
		newBMi2=patienttest2.getBMIError();
		double expected2=33.197;
		double tolerane2 =0.001;
		if (newBMi2-expected2<tolerane2) {
			System.out.println("test1 has passed successfully.");
		} else {
			System.out.println("Test2  has failed.");
		}
	}
}


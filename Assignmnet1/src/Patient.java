
import java.util.Calendar;
/**
 * This is our Patient class that we want use this class in our main programs ( MyHealthDataTest , MyHealthDataTest2)  that after prompting user to input some information about the patient ; 
 * The program should be able to  use this class to calculates BMI and age of patient in years and TargetHeartRate and MaximumHeartRate
 * @see MyHealthDataTest 
 * @see MyHealthDataTest2
 * @author Amir Salehi
 */
public class Patient {

	private String FirstName;
	private String LastName;
	private String Gender;
	private int BirthYear;
	private int BirthMonth;
	private int BirthDay;
	private double Height;
	private double Weight;
	/**
	 * This is our Patient Constructor that does not have any arguments
	 */
	public Patient( ){
	}
	/**
	 * This is our Patient Constructor that has arguments like First name , last name , gender , birth year , birth month,birthday and height and weight of the patient 
	 *
	 * @param FirstName This is Firstname that we will get from patient 
	 * 
	 * @param LastName This is LastName that we will get from patient 
	 * 
	 * @param Gender This is Gender that we will get from patient 
	 *  
	 * @param BirthYear This is BirthYear that we will get from patient 
	 *  
	 * @param BirthMonth This is BirthMonth that we will get from patient 
	 *
	 * @param birthDay  This is birthDay that we will get from patient 
	 *
	 * @param Height  This is Height that we will get from patient 
	 *
	 * @param Weight  This is  Weight that we will get from patient 
	 */

	public Patient(String FirstName,	String LastName,String Gender,	int BirthYear,int BirthMonth,int birthDay,double Height,double Weight) {
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.Gender=Gender;
		this.BirthYear=BirthYear;
		this.BirthMonth=BirthMonth;
		this.BirthDay=birthDay;
		this.Height=Height;
		this.Weight=Weight;
	}

	/**
	 * Return Firstname of the patient 
	 * @return FirstName
	 */
	public String getFirstName() {
		return FirstName;
	}
	/**
	 *  this is the firstName that we get from patient
	 * @param firstName , this is the firstName that we get from patient
	 */
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	/**
	 * Return LastName of the patient 
	 * @return LastName
	 */
	public String getLastName() {
		return LastName;
	}
	/**
	 * this is the lastName that we get from patient
	 * @param lastName this is the lastName that we get from patient
	 */
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	/**
	 * Return Gender of the patient 
	 * @return Gender
	 */
	public String getGender() {
		return Gender;
	}
	/**
	 *this is the gender  that we get from patient
	 * @param gender this is the gender  that we get from patient
	 */
	public void setGender(String gender) {
		Gender = gender;
	}
	/**
	 * Return BirthYear of the patient 
	 * @return BirthYear
	 */
	public int getBirthYear() {
		return BirthYear;
	}
	/**
	 *this is the birthYear that we get from patient
	 * @param birthYear this is the birthYear that we get from patient
	 */
	public void setBirthYear(int birthYear) {
		BirthYear = birthYear;
	}
	/**
	 * Return BirthMonth of the patient 
	 * @return BirthMonth
	 */
	public int getBirthMonth() {
		return BirthMonth;
	}
	/**
	 *this is the birthMonth that we get from patient
	 * @param birthMonth this is the birthMonth that we get from patient
	 */
	public void setBirthMonth(int birthMonth) {
		BirthMonth = birthMonth;
	}
	/**
	 * Return BirthDay of the patient 
	 * @return BirthDay
	 */
	public int getBirthDay() {
		return BirthDay;
	}
	/**
	 * this is the birthDay that we get from patient
	 * @param birthDay this is the birthDay that we get from patient
	 */
	public void setBirthDay(int birthDay) {
		this.BirthDay = birthDay;
	}
	/**
	 * Return Height of the patient 
	 * @return Height
	 */
	public double getHeight() {
		return Height;
	}
	/**
	 * this is the height that we get from patient
	 *@param height this is the height that we get from patient
	 */
	public void setHeight(double height) {
		Height = height;
	}
	/**
	 * Return Weight of the patient 
	 * @return Weight
	 */
	public double getWeight() {
		return Weight;
	}
	/**
	 *this is the weight that we get from patient
	 * @param weight this is the weight that we get from patient
	 */
	public void setWeight(double weight) {
		Weight = weight;
	}
	/**
	 * This method calculate BMI According to Weight and Height 
	 * @return getBMI
	 */
	public double getBMI() {
		return (getWeight() * 703) / (getHeight() * getHeight());
	} 
	/**
	 * This Method has and error It was supposed to Calculate BMI but there is an error in coding 
	 * @return getBMIError
	 */
	public double getBMIError() {
		return (getWeight() * 703) / (getHeight() * getHeight()*0);
	} 
	/**
	 * This Method Display Health data provided to it like ; patient full name; gender;Birthdate;Height;Weight  and shows some Information about BMI 
	 */
	public void displayMyHealthData() 
	{ 
		System.out.printf("PatientFullname : %s %s%n", getFirstName(), getLastName());
		System.out.printf("Gender: %s%n", getGender());
		System.out.printf("Birthdate: %d/%d/%d%n", getBirthMonth(), getBirthDay(), getBirthYear());
		System.out.printf("Height: %.3f inches%n", getHeight());
		System.out.printf("Weight: %.3f pounds%n", getWeight());
		System.out.printf("BMI: %.3f%n", getBMI());
		System.out.println("BMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");   
	} 
	static Calendar cal = Calendar.getInstance();
	/**
	 * this method is based on current year and the patient born year that will calculate how many years old is our patient
	 * @return current-BirthYear
	 */

	public int AgeInYears() {
		int current = Calendar.getInstance().get(Calendar.YEAR);
		return current-BirthYear;
	}
	/**
	 * This method will calculate MaximumHeartRate()
	 * @return 220- AgeInYears()
	 */
	public int MaximumHeartRate() {
		return 220- AgeInYears();
	}

	/** This method return a message with some calculation about our patient  TargetHeartRate
	 * @return  "Your TargetHeartRate is: "+MinimunTargetHeartRat+ " - " + MaximunTargetHeartRat;	
	 */
	public String TargetHeartRate() {
		int MaximumHeartRate = MaximumHeartRate();
		int MinimunTargetHeartRat;
		MinimunTargetHeartRat= (int) (0.5*MaximumHeartRate);
		int MaximunTargetHeartRat;
		MaximunTargetHeartRat=(int) (0.85*MaximumHeartRate);
		return "Your TargetHeartRate is: "+MinimunTargetHeartRat+ " - " + MaximunTargetHeartRat;	
	}
}



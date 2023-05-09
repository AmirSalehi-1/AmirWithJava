
/**
 * This is SalariedProgrammer class inherited from Programmer
 * @author Amir
 *
 */
public  class SalariedProgrammer extends  Programmer  {
	private double weeklySalary;


	public SalariedProgrammer(String firstName, String lastName, 
			String socialSecurityNumber, int month, int year, 
			double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber, month, year);

		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException(
					"Weekly salary must be >= 0.0");
		}

		this.weeklySalary = weeklySalary;
	} 

	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException(
					"Weekly salary must be >= 0.0");
		}

		this.weeklySalary = weeklySalary;
	} 

	//return salary
	public double getWeeklySalary() {
		return weeklySalary;
	} 



	@Override                                                           
	public double earnings() {                                          
		return getWeeklySalary();                                        
	}                                             


	@Override        
	public String toString() {
		return String.format("salaried Programmer: %s %s%n%s: %s%n%s: $%,.2f",
				getFirstName(), getLastName(),
				"social security number", getSocialSecurityNumber(),
				"weekly salary", getWeeklySalary());
	}                                       

	@Override
	public double getPaymentAmount() {
		return getWeeklySalary();
	}

	@Override
	public void display() {
		double paymentDue = getPaymentAmount();
		double incomeTax = paymentDue * 0.3;
		System.out.printf("payment due: $%.2f\nincome tax: $%.2f\n", paymentDue, incomeTax);
	}
}



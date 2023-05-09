
/**
 * This is HourlyProgrammer class inherited from Programmer
 * @author Amir
 *
 */
public  class HourlyProgrammer extends Programmer {
	private double wage; 
	private double hours; 

	public HourlyProgrammer(String firstName, String lastName,
			String socialSecurityNumber, int month, int year,
			double wage, double hours) {
		super(firstName, lastName, socialSecurityNumber, month, year);

		if (wage < 0.0) {
			throw new IllegalArgumentException(
					"Hourly wage must be >= 0.0");
		}

		if ((hours < 0.0) || (hours > 168.0)) { 
			throw new IllegalArgumentException(
					"Hours worked must be >= 0.0 and <= 168.0");
		}

		this.wage = wage;
		this.hours = hours;
	} 

	public void setWage(double wage) {
		if (wage < 0.0) { 
			throw new IllegalArgumentException(
					"Hourly wage must be >= 0.0");
		}

		this.wage = wage;
	} 


	public double getWage() {
		return wage;
	} 


	public void setHours(double hours) {
		if ((hours < 0.0) || (hours > 168.0)) { 
			throw new IllegalArgumentException(
					"Hours worked must be >= 0.0 and <= 168.0");
		}

		this.hours = hours;
	} 

	public double getHours() {
		return hours;
	} 

	@Override                                                           
	public double earnings() {                                            
		if (getHours() <= 40) { // no overtime                           
			return getWage() * getHours();   
		}
		else {                                                             
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
		}
	}                                          

	@Override                                                             
	public String toString() {
		return String.format("hourly Programmer: %s %s%n%s: %s%n%s: $%,.2f; %s: %.2f",
				getFirstName(), getLastName(),
				"social security number", getSocialSecurityNumber(),
				"hourly wage", getWage(),
				"hours worked", getHours());
	}


	@Override
	public double getPaymentAmount() {
		double payment;

		if (getHours() <= 40) {
			payment = getWage() * getHours();
		} else {
			payment = 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
		}
		return payment;
	}

	@Override
	public void display() {
		double paymentDue = getPaymentAmount();
		double incomeTax = paymentDue * 0.3;
		System.out.printf("payment due: $%.2f\nincome tax: $%.2f\n", paymentDue, incomeTax);
	}
}



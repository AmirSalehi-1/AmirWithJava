

/**
 * This is an abstract superclass that IMPLEMENTS the Payme interface
 * @author Amir
 *
 */
public abstract class Programmer implements Payme {

	private String firstName;
	private String lastName;
	private String socialSecurityNumber;

	public Programmer(String first, String last, String ssn, int month, int year) {
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
	}


	/**
	 * this return firstName
	 * @return this return firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * This return lastname
	 * @return This return lastname
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * This return socialSecurityNumber
	 * @return This return socialSecurityNumber
	 */
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;

	}
	/**
	 * This return toString in regard to social security number
	 */
	public String toString() {
		return String.format("%s %s\n%s: %s", 
				getFirstName(), getLastName(),
				"social security number", getSocialSecurityNumber());
	}



	public abstract double earnings();

	@Override
	public void display() {
		double paymentAmount = getPaymentAmount();
		double incomeTax = paymentAmount * 0.30;

		System.out.printf("payment due: $%.2f\nincome tax: $%.2f\n", paymentAmount, incomeTax);
	}

}


/**
 * This is CommissionProgrammer class inherited from Programmer
 * @author Amir
 *
 */
public class CommissionProgrammer extends Programmer { 

	private double grossSales; 
	private double commissionRate; 

	public CommissionProgrammer(String firstName, String lastName, 
			String socialSecurityNumber, int month, int year, 
			double grossSales, double commissionRate) {
		super(firstName, lastName, socialSecurityNumber, month, year);

		if (commissionRate <= 0.0 || commissionRate >= 1.0) { 
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0");
		}

		if (grossSales < 0.0) { 
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	} 


	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0) { 
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		this.grossSales = grossSales;
	} 

	public double getGrossSales() {
		return grossSales;
	} 

	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate >= 1.0) { 
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0");
		}

		this.commissionRate = commissionRate;
	} 

	/**
	 * this return commissionrate
	 * @return this return commissionrate
	 */
	public double getCommissionRate() {
		return commissionRate;
	} 



	@Override                                                           
	public double earnings() {                                            
		return getCommissionRate() * getGrossSales();                    
	}                                             

	@Override
	public String toString() {
		return String.format("commission programmer: %s\n%s: $%,.2f; %s: %.2f",
				super.toString(), "gross sales", getGrossSales(),
				"commission rate", getCommissionRate());
	}
	@Override    

	public double getPaymentAmount() {                                            
		return getCommissionRate() * getGrossSales();                    
	}                                             

	public void display() {
		double paymentDue = getPaymentAmount();
		double incomeTax = paymentDue * 0.3;
		System.out.printf("payment due: $%.2f\nincome tax: $%.2f\n", paymentDue, incomeTax);
	}

}


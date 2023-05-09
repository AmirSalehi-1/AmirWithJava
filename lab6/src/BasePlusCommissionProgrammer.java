
/**
 * this is BasePlusCommissionProgramme inherited from  CommissionProgrammer
 * @author Amir
 *
 */
public class BasePlusCommissionProgrammer extends CommissionProgrammer { 

	private double baseSalary;

	public BasePlusCommissionProgrammer(String firstName, String lastName, 
			String socialSecurityNumber, int month, int year, 
			double grossSales, double commissionRate, double baseSalary) {
		super(firstName, lastName, socialSecurityNumber, 
				month, year, grossSales, commissionRate);

		if (baseSalary < 0.0) {               
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}

		this.baseSalary = baseSalary;                
	}

	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0) { 
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}

		this.baseSalary = baseSalary;                
	} 

	public double getBaseSalary() {
		return baseSalary;
	}
	@Override                                                            
	public double getPaymentAmount() {                                             
		return getBaseSalary() + super.getPaymentAmount();                        
	} 


	@Override                                                            
	public double earnings() {                                             
		return getBaseSalary() + super.earnings();                        
	} 


	@Override   
	/**
	 * this is toString Method for base salary
	 * @return this is toString Method for base salary
	 */
	public String toString() {
		return String.format("%s %s; %s: $%,.2f",
				"base-salaried", super.toString(),
				"base salary", getBaseSalary());
	}            

	public void display() {
		double paymentDue = getPaymentAmount();
		double incomeTax = paymentDue * 0.3;
		System.out.printf("payment due: $%.2f\nincome tax: $%.2f\n", paymentDue, incomeTax);
	}


}




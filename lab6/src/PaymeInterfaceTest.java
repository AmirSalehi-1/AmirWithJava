


/**
 * This is PaymeInterfaceTest class that is  the test for your interface Payme.
 * @author Amir
 *
 */
public class PaymeInterfaceTest  {

	public static void main(String[] args) {


		Payme[] paymeObjects = new Payme[6];


		paymeObjects[0] = new Invoice("22776", "brakes", 3, 300.00);
		paymeObjects[1] = new Invoice("33442", "gear", 5, 90.99);
		paymeObjects[2] = new SalariedProgrammer("Chioma", "Chidimma", "345-67-0001", 1, 2022, 320.00);
		paymeObjects[3] = new HourlyProgrammer("Amara", "Chukwu", "234-56-7770", 1, 2022, 18.95, 40);
		paymeObjects[4] = new CommissionProgrammer("Peter", "Goodman", "123-45-6999", 1, 2022, 16500.00, 0.44);
		paymeObjects[5] = new BasePlusCommissionProgrammer("Amir", "Salehi", "102-34-5888", 1, 2022, 1200.00, 0.04, 720.00);


		System.out.println(
				"Payment for Invoices and Programmers are processed polymorphically:\n"); 

		for (Payme currentPayme : paymeObjects) {

			System.out.printf("%s \n", currentPayme.toString());

			if (currentPayme instanceof BasePlusCommissionProgrammer) {
				BasePlusCommissionProgrammer programmer = (BasePlusCommissionProgrammer) currentPayme;
				double oldBaseSalary = programmer.getBaseSalary();
				programmer.setBaseSalary(1.10 * oldBaseSalary);
				System.out.printf("new base salary with 10%% increase is: $%,.2f\n", programmer.getBaseSalary());
			}

			currentPayme.display();
			System.out.println();




		}
	}
}



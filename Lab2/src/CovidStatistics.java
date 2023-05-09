
import java.util.Scanner;
/**
 *The CovidStatistics class in our system serves multiple functions related to the tracking of COVID-19 patients. 
 *For each month and province, it provides data on the number of patients reported. 
 *Moreover, it's capable of displaying the total count of patients across all provinces within a specific month.
 * It also includes an interactive feature that prompts users to select their province, upon which it reveals the total number of patients for that selected province.
 * @author - Amir Salehi
 * 
 */

public class CovidStatistics
{
	/**
	 * This is our CovidStatistics class that Show us for each month and province how many patients we had and even it shows us the sum of patients in all of province in one month and also it prompt user to choose his province and shows the sum of patients in his province.
	 * @param args this is our args that it does not do anything in this program 
	 */
	public static void main(String[] args)
	{
		final int ROWS = 7;
		final int COLUMNS = 8;

		int[][] patients = 
			{ 
					{  2200, 1100, 1200, 1000, 1015, 2000, 1092, 2204 },
					{  5020, 6105, 2009, 9047, 1016, 2014, 2708, 2308 }, 
					{  1720, 2406, 3054, 1018, 1023, 3100, 1406, 1502 }, 
					{  1490, 2002, 2016, 5008, 2044, 1055, 1607, 2201 },
					{  1520, 1007, 1092, 2065, 1023, 1010, 1046, 1502 },
					{  1670, 1201, 2008, 2001, 1086, 1009, 1041, 1706 },
					{  1870, 2001, 2078, 1006, 1053, 1702, 1009, 1406 }

			};

		String[] provinces = 
			{ 
					"Ontario", 
					"Quebec", 
					"Nova Scotia",
					"New Brunswick", 
					"Manitoba", 
					"British Columbia",
					"Prince Edward Island"         
			};

		System.out.println("Month                          feb	    March	    April          May  	     June	    July	Aug	     Sept");
		System.out.println();


		
		for ( int row=0; row< patients.length ; row++ )
			for (int index = 0 ; index<provinces.length;index++)
			{
				System.out.printf( "%-20s",provinces[index]);

				{
					for (int col=0 ;col<patients[row].length; col++ )
					{
						System.out.printf("%15d", patients[row][col]);

					}
					System.out.println();
					row++;
				}
			}

	

		System.out.println();
		System.out.print("Recovered Patients   ");

	

		int sum=0;
		for (int col = 0 ; col<8;col++) {
			for (int row=0; row<7; row++)
				sum=sum+patients[row][col];
			System.out.printf("%15d", sum);
			sum=0;
		}

		System.out.println(); 
		System.out.println(); 
		System.out.println("               Vaccinate and maintain good health practices!" );


		System.out.println("please input your province number:");
		Scanner keyboard=new Scanner(System.in);
		int row = keyboard.nextInt();
		int sum2 = 0;
		for (int col=0; col<8; col++)
			sum2=sum2+patients[row][col];
		System.out.print( " The province that you choose is : "+provinces[row]+"  Total patients in this province is: "+sum2);

	}
}













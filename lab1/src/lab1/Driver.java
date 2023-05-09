package lab1;

import java.util.Scanner;


/** *This main program is designed to output a unique identifier for each student. 
 * It accomplishes this by first extracting the last three characters of the student's first name. Next, it obtains the last two digits of the student's ID number and performs a modulus operation with 17 on them, ensuring that the result is always two characters long. 
 * Finally, it appends the first character of the student's family name. The output string represents this combination of selected elements from the student's first name, ID number, and family name.
 * @author Amir Salehi
 *  .
 */

public class Driver {

	public static void main(String[] args) {

		Username username =new Username();
		String firstname;
		String lastname;
		long studentid;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("please input your first name");
		firstname=keyboard.nextLine();
		username.setFirstname(firstname);

		System.out.println("please input your last name");
		lastname=keyboard.nextLine();
		username.setLastname(lastname);

		System.out.println("please input your Student id");
		studentid=keyboard.nextLong();
		username.SetStudentid(studentid);
		System.out.println(username.generateUsername());
	}
}

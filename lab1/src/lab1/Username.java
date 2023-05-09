package lab1;

/**
 *  This is Username class that has our constructors generateUsername ,that use three last digit of user first name and two last digit of user student id module by 17, and it should be two character  and  use first character of user  last name.
 * @author Amir salehi
 *
 */
public class Username {

	private String firstname;
	private String lastname;
	private long studentid;

	public Username() {
	}
	/**this returns firstname of student 
	 * @return firstname
	 * 
	 */
	public String getFirstname() {
		return firstname;

	}
	/**
	 * this is first name that is part of our information
	 * @param firstname that is part of our information
	 */
	public void  setFirstname(String firstname) {
		this.firstname=firstname;
	} 
	/**this return the last name of student 
	 * @return lastname
	 * 
	 */
	public String getLasttname() {
		return lastname;

	}
	/**  This is lastname that is part of our information     
	 * @param lastname that is part of our information
	 */
	public void setLastname(String lastname) {
		this.lastname=lastname;
	} 
	/**this return studentid of student 
	 * @return  studentid
	 * 
	 */
	public long getStudentid() {
		return studentid;

	}
	/**
	 * this is student id that is part of our information
	 * @param studentid that is part of our information
	 */
	public void  SetStudentid(long studentid) {
		this.studentid=studentid;
	} 

	/**
	 * This worker method generate user name based on last three character of a name and two last digit of student id and modulu t 17 that it should be two character and then first character of family name of student 
	 * @return sub1,sub2 and amend or if mosulu to 17 is biger than 10 , then sub1 , sub4 and sub 2 
	 */
	public String generateUsername()  {
		String sub1=getFirstname().substring(getFirstname().length()-3,getFirstname().length());
		String sub2=getLasttname().substring(0,1);
		long sub3=Math.abs(getStudentid()%100);
		long sub4 =sub3%17;
		String amend;
		if (sub4<10) {
			amend="0"+sub4;
			return sub1+ amend+sub2;	
		}
		else
		{
			return sub1+ sub4+sub2;	
		}
	}
}

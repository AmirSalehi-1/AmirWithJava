
package lab5;
/**
 *  This is Subclass of SalesSupervisor that has its features and we add department to it . 
 * @author Amir
 *
 */
public class SalesChief extends SalesSupervisor{
	public String department;
	
	   public SalesChief(String name, int age, String location, String department) {
	        super(name, age, location);
	        this.department = department;
	    }
	   /**
	    * Return dpartment of where agent work 
	    * @return Return dpartment of where agent work 
	    */
	   public String getDepartment() {
	        return department;
	    }
	   public void setDepartment(String department) {
	        this.department = department;
	    }
/** Return String of Super class and department that added
 * @return Return String of Super class and department that added
 */
public String toString() {
    return "Sales Chief [super="+ super.toString() +
           
            "department=" + department +"]";
}
public boolean equals(Object obj) {
    if (!(obj instanceof SalesChief)) return false;
    SalesChief salesChief = (SalesChief) obj;
    return super.equals(obj) && this.department.equals(salesChief.getDepartment());
}
}

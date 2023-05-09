
package lab5;
/**
 *  This is Subclass of SalesSupervisor that has its features and we add location to it . 
 * @author Amir
 *
 */
public class SalesSupervisor extends SalesAgent {
String location;


public SalesSupervisor(String name, int age, String location) {
    super(name, age);
    this.location = location;
}
public String getLocation() {
    return location;
}

public void setLocation(String location) {
    this.location = location;
}
/**Return String of Super classs and location that added
 * @return Return String of Super classs and location that added
 */
public String toString() {
    return " Sales Supervisor [super="+  super.toString() +
            "location=" + location+"]" ;
}
@Override
public boolean equals(Object obj) {
    if (!(obj instanceof SalesSupervisor)) return false;
    SalesSupervisor salesSupervisor = (SalesSupervisor) obj;
    return super.equals(obj) && this.location.equals(salesSupervisor.getLocation());
}
}
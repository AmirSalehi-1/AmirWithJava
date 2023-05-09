
package lab5;
/**
 * 
   This program is the tests for the SalesAgent class including the subclasses that we used  Polymorphism.
   when we call println() to print an object, the toString() method of that object is called.
 * @author Amir
 *
 */
public class SalesAgentTest2
{  

	   public static final int MAX_AGENTS = 2;
	 
   public static void main(String[] args)
   {
		        SalesAgent[] agents = new SalesAgent[]{
		                new SalesAgent("Abar", 22),
		                new SalesAgent("gholi", 35),
		                new SalesSupervisor("Mohammad", 35, "new York"),
		                new SalesChief("Amir", 35, "Ottawa", "Marketing")
		        };
		        for (SalesAgent agent : agents) {
		            System.out.println(agent);
		        }
		    }
   }

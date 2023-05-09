
package lab5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * This program is the first test for the SalesAgent class including the subclass. 
 * that we have two object of salesagent , one SalesSupervisor and one SalesChief and we print toStrig of each of them.
 * @author Amir
 *
 */
public class SalesAgentTest
{  
   public static void main(String[] args)
   {
	   SalesAgent agent1=new SalesAgent("AKbar", 22);
	   SalesAgent agent2=new SalesAgent("gholi", 35);
	   SalesSupervisor superviser1=new SalesSupervisor("Mohammad",40,"NewYork");
	   SalesChief chief=new SalesChief("Amir",35,"Ottawa","marketing");
	   System.out.println("  " + agent1.toString());
       System.out.println("  " + agent2.toString());
       System.out.println(" " + superviser1.toString());
       System.out.println(" " + chief.toString());
}
 


}


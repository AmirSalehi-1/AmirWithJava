
package lab5;

/**
 * This class shows a Sales Agent with a name and age.
 * @author Amir This class shows a Sales Agent with a name and age.
 *
 */
public class SalesAgent
{  
   private String name;
   private int age;

/**
 * 
       In this portion of your code, construct a SalesAgent object.
      @param name the name of the Sales Agent
      @param age the age of the Sales Agent
 */
   public SalesAgent(String name, int age) {
       this.name = name;
       this.age = age;
   }
/**
 * Return name of agent
 * @return return name 
 */
   public String getName() {
       return name;
   }
/**
 * Return age of agent
 * @return age
 */
   public int getAge() {
       return age;
   }

   /**
      This portion of your code returns the string representation of the object.
      @return a string representation of the object
   */
/**Return name and age of agent
 * @return our String  consist of Name and age of agent
 */
   public String toString()
   {  
      return "Sales Agent [name=" + name + ",age=" + age + "]";
   }

   @Override
   public boolean equals(Object obj){                          
       if (!(obj instanceof SalesAgent)) return false;     
       SalesAgent salesAgent = (SalesAgent)obj;        
       return (this.age == salesAgent.getAge()) && (this.name).equals(salesAgent.getName());
   }
   
   
}
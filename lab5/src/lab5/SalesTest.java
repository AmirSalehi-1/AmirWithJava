package lab5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
/**
 * This class includes our Junit test ; that test equality of object of salesVp class that is subclass of SalesChief
 * @author Amir
 *
 */
public class SalesTest {
	@Test
    public void testAssertEquals(){
       SalesVP vp1 = new SalesVP("Zhang", 23, "Ottawa", "Sales", 37027.812);            
       SalesVP vp2 = new SalesVP("Zhang", 23, "Ottawa", "Sales", 37027.818);        
       assertEquals(vp1,vp2);
       System.out.println("assertEquals test completed");
	}
}

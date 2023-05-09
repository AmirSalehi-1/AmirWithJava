/*student name :amir Salehi
 * course name:CST8284
 * Course Section:313
 * lab professor:David Houtman
 * Due date: feb 2023
 * Description:  This is our  YourPurchasesTest2  class thar tun with errors and we added three test to it , one with exact  change ;one with partial and other with exact change in dollar 
 */
package w23lab4;


import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
/**This is our  YourPurchasesTest2  class that run with errors and we added two test to it , one with null ; second Not null
 */
public class YourPurchasesTest2 {

	private static final double EPSILON = 1E-12;
	
	@Test
	public void testCalculateChange() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.5);
		aPurchase.receivePayment(5, 0, 0, 0, 0);
		double changeResult = aPurchase.CalculateChange();
		double expected = 3.50;
	    Assert.assertEquals(expected, changeResult, EPSILON);
	}
	
@Test
public void testCalculateChangExact() {
    YourPurchases aPurchase = new YourPurchases();
    aPurchase.recordPurchase(2.5);
    aPurchase.receivePayment(2, 0, 0, 0, 0);
    double changeResult = aPurchase.CalculateChange();
    double expected = 0;
    Assert.assertNull( aPurchase);
}
    @Test
    public void testCalculateChangExac2t() {
        YourPurchases aPurchase = new YourPurchases();
        aPurchase.recordPurchase(2.5);
        aPurchase.receivePayment(2, 0, 0, 0, 0);
        double changeResult = aPurchase.CalculateChange();
        double expected = 0;
        Assert.assertNotNull( aPurchase);
}
}


	
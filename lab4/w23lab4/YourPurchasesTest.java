package w23lab4;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
/**
 * this is our YourPurchasesTest that we have three test in it the first test is about testGetPayment() method that we tested .getPurchase method that  it  run without error
the second test is about when both classes are loaded with 0.10 ; that it has no error
the third test shows error when we loaded about 0.7 .
 * 
 * @author Amir salehi
 *
 */
public class YourPurchasesTest
{
   private static final double EPSILON = 1E-12;

   @Test
	public void testGetPayment() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(2.0);
		double result = aPurchase.getPurchase();
		double expected = 2.0;
		Assert.assertEquals(expected, result, EPSILON);
   }	
   @Test
	public void testComparePurchases1() {
		YourPurchases aPurchase = new YourPurchases();
		YourPurchases bPurchase = new YourPurchases();
		aPurchase.receivePayment(0, 0, 1, 0, 0);
		bPurchase.receivePayment(0, 0, 0, 1, 5);
		Assert.assertTrue(aPurchase.getPayment() == bPurchase.getPayment());
	}
   @Test
public void testComparePurchases2() {
	YourPurchases aPurchase = new YourPurchases();
	YourPurchases bPurchase = new YourPurchases();
	aPurchase.receivePayment(0, 0, 7, 0, 0);
	bPurchase.receivePayment(0, 0, 0, 1, 5);
	Assert.assertTrue(aPurchase.getPayment() == bPurchase.getPayment());
	}
   
   
}





/**
 * This is the Invoice class which is an UNRELATED CLASS to the Programmer superclass
 * @author Amir
 *
 */
public class Invoice implements Payme {

	private String partNumber; 
	private String partDescription;
	private int quantity;
	private double pricePerItem;


	public Invoice(String part, String description, int count, 
			double price) {
		partNumber = part;
		partDescription = description;
		setQuantity(count); 
		setPricePerItem(price); 
	}

	public void setPartNumber(String part) {
		partNumber = part; 
	}


	public String getPartNumber() {
		return partNumber;
	}


	public void setPartDescription(String description) {
		partDescription = description; 
	}

	/**
	 * this return partDescription
	 * @return partDescription
	 */
	public String getPartDescription() {
		return partDescription;
	}

	/**
	 * this set quantity
	 * @param count this set quantity
	 */
	public void setQuantity(int count) {
		quantity = (count < 0) ? 0 : count; // quantity cannot be negative
	}

	/**
	 * this return quantity
	 * @return quantity
	 */
	public int getQuantity() {
		return quantity;
	}


	public void setPricePerItem(double price) {
		pricePerItem = (price < 0.0) ? 0.0 : price; // validate price
	}

	/**
	 * This return pricePerItem
	 * @return pricePerItem
	 */

	public double getPricePerItem() {
		return pricePerItem;
	}

	/**
	 * This return toString in regard to invoice , part number ,quantity , price per Item
	 * @return This return toString in regard to invoice , part number ,quantity , price per Item
	 */
	@Override
	public String toString() {
		return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", 
				"invoice", "part number", getPartNumber(), getPartDescription(), 
				"quantity", getQuantity(), "price per item", getPricePerItem());
	} 

	@Override
	/**
	 * This return total cost 
	 * @return This return total cost 
	 */
	public double getPaymentAmount() {
		return getQuantity() * getPricePerItem(); // calculate total cost
	}

	@Override
	public void display() {
		double paymentDue = getPaymentAmount();
		double incomeTax = paymentDue * 0.3;
		System.out.println("payment due: $" + String.format("%.2f", paymentDue));
		System.out.println("income tax: $" + String.format("%.2f", incomeTax));

	}
}



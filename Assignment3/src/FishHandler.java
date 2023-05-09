


/**
 * 
 * This is FishHandler class it demonstrate rethrowing of an exception and for the output it show that the 
exception subclasses have been successfully caught.
 * @author Amir
 *
 */
public class FishHandler {
	/**
	 * This is main method 
	 *
	 * @param args this args does not do anything
	 */
	public static void main(String[] args) {
		try {
			easterStarting();
		} catch (Exception exception) {
			System.err.println("Caught : " + exception.getClass().getSimpleName());
			exception.printStackTrace();
		}
	}

	/**
	 * This method calls the easterEnding() 
	 * 
	 * @throws Exception if an exception is thrown in the easterEnding()
	 */
	public static void easterStarting() throws Exception {
		try {
			easterEnding();
		} catch (Exception exception) {
			System.err.println("caught and rethrowing : " + exception.getClass().getSimpleName());
			throw exception;
		}
	}
	/**
	 * This method throws an exception.
	 * 
	 * @throws Exception with this  message "Sample of Throws Exception"
	 */
	public static void easterEnding() throws Exception {
		throw new Exception("Sample of Throws Exception ");
	}
}




import java.io.IOException;
/**
 * This is OrderHandler that I show that the arrangement 
(order) of the catch blocks in your program is essential and OrderHandler.java should show a compilation error when you try catching 
the superclass exception type before the subclass exception type.
 * @author Amir
 *
 */
public class OrderHandler {

	public static void main(String[] args) {
		// Throwing superclass exception

		try {
			throw new Exception("Sample of throwing");
		} catch (Exception exception) {
			System.err.println("Caught : " + exception.getClass().getSimpleName());
			exception.printStackTrace();
		}
		// Throwing subclass exception
		try {
			throw new IOException("Sample IOException");
		} catch (IOException exception) {
			System.err.println("Caught IOException: " + exception.getClass().getSimpleName());
			exception.printStackTrace();
		} catch (Exception exception) {
			System.err.println("Caught Exception: " + exception.getClass().getSimpleName());
			exception.printStackTrace();
		}

		// Incorrect order of catch blocks - this will cause a compilation error

		/*try {
            throw new IOException("Sample of  IOException");
        } catch (Exception exception) {
            System.err.println("Caught Exception: " + exception.getClass().getSimpleName());
            exception.printStackTrace();
        }
        catch (IOException exception) {
            System.err.println("Caught IOException: " + exception.getClass().getSimpleName());
            exception.printStackTrace();} */



		//correct order of catch blocks
		try {
			throw new IOException("Sample of  IOException");
		} 
		catch (IOException exception) {
			System.err.println("Caught IOException: " + exception.getClass().getSimpleName());
			exception.printStackTrace();} 

		catch (Exception exception) {
			System.err.println("Caught Exception: " + exception.getClass().getSimpleName());
			exception.printStackTrace();
		}


	}
}




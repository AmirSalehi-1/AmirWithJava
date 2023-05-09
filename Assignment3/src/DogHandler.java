
import java.io.IOException;
/**
 * This is DogHandler class ; this program  try catch blocks which throw exceptions of types:
a. ExceptionDog
b. ExceptionPuppy
c. NullPointerException
d. IOException
and for the output it  show that that the 
exception subclasses have been successfully caught.
 */

public class DogHandler {

	public static void main(String[] args) {
		testExceptionDog();
		testExceptionPuppy();
		testNullPointerException();
		testIOException();
	}

	public static void testExceptionDog() {
		try {
			throw new ExceptionDog();
		} catch (Exception exception) {
			System.err.println("Caught Exception: " + exception.getClass().getSimpleName());
			exception.printStackTrace();
		}
	}

	public static void testExceptionPuppy() {
		try {
			throw new ExceptionPuppy();
		} catch (Exception e) {
			System.err.println("Caught Exception: " + e.getClass().getSimpleName());
			e.printStackTrace();
		}
	}

	@SuppressWarnings("null")
	public static void testNullPointerException() {
		try {
			String str = null;
			str.length();
		} catch (Exception exception) {
			System.err.println("Caught Exception: " + exception.getClass().getSimpleName());
			exception.printStackTrace();
		}
	}

	public static void testIOException() {
		try {
			throw new IOException("Sample IOException");
		} catch (Exception exception) {
			System.err.println("Caught Exception: " + exception.getClass().getSimpleName());
			exception.printStackTrace();
		}
	}
	/**
	 * this is Inner class ExceptionDog
	 * 
	 * @author Amir
	 *
	 */

	public static class ExceptionDog extends Exception {
		public ExceptionDog() {
			super("ExceptionDog");
		}
	}
	/**
	 * This is Inner class ExceptionPuppy
	 * @author Amir
	 *
	 */

	public static class ExceptionPuppy extends ExceptionDog {
		public ExceptionPuppy() {
			super();
		}
	}
}

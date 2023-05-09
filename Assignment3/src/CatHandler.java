


/**
 * 
 * This is CatHandler class that shows exception subclasses , ExceptionBeta and ExceptionGammer will be caught in the catch block of
type ExceptionAlpha ,for the output it shows that the exception subclasses have been successfully caught.
 * @author Amir
 *
 */
public class CatHandler {
	/**
	 * this is our main program that args do nothing here
	 * @param args this is our main program that args do nothing here
	 */
	public static void main(String[] args) {

		try {
			throw new ExceptionBeta();
		} catch (ExceptionAlpha exception) {
			System.err.println("Caught ExceptionAlpha");
			exception.printStackTrace();
		}
		try {
			throw new ExceptionGammer();
		} catch (ExceptionAlpha exception) {
			System.err.println("Caught ExceptionAlpha");
			exception.printStackTrace();
		}

	}
	/**
	 * This is Inner class ExceptionAlpha
	 * @author Amir
	 *
	 */
	// Inner class ExceptionAlpha
	public static class ExceptionAlpha extends Exception {
		public ExceptionAlpha() {
			super("ExceptionAlpha");
		}
	}
	/**
	 *  This is  Inner class ExceptionBeta
	 * @author Amir
	 *
	 */
	// Inner class ExceptionBeta
	public static class ExceptionBeta extends ExceptionAlpha {
		public ExceptionBeta() {
			super();
		}
	}
	/**
	 * This is  Inner class ExceptionGammer
	 * @author Amir
	 *
	 */
	// Inner class ExceptionGammer
	public static class ExceptionGammer extends ExceptionBeta {
		public ExceptionGammer() {
			super();
		}
	}
}

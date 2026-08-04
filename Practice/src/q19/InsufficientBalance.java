package q19;

/**
 * This class extends Exception class to throw InsufficientBalance exception.
 */
public class InsufficientBalance extends RuntimeException {
	public InsufficientBalance(String message) {
		super(message);
	}
}

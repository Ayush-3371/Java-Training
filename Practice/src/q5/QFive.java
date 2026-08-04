package q5;

/**
 * This program uses the ReverseString class
 * to reverse a String without using built-in functions.
 */

public class QFive {

	public static void main(String[] args) {
		String s = "Hello, This is my method to reverse a string in Java.";
		
		ReverseString r = new ReverseString();
		String ans = r.reverse(s);
		
		System.out.println(ans);
	}

}

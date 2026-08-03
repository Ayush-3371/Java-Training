package q5;

public class Q5 {

	public static void main(String[] args) {
		String s = "Hello, This is my method to reverse a string in Java.";
		
		ReverseString r = new ReverseString();
		String ans = r.reverse(s);
		
		System.out.println(ans);
	}

}

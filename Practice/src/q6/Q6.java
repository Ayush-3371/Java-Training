package q6;

public class Q6 {

	public static void main(String[] args) {
		String s = "Hello, This is my method to reverse a string in Java.";
		
		int[] ans = new int[2];
		
		countVovelsAndConsonants count = new countVovelsAndConsonants();
		
		ans = count.solve(s);
		
		System.out.println("Number of Vovels :" + ans[0] + "  Number of Consonants :" + ans[1]);
	}

}

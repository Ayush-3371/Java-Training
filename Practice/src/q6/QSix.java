package q6;

/**
 * This programs prints the number of Vowels and Consonants in a String
 * using the countVowelsAndConsonants class.
 */

public class QSix {

	public static void main(String[] args) {
		String s = "Hello, This is my method to reverse a string in Java.";
		
		int[] ans = new int[2];
		
		countVowelsAndConsonants count = new countVowelsAndConsonants();
		
		ans = count.solve(s);
		
		System.out.println("Number of Vovels :" + ans[0] + "  Number of Consonants :" + ans[1]);
	}

}

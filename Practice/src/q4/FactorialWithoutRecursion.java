package q4;

import java.util.Scanner;

/**
 * This program calculates and prints the factorial of a integer number n without using recursion.
 */

public class FactorialWithoutRecursion {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the value of n: ");
		
		int n = s.nextInt();
		
		s.close();
		
		int ans = 1;
		
		for(int i=0; i<=n; i++) {
			ans *= (i <= 1 ? 1 : i);
		}
		
		System.out.println(ans);
	
	}

}

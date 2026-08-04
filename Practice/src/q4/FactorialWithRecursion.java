package q4;

import java.util.Scanner;

/**
 * This program calculates and prints factorial of an integer number n using recursion.
 */

public class FactorialWithRecursion {
	
	public static int fact(int n) {
		if(n <= 1) return 1;
		
		return n * fact(n-1);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the value of n: ");
		
		int n = s.nextInt();
		
		System.out.print(fact(n));
		
		s.close();
	}
}

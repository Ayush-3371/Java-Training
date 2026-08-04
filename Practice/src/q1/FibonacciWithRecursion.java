package q1;

import java.util.Scanner;

/**
 * This is a program to print Fibonacci Numbers upto nth term using recursion.
 */

public class FibonacciWithRecursion {
	
	public static int fib(int n) {
		if(n <= 1) return 1;
		
		return fib(n-1) + fib(n-2);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the value of n: ");
		
		int n = s.nextInt();
		
		for(int i=0; i<=n; i++) {
			System.out.print(fib(i) + " ");
		}
		
		
		s.close();
	}

}

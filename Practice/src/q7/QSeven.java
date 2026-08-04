package q7;

import java.util.Scanner;

/**
 * This program checks and prints whether an input integer n is a prime number or not.
 */

public class QSeven {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number you want to check: ");
		
		Integer n = s.nextInt();
		
		s.close();
		
		IsPrime p = new IsPrime();
		
		if(p.checkPrime(n)) System.out.println(n + " is a prime number.");
		
		else System.out.println(n + " is not a prime number.");
	}

}

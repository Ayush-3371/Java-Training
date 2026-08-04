package q2;

import q7.IsPrime;

/**
 * This program prints the prime numbers from 1 till 100.
 */

public class QTwo{

	public static void main(String[] args) {
		IsPrime p = new IsPrime();
		
		System.out.println("Following are the prime numbers between 1 & 100: ");
		
		for(int i = 1; i <= 100; i++) {
			if(p.checkPrime(i)) System.out.print(i + " ");
		}
	}

}

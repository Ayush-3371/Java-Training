package q2;

import q7.IsPrime;

public class Q2 {

	public static void main(String[] args) {
		IsPrime p = new IsPrime();
		
		System.out.println("Following are the prime numbers between 1 & 100: ");
		
		for(int i = 1; i <= 100; i++) {
			if(p.checkPrime(i)) System.out.print(i + " ");
		}
	}

}

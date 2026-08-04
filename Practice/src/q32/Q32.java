package q32;

import q7.IsPrime;
import java.util.Scanner;
import java.util.function.Predicate;

public class Q32 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number you want to check: ");
		
		Integer n = s.nextInt();
		
		IsPrime c = new IsPrime();
		
		Predicate<Integer> p = num -> c.checkPrime(num);
		
		if(p.test(n)) System.out.println(n + " is a prime number.");
		else System.out.println(n + " is not a prime number.");
	}

}

package q3;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the two numbers you want to swap : ");
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		System.out.println("Before Swapping : "
				+ "a = " + a + " b = " + b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After Swapping : "
				+ "a = " + a + " b = " + b);
		
		s.close();
		
	}

}

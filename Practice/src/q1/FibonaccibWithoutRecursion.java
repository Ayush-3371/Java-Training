package q1;

import java.util.Scanner;

public class FibonaccibWithoutRecursion {
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the value of n: ");
		
		int n = s.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			if(i <= 1) arr[i] = 1;
			else arr[i] = arr[i-1] + arr[i-2];
			
			System.out.print(arr[i] + " ");
		}
		
		s.close();
		
	}
}

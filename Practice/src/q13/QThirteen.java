package q13;

import java.util.Scanner;

/**
 * This program provides implementation for linear search on an integer array
 * and prints whether the target is in the array or not.
 */

public class QThirteen {
	
	public static boolean linearSearch(int[] arr, int target) {
		int n = arr.length;
		
		for(int i=0; i<n; i++) {
			if(arr[i] == target) return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 8, 3, 94, 38, 93, 32, 9, 7, 4, 6};
		
		System.out.println("Enter the number you want to search in the array: ");
		
		Scanner s = new Scanner(System.in);
		
		int target = s.nextInt();
		
		s.close();
		
		if(linearSearch(arr,target)) {
			System.out.println("Found....");
		}else {
			System.out.println("Not Found....");
		}
	}

}

package q12;

import java.util.Arrays;

public class Q12 {

	public static void bubbleSort(int arr[]) {
		int n = arr.length;
		
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 3, 8, 9, 239, 93};
		
		System.out.println("Before Sorting : " + Arrays.toString(arr));
		
		bubbleSort(arr);
		
		System.out.println("After Sorting : " + Arrays.toString(arr));
	}

}

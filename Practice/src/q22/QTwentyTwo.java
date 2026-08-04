package q22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This program accepts a list of Integers and uses RemoveDuplicates class
 * to remove any duplicates in the list.
 */

public class QTwentyTwo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of integers you want to add to list: ");
		
		int n = s.nextInt();
		
		System.out.println("Enter the numbers one by one: ");
		
		for(int i=0; i<n; i++) {
			int temp = s.nextInt();
			list.add(temp);
		}
		
		s.close();
		
		RemoveDuplicates r = new RemoveDuplicates();
		
		System.out.println("Before romving duplicates : " + list);
		
		r.remove(list);
			
		System.out.println("After removing duplicates : " + list);
	}
}

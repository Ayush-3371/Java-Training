package q24;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This program accepts a list of integers and prints
 * the list of duplicates in the given list.
 */

public class QTwentyFour {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of integers you want to add to list: ");
		
		int n = s.nextInt();
		
		System.out.println("Enter the numbers one by one: ");
		
		for(int i=0; i<n; i++) {
			int temp = s.nextInt();
			list.add(temp);
		}
		
		s.close();
		System.out.println("The list you entered is: " + list);
		
		FindDuplicates f = new FindDuplicates();
		f.printDuplicates(list);
		
	}

}

package q25;

import java.util.ArrayList;
import java.util.Collections;

/**
 * This programs sorts a given list of strings in ascending then descending order 
 * and prints the sorted list.
 */

public class QTwentyFive {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		Collections.addAll(list, "Ayush", "Kumar", "Ajeet", "Suryavanshi", "Vaibhav", "Suryavanshi");
		
		System.out.println("Original Array: " + list);
		
		list.sort((s1, s2) -> s1.compareTo(s2));
				
		System.out.println("Ascending Sort: " + list);
		
		list.sort((s1, s2) -> s1.compareTo(s2) == 0 ? 0 : (-1)*s1.compareTo(s2));
		
		System.out.println("Descending Sort: " + list);
		
	}
}

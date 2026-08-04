package q24;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * This class provides the method printDuplicates which takes a list of Integers
 * and prints the list of duplicates present in the given list.
 */

public class FindDuplicates {
	
	private HashMap<Integer, Integer> mpp = new HashMap<>();
	
	public void printDuplicates(ArrayList<Integer> list) {
		int n = list.size();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			Integer num = list.get(i);
			mpp.put(num, mpp.getOrDefault(num, 0) + 1);
		}
		
		for(Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
			if(entry.getValue() > 1) list2.add(entry.getKey());
		}
		
		System.out.println("The duplicate values in the list are: " + list2);
	}
}

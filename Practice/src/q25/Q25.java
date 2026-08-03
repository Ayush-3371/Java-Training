package q25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Q25 {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		Collections.addAll(list, "Ayush", "Kumar", "Ajeet", "Suryavanshi", "Vaibhav", "Suryavanshi");
		
		System.out.println("Original Array: " + list);
		
		Collections.sort(list);
		
		System.out.println("Ascending Sort: " + list);
		
		list.sort(Comparator.reverseOrder());
		
		System.out.println("Descending Sort: " + list);
		
	}
}

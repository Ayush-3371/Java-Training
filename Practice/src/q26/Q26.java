package q26;

import java.util.Collections;
import java.util.HashSet;

public class Q26 {
	public static void main(String[] args) {
		HashSet<Integer> hs1 = new HashSet<>();
		HashSet<Integer> hs2 = new HashSet<>();
		
		Collections.addAll(hs1, null, 1, 2, 5, 9, 0);
		
		Collections.addAll(hs2, null, 1, 3, 4, 6, 7, 8, 0);
		
		HashSet<Integer> hsUnion = new HashSet<>();
		
		hsUnion.addAll(hs1);
		hsUnion.addAll(hs2);
		
		System.out.println("First set : " + hs1);
		System.out.println("Second set : " + hs2);
		System.out.println("Union set : " + hsUnion);
		
	}
}

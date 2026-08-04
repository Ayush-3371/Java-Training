package q22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class provides the implementation for remove method to remove duplicates from the given list.
 */

public class RemoveDuplicates {
	
	private Map<Integer, Integer> mpp = new HashMap<>();
	
	public void remove(List<Integer> list) {
		int n = list.size();
		List<Integer> l2 = new ArrayList<>();
		l2.addAll(list);
		list.clear();
		for(int i=0; i<n; i++) {
			Integer num = l2.get(i);
			mpp.put(num, mpp.getOrDefault(num, 0) + 1);
			if(mpp.get(num) > 1) continue;
			else list.add(num);
		}
	}
}

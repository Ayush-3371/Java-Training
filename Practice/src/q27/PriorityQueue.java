package q27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class provides implementation for a PriorityQueue using
 * a list and provides methods like add, peek & remove.
 */

public class PriorityQueue {
	private List<Integer> list = new ArrayList<>();
	
	public void add(Integer e) {
		list.add(e);
	}
	
	public Integer peek() {
		Collections.sort(list);
		if(list.isEmpty()) return null;
		return list.get(0);
	}
	
	public Integer remove() {
		Collections.sort(list);
		if(list.isEmpty()) return null;
		return list.removeFirst();
	}
	
}

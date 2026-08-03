package q27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

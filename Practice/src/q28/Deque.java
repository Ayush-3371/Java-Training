package q28;

import java.util.ArrayList;

import java.util.List;

public class Deque {
	
	private List<Integer> list = new ArrayList<>();
	
	public void addFirst(Integer n) {
		list.addFirst(n);
		System.out.println("Element added at the first position.");
	}
	
	public void addLast(Integer n) {
		list.addLast(n);
		System.out.println("Element added at the last position.");
	}
	
	public Integer removeFirst() {
		Integer temp = list.removeFirst();
		return temp;
	}
	
	public Integer removeLast() {
		Integer temp = list.removeLast();
		return temp;
	}

	@Override
	public String toString() {
		return  list.toString() ;
	}
	
	
	
}

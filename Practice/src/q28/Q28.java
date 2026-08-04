package q28;

public class Q28 {

	public static void main(String[] args) {
		Deque dq = new Deque();
		
		dq.addFirst(22);
		dq.addLast(39);
		dq.addFirst(29);
		System.out.println(dq.toString());
		System.out.println(dq.removeFirst());
		System.out.println(dq.removeLast());
	}

}

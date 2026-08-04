package q27;

public class QTwentySeven {

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		
		System.out.println(pq.remove());
		pq.add(12);
		pq.add(22);
		System.out.println(pq.peek());
		pq.add(38);
		pq.add(1);
		System.out.println(pq.remove());
		
	}
		

}

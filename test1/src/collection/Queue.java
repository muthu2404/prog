package collection;

import java.util.PriorityQueue;

public class Queue {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		/*pq.offer(12);
		pq.offer(7);
		pq.offer(84);
		pq.offer(12);
		pq.offer(72);*/
		System.out.println(pq);
		
		System.out.println(pq.peek());
		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println("-----------------");
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println("-----------------");
		
		/*System.out.println(pq.element());
		System.out.println(pq);
*/
		System.out.println(pq.remove());
		System.out.println(pq);
		
		
	}
}

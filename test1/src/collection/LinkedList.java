package collection;

public class LinkedList {
	public static void main(String[] args) {
		java.util.LinkedList l = new java.util.LinkedList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		System.out.println(l);
		
		
		
		l.add(2, 100);
		
		System.out.println(l);
		
		l.addFirst(20);
		l.addLast(50);
		System.out.println(l);
		
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
		
	System.out.println(l.getFirst());
	System.out.println(l.getLast());
	}
}

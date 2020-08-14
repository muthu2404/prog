package collection;

public class Stack {
	public static void main(String[] args) {
		java.util.Stack s = new java.util.Stack<>();
		System.out.println(s.push(15));
		s.push(20);
		System.out.println(s);
		
		System.out.println(s.pop());
		System.out.println(s);
		
		System.out.println(s.peek());
		System.out.println(s);
		
		System.out.println(s.empty());
		
		System.out.println(s.search(15));
		System.out.println(s.search(20));
		
	}
}

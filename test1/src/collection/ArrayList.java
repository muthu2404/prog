package collection;

public class ArrayList {
public static void main(String[] args) {
	
	java.util.ArrayList l=new java.util.ArrayList<>();
	
	l.add(10);
	l.add(20);
	l.add(30);
	l.add(10);
	l.add(20);
	l.add(30);
	
	System.out.println(l);
	
	l.add(1, 50);
	System.out.println(l);
	
	java.util.ArrayList l1=new java.util.ArrayList<>();
	l1.add(90);
	l1.add(80);
	l1.add(70);
	
	l.addAll(0, l1);
	System.out.println(l);
	
	System.out.println(l.get(3));
	
	System.out.println(l.remove(1));
	System.out.println(l);
	
	System.out.println(l.set(0, 100));
	System.out.println(l);
	
System.out.println(	l.indexOf(20));
System.out.println(l.lastIndexOf(20));
	System.out.println(l.iterator());
	
}
}

package treeset;

import java.util.TreeSet;

public class Names {
	public static void main(String[] args) {
		TreeSet s = new TreeSet(new SortWithLengthAsc());
		s.add("aj");
		s.add("vishnu");
		s.add("rehman");
		s.add("preethi");
		s.add("vinoth");

		System.out.println(s);
		
		
		TreeSet s1 = new TreeSet();
		s1.add("A");
		s1.add("AAAAA");
		s1.add("AAA");
		s1.add("AAAAAAAA");
		s1.add("AAAA");
		System.out.println(s1);
		
		System.out.println(s1.first());
		System.out.println(s1.last());
		System.out.println(s1.headSet("AAAA"));
		System.out.println(s1.tailSet("AAAA"));
		System.out.println(s1.subSet("AAAA","AAAAAAAA" ));
		
	}
}

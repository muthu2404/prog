package treeset;

import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		TreeSet s = new TreeSet(new StudentRollNoDesc());
		s.add(new Student("ragu",12));
		s.add(new Student("vishnu",22));
		s.add(new Student("aj",14));
		s.add(new Student("preethi",18));
		s.add(new Student("nivi",44));
		
		/*s.add("ragu");
		s.add("vishnu");
		s.add("aj");
		s.add("preethi");
		s.add("nivi");
		*/
		System.out.println(s);
		
	}
}

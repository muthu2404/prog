package treeset;

import java.util.Comparator;

public class StudentRollNoDesc implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		Student s1= (Student)obj1;
		Student s2= (Student)obj2;
		
		/*Integer i1= s1.rollno;
		Integer i2= s2.rollno;
*/
		
		return -s1.compareTo(s2);

	}
	

}

package treeset;

import java.util.Comparator;

public class SortWithLengthAsc implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		String s1= obj1.toString();
		String s2= (String)obj2;
		
		Integer i1 = s1.length();
		Integer i2 = s2.length();
		return i1.compareTo(i2);

	}
	

}

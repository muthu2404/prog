package treeset;

import java.util.Comparator;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		String s1= (String)obj1;
		String s2=obj2.toString();
		//return s1.compareTo(s2);[aj, preethi, rehman, vinoth, vishnu]
		//return -s1.compareTo(s2);[vishnu, vinoth, rehman, preethi, aj]
		//return s2.compareTo(s1);//[vishnu, vinoth, rehman, preethi, aj]
		//return -s2.compareTo(s1);[aj, preethi, rehman, vinoth, vishnu]
		//return 0;[aj]
		//return 1;[aj, vishnu, rehman, preethi, vinoth]
		//return -1;[vinoth, preethi, rehman, vishnu, aj]
		//return s1.compareTo(s1);[aj]
		//return s2.compareTo(s2);[aj]

	}
	
}

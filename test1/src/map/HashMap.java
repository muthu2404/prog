package map;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class HashMap {
	public static void main(String[] args) {
		java.util.HashMap m = new java.util.HashMap();
		m.put(101, "Ramesh");
		m.put(105, "mahesh");
		m.put(110, "suresh");
		m.put(107, "ganesh");
		m.put(101, "kumar");
		System.out.println(m);
		
		System.out.println(m.get(105));
		
		System.out.println(m.remove(101));
		System.out.println(m);
		
		System.out.println(m.containsValue("kumar"));
		System.out.println(m.containsKey(105));
		System.out.println(m.isEmpty());
		System.out.println(m.size());
		/*m.clear();
		System.out.println(m.isEmpty());
		System.out.println(m.size());*/
		
		Set ks = m.keySet();
		Iterator it = ks.iterator();
		System.out.println("the keys are :");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		Collection v = m.values();
		Iterator it1 = v.iterator();
		System.out.println("the values are :");
		while(it1.hasNext())
		{
			System.out.println(it1.next());
			
		}
		
		
		Set es = m.entrySet();
		Iterator it2 = es.iterator();
		System.out.println("the entries are:");
		while(it2.hasNext())
		{
			System.out.println(it2.next());
		}
		
		System.out.println( ks.getClass().getName());
		System.out.println( v.getClass().getName());
		System.out.println( es.getClass().getName());
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

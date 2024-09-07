package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Program {

	public static void main(String[] args) 
	{
		HashSet h1 = new HashSet();
		h1.add(500);
		h1.add(1000);
		h1.add("Atul");
		h1.add("Rohit");
		h1.add(null);
		h1.add(null); //accept only one null value
		System.out.println(h1);
		System.out.println(h1.contains(null));
		
		HashSet h2 = new HashSet();
		h2.add(900);
		h2.add(900); //doesn't accept duplicate values
		h2.add("Sandeep");
		System.out.println(h2);
		System.out.println(h2.containsAll(h1));
		System.out.println(h1.size());
		System.out.println(h1.isEmpty());
		h1.remove(h2);
		System.out.println(h1);
		h1.addAll(h2);
		System.out.println(h1);
		System.out.println("--------------------");
		
		Iterator i1 = h1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}	
	}
}
//ListIterator is not used in HashSet
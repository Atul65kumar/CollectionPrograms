package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Program {

	public static void main(String[] args)
	{
		ArrayList a1 = new ArrayList();
		a1.add(500);
		a1.add(300);
		a1.add("Atul");
		a1.add("Rohit");
		a1.add(null);
		a1.add(null);
		System.out.println(a1);
		
		ArrayList a2 = new ArrayList();
		a2.add("Sandeep");
		a2.add(1000);
		System.out.println(a2);
		a1.addAll(a2);
		System.out.println(a1);
		a1.remove(1);
		System.out.println(a1);
		a1.removeAll(a2);
		System.out.println(a1);
		a2.clear();
		System.out.println(a2);
		System.out.println(a1.contains("Atul"));
		System.out.println(a2.containsAll(a1));
		System.out.println(a1.size());
		System.out.println(a1.get(2));
		a1.set(0, 900);
		System.out.println(a1);
		a1.indexOf(a2);
		System.out.println(a1);
		System.out.println("-----------------");
		
		Iterator l1 = a1.iterator();
		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
		System.out.println("--------------------");
		ListIterator l2 = a1.listIterator();
		while(l2.hasNext())
		{
			System.out.println(l2.next());
		}
		System.out.println("-------------------");
		while(l2.hasPrevious())
		{
			System.out.println(l2.previous());
		}
		System.out.println("--------------------------");
		
		ArrayList a3 = new ArrayList();
		a3.add(800);
		a3.add(600);
		a3.add(100);
		System.out.println(a3);
		Collections.sort(a3);
		System.out.println(a3);	
	}
}

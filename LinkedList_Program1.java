package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_Program1 {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(500);
		l1.add(300);
		l1.add("Atul");
		l1.add(300);
		l1.add(null);
		l1.add(null);
		System.out.println(l1);
		
		LinkedList l2 = new LinkedList();
		l2.add("Sandeep");
		l2.add(1000);
		System.out.println(l2);
		l1.addAll(l2);
		System.out.println(l1);
		l1.remove(1);
		System.out.println(l1);
		l1.removeAll(l2);
		System.out.println(l1);
		l2.clear();
		System.out.println(l2);
		System.out.println(l1.contains("Atul"));
		System.out.println(l2.containsAll(l1));
		System.out.println(l1.size());
		System.out.println(l1.get(2));
		l1.set(0, 900);
		System.out.println(l1);
		l1.indexOf(l2);
		System.out.println(l1);
		System.out.println("-----------------");
		
		Iterator l3 = l1.iterator();
		while(l3.hasNext())
		{
			System.out.println(l3.next());
		}
		System.out.println("--------------------");
		ListIterator l4 = l1.listIterator();
		while(l4.hasNext())
		{
			System.out.println(l4.next());
		}
		System.out.println("-------------------");
		while(l4.hasPrevious())
		{
			System.out.println(l4.previous());
		}
		System.out.println("--------------------------");
		
		LinkedList l5 = new LinkedList();
		l5.add(800);
		l5.add(600);
		l5.add(100);
		System.out.println(l5);
		Collections.sort(l5);
		System.out.println(l5);	
	}

}

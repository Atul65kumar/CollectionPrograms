package Collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class Stack_Program {

	public static void main(String[] args)
	{
		Stack s1 = new Stack();
		s1.add(44);
		s1.add(500);
		s1.add(9);
		s1.add("Atul");
		s1.add(null);
		s1.add(null);
		s1.add("Atul");
		System.out.println(s1);
		System.out.println("------------------------------");
		
		Iterator i1 =s1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println("------------------------------");
		ListIterator l1=s1.listIterator();
		while(l1.hasNext()) {
			System.out.println(l1.next());
		}
		System.out.println("------------------------------");
		while(l1.hasPrevious()) {
			System.out.println(l1.previous());
		} 
		System.out.println("--------------------------------");
		
		Stack s2 = new Stack();
		s2.add(45);
		s2.add(600);
		s2.add(56);
		s2.add(33);
		System.out.println(s2);
		Collections.sort(s2);
		System.out.println(s2);
		System.out.println("----------------------------");
		
		Enumeration e1 = s2.elements();
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}		
	}
}

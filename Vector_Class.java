package Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_Class {

		public static void main(String[] args) 
		{
			Vector v1 = new Vector();
			v1.add(44);
			v1.add(500);
			v1.add(9);
			v1.add("Atul");
			v1.add(null);
			v1.add(null);
			v1.add("Atul");
			System.out.println(v1);
			System.out.println("------------------------------");
			
			Iterator i1 =v1.iterator();
			while(i1.hasNext()) {
				System.out.println(i1.next());
			}
			System.out.println("------------------------------");
			ListIterator l1=v1.listIterator();
			while(l1.hasNext()) {
				System.out.println(l1.next());
			}
			System.out.println("------------------------------");
			while(l1.hasPrevious()) {
				System.out.println(l1.previous());
			} 
			System.out.println("--------------------------------");
			Vector v2 = new Vector();
			
			v2.add(45);
			v2.add(600);
			v2.add(56);
			v2.add(33);
			Collections.sort(v2);
			System.out.println(v2);
			System.out.println("----------------------------");
			
			Enumeration e1 = v2.elements();
			while(e1.hasMoreElements()) {
				System.out.println(e1.nextElement());
			}	
	}
}

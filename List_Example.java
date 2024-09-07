package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_Example {
	public static void main(String[] args)
	{
		List l1 = new ArrayList();
		l1.add(98);
		l1.add(63);
		l1.add(0);
		l1.add(35);
		l1.add(876);
		l1.add(342);
		l1.add(342); //duplicate
		l1.add(342);
		/*l1.add(null); //null
		l1.add(null);
		l1.add("Atul"); //hetrogeneous
		l1.add("eref4545br5"); */
		Collections.sort(l1); //sorting
		
		System.out.println(l1);
		System.out.println("Iteration --");
		//Iteration
		 Iterator i1 = l1.iterator();
		 while(i1.hasNext())
		 {
			 System.out.println(i1.next());
		 }
		 System.out.println("Forward Iteration --");
		 //Forward Iteration using list of Iterator
		 ListIterator i2 = l1.listIterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		 System.out.println("Backward Iteration --");
		//Backward Iteration using list of Iterator
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}	
	}
}

package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue_Program {

	public static void main(String[] args) 
	{
		PriorityQueue p1 = new PriorityQueue();
		p1.add("Sandeep");
		p1.add("Atul");
		p1.add("Rohit");
		//p1.add(null); //won/t accept the null values
		//p1.add(500); //won't accept the hetrogeneous inputs
		System.out.println(p1);
		System.out.println("--------------");
		
		Iterator i1 =p1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		} 
		System.out.println("--------------");
		
		PriorityQueue p2 = new PriorityQueue();
		p2.add(500);
		p2.add(1000);
		System.out.println(p2);	
	}
}

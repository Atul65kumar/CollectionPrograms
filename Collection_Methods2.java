package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class Collection_Methods2 {

	public static void main(String[] args) {
		 Collection c1 = new ArrayList();
		 c1.add("Age");
		 c1.add("Colour");
		 c1.add(76);
		 c1.add(false);
		 c1.add(45.45);
		 System.out.println(c1);
		 
		Iterator i1 = c1.iterator();
		while(i1.hasNext()) 
		{
			System.out.println(i1.next());	
		}
		
		System.out.println(c1.size());
		boolean b1 = c1.contains("Manish");
		System.out.println(b1);
		 
		 
		 
		 
		 
		 
	}

}

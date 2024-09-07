package Collection;

import java.util.ArrayList;
import java.util.Collection;
public class Collection_Methods1 {

	public static void main(String[] args) {
		 Collection c1 = new ArrayList();
		 c1.add("Age");
		 c1.add("Colour");
		 c1.add(76);
		 c1.add(false);
		 c1.add(45.45);
		 System.out.println(c1);
		 
		 Collection c2 = new ArrayList();
		 c2.addAll(c1);
		 c2.add("Atul");
		 c2.add("Rohit");
		 System.out.println(c2);
		 
		boolean b1 = c2.equals(c1);
		System.out.println(b1);
		
		boolean b2 = c1.isEmpty();
		System.out.println(b2);
		
		//c1.clear();
		//System.out.println(c1);
		
		/*c1.remove(76);
		System.out.println("New c1 is --" +c1);
		
		c2.removeAll(c1);
		System.out.println(c2); */
		
		boolean b3 = c2.containsAll(c1);
		System.out.println(b3);
		
		
		
		
	}
}

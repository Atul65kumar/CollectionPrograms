package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Method {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("ATUL");
		a1.add("Rohit");
		a1.add(200);
		a1.add(100);
		System.out.println(a1);
		 Iterator l1 = a1.iterator();
		 while(l1.hasNext())
		 {
			 System.out.println(l1.next());
		 }
	}
}

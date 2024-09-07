package Collection;

import java.util.ArrayList;

public class ContainsAll_Method {

	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add("ATUL");
		a1.add(200);
		ArrayList a2 = new ArrayList();
		//a2.add("ROHIT");
		a2.add("ATUL");
		a2.add(200);
		System.out.println(a1.containsAll(a2));  //Default values of containsAll is Boolean
	}
}

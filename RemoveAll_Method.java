package Collection;

import java.util.ArrayList;

public class RemoveAll_Method {

	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add("ATUL");
		a1.add(200);
		System.out.println(a1);
		ArrayList a2 = new ArrayList();
		a2.add(200);
		a2.add("Rohit");
		System.out.println(a2);
		a1.removeAll(a2);
		System.out.println(a1);
		a2.removeAll(a1);
		System.out.println(a2);
	}
}

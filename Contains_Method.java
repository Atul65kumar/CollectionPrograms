package Collection;

import java.util.ArrayList;

public class Contains_Method {

	public static void main(String[] args)
	{
		ArrayList a1 = new ArrayList();
		a1.add("ATUL");
		a1.add(200);
		a1.add("ROHIT");
		System.out.println(a1.contains("ROHIT")); //Default values of contains is Boolean
		System.out.println(a1.contains("Atul"));
		System.out.println(a1.contains(200));
		
	}

}

package Collection;

import java.util.ArrayList;

public class Remove_Method {

	public static void main(String[] args) 
	{
		ArrayList a1 = new ArrayList();
		a1.add("ATUL");
		a1.add(200);
		System.out.println(a1);
		a1.remove(200);
		System.out.println(a1);		
	}
}
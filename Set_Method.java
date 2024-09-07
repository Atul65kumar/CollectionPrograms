package Collection;

import java.util.ArrayList;

public class Set_Method {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("ATUL");
		a1.add("Rohit");
		a1.add(200);
		System.out.println(a1);
		//a1.set(1, "SANDEEP");
		//System.out.println("Updated array -" + a1);
		a1.set(2, 400);
		System.out.println("Updated array -" + a1);
	}
}

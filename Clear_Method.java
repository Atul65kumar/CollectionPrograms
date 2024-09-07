package Collection;

import java.util.ArrayList;

public class Clear_Method {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(100);
		a1.add(200);
		a1.add(300);
		System.out.println(a1);
		a1.clear();
		System.out.println("After applying Clear method, Output is " + a1);
	}
}

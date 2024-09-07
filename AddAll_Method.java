package Collection;

import java.util.ArrayList;

public class AddAll_Method {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(300);
		a1.add(600);
		a1.add(800);
		System.out.println(a1);
		ArrayList a2 = new ArrayList();
		a2.add(500);
		a2.add(100);
		System.out.println(a2);
		a1.addAll(a2);
		System.out.println(a1);
	}
}

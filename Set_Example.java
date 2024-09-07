package Collection;
import java.util.HashSet;
import java.util.Set;
public class Set_Example {

	public static void main(String[] args) 
	{
		Set s1 = new HashSet();
		s1.add("Ramya");
		s1.add("Atul");
		s1.add("Rohit");
		s1.add("Sandeep");
		s1.add("Sandeep");
		s1.add(null);
		s1.add(null);
		s1.add(76);
		s1.add(98);
		s1.add(76);
		System.out.println(s1);		
	}
}

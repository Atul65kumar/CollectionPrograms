package Collection;
import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_Program {

	public static void main(String[] args) 
	{
		Vector v = new Vector();
		v.add(10);
		v.add("Rohit");
		v.add("Atul");
		v.add("Sandeep");
		v.add(65);
		Enumeration e1 = v.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}	
	}
}

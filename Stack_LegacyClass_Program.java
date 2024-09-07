package Collection;

import java.util.Stack;

public class Stack_LegacyClass_Program {

	public static void main(String[] args) 
	{
		Stack<String> s1 =  new Stack();
		s1.add("Atul");
		s1.add("Rohit");
		s1.add("45");
		s1.add("80");
		s1.add("Sandeep");
		s1.add("75");
		System.out.println(s1);
		s1.pop(); //remove the last object
		System.out.println(s1);
		System.out.println(s1.peek());
		System.out.println(s1);
		System.out.println(s1.push("35")); //add the element 
		System.out.println(s1);
		System.out.println(s1.search("Atul"));
	}

}

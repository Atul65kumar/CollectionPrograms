package Collection;

import java.util.LinkedList;

public class LinkedList_Program 
{
	public static void main(String[] args) 
	{
		LinkedList l1 = new LinkedList();
		l1.add(200);
		l1.add(600);
		l1.add(400);
		l1.add(800);
		System.out.println(l1.getFirst()); //getting first Object
		System.out.println(l1.getLast()); //getting last object
		System.out.println(l1.peekFirst()); //same as get first
		System.out.println(l1.peekLast()); //same as get last
		
		l1.addFirst(1000);
		System.out.println(l1); //add this element on top of array
		
		l1.addLast(-1000);
		System.out.println(l1); //add this element on last of array
		
		System.out.println(l1.offerFirst(900));  //same as add first
		System.out.println(l1.offerLast(-900));  //same as last first
		System.out.println("Poll First -- " + l1.pollFirst()); //same as remove first
		System.out.println("Poll Last-- " + l1.pollLast());  //same as remove last
		
		System.out.println(l1.removeFirst());
		System.out.println(l1.removeLast());
		System.out.println(l1);		
	}
}

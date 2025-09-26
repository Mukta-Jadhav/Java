package labassignment3;

import java.util.*;


public class Linkedlist {

	public static void main(String[] args) {
		 LinkedList linkedlist1=new LinkedList();
		 linkedlist1.add("red");
		 linkedlist1.add("blue");
		 linkedlist1.add("yellow");
		 linkedlist1.add("orange");
		 System.out.println(linkedlist1);
		 
		 //add element betn blue and yellow
		 linkedlist1.add(2,"pink");
		 linkedlist1.add(3,"pink");
		 System.out.println(linkedlist1);
		 
		 //Iterator
		 Iterator<String> i = linkedlist1.iterator();
		 System.out.println("Display list using literator");
		 while(i.hasNext()) {
			 System.out.println(i.next());
			 
		 }
		 //ListIterator
		 ListIterator l1=linkedlist1.listIterator();
		 System.out.println("Reverse order of list");
		 while(l1.hasPrevious()) {
			 System.out.println(l1.previous()+" ");
		 }
	}

}

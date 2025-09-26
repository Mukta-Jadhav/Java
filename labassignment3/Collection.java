package labassignment3;

import java.util.*;


public class Collection {

	public static void main(String[] args) {
		
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter a number:");
      int n=sc.nextInt();
	 sc.nextLine();
	 HashSet hashset1=new HashSet();
	 /*hashset1.add(4);
	 hashset1.add(1);
	 hashset1.add(4);
	 hashset1.add(6);*/
	 for(int i=0;i<=n;i++) {
		 System.out.println("enter a number:");
		 String element = sc.nextLine();
		 hashset1.add(element);
	   }
	    System.out.println(hashset1);
	  }

}

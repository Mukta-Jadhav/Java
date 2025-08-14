package assignment1;

import java.util.*;

//A = bh

public class Parallelogramarea {

	public static void main(String[] args) {
	
     Scanner sc=new Scanner(System.in);
     System.out.println("enter base of parallelogram:");
     int b=sc.nextInt();
     System.out.println("enter height of parallelogram:");
     int h=sc.nextInt();
     int area=b*h;
     System.out.println("area of parallelogram is:"+area);
	}

}

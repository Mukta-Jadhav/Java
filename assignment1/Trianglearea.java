package assignment1;

import java.util.*;

public class Trianglearea {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter height of triangle:");
		int h=sc.nextInt();
		System.out.println("enter base of triangle:");
		int b=sc.nextInt();
		double area=(0.5*h*b);
		System.out.println("area of triangle is:"+area);
		
	}

}

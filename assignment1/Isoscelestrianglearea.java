package assignment1;
//Area = ½ × base × Height

import java.util.*;


public class Isoscelestrianglearea {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter base of triangle: ");
		int b=sc.nextInt();
		System.out.println("enter height of triangle:");
		int h=sc.nextInt();
		double area=(b*h)*0.5;
		System.out.println("Area of Isosceles triangle is:"+area);
	}

}

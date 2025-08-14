package assignment1;
//Area = 1/2 × d1 × d2

import java.util.*;

public class Rhombusarea {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter digonal 1:");
		int d1=sc.nextInt();
		System.out.println("enter digonal 2:");
		int d2=sc.nextInt();
		double area=(d1*d2*1)/2;
		System.out.println("Area of rhombus is:"+area);
		
	}

}

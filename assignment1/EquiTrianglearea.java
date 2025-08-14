package assignment1;
//root 3=1.73/4*a*a

import java.util.*;

public class EquiTrianglearea {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value a:");
		int a=sc.nextInt();
		double area=a*a*(1.73/4);
		System.out.println("area of equilateral triangle is:"+area);
		

	}

}

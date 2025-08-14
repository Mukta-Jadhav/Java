package assignment1;

//2*3.14*r*r*h

import java.util.*;

public class Cylindertotalarea {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius of cylinder:");
		int r=sc.nextInt();
		System.out.println("enter height of cylinder:");
		int h=sc.nextInt();
		double Tarea=2*3.14*r*r*h;
		System.out.println("Total area of cylinder is:"+Tarea);

	}

}

package assignment1;

//πr2h

import java.util.*;


public class Cylindervolume {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter height of cylinder:");
		int h=sc.nextInt();
		System.out.println("enter radius of cylinder:");
		int r=sc.nextInt();
		double volume=3.14*r*r*h;
		System.out.println("volume of cylinder is:"+volume);
		
	

	}

}

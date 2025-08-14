package assignment1;

//1/3πr2h

import java.util.*;

public class Conevolume {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter radius of cone base:");
	int r=sc.nextInt();
	System.out.println("enter height of cone:");
	int h=sc.nextInt();
	
	double volume=(3.14*r*r*h)*0.33;
	System.out.println("volume of cone is:"+volume);
	

	}

}

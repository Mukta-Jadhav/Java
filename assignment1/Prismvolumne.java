package assignment1;

//(0.5*h*b)*h  triangular prism

import java.util.*;

public class Prismvolumne {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter height of prism:");
		int h=sc.nextInt();
		System.out.println("enter base of prism:");
		int b=sc.nextInt();
		System.out.println("enter length of prism:");
		int l=sc.nextInt();
        double volume=(0.5*h*b)*l;
        System.out.println("volume of prism is:"+volume);
	}

}

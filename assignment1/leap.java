package assignment1;

import java.util.*;
public class leap {

	public static void main(String[] args) {
		System.out.println("enter a year");
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		if(n%4==0) {
			System.out.println("This year is leap");
		}
		else {
			System.out.println("This year is Not leap");
		}
		

	}

}

package assignment1;

import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int a=sc.nextInt();
		int i=1;
		int f=1;
		while(i<=a) {
			f=f*i;
			i++;
			System.out.println("factorial of"+ a +"is:"+f);
		}
	

	}

}

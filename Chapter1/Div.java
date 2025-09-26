package Chapter1;

import java.util.*;

public class Div {
	public static void main(String[] args) {
	System.out.println("enter a number:");
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	if (n%3==0 && n%5==0)
	{
		System.out.println("number is divisible by 3 and 5");
	}
	else if(n%3==0) {
		System.out.println("number is divisible by 3");
	}
	else if(n%5==0)
	{
		System.out.println("number is divisible by 5");
	}
	
	
}
}

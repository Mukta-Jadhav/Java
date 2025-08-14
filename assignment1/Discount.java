package assignment1;

import java.util.*;

public class Discount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the price of product:");
		double p=sc.nextDouble();
		System.out.println("enter discount on product:");
		double d=sc.nextDouble();
		
        double discountamount=(p*d)/100;
		double finalamount=p-discountamount;
		System.out.println("***********Bill****************");
		System.out.println("Price:"+p);
		System.out.println("Discount:"+d);
		System.out.println("Discount amount:"+discountamount);
		System.out.println("Total amount:"+finalamount);
		System.out.println("***********Thank You for Visit****************");
		System.out.println("********You Save Rs."+discountamount+"********************");
	}

}

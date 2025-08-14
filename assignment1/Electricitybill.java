package assignment1;

//Electricity Bill = (Total Consumption in kWh × Rate per kWh) 
//+ Fixed Charges + Taxes and Surcharges

import java.util.*;

public class Electricitybill {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter total consumption in kwh:");
		double c=sc.nextDouble();
		System.out.println("enter rate per kwh:");
		double r=sc.nextDouble();
		System.out.println("enter fixed charge:");
		double f=sc.nextDouble();
		System.out.println("enter tax cut:");
		double t=sc.nextDouble();
		double bill=(c*r)+f+t;
		System.out.println("***********Bill****************");
		System.out.println("Total consumption:"+c);
		System.out.println("Rate per unit:"+r);
		System.out.println("fixed charge:"+f);
		System.out.println("Tax:"+t);
		System.out.println("Total bill:"+bill);
		System.out.println("***********Thank You for Visit****************");
	

	}

}

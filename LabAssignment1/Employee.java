package LabAssignment1;

import java.util.*;

public class Employee {
	String name;
	long  salary;
	Scanner sc=new Scanner(System.in);
	public void get() {
		
		System.out.println("enter name:");
		name=sc.nextLine();
		System.out.println("enter salary:");
		salary=sc.nextLong();
	}
	public void display() {
		System.out.println("name is:"+name);
		System.out.println("salary is:"+salary);
	}
	

	public static void main(String args[]) {
		
		Employee emp[]=new Employee[2];
	    for (int i=0;i<2;i++) {
	    	System.out.println("enter detail of Employee"+(i+1));
	    	emp[i]=new Employee();
	    	emp[i].get();
	    	
	    }
	    for (int i=0;i<2;i++) {
	    	System.out.println(" detail of Employee"+(i+1));
	    	//emp[i]=new Employee();
	    	emp[i].display();
	    	
	    }

	}

}

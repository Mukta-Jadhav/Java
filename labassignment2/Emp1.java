package labassignment2;

import java.util.*;

import LabAssignment1.Employee;


class Data1 {
	
	String name;
	long salary;
	Scanner sc=new Scanner(System.in);
	Data1(){
		
	}
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
}

class Developer extends Data1{
	String ProjectName;
	Scanner sc=new Scanner(System.in);
	public Developer() {
		super();
	}
	
	public void get() {
		
		System.out.println("project name:");
		ProjectName=sc.nextLine();
		
	}
	public void display() {
	
		System.out.println("project name is:"+ProjectName);
	}
		public static void main(String[] args) {
		Developer d[]=new Developer[2];
		Data1 d1[]= new Data1[2];		
		//Employee emp[]=new Employee[2];
	    for (int i=0;i<2;i++) {
	    	System.out.println("enter detail of Employee"+(i+1));
	    	d1[i]=new Data1();
	    	d1[i].get();
	    	d[i]=new Developer();
	    	d[i].get();
	    	
	    }
	    for (int i=0;i<2;i++) {
	    	System.out.println(" detail of Employee"+(i+1));
	    	//emp[i]=new Employee();
	    	d1[i].display();
	    	d[i].display();
	    	
	    }

	}
	
	
}


	


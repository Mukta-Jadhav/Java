package labassignment2;

import java.util.Scanner;

 class Ep {
	int id;
	String name;
	long  salary;
	Scanner sc=new Scanner(System.in);
	
	public void get() {
		System.out.println("enter id:");
		id=sc.nextInt();
		System.out.println("enter name:");
		name=sc.nextLine();
		 System.out.println("enter salary:");
		salary=sc.nextLong();
	}
	
	public void display() {
		System.out.println("Id is:"+id);
		System.out.println("name is:"+name);
		System.out.println("salary is:"+salary);
	}
	

}
class Mg extends Ep{
	long bonus;
	Scanner sc=new Scanner(System.in);
	Mg(){
		//super(salary);
		
	}
	public void get() {
		
		System.out.println("enter bonus:");
		bonus=sc.nextLong();
	}
	public void display() {
		System.out.println("Bonus is:"+bonus);
	}
}
class Employee{
	public static void main(String[] args) {
		Mg m[]=new Mg[2];
		Ep e[]=new Ep[2];
		 for (int i=0;i<2;i++) {
		    	System.out.println("enter detail of Employee"+(i+1));
		    	e[i]=new Ep();
		    	e[i].get();
		    	m[i]=new Mg();
		    	m[i].get();
		    	
		    	
		    }
		 
		 for (int i=0;i<2;i++) {
		    	System.out.println("display detail of Employee"+(i+1));
		    	e[i].display();
		    	m[i].display();
		 }
	}
}

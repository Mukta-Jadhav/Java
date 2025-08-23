package LabAssignment1;

public class Student {
	
	private int id; 
	private String name; 
	public Student() //Default constructor 
	{ 
	id=101; 
	name="Siya"; 
	} 
	public void display() 
	{ 
	 System.out.println(id+" "+name); 
	} 
	public static void main(String args[]) 
	{ 
	  Student s1=new Student(); 
	  s1.display(); 
	 } 
	}
	

	



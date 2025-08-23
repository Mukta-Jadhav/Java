package LabAssignment1;

public class Employee1 {
      String name;
      long salary;
	public static void main(String[] args) {
		Employee1 emp[]=new Employee1[5];
		emp[0]=new Employee1();
	    emp[1]=new Employee1();
	    //emp[2]=new Employee1("arya",45677);
	    //emp[3]=new Employee1("asd",567754);
	    //emp[4]=new Employee1("dff",56774);
	    emp[0].name="siya";
	    emp[1].name="ashitosh";
	    emp[0].salary=45690;
	    emp[1].salary=56780;
	    System.out.println("detail of employee 1:\n name:"+emp[0].name+"\n salary:"+emp[0].salary);
	    System.out.println("detail of employee 2:\n name:"+emp[1].name+"\n salary:"+emp[1].salary);
	    
	}

}

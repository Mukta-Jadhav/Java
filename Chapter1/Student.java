package Chapter1;

public class Student {
	String name;
	int roll_no;
	String phone_no;
	String email_id;
	final static String college_name="BJS Wagholi";
	
	private Student(	String name,int roll_no,String phone_no,String email_id) {
		this.name=name;
		this.roll_no=roll_no;
		this.phone_no=phone_no;
		this.email_id=email_id;
	}
    
	public void display() {
		System.out.println("student name:"+this.name);
		System.out.println("student roll no:"+this.roll_no);
		System.out.println("student phone number:"+this.phone_no);
		System.out.println("student email id:"+this.email_id);
		System.out.println("*************************************");
	}
	public static void main(String[] args) {
		Student s=new Student("sita",101,"9870867834","sita1@gmail.com");
		s.display();

  
	}

}

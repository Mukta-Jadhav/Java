package assignment1;

public class Parameterizedconstructor {
	public Parameterizedconstructor(int roll_no,String name) {
		System.out.println("student roll no:"+roll_no);
		System.out.println("student name:"+name);
	}

	public static void main(String[] args) {
		Parameterizedconstructor p=new Parameterizedconstructor(101,"sita");

	}

}

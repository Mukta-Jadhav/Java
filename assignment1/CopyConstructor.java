package assignment1;

//import java.util.*;

public class CopyConstructor {
		int roll_no;
		String name;
		public CopyConstructor(int roll_no,String name) {
			roll_no=roll_no;
			name=name;
		}
		CopyConstructor(){
			
		}
		
		void show() {
			System.out.println(roll_no+" "+name);
			//System.out.println("student name:"+name);
		}

		public static void main(String[] args) {
			CopyConstructor c=new CopyConstructor(101,"sita");
			CopyConstructor d=new CopyConstructor();
			d.roll_no=c.roll_no;
			d.name=c.name;
          c.show();
          d.show();
		}

	}



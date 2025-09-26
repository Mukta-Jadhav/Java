
package Chapter1;

import java.util.Scanner ;
 

public class age {

	public static void main(String[] args) {
		System.out.println("enter your age");
		Scanner sc=new Scanner (System.in);
		int age=sc.nextInt();
		
		if(age>0 && age<18) {
			System.out.println("you're kid");
		}
		else if(age>18 && age<60) {
			System.out.println("you're adult");
			
		}
		else if(age>60 && age<=100) {
			System.out.println("you're senior");
			
		}
		else {
			System.out.println("invalid number");
		}
		
		

	}

}

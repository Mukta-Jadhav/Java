package assignment1;
import java.util.*;


public class Switchcase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choise:\n1.addition\n2.substraction\n 3.multiplication\n4.division\n");
		int a=sc.nextInt();
		System.out.println("enter number 1:\n");
		int b=sc.nextInt();
		System.out.println("enter  number 2:\n");
		int c=sc.nextInt();
		switch(a) {
		case 1:
			int result=b+c;
			System.out.println("addition is:"+result);
		break;
		case 2:
			int sub=b-c;
			System.out.println("subtraction is:"+sub);
		break;
		case 3:
			int multi=b*c;
			System.out.println("multiplication is:"+multi);
		break;
		case 5:
			int div=b/c;
			System.out.println("division is:"+div);
		break;
		default:
			System.out.println("invalid number");
		break;
			
		}

	}

}

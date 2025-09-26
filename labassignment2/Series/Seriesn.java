package labassignment2.Series;

import java.util.*;

class Cube{
	int result;
     void display(int n) {
    	result=n*n*n;
    	System.out.println("cube of"+n+"is:"+result);
     }
	
}
class Square extends Cube{
	int square;
    void display1(int n) {
   	square=n*n;
   	System.out.println("Square of" +n+ "is:" +square);
    }
}
class Fibonacci extends Square{
	int a=0;
	int b=1;
	void display3(int n) {
	
	System.out.println("fibonacci series:");
	
	System.out.println(a+" "+b+" ");
	for(int i=2;i<n;i++) {
		int sum=a+b;
		System.out.println(sum+" ");
		a=b;
		b=sum;
	}
}
}

public class Seriesn extends Fibonacci{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		Seriesn s= new Seriesn();
		//Cube c=new Cube();
		s.display(n);
		s.display1(n);
		s.display3(n);

	}

}

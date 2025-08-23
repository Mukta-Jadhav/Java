
public class MyNumber {
	private int no;
	public MyNumber() {
		no=0;
	}
	
	public MyNumber(int n) {
		 no=n;
		
	}
	void isNegative() {
		if(no<0) {
			System.out.println(no + "is negative ");
		}
		
	}
	void isPositive() {
		
		if(no>0) {
			System.out.println(no + "is positive ");
		}
		
	}
	void isOdd() {
		if(no%2!=0) {
			System.out.println(no + "is odd.");
		}
	}
	void isEven() {
		if(no%2==0) {
			System.out.println(no + "is even.");
		}
	}
	

	public static void main(String[] args) {
		int n;
		n=Integer.parseInt(args[0]);
		 MyNumber obj=new MyNumber(n);
		 obj.isNegative();
		 obj.isPositive();
                                    obj.isOdd();
                                     obj.isEven();
	}

}
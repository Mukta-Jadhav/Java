public class Reverse {

	public static void main(String[] args) {
	int a;
                  int rem;
                 int rev=0;
	a=Integer.parseInt(args[0]);
                 while(a>0)
               {
                  rem=a%10;
                  rev=(rev*10)+rem;
                  a=a/10;
              }
             System.out.println("Reverse number is:" +rev);
     }
}

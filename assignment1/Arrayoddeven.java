package assignment1;

public class Arrayoddeven {

	public static void main(String[] args) {
		
		int n=5;
		
		double arr[]= {23,45,22,2,45};
		
		for(int i=0;i<n;i++) {
			
			if(arr[i]%2==0) {
				System.out.println(i+"is even number");
				
			}
			else {
				System.out.println(i+"is odd number");
			}
		}

	}

}

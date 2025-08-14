package assignment1;

public class CGPA {

	public static void main(String[] args) {
		double  arr[]= {9.07,8.67,9.0,8.9,10};
		//int grade[];
		double sum=0;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
	   
		double cgpa=sum/n;
		double per=cgpa*9.5;
		System.out.println("******************Result*******************");
		System.out.println("CGPA="+cgpa);
		System.out.println("percentage="+per);
		
		
			
			
		}

	}



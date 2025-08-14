package assignment1;

public class Additionarray {

	public static void main(String[] args) {

		int  arr[]= {34,1,67,89,100};
		int n=arr.length;
		int  arr1[]= {4,17,47,19,100};
		int m=arr1.length;
		int add[];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				 add[]=arr[i]+arr1[j];
				
			}
		}
		System.out.println("addition of two array add[]:"+add);

	}

}

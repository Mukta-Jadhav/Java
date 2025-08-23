package LabAssignment1;

public class Arraysum {

	public static void main(String[] args) {
	int[] arr= {23,4,56,12};
	int n=arr.length;
	int sum=0;
	
	for(int i=0;i<n;i++) {
		 sum=sum+arr[i];
		 
	}
	System.out.println("sum of array is:"+sum);
	
	

	}

}

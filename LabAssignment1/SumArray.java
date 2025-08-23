package LabAssignment1;

import java.util.Arrays;

public class SumArray {

	public static void main(String[] args) {
        int n=5;
		int sum=0;
		int  arr[]= {23,45,22,2,45};
		//Arrays.sort(arr);
		//System.out.println(arr);
		for(int i=0;i<5;i++) {
			sum=sum+arr[i];
		}
		System.out.println("sum is:"+sum);
		

	}

}

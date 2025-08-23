package LabAssignment1;

import java.util.*;


public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no to table:");
		int n=sc.nextInt();
		System.out.println("Table of:"+n);
		for(int i=1;i<=10;i++) {
			System.out.println(n+"X"+i+"="+n*i);
			
		}
    

	}

}

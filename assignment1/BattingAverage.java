package assignment1;

//Batting Average = Total Runs Scored ÷ 
//Number of Times Dismissed

import java.util.*;
public class BattingAverage {

	public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    System.out.println("enter total runs of player:");
    int r=sc.nextInt();
    System.out.println("enter total number of time he out:");
    int o=sc.nextInt();
    double avg=r/o;
    System.out.println("total average of player is:"+avg);
    if((avg>=40)&& (avg<50))
    {
    	System.out.println("good");
    	}
    else if(avg>=50)
    {
		System.out.println("excellent");
		}
    else 
    {
    	System.out.println("average");
    	}
    	
    
    
	}

}

package LabAssignment1;

public class MyDate {
	   int dd;
	    int mm;
	    long yyyy;
       public MyDate() {
    	  
       }
       public MyDate(int dd,int mm,long yyyy) {
    	this.dd=dd;
    	this.mm=mm;
    	this.yyyy=yyyy;
       }
       void display() {
    	   System.out.println("date:"+this.dd+"-"+this.mm+"-"+this.yyyy);
    	   
       }
	public static void main(String[] args) {
		 MyDate d=new MyDate(04,12,2000);
		 d.display();

	}

}

package labassignment2;

import java.util.*;

interface Operation{
	final Float pi=3.14F;
	void area();
	void volume();
	
}
class Circle implements Operation {
	int radius;
	Float Area;
	Circle(int r){
		radius=r;
	}
	
	public void area() {
		Area=pi*radius*radius;
		System.out.println("area of circle is:"+Area);
	}
	public void volume() {
		System.out.println(" circle has no area" );	
	}

}

 class Cylinder implements Operation{
     int radius;
     int height;
	 Float area1;
	 Float volume1;
	  Cylinder(int r,int h){
	  radius=r;
	  height=h;
	  }
	 public void area() {
	 area1=2*pi*radius*(height+radius);
	 System.out.println("area of cylinder is:"+area1);
		 
	 }
        public void volume() {
        volume1=pi*radius*radius*height;
        System.out.println("volume of cylinder is:"+volume1);
        	
        }
}
public class Test{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a radius:");
		int r=sc.nextInt();
		System.out.println("enter a height:");
		int h=sc.nextInt();
		Test t=new Test();
		Circle c=new Circle(r);
		Cylinder a=new Cylinder(r,h);
		c.area();
		c.volume();
		a.area();
		a.volume();
	}
	

	}





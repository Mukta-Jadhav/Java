package labassignment2;



 class Point {
	int x;
	int y;
	
	public Point (){
		this.x=0;
		this.y=0;
		
	}
	public Point (int x,int y){
		this.x=x;
		this.y=y;
		
	}
	void display() {
		System.out.println("point:(x="+x+",y="+y+")");
		
	}

	
}


class ColorPoint extends Point{
	String color;
	public ColorPoint() {
		super();
		this.color="black";
	}
	public ColorPoint(int x,int y,String color) {
		super(x,y);
		this.color=color;
		
	}
	void display() {
		System.out.println("point:(x="+x+",y="+y+") and color="+color);
	}
	
	
}

 class Main{
	 public static void main(String[] args) {
		 Point p1 = new Point();
		 Point p2 = new Point(10, 20);
	        ColorPoint cp1 = new ColorPoint(5, 15, "Red");
	        ColorPoint cp2 = new ColorPoint();
		     p1.display();
		     p2.display();
			cp1.display();
			cp2.display();
		}
	
}




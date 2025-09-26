package Chapter1;

public class Test24 {
	   int x=20;
	public static void main(String[] args) {
		Test24 t=new Test24();
	    Test24 s=new Test24();
	    //Test24 y=new Test24();
       // x=x+5;
        t.x=s.x+5;
        //error Cannot make a static reference to the non-static field x
        System.out.println(t.x);
	}

}

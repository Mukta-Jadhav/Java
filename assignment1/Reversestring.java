package assignment1;

public class Reversestring {

	public static void main(String[] args) {
	 String s="malya";
	// string b=rev(s);
	 String r=" ";
	 char ch;
	 for (int i=0;i<s.length();i++) {
		 ch=s.charAt(i);
		 
		 
		 r=ch+r;
	 }
	 System.out.println("reverse of" +s+ "is:" +r );
	 
	 

	}

}

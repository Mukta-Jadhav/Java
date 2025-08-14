package assignment1;

import java.io.*;

public class Bufferreader {

	public static void main(String[] args) {
		BufferedReader br=new 	BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter your name:");
		String name=br.read();
		System.out.println("welcome"+name);
		

	}

}

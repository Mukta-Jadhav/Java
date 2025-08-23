package LabAssignment1;

import java.io.*;
public class Bufferedreader {
	


	

		public static void main(String[] args)  throws IOException {
			String name;
			int rollNo;
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter your name:");
			 name=br.readLine();
			 System.out.println("enter your roll no:");
			 rollNo=Integer.parseInt(br.readLine());
			System.out.println("NAME:" +name);
			System.out.println("ROLL No:" + rollNo);

		}

	}


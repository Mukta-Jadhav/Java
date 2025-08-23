import java.io.*;
public class Table
{
     public static void main(String[] args) throws IOException
     {
       int n;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("enter a number for table:");
        n=Integer.parseInt(br.readLine());
       for(int i=1;i<=10;i++){
       System.out.println(n + "*" + i + "=" + n*i +"\n"); }
      }
}
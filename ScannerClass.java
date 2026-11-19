package Module1;
import java.util.Scanner;

public class ScannerClass 
{
 public static void main(String[]args)
 {
	 Scanner s1 = new Scanner (System.in);
	 System.out.println("Please enter the value of A");
	 
	 int a= s1.nextInt();
	 System.out.println("Please enter the value of B");
	 int b= s1.nextInt();
	 
	 int sum= a+b;
	 System.out.println("Final output is");
	 System.out.println(sum);
	 s1.close(); 
 }

 }


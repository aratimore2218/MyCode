package Module1;

import java.util.Scanner;

public class AreaofCircle
{
 public static void main(String[]args)
 {
	 Scanner s1= new Scanner(System.in);
	 System.out.println("Please enter the value of radius:");
	 int radius= s1.nextInt();
	 double area= Math.PI *radius * radius;
	 System.out.println("The area of circle is:" +area);
	 double circumferance= 2* Math.PI*radius;
	 System.out.println("The circumference of circle is:" +circumferance);
	 s1.close();

	 
 }
}

package Module1;

import java.util.Scanner;

public class AreaofTriangle 
{
public static void main(String[]args)
{

	 Scanner s1= new Scanner(System.in);
	 System.out.println("Please enter the value of base:");
	 int base= s1.nextInt();
	 System.out.println("Please enter the value of height:");
	 int height= s1.nextInt();
	 double area= 0.5*base*height;
	 System.out.println("The area of Triangle is:" +area);
	 System.out.println("Please enter the value of a:");
	 int a= s1.nextInt();
	 System.out.println("Please enter the value of b:");
	 int b= s1.nextInt();
	 System.out.println("Please enter the value of c:");
	 int c= s1.nextInt();
	 
	 double circumferance= a+b+c;
	 System.out.println("The circumference of Triangle is:" +circumferance);
	 s1.close();
}
}
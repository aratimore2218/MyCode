package Module1;
import java.util.Scanner;

public class AreaOfRectangle{
	public static void main(String[]args)
	{
		Scanner s1= new Scanner(System.in);
		
 System.out.println("Please enter the value of side a");
 int a= s1.nextInt();
 System.out.println("Please enter the value of side b");
 int b= s1.nextInt();
 int area= a*b;
 System.out.println("Area of Rectangle is:" +area);
 
 int circumferance= 2*(a+b);
 System.out.println("Cicumferance of Rectangle is:" +circumferance);
 s1.close();
 
	}
}

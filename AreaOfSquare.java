package Module1;

import java.util.Scanner;

public class AreaOfSquare {
	public static void main(String[]args)
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Print value of side a");
		int a= s1.nextInt();
		int area= a*a;
		System.out.println("Area of square is:" +area);
		int circumferance= 4*a;
		System.out.println("Circumferance of square is:" +circumferance);
		s1.close();
		
	
	}

}

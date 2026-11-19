package Module1;

public class Addition {
	
	Addition (int a, int b, int c)
	{		
		System.out.println("Constructor 1");
	}
	Addition(double a, double b, double c)
	{
		
		System.out.println("Constructor 2");
	}
	
	static void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	static void sub(int a, double b)
	{
		double c=a-b;
		System.out.println(c);
	}
	static void mul(double a, double b)
	{
		double c=a*b;
		System.out.println(c);
	}
	
	void div(double a, int b)
	{
		double c=a/b;
		System.out.println(c);
	}
	
public static void main(String[]args)
{
	add(23,60);  //to call addition method
	sub(89,12.41); // subtraction
	mul(63.54, 45.10); //multiplication
	
	Addition a1= new Addition(12, 56, 43); // constructor 1
	Addition a2= new Addition(23.12, 56.85, 43.66); // constructor 2
	
	a1.div(78.12, 56); //division
	
}
}

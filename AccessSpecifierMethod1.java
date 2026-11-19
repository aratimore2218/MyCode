package Module2;

public class AccessSpecifierMethod1 
{
     public static int a= 10;
     protected static int b= 20;
     static int c= 30;
     private static int d= 40;
     	public static void m1()
	{
		
	}
	protected static void m2()
	{
		
	}
	static void m3()
	{
		
	}
	private static void m4()
	{
		
	}
	public static void main(String[]args)
	{
		m1();
		m2();
		m3();
		m4();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}		
	}
	


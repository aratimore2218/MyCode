package Module2;

public class AccessSpecifierClass {
	
	
	final static int a=100; //global variable
	double b=5.7; //global instance variable
	
	
	public static void main(String[]args)
	
	{
		
		System.out.println(a);
		
		AccessSpecifierClass a1= new AccessSpecifierClass();
		System.out.println(a1.b);
		 final int b=98;
		System.out.println(b);
		
	}

}

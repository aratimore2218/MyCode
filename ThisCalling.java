package Module2;

public class ThisCalling {
	
	ThisCalling(double a, int b)
	{
     this(56);
	 System.out.println("3");
	}
	
	ThisCalling()
	{
	this(56.32, 89);
	  System.out.println("2");
	}
	ThisCalling(int a)
	{
		
		System.out.println("1");
	}
	
	public static void main(String[]args)
	{
		new ThisCalling();
		
	}

}

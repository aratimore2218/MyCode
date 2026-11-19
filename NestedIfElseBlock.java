package Module1;

public class NestedIfElseBlock {
	public static void main(String[]args)
	{
		int a=23;
		int b= 10;
		int c=85;
		if(c>b)
		{
			System.out.println("Statement 1");
			if(b>a)
			{
				System.out.println("Statement 2");
			}
		
		else
		{
			System.out.println("Statement 3");
		}
  }
		else
		{
			System.out.println("Statement 4");
				
		}
		System.out.println("Statement 5");
	}
}
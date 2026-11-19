package Module2;

public class Continue2 {
	public static void main(String[]args)
	{
			
	System.out.println("for month of january" );
	
	for(int j=1;j<=12;j++)
	for(int i=1; i<=31; i++)
	{
	
  System.out.println("month:" +j );
   System.out.println("date:" +i );
  
   System.out.println("for month of february" );
	for(int m=1;m<=12;m++)
	for(int n=1; n<=28; n++)
	{
		if(m==2 && (n==29 || n==30 || n==31))
		{
			continue;
		}
		
  System.out.println("month:" +m );
   System.out.println("date:" +n );
	
		}
}
	}
	}


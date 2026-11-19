package Module1;

import java.util.Scanner;

public class IfElseBlock {
	public static void main(String[]args)
	{
		Scanner s1= new Scanner(System.in);
		
		for(int i=1; i<=20; i++)
		{
	
			System.out.println("Enter the age for person" +i+ ":");		
            int age= s1.nextInt();
            
			
		if(age>=18)
		{
			System.out.println("You can vote");	
		}
		else
		{
		System.out.println("You can't vote");	
		}
		}

	s1.close();	
}
}

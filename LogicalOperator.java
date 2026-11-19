package Module1;

public class LogicalOperator {
	public static void main(String[]args)
	{
		int age= 28;
		char gender= 'M';
		if(age>30 && gender=='M')
		{
			System.out.println("You are participate");	
		}
		else
		{
			System.out.println("You are not participate");
		}
		
		if(age>20 || gender=='F')
		{
			System.out.println("Follow the rules");	
		}
		else
		{
			System.out.println("Try next time");
		}
		
		if(!(age>30 && gender=='M'))
		{
			System.out.println("You win the team");	
		}
		else
		{
			System.out.println("Sorry, try next time");
		}
		if(!(age>20 || gender=='F'))
		{
			System.out.println("Congratulations");	
		}
		else
		{
			System.out.println("Welcome");
		}
	}

}


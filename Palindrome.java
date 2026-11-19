package Module2;

public class Palindrome {
	
	public static void main(String[]args)
	{
		String input="radar";
		String output="";
		
		for(int i=input.length()-1; i>=0; i-- )
		{
			char c1=input.charAt(i);
			output= output+c1;
		}
			System.out.println("This is my input->"+input);
			System.out.println("This is my output->"+output);
		
			boolean b1= input.equals(output);
			//if(input.equals(output)==true)     //true==true
			//if(b1)   //true	
			//if(b1==true) // false==true	
			if(input.equals(output)) // radar=radar
			{
         	
		    System.out.println("It is a palindrome");
			}
	        else
			System.out.println("It is not a palindrome");
	}
	}

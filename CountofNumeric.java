package Module2;

public class CountofNumeric {

	static int countofalpha=0;
	static int countofnumeric=0;
	static int countofspace=0;
	static int countofspecial=0;
	
public static void main(String[]args)
{
	String a="Samsung S20 FE 5G !@#$%";
	char [] c1= a.toCharArray();
	for(int i=0;i<c1.length; i++)
	{
		boolean b1= Character.isAlphabetic(c1[i]);
		boolean b2= Character.isDigit(c1[i]);
		boolean b3= Character.isWhitespace(c1[i]);
	
			if(b1)
		{
			countofalpha++;
			
		}
			if(b2)
			{
				countofnumeric++; 
				
			}
			if(b3)
			{
				countofspace++;
				
			}
	}
	
	System.out.println("Total Alphabet is->"+countofalpha);
	System.out.println("Total Numeric is->"+countofnumeric);
	System.out.println("Total Space is->"+countofspace);
	countofspecial= a.length()-(countofalpha+countofnumeric+countofspace);
	System.out.println("Total Special Character is->"+countofspecial);
}
}


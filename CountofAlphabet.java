package Module2;

public class CountofAlphabet {
	
	static int countofalpha=0;              //global variable
	public static void main(String[]args)
	{
		String a="Arati Prashant More";
		char [] c1= a.toCharArray();
		for(int i=0;i<c1.length; i++)
		{
			boolean b1= Character.isAlphabetic(c1[i]);
			if(b1)
			{
				countofalpha++;
				
			}
		}
		
		System.out.println("Total count is->"+countofalpha);
	}
}

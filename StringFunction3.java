package Module2;

public class StringFunction3 {
	public static void main(String[]args)
	{
		String a= "Automation Testing";
		
		//for(int i=0; i<18; i++)
		System.out.println("Start of the loop");
		for(int i=0; i<a.length(); i++) 		
		{
			char c1= a.charAt(i);
			System.out.println(c1);
	}
		System.out.println("End of the loop");
	}
}

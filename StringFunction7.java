package Module2;

public class StringFunction7 {
	public static void main(String[]args)
	{
		String a= "Selenium";
		//does it start with s
		boolean b1= a.matches("S.*");
		System.out.println(b1);
		
		//end with m
		boolean b2= a.matches(".*m");
		System.out.println(b2);
		
		String url= "https://www.google.com";
		boolean b3=url.matches("https.*");
		System.out.println(b3);
		
		String f="abc";
		boolean b7=f.matches("....");
		System.out.println(b7);
		
		
		
	}

}

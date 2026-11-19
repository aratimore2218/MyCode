package Module2;

public class StringFunction6 {
	
	public static void main(String[]args)
	{
		String a= "function";
		System.out.println(a.replace('n', 'M'));
		
		String b= "Java";
		System.out.println(b.replace("Java", "Paython"));
		
		String c= "13225automation%%$ADFF";
		System.out.println(c.replaceAll("[0-9]", ""));
		System.out.println(c.replaceAll("[A-Z]", ""));
		System.out.println(c.replaceAll("[a-z]", "Arati"));
		System.out.println(c.replaceAll("[a-z]", "***"));
		System.out.println(c.replaceAll("", "***"));
		}

}

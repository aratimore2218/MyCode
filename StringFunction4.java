package Module2;

public class StringFunction4 {
	public static void main(String[]args)
	{
		String a= "Testing";
		System.out.println(a);
		
		String b= a.toUpperCase();
		System.out.println(b);
		System.out.println(a.toUpperCase());
		
		//String is Immutable
		
		String c= "DeMo";
		System.out.println(c.toLowerCase());
		
		String d= a.concat("Course");
		System.out.println(d);
		System.out.println(a);
		
	}

}

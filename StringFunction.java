package Module2;

public class StringFunction {
	public static void main(String[]args)
	{
		String a="Automation"; // String pool area
		
		String b= new String("Automation"); //Heap Memory
		
		String c="Automation"; // String pool area
		
		String d= new String("Automation"); //Heap Memory
		
		boolean b1= a.equals(b);
		System.out.println(b1);
		
		boolean b3= a==b;
		System.out.println(b3);
		
		boolean b4= a==c;
		System.out.println(b4);
		
		boolean b5= b==a;
		System.out.println(b5);
		
		boolean b6= b.equals(d); 
		System.out.println(b6);
	}
}

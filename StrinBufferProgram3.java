package Module2;

public class StrinBufferProgram3 {
	
	public static void main(String[]args)
	{
		StringBuffer s1= new StringBuffer("Java");
		System.out.println(s1.reverse());
		
		System.out.println(s1.substring(2));
		
		System.out.println(s1.length());
		
		System.out.println(s1.capacity());
		
		StringBuilder s2= new StringBuilder(" Python");
		
		s2.append(" Programming");
		System.out.println(s2);
		
		s2.replace(1, 7, "Java");
		System.out.println(s2);
		
		s2.delete(1, 6);
		System.out.println(s2);
	}

}

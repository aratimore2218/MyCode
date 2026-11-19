package Module2;

public class StrinBufferProgram2 {
	
	public static void main(String[]args)
	{
		StringBuffer s1= new StringBuffer("Automation");
		s1.append(" Testing");
		System.out.println(s1);
	
		
		s1.insert(11, "API ");
		System.out.println(s1);
		
		s1.delete(0, 10);
		System.out.println(s1);
		
		s1.replace(0, 4, "course");
		System.out.println(s1);
		
		s1.reverse();
		System.out.println(s1);
	}

}

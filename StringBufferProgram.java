package Module2;

public class StringBufferProgram {
	
	public static void main(String[]args)
	{
		StringBuffer s1= new StringBuffer("School");
		s1.append(" name is HR Patel");
		System.out.println(s1);

		StringBuffer s2= new StringBuffer();   //constructor string buffer with initial capacity is 16
		
		StringBuffer s3= new StringBuffer(100);  //constructor string buffer with initial capacity is 100
		
		
	}
}

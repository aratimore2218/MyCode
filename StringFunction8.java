package Module2;

public class StringFunction8 {
	
	public static void main(String[]args)
	{
		String input= "car";
		char[] c1= input.toCharArray();
		System.out.println(c1);
		//[c,a,r]	
		int [] rollno= new int[5];
		rollno [0]= 52;
		rollno [1]= 21;
		rollno [2]= 98;
		rollno [3]= 63;
		rollno [4]= 56;
		
		for(int i=0; i<5; i++)
		{
			System.out.println(rollno[i]);
		}
		
		String [] name= new String[5];
		name [0]= "aboli";
		name [1]= "arpit";
		name [2]= "avani";
		name [3]= "ananya";
		name [4]= "aarav";
		
		for(int i=0; i<5; i++)
		{
			System.out.println(name[i]);
		}
		
	}
}

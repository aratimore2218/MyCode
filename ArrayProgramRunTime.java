package Module2;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayProgramRunTime {
	
	public static void main(String[]args)
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Please enter the size of your array:");
		
		int rollno[]= new int[s1.nextInt()];
		
		for(int i=0; i<rollno.length; i++)
		{
			System.out.println("Please enter the value of index->" +i);
			rollno[i]= s1.nextInt();
			
		}
		System.out.println(Arrays.toString(rollno));
		s1.close();
		
	}

}

package Module2;
import java.util.Arrays;


public class StringFunction9 {
	public static void main(String[]args)
	{
		String a="My Name is Arati";
		String [] c1= a.split(" ");
		String output= " ";
		System.out.println(Arrays.toString(c1));
		
		for(int i=a.length()-1; i>=0; i-- )
		{
			char s1=a.charAt(i);
			output= output+s1;
		}
	
		System.out.println("This is my output->"+output);
	}
}

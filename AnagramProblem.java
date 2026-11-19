package Module2;
import java.util.Arrays;
public class AnagramProblem {
	public static void main(String[]args)
	{
		String s1= "silent";
		String s2= "listen";
		
		if(s1.length()!=s2.length())
		{
			System.out.println("It can't be Anagram");
		}
		else
		{
			char c1[]= s1.toCharArray();      //convert string into array
			char c2[]= s2.toCharArray();
			
			Arrays.sort(c1);               //sort them
			Arrays.sort(c2);
			System.out.println("After sorting array 1->" +Arrays.toString(c1));
			System.out.println("After sorting array 2->" +Arrays.toString(c2));
			
			if(Arrays.equals(c1, c2))
			{
				System.out.println("It is a Anagram");
			}
			else
			{
				System.out.println("It is not an Anagram");
			}
			
		}
		
	}

}

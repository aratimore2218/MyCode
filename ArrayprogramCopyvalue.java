package Module2;
import java.util.Arrays;
public class ArrayprogramCopyvalue {

	public static void main(String[]args)
	{
		int rollnoA[]= new int[4];
		
		rollnoA[0]= 10;
		rollnoA[1]= 20;
		rollnoA[2]= 30;
		rollnoA[3]= 40;

		int rollnoB[]= new int[rollnoA.length];
		
		for(int i=0; i<rollnoA.length; i++)
		{
			rollnoB[i]= rollnoA[i];
		}
		System.out.print("This is my input array:");
		
		System.out.println(Arrays.toString(rollnoA));
		
        System.out.print("This is my output array:");
		
		System.out.println(Arrays.toString(rollnoB));
		
	}
}

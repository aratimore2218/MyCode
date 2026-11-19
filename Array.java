package Module2;

import java.util.Arrays;
                                                         //compare two arrays is they are equal or not
public class Array {
	public static void main(String[]args)
	{
		int array1[] = new int [5];
		array1[0]= 16;
		array1[1]= 23;
		array1[2]= 30;
		array1[3]= 40;
		array1[4]= 50;
		 
		int array2[] = new int [array1.length];
		array2[0]= 16;
		array2[1]= 28;
		array2[2]= 30;
		array2[3]= 45;
		array2[4]= 50;
		
		System.out.print("Arrays 1 are");
		
		System.out.println(Arrays.toString(array1));
		
		System.out.print("Arrays 2 are");
		
		System.out.println(Arrays.toString(array2));
	if(array1.length==array2.length);
	{
		for(int i=0; i<array1.length; i++)
		{
			if(array1[i] ==array2[i])
			{
				
				System.out.println("Arrays are equal at index->" +i);
			}
	
			else
			{
				
				System.out.println("Arrays are not equal at index->" +i);	
			}
		}
	}
	}
}

	
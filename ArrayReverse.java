package Module2;

import java.util.Arrays;
public class ArrayReverse {

	public static void main(String[]args)
	{
		int a=10, b=20;
		int array1[] = new int [5];
		array1[0]= 123;
		array1[1]= 1234;
		array1[2]= 12345;
		array1[3]= 123456;
		array1[4]= 1234567;
		System.out.println("Input Array:");
		System.out.println(Arrays.toString(array1));
		
		int array2[] = new int [array1.length];
		
		for(int i=0,j=array2.length-1; i<array1.length; i++, j--)
		array2[j] = array1[i];
		
		/*array2[3] = array1[1];
		array2[2] = array1[2];
		array2[1] = array1[3];
		array2[0] = array1[4]; */
		
		System.out.println("Output Array:");
		System.out.println(Arrays.toString(array2));
	}	
}

package Module2;
import java.util.Arrays;
public class ArrayAverage {

	public static void main(String[]args)
	{
		double A[] = new double[5];
		
		A[0]= 10;
		A[1]= 20;
		A[2]= 30;
		A[3]= 40;
		A[4]= 72;
		double sum=0;
		
		for(int i=0;i<A.length; i++)
		{
			sum= sum+ A[i];
		}
		System.out.println("Total sum->" +sum);
		double average= sum/ A.length;
		System.out.println("Average is->"+average);
		
	/*	sum= sum +A[0];
		sum= sum +A[1];
		sum= sum +A[2];
		sum= sum +A[3];
		sum= sum +A[4]; */
		System.out.println("This is my input array");
		System.out.println(Arrays.toString(A));

	}
}

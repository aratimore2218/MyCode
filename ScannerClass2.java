package Module1;
import java.util.Scanner;
public class ScannerClass2 
{
public static void main(String[]args)
{
	Scanner s1= new Scanner(System.in);
	System.out.println("Enter the output value:");
	s1.nextInt();
	s1.nextByte();
	s1.nextShort();
	s1.nextLong();
	s1.nextFloat();
	s1.nextDouble();
	s1.nextBoolean();
	s1.next();
	s1.close();

}

}

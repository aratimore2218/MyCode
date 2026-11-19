package Module2;
class Y3
{
	Y3()
	{
		super();
		System.out.println("grand- parent class");
	}
}
class Y2 extends Y3
{
	Y2()
	{
		super();
		System.out.println("parent class");
	}
}
public class Y1 extends Y2
{
	Y1()
	{
		super();
		System.out.println("child class");
	}
	
	public static void main(String[]args)
	{
		new Y1();
		new Y2();
		new Y3();
		
		
		}
	

}

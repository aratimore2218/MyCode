package Module2;
                     //super calling statement
class Z3
{
	Z3(String name, char gender)
	{
		System.out.println("grand-parent class");
	}
}
class Z2 extends Z3
{
	Z2(int rollno, double balance)
	{
		super("Arati", 'D');
		System.out.println("parent class");
	}
}
public class Z1 extends Z2
{
	Z1(String a, String b)
	{
		super(50, 565.235);
		System.out.println("child class");
	}
	
	public static void main(String[]args)
	{
		new Z1("username", "password");
	}
}


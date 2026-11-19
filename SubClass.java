package Module2;

class SupermostClass           //Multi-level Inheritance
{
	static void m3()
	{
		System.out.println("Grand Parent Property");		
		}

}
class SuperClass extends SupermostClass
{
	static void m2()
	{
		System.out.println("Parent Property");
		}
}

public class SubClass extends SuperClass
{ 
	static void m1()
	{
		System.out.println("Child Property");
		}
	
	public static void main(String[]args)
	{
		m1();
		m2();
		m3();
	}

}

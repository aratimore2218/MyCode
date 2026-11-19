package Module2;

interface super2
{
	void method2();            //abstract method
	
}
interface super1 extends super2        //interface to interface by using extends keyword
{
	void method1();               //abstract method
	
}
public class Multiple implements super1, super2          //Multiple level of Inheritance
{
	public static void main(String[]args)
	{
		
	}@Override
	public void method2() {                           //method overriding
		// TODO Auto-generated method stub
		
	}@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

}

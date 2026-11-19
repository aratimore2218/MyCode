package Module2;

abstract class AC1                      //100% abstraction
{
    abstract void method1();

    abstract void method2();
}
public class CC1 extends AC1
{
public static void main(String[]args)
{
	
}

void method1()
{
	System.out.println("Developer will write real logic 1");
}

void method2()
{
	System.out.println("Developer will write real logic 2");
	
}
}

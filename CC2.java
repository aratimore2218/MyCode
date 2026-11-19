package Module2;
abstract class AB2                            //50% abstraction
{
   abstract void method1();
   abstract void method();
   static void method3()
   {
	   System.out.println("Logic of some free API");
   }
      static void method4()
   {
	   System.out.println("Logic of some free API");
   }
}
public class CC2 extends AB2
{
public static void main(String[]args)
{
	
}

void method1() {
	System.out.println("real logic 1");
}

void method() {
	System.out.println("real logic 2");
	}
}

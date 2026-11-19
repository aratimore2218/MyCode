package Module2;
class parent2 extends grandparent
{
	  static void method4()
      {
   	  System.out.println("Method4");
      }
}
class grandparent
{
	  static void method3()
      {
   	  System.out.println("Method3");
      }
}
class parent extends grandparent
{
	  static void method2()
      {
   	  System.out.println("Method2");
      }
}
public class HybridChild extends parent
{
    static void method1()
       {
    	  System.out.println("Method1");
       }
    public static void main(String[]args)
    {
    	method1();
    	method2();
    	method3();
    	
    }
}

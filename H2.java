package Module2;

public class H2 implements H1
{
 public static void main(String[]args)
 {
	 H2 object = new H2();
	 object.method1();
	 object.method2();
 }
 public void method1()
 {
	System.out.println("logic 1");
	}
public void method2() 
 {
	 System.out.println("logic 2");
 }
}

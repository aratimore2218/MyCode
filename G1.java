package Module2;

class G3
{
	static void method7()
	{
		System.out.println("concrete method 7");
	}
	static void method9()
	{
		System.out.println("concrete method 9");
	}
}
abstract class G2 extends G3
{
	abstract void method2();
	abstract void method3();
	static void method4()
	{
		System.out.println("concrete method 1");
	}
	static void method5()
	{
		System.out.println("concrete method 2");
	}
}
public class G1 extends G2 
{
	static void method1()
	{
		System.out.println("concrete method 3");
	}
	public static void main(String[]args)
	{
		
	}
	void method2() {
		System.out.println("reaal logic1");
		
	}
	
	void method3() {
	
		System.out.println("reaal logic2");
	}

}

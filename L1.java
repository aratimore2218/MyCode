package Module2;

interface L3
{
	void method2();
}

interface L2 extends L3
{
	void method1();
}

public class L1 implements L2, L3
{
    public static void main(String[]args)
    {
    	L1 object= new L1();
    	object.method1();
    	object.method2();
    }
	public void method2() {
		System.out.println("Actual Logic 1");
	}

	
	public void method1() {
		System.out.println("Actual Logic 2");
	}
}

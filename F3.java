package Module2;

public class F3 implements F2                    //multiple level of inheritance
{

	public static void main(String[]args)
	{
		F3 add = new F3();
		add.mathod1();
		add.mathod2();
		add.method3();
		add.method4();
	}

	public void method3() {
		System.out.println("This is method 3");
		
	}

	public void method4() {
		System.out.println("This is method 4");
	}

	public void mathod1() {
		System.out.println("This is method 1");
	}

	
	public void mathod2() {
		System.out.println("This is method 2");
	}
}

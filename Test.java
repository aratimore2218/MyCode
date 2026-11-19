package Module2;

public class Test {
	int x;
	Test()
	{
		x=25;
	}
	
	void show()
	{
		System.out.println(x);
	}
	
	public static void main(String[]args)
	{
		Test t= new Test();
		t.show();
	}
	}
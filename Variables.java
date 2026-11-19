package Module2;

public class Variables {
	int a; //global variable
	static double b= 3.5; // global variable
	char f='C';  //instance variable or non-static variable
	String s;
	boolean j;
	

	public static void main(String[]args)
	{
		int g= 56; //local variable
		
		System.out.println(g);
		System.out.println(b);
		
		
		Variables v1= new Variables();
		System.out.println(v1.a);	
		System.out.println(v1.f);
		System.out.println(v1.s);
		System.out.println(v1.j);
		v1.add();
	}	
	
	public void add()
	{
		int salary= 25000;
		String s= "Hello";
		System.out.println(salary);
		System.out.println(s);
		
		
	}
}

package Module2;

public class GlobalVariable {

	static String name="Automation";
	int a= 66;
	float f;
	long l;
	char v;
	String s;
	boolean b;
	byte dd;
	short xx;
	double bb;	
	public static void main(String[]args)
	{
		name="Binary";
		
		System.out.println(name);
		GlobalVariable g1= new GlobalVariable();
		System.out.println(g1.f);
		System.out.println(g1.l);
		System.out.println(g1.v);
		System.out.println(g1.s);
		System.out.println(g1.b);
		System.out.println(g1.dd);
		System.out.println(g1.xx);
		System.out.println(g1.bb);
		System.out.println(g1.a= 39);
	}
	
	
}
	


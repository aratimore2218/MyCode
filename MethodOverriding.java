package Module2;
class A12
{
	void login()
	{
		System.out.println("Login with email ID");
	}
}
public class MethodOverriding extends A12
{
	
	void login()
	{
		super.login();
		
		System.out.println("Login with mobile number");	
	}
	
	public static void main(String[]args)
	{
	
	if(true)   //developer is checking if user can enter mobile number
	{
		MethodOverriding m1= new MethodOverriding();
				m1.login();		
	}
	else
	{
		A12 a1= new A12();
		a1.login();
	}
}
}




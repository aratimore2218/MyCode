package Module2;

public class StringFunction5 {
	public static void main(String[]args)
	{
		String a= "My Name is Ram";  //length= 14, index= 0-13
		System.out.println(a.length());
		System.out.println(a.trim());
		
		String b= "School";
		System.out.println(a.trim());
		System.out.println(b.substring(2));   //substring(start index)
		System.out.println(a.substring(a.length()-1,a.length()));
		
		String c= "Name";                     //substring(start index, end index)
		System.out.println(c.substring(c.length()-3, c.length())); // (4-1, 4) = 3,3
		
		String fullname= "Ram Singh Talwar";
		
		String fname= fullname.substring(0, 3);
		String middlename= fullname.substring(4, 9);
		String lastname= fullname.substring(10);    //fullname.length()-6
		System.out.println("My First Name is->" +fname);
		System.out.println("My Middle Name is->" +middlename);
		System.out.println("My Last Name is->" +lastname);
		}

}

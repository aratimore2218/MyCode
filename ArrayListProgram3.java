package Module2;

import java.util.ArrayList;

public class ArrayListProgram3 {
	
	public static void main(String[]args)
	{
		ArrayList<String> a1= new ArrayList<String>();
		a1.add("Mona");
		a1.add("Meera");
		a1.add("Raha");
		a1.add("Radha");
		a1.add("Rani");
		System.out.println(a1);
		
		a1.add(1, "Arati");
		
		ArrayList<String> a2= new ArrayList<String>();
		a2.add("Amol");
		a2.add("Krishna");
		a2.add("Sameer");
		a2.add("Rohan");
		a2.add("Raj");
		System.out.println(a2);
		
		a1.addAll(2, a2);
		
		System.out.println("New a1:" +a1);
		
		System.out.println(a1.get(0));
		System.out.println(a1.indexOf("Raha"));
	}
}


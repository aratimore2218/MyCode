package Module2;

import java.util.ArrayList;

public class ArrayListProgram4 {
	
	public static void main(String[]args)
	{
		ArrayList<String> a1= new ArrayList<String>();
		a1.add("Mona");
		a1.add("Meera");
		a1.add("Raha");
		a1.add("Radha");
		a1.add("Rani");
		System.out.println(a1);
		System.out.println("Size of array is:"+a1.size());
		
		ArrayList<String> a2= new ArrayList<String>();
		a2.add("Mona");
		a2.add("Meera");
		a2.add("Raha");
		a2.add("Radha");
		a2.add("Rani");
		System.out.println(a2);
		
		boolean b2= a1.containsAll(a2);
		System.out.println(b2);
		boolean b1= a1.isEmpty();
		System.out.println("isEmpty:" +b1);
		
		//a1.clear();
		System.out.println(a1);
		boolean b3= a1.contains("Manish");
		System.out.println("is present:"+b3);
		
		a1.remove(1);
		a1.remove("Raha");
		
		a1.addAll(a2);
		System.out.println("Merge two arraylist:"+a1);
		a1.removeAll(a2);
		
		boolean b4= a1.equals(a2);
		System.out.println("is equal>" +b4);
}
}
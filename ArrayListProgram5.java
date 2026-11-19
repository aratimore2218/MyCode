package Module2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class ArrayListProgram5 {
	
	public static void main(String[]args)
	{
		ArrayList<String> a1= new ArrayList<String>();
		a1.add("Samira");		
		a1.add("Ziva");
		a1.add("Arnav");
		a1.add("Arpit");
		a1.add("Rina");
		a1.add(null);
		
	    Iterator<String>i1=a1.iterator();
	    /*hasNext-> boolean
	     * next-> Object
	     * remove-->
	     */
	    System.out.println("Iterattion using Iterator:-");
	   while(i1.hasNext())
	   {
		   System.out.println(i1.next());
	   }
	   
		ListIterator<String> i2=a1.listIterator();
		/*hasNext
		  *hasPrevious
		  *next
		  *previous
		  *remove
		  *set
		  */
		
		System.out.println("Iterattion using forward Iterator:-");
		while(i2.hasNext())
		   {
			   System.out.println(i2.next());
		   }
		
		System.out.println("Iterattion using backward Iterator:-");
		while(i2.hasPrevious())
		   {
			   System.out.println(i2.previous());
		   }
	
		}

}

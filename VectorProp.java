package Module2;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorProp {

	public static void main(String[]args)
	{
		Vector<String> v1= new Vector<String>(15);
		
		v1.addElement("Neha");
		v1.addElement("Megha");
		v1.addElement("Jaya");
		v1.addElement("Sneha");
		v1.add("Megha");
		v1.addFirst("Run");
		v1.addLast("Program");
		v1.removeElementAt(2);
	    System.out.println(v1.capacity());
		System.out.println(v1);
		
		 Vector<String> v2= new Vector<String>();

		v2.addElement("Java");
		v2.addElement("Python");
		v2.addElement("Selenium");
		System.out.println(v2);
		
		System.out.println("Iterating vector using Enumeration ");
		Enumeration<String> e1 =v2.elements();
		  
		  while(e1.hasMoreElements())                 //boolean
		  {
			  System.out.println(e1.nextElement());     //object
		  }
		  
		    System.out.println("Iterating vector using Iterator ");
		  
		  Iterator<String> i1 = v2.iterator();
		  while(i1.hasNext())
		  {
			  System.out.println(i1.next());
		  }
		  
		  System.out.println("Iterating vector using List of Iterator ");
		  
		  ListIterator<String> i2=v2.listIterator();
		  while(i2.hasNext())
		   {
			   System.out.println(i2.next());
		   }	 		
	}
}

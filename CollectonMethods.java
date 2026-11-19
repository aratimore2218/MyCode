package Module2;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectonMethods {
	
	public static void main(String[]args)
	{
	
	Collection<Character> c1= new ArrayList<Character>();
	c1.add('B');
	c1.add('A');
	c1.add('I');
	c1.add('L');
	
	System.out.println(c1);                     //add
	Collection<Character> c2= new ArrayList<Character>();
	c2.add('D');
	c2.add('A');
	c2.add('T');
	c2.add('A');
	
	c1.addAll(c2);                            //addAll
	System.out.println(c1);
	
	boolean b1=c1.contains('M');                   //contains
	System.out.println(b1);
	
	System.out.println(c1);
	boolean b2= c1.containsAll(c2);               //containAll
	System.out.println(b2);
	
	boolean b3=c1.isEmpty();                  //isEmpty
	System.out.println(b3);
	
	c1.remove('B');
	System.out.println(c1);                   //remove
	
	c1.removeAll(c2);                       //removeAll
	System.out.println(c1);
	
	int i1=c1.size();                 //size
	System.out.println(i1);
	
	c1.addAll(c2);                    
	System.out.println(c1);
	
	//c1.clear();                      //clear
	//System.out.println(c1);
	                                   
	boolean b4=c1.equals(c2);              //equals
	System.out.println(b4);
	                       
	Iterator<Character>i4 = c1.iterator();        //Iterator
	while(i4.hasNext())                  //hasNext
	{
		System.out.println(i4.next());            //next
	}
	
	}
}
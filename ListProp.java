package Module2;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;

public class ListProp {

	public static void main(String[]args)
	{
		List<Integer> l1= new ArrayList<Integer>();
		l1.add(56);
		l1.add(400);
		l1.add(633);
		l1.add(633);
		l1.add(null);
		l1.add(897);
		l1.add(78);
		System.out.println(l1);

		List<Integer> l2= new ArrayList<Integer>();
		l2.add(23);
		l2.add(40);
		l2.add(33);
		l2.add(97);
		l2.add(578);
		System.out.println(l2);
	l1.addAll(l2);
	System.out.println(l1);
	
	Iterator<Integer> i1= l1.iterator();
	System.out.println("Iteration of Iterator:-");
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}	
	System.out.println("Iteration of List of Iterator:-");
	ListIterator<Integer> i2= l1.listIterator();
	while(i2.hasNext())
	{
		System.out.println(i2.next());
	}
	}
}

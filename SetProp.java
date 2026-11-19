package Module2;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
public class SetProp {
	public static void main(String[]args)
	{
		Set<String> s1= new HashSet<String>();
		s1.add("Arati");
		s1.add("Arati");
		s1.add("Sharvill");
		s1.add(null);
		s1.add(null);
		
		System.out.println(s1);
		
		Set<String> s2= new HashSet<String>();
		s2.add("Pooja");
		s2.add("Prasad");
		s2.add("Raj");
		System.out.println(s2);
		
		s1.addAll(s2);
		System.out.println(s1);
		
		boolean b1=s1.contains("Manish");
		System.out.println(b1);
		
		boolean b2=s1.containsAll(s2);
		System.out.println(b2);
		
		boolean b3=s1.isEmpty();
		System.out.println(b3);
		
		//s1.clear();
		System.out.println(s1);
		
		s1.remove("Prasad");
		System.out.println(s1);
		
		s1.removeAll(s2);
		System.out.println(s1);
		
		boolean b4=s1.equals(s2);
		System.out.println(b4);
		
		
		System.out.println("Iteration using Iterator:-");
		Iterator<String> i1=s1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}

}

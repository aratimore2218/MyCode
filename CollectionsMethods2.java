package Module2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsMethods2 {

	public static void main(String[]args)
	{
		List<String> a= new ArrayList<String>();
		List<String> b= Collections.synchronizedList(a);
		
		b.add("Java");
		b.add("Python");
		
		System.out.println("Collections method for Synchronized List:");
		
		synchronized(b) 
		{
		for(String s :b)
			
		{
			System.out.println(s);
		}
		
		Set<Integer> c= new HashSet<Integer>();
		Set<Integer> d= Collections.synchronizedSet(c);
		
		d.add(50);
		d.add(100);
		
		System.out.println("Collections method for Synchronized Set:");
		synchronized(d) {
		for(Integer i :d)
			
		{
			System.out.println(i);
		}
	
		Map<String, Integer> e = new HashMap<String, Integer>();
		Map<String, Integer> f = Collections.synchronizedMap(e);
		
		f.put("Selenium", 80);
		f.put("JavaScript", 50);
		
		System.out.println("Collections method for Synchronized Map:");
		synchronized(f) {
		for(Map.Entry<String,Integer> i6:f.entrySet())
		{
			System.out.println(i6);
		}
		
		
		}
		}
		}
		
	}

	
	}


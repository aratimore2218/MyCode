package Module2;
import java.util.ArrayList;
import java.util.Collections;
public class CollectionsMethods {
	
public static void main(String[]ars)
	{
		ArrayList<Integer> a1= new ArrayList<Integer>();
		a1.add(52);
		a1.add(77);
		a1.add(89);
		a1.add(77);
		a1.add(200);
		System.out.println(a1);
		
		Collections.sort(a1);
		System.out.println(a1);
		
		Collections.reverse(a1);
		System.out.println(a1);
		
		System.out.println(Collections.frequency(a1, 77));
		
		System.out.println(Collections.max(a1));
		System.out.println(Collections.min(a1));
		
	}
}

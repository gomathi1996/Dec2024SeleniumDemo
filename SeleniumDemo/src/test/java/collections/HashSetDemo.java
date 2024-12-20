package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	// do not store duplicate values
	// order can be stored random
	//HashSet treeset, LinkedHashset implements Set interface
	//does not accept duplicate values 
	// There is no guarantee elements stored in sequential order..Random order

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("US");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("CANADA");
		hs.add("AUSTRALIA");
		hs.add("US");
		System.out.println(hs);
		
		System.out.println(hs.remove("US"));
		System.out.println(hs.size());
		
		System.out.println("****************");
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}

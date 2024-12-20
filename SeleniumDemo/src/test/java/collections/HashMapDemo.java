package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	// hashmap will have key and value pair
	// key should be unique
	//if same key with different value is inserted, entry will get updated with latest values

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0, "Carrot");
		hm.put(1, "Onion");
		hm.put(21, "Tomato");
		hm.put(3, "Potato");
		hm.put(3, "Cabbage");
		hm.put(4, "Onion");
		
//		System.out.println(hm.get(3));
//		System.out.println(hm.remove(3));
//		System.out.println(hm.get(3));
		System.out.println("****************************");
		Set entryset = hm.entrySet();
		Iterator it = entryset.iterator();
		while(it.hasNext()) {
			Map.Entry<Integer,String> entry = (Map.Entry<Integer,String>)it.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		

	}

}

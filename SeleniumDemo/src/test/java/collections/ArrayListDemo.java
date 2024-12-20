package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	
	// can accept duplicate values
	//ArraList,LinkedList,vector- Implementing List interface
	//array have fixed size where as arraylist can grow dynamicaly
	//you can access and insert any value in any index

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Arun");
		al.add("Rahul");
		al.add("Rakesh");
		al.add("Ravi");
		al.add("Rahul");
		System.out.println(al);
		al.add(1, "Mani");
		System.out.println(al);
		System.out.println(al.indexOf("Ravi"));
		System.out.println(al.isEmpty());
		System.out.println(al.contains("Rahul"));
		System.out.println(al.remove(1));
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.size());
		System.out.println(al.set(0, "updated"));
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		System.out.println("*******************************************");
		Iterator<String> it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}

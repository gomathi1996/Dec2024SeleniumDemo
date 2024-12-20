package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindNumberOfOccurrences {

	public static void main(String[] args) {
		int a[] ={ 4,5,5,5,4,6,6,5,9,4,4,1,4,4,1,1};
		ArrayList<Integer> al = new ArrayList<Integer>();
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for(int i =0;i<a.length;i++) {
			int k =0;
			if(!al.contains(a[i])) {
				al.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						k++;
					}
				}
				hm.put(a[i], k);
				if(k==1) {
					System.out.println(a[i] +" is a unique number");
				}
			}
		}
//		Set entryset = hm.entrySet();
//		Iterator it = entryset.iterator();
//		while(it.hasNext()) {
//			Map.Entry<Integer, Integer> entry = (Map.Entry<Integer, Integer>)it.next();
//			System.out.println("The Value "+entry.getKey()+ " is repated at "+entry.getValue()+" times");
//		}
		for (Entry<Integer, Integer> val : hm.entrySet()) {
			System.out.println("The Value "+val.getKey()+ " is repated at "+val.getValue()+" times");
		}
        int max_count = 0, res = -1;

        for (Entry<Integer, Integer> val : hm.entrySet()) {
            if (max_count < val.getValue()) {
                res = val.getKey();
                max_count = val.getValue();
           
            }
        }

        System.out.println("Maximum repeated value is :"+res+" and it's frequency :"+max_count);
    }

	}



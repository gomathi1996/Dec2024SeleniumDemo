package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import dev.failsafe.internal.util.Assert;

public class StreamsDemo {
	
	public void regularway() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Anand");
		al.add("Abhi");
		al.add("Bose");
		al.add("Chand");
		al.add("Arun");
		
		int count = 0;
		for(int i=0;i<al.size();i++) {
			String val = al.get(i);
			if(val.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);
	}

	public void usingStream() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Anand");
		al.add("Abhi");
		al.add("Bose");
		al.add("Chand");
		al.add("Arun");
		
//		long count = al.stream().filter(s->s.startsWith("A")).count();
//		System.out.println(count);
		
//		long res = Stream.of("Anand","Abhi","Bose","Chand","Arun","Aalvin").filter(s->{
//			s.startsWith("A");
//			return false;
//		}).count();
		long res = Stream.of("Anand","Abhi","Bose","Chand","Arun","Aalvin").filter(s->s.startsWith("A")).count();
		System.out.println(res);
	}
	
	public void printUsingStream() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Anand");
		al.add("Abhi");
		al.add("Bose");
		al.add("Chand");
		al.add("Arun");
		
		al.stream().forEach(s->System.out.println(s));
		
		System.out.println("************************************");
		
		al.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		System.out.println("************************************");
		
		Stream<String> val = al.stream().filter(s->s.length()>4).limit(1);
		val.forEach(s-> System.out.println(s));
	}
	
	public void streammap() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Anand");
		al.add("Abhi");
		al.add("Bose");
		al.add("Chand");
		al.add("Arun");
		
		al.stream().filter(s->s.endsWith("d")).map(s->s.toUpperCase()).forEach(s-> System.out.println(s));
		
		System.out.println("***********************");
		
		al.stream().map(s->s.toUpperCase()).sorted().forEach(s->System.out.println(s));
		
		System.out.println("***********************");
		
//		al.stream().filter(s->s.startsWith("A")).map(s->s.toUpperCase()).sorted().forEach(s->System.out.println(s));
		
		al.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
	}

	public void streamMerge() {
		List<String> list1 = Arrays.asList("Abhi","Arun","Anu","Bala","Xero");
		List<String> list2 = Arrays.asList("Aravind","Anand","Chand","Xoro","Parig");
		
		Stream<String> list3 = Stream.concat(list1.stream(), list2.stream());
//		list3.sorted().forEach(s->System.out.println(s));
		
		boolean flag = list3.anyMatch(s->s.equalsIgnoreCase("bala"));
		System.out.println(flag);
		Assert.isTrue(flag, "Expected true but received : "+flag);

	}
	
	public void streamCollect() {
		List<Integer> list = Arrays.asList(1,4,2,6,7,1,3,2,6,7,4);
		
		//sort an array
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		//print unique number
		list.stream().distinct().sorted().forEach(s->System.out.println(s));
		
		Map<Integer, Long> result = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(result);
		
		Map<Integer, Integer> result1 = list.stream().collect(Collectors.groupingBy(Function.identity(),
                Collectors.summingInt(e -> 1)));
		System.out.println(result1);
		
	}
	
	public void collectionFreq() {
		List<Integer> list = Arrays.asList(1,4,2,6,7,1,3,2,6,7,4,1,4,4);
		Map<Integer, Integer> result = new HashMap<Integer, Integer>();
		for(int i =0; i<list.size();i++) {
			int freq = Collections.frequency(list, list.get(i));
			result.put(list.get(i), freq);
			
		}
		// Get keys and values
//		for(Map.Entry<Integer, Integer> entry: result.entrySet()) {
//			int key = entry.getKey();
//			int val = entry.getValue();
//			System.out.println(key+" : "+val);
//			
//		}
		
		//Java 8
//		result.forEach((k,v)->System.out.println(k + " - "+v));
		
		//get all keys
//		Set<Integer> keys = result.keySet();
//		for(Integer k: keys) {
//			System.out.println(k);
//		}
		
		//get all values
		Collection<Integer> values = result.values();
		for(Integer val:values) {
			System.out.println(val);
		}
		
		
	}
	
	public static void main(String[] args) {
		StreamsDemo sd = new StreamsDemo();
//		sd.regularway();
//		sd.usingStream();
//		sd.printUsingStream();
//		sd.streammap();
//		sd.streamMerge();
//		sd.streamCollect();
		sd.collectionFreq();

	}

}

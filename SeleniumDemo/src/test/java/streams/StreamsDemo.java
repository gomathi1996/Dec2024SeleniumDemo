package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
	
	public static void main(String[] args) {
		StreamsDemo sd = new StreamsDemo();
//		sd.regularway();
//		sd.usingStream();
//		sd.printUsingStream();
//		sd.streammap();
		sd.streamMerge();

	}

}

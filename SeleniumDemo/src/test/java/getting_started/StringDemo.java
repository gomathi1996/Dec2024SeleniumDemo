package getting_started;

public class StringDemo {

	public static void main(String[] args) {
		String s = "hello"; //literal - immutable
		String s1 = "hello"; //point to s reference
		s.concat("world"); 
		System.out.println(s); //hello
		String s2 = s.concat("world");
		System.out.println(s2); //helloworld
		
		s.replace('e', 'i');
		System.out.println(s);//hello
		String s3 = s.replace('e', 'i');
		System.out.println(s3);//hillo
		
		String str = new String("hiii");
		String str1 = new String("hiii"); //it will create new memory no matter what
		
		//StringBuffer and StringBuilder -> //mutable
		// StringBuffer - > thread safe
		//StringBuilder -> not thread safe-> non synchronized -> faster than stringbuffer -> parallel case we can go for it
		StringBuffer sb = new StringBuffer("hello"); 
		sb.append("world");
		System.out.println(sb);//helloworld
		
		sb.insert(1, "aa");
		System.out.println(sb);//haaelloworld
		
		sb.replace(1, 4, "e"); // start->including, end -> excluding
		System.out.println(sb);//helloworld
		
		sb.delete(5, sb.length());//hello
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);//olleh
		
		String st1 = "gomathi";
		String st2 = "gomathi";
		System.out.println(st1==st2); //compares object reference
		System.out.println(st1.equals(st2)); //compares content
		String st3 = new String("mano");
		String st4 = new String("mano");
		System.out.println(st3==st4);
		System.out.println(st3.equals(st4));	
	}

}

package getting_started;

public class StringClassDemo {

	public static void main(String[] args) {
		// String -> one of the pre-built class in java
		// 1. string literal 2. by creating object of string
		
		String s1 = "helloworld"; //string literal
		String s2 = new String("hello hiii"); //object of string
		
		System.out.println(s1);//helloworld
		System.out.println(s1.charAt(1));//e
		System.out.println(s1.indexOf('e'));//1
		System.out.println(s1.indexOf('k'));//-1
		System.out.println(s1.substring(3));//loworld
		System.out.println(s1.substring(2, 5));//llo
		System.out.println(s1.concat(s2).trim());//helloworldhello hiii
		System.out.println(s2.trim());//hello hiii
		System.out.println(s1.toUpperCase());//HELLOWORLD
		String arr[] = s1.split("o");
		System.out.println(arr.length);//3
		System.out.println(arr[0]); //hell
		System.out.println(arr[1]);//w
		System.out.println(arr[2]);//rld
		System.out.println(s1.replace("o", "ii")); //helliiwiirld
	}
}

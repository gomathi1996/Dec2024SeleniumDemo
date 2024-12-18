package getting_started;

public class PalindromeDemo {

	public static void main(String[] args) {
		String s1 = "madam";
		int length = s1.length();
		String s2 = "";
		for (int i = length - 1; i >= 0; i--) {
			s2 = s2 + s1.charAt(i);
		}
		System.out.println(s2);
		if (s1.equals(s2)) {
			System.out.println("It's Palindrome!!!");
		} else {
			System.out.println("It's Not a Palindrome!!!");
		}
	}
}

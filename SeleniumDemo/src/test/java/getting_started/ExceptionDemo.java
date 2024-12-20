package getting_started;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		//one try can be followed by multiple catch blocks
		//catch should be an immediate block after try
		try {
			int c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException ae) {
			System.out.println("Arithmetic Exception captured :"+ae);
		}
		catch(Exception e) {
			System.out.println("Exception captured :"+e);
		}
		finally {//This block is executed irrespective of exception thrown or not
			System.out.println("Finally block executed");
		}

	}

}

package getting_started;

public class ArraysDemo {

	public static void main(String[] args) {
		// Array - container that stores multiple values of same data type.
		int a[] = new int[5]; //declares an array and allocate memory for the variable
		a[0] = 2;
//		a[1] = 5;
		a[2] = 6;
		a[3] = 10;
		a[4] = 12;
//		a[5] = 9;
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("**************************");
		int b[] = {3,5,1,8,10}; //array literals
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}

	}

}

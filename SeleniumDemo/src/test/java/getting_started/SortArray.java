package getting_started;

public class SortArray {

	public static void main(String[] args) {
		int a[] = {10,5,2,9,6};
		
		int temp = 0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
//				if(a[i]>a[j]) { //ascending order
//					temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
				if(a[i]<a[j]) { //descending order
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int k =0;k<a.length;k++) {
			System.out.println(a[k]);
		}
		System.out.println("************************");

		// swaping of 2 numbers without 3rd variable
		int val1 = 5;
		int val2 = 4;
		System.out.println("Original Values");
		System.out.println("val1 : "+val1);
		System.out.println("val2 : "+val2);
		
		val1 = val1+val2;
		val2 = val1 - val2;
		val1 = val1 - val2;
		
		System.out.println("After swapping");
		System.out.println("val1 : "+val1);
		System.out.println("val2 : "+val2);
	}

}

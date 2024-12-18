package getting_started;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		
		System.out.println("Row length : "+a.length);
		System.out.println("First row Column length : "+a[0].length);
		System.out.println("Second row Column length : "+a[1].length);
		
		for(int i=0;i<a.length;i++) { //row
			for(int j=0;j<a[i].length;j++) { //column
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println();
		}
	
}
}

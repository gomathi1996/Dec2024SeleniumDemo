package getting_started;

public class MinNumberFromMultiDimenArray {

	public static void main(String[] args) {
		int a[][]= {{21,100,0},{47,15,60},{17,8,91},{10,11,31}};
/*
		int min =a[0][0];
		int max =a[0][0];
		
		for(int i=0;i<a.length;i++) { //row
			for(int j=0;j<a[i].length;j++) { //column
				if(a[i][j]<min) {
					min = a[i][j];
				}
				if(a[i][j]>max) {
					max = a[i][j];
				}
			}
		}
		System.out.println(min);
		System.out.println(max);
*/
		
		int min =a[0][0];
		
		int minrow = 0;
		
		for(int i=0;i<a.length;i++) { //row
			for(int j=0;j<a[i].length;j++) { //column
				if(a[i][j]<min) {
					min = a[i][j];
					minrow = i;
				}
			}
		}
		
		System.out.println("Minimum value in a multi dimensional array : "+min);
		
		int max =a[minrow][0];;
		
			for(int k=0;k<a[minrow].length;k++) {
				if(a[minrow][k]>max) {
					max = a[minrow][k];
				}
			}
			System.out.println("Maximum value in a minimum value row of multi dimensional array : "+max);
		
		
	}
	
}



package getting_started;

public class NestedForLoop {

	public static void main(String[] args) {

/*
		int k = 1;
		for (int i = 0; i <= 4; i++) {
			for (int j = 1; j <= 4 - i; j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println();
		}
		
/*
1	2	3	4	
5	6	7	
8	9	
10
		
 */
	
/*		
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= 1 + i; j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println();
		}	
		
/*
1	
2	3	
4	5	6	
7	8	9	10

*/
/*		
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= 1 + i; j++) {
				System.out.print(j);
				System.out.print("\t");
			}
			System.out.println();
		}
/*
1	
1	2	
1	2	3	
1	2	3	4
 */
		int n = 3;
		for (int i = 0; i < 3; i++) {
			for (int j =1 ; j <= 1 + i; j++) {
				System.out.print(n);
				System.out.print("\t");
				n=n+3;
			}
			System.out.println();
		}
/*
3	
6	9	
12	15	18		
 */
	}
}

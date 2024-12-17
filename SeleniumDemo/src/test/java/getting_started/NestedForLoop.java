package getting_started;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=4;i>=1;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+ " ");
//				
//			}
//			System.out.println();
//		
//		}
		int k =1;
		for(int i=0;i<=4;i++) {
			for(int j=1;j<=4-i;j++) {
				System.out.print(k+ " ");
				k++;
				
			}
			
			System.out.println();
		
		}
	}

}

package getting_started;

public class ClassObjects {
	
	public void getData() {
		System.out.println("Fetching getdata method");
	}
	
	static int a = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);
		ClassObjects co = new ClassObjects();
		SecondClassObjects sc = new SecondClassObjects();
		co.getData();
		sc.setData();
		

	}

}

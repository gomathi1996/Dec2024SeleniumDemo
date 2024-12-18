package getting_started;

public class ParentSuperDemo {
	String name = "Parent";
	public void getData() {
		System.out.println(name);
	}
	public ParentSuperDemo() {
		System.out.println("Parent default constructor");
	}
	public ParentSuperDemo(int a) {
		System.out.println("Parent parameterized constructor " +a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

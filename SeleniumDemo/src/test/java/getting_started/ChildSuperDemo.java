package getting_started;

public class ChildSuperDemo extends ParentSuperDemo{
	String name = "Child";
	public void getData() {
		super.getData();
		System.out.println(name);
		System.out.println(super.name);
	}
	public ChildSuperDemo() {
		System.out.println("Child default constructor");
	}
	public ChildSuperDemo(int a) {
		super(5);
		System.out.println("Child parameterized constructor "+a);
	}

	public static void main(String[] args) {
		ChildSuperDemo csd = new ChildSuperDemo();
		ChildSuperDemo csd1 = new ChildSuperDemo(10);
		csd.getData();
	}

}

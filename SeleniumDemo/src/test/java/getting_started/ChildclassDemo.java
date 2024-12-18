package getting_started;

public class ChildclassDemo extends ParentclassDemo{
	public void engine() {
		System.out.println("Engine is implemented");
	}
	public void color() {
		System.out.println(color);
	}
	//Function overloading - Multiple function with same name but different no. of arguments or argument data type should be different
	public void getdata(int a) {
		System.out.println(a);
	}
	public void getdata(String a) {
		System.out.println(a);
	}
	public void getdata(int a,int b) {
		System.out.println(a+b);
	}

	//Function overriding -> same function name and argument overridden in child class
	public void brake() {
		System.out.println("Child brake is implemented");
	}
	public static void main(String[] args) {
		ChildclassDemo cd = new ChildclassDemo();
		cd.brake();
		cd.color();
		cd.engine();
		cd.getdata(3);
		cd.getdata("Hello.....");
		cd.getdata(5, 9);

	}

}

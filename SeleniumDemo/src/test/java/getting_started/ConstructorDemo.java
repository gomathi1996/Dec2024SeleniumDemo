package getting_started;

public class ConstructorDemo {
	
	public ConstructorDemo() {
		System.out.println("This is default constructor");
	}
	public ConstructorDemo(int a) {
		System.out.println(a);
	}
	public ConstructorDemo(String a) {
		System.out.println(a);
	}
	public ConstructorDemo(int a,int b) {
		System.out.println(a+b);
	}
	//Constructor -> block of code that will be execute when object is created
	//1. Default constructor 2. Parameterized Constructor
	//will not return values
	//name of constructor should be the class name
	// compiler will call implict constructor if you have not defined constructor block
	//default constructor should be defined explicitly if there is any parameterized constructor

	public static void main(String[] args) {
		ConstructorDemo cd = new ConstructorDemo();
		ConstructorDemo cd1 = new ConstructorDemo(5);
		ConstructorDemo cd2 = new ConstructorDemo("hello");
		ConstructorDemo cd3 = new ConstructorDemo(5,5);

	}

}

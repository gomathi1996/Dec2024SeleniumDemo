package getting_started;

public class VariablesDemo {
	String name; // Instance variables
	String address;
//	static String city = "Bangalore"; // class variables
	//static variables will be shared
	static int i =0;
	int j =0;
	static String city;
	
	//static block -> used to instantiate static variable and it should contain only static variables
	static {
		city= "Bangalore";
		
	}
	
	VariablesDemo(String name,String address){
		this.name = name; // this -> refers to current class objects
		this.address = address; // local variables
	}
	public void getAddress() { // Instance methods
		System.out.println(address +" "+city);
		i++;
		System.out.println("value of static variable i :"+i);
		j++;
		System.out.println("value of static variable j :"+j);
		
	}
	public static void getCity() { //static /class methods -> can be called using classname
		System.out.println(city);
	}

	public static void main(String[] args) {
		VariablesDemo vd1 = new VariablesDemo("Bob","SilkBoard");
		VariablesDemo vd2 = new VariablesDemo("John","Jayanagar");
		vd1.getAddress();
		vd2.getAddress();
		System.out.println(vd1.name);
		System.out.println(VariablesDemo.city);
		VariablesDemo.getCity();
		//static variables/methods can be called directly using classname without object
		

	}

}

package getting_started;

public class ThisDemo {
	int a = 5;
	public void getData() {
		int a = 8;
		System.out.println(a);
		System.out.println(this.a);
		//this -> this refers to current object- object scope lies in class level
	}

	public static void main(String[] args) {
		ThisDemo td = new ThisDemo();
		td.getData();
	}

}

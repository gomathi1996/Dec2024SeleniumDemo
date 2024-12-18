package getting_started;

public class ChildAircraft extends ParentAircraft {

	public static void main(String[] args) {
		ChildAircraft ca = new ChildAircraft();
		ca.engineGuidelines();
		ca.color();
		ca.instructions();
		
//		ParentAircraft pa = new ParentAircraft();
		//can't instantiate abstract class

	}

	@Override
	public void color() {
		System.out.println("Blue");
		
	}
	
	public void instructions() {
		System.out.println("Please follow the aircraft instruction");
	}

}

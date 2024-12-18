package getting_started;

public class BeagleDog implements DogDemo{

	public static void main(String[] args) {
		BeagleDog bd = new BeagleDog();
		bd.breed();
		bd.colour();
		bd.lifespan();

	}

	@Override
	public void breed() {
		System.out.println("Beagle");
		
	}

	@Override
	public void colour() {
		System.out.println("Brown");
		
	}

	@Override
	public void lifespan() {
		System.out.println("12-15 Years");
		
	}

}

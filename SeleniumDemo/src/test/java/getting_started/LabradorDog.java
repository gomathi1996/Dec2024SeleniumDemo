package getting_started;

public class LabradorDog implements DogDemo {

	public static void main(String[] args) {
//		DogDemo ld = new LabradorDog();
		LabradorDog ld = new LabradorDog();
		ld.breed();
		ld.colour();
		ld.lifespan();
		ld.nature();
	}
	public void nature() {
		System.out.println("Loving and adorable");
	}

	@Override
	public void breed() {
		System.out.println("Labrador");
		
	}

	@Override
	public void colour() {
		System.out.println("Sandle");
		
	}

	@Override
	public void lifespan() {
		System.out.println("10-14 Years");
		
	}

}

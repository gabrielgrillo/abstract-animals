package abstracts.lessons.java;

public class Aquila extends Animale implements IVolante{

	@Override
	public void verso() {
		System.out.println("verso aquila");		
	}

	@Override
	public void mangia() {
		System.out.println("mangia carne");		
	}

	@Override
	public void vola() {
		System.out.println("sto volando");
		
	}

}

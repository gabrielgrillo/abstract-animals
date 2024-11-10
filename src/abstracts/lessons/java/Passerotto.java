package abstracts.lessons.java;

public class Passerotto extends Animale implements IVolante {

	@Override
	public void verso() {
		System.out.println("cip");
	}

	@Override
	public void mangia() {
		System.out.println("mangia semi");
	}
	
	@Override
	public void vola() {
		System.out.println("sto volando");
		
	}
	

}
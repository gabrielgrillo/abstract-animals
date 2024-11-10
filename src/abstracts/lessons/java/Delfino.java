package abstracts.lessons.java;

public class Delfino extends Animale implements INuotante {

	@Override
	public void verso() {
		System.out.println("kiki");
	}

	@Override
	public void mangia() {
		System.out.println("mangia pesci");
	}

	@Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }
	
}

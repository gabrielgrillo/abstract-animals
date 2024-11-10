package abstracts.lessons.java;

public class Main {
	
	
	public static void main(String[] args) {
		
		Animale cane = new Cane();
		Animale passero = new Passerotto();
		Animale aquila = new Aquila();
		Animale delfino = new Delfino();
		
		cane.dormi();
        cane.verso();
        cane.mangia();
        
        passero.dormi();
        passero.verso();
        passero.mangia();
        
        aquila.dormi();
        aquila.verso();
        aquila.mangia();
        	
        delfino.dormi();
        delfino.verso();
        delfino.mangia();
        
        Aquila a2 = new Aquila();
        
        a2.vola();
        faiVolare(a2);
        
        Delfino d2 = new Delfino();
        
        d2.nuota();
        faiNuotare(d2);
        
        
	}
	
	static void faiVolare(IVolante animale) {
		animale.vola();
	}
	
	static void faiNuotare(INuotante animale) {
		animale.nuota();
	}


}

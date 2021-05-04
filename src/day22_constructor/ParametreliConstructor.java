package day22_constructor;

public class ParametreliConstructor {

	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;

	public ParametreliConstructor(int yil) { //1 > tek parametreli constructor
		this.yil=yil; // runner classinda ki parametreyi aktif etmek icin bu satiri yazmamiz gerekir
					  // bu classdaki yili(int yil;) = argument olarak gelen yila esitle(parantez icinde ki int yil)
	}
		
	public ParametreliConstructor() { // 2 >> default' un yerine

	}
	
	public ParametreliConstructor(String Marka,String Model) { // 3 > 2 parametreli constructor
		this.marka = Marka;
		this.model = Model;
	}
	
	public ParametreliConstructor(String marka,String model, int yil, boolean kazasiVarMi) { // 4
		this.marka=marka;
		this.model=model;
		this.yil = yil;
		this.kazasiVarMi=kazasiVarMi;
	}

	public void yakit(String yakit) {
		System.out.println("Araba yakit olarak " + yakit + " kullanir");

	}

	public void vites(String vites) {
		System.out.println("Araba " + vites + " vitestir");

	}
}

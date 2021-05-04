package day22_constructor;

public class Otomobil {

	public Otomobil (String renk){ // Istersek constructor'i parametreli olarak olusturabiliriz
		
	}
	// biz bir constructor olusturunca Java default olani yok etti
	// Dolayisiyla biz bir constructor olusturdugumuzda 
	// mutlaka default constructor'un yerine de bir constructor yazmaliyiz
	
	public Otomobil() { // default constructor yerine yazdigimiz constructor
		
	}
	// ONEMLI NOT : Default constructor'dan baska bir constructor yazdigimizda
	// Java default olani yok ettigi icin MUTLAKA biz default yerine de constructor yazmaliyiz
	
	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;
	
	
	
	public void yakit(String yakit) {
		System.out.println("Araba yakit olarak "+ yakit + " kullanir");
		
	}
	
	public void vites(String vites) {
		System.out.println("Araba " + vites + " viteslidir");
		
	}
}

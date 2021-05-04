package day22_constructor;

public class CarUret {
	// Bir programda cok fazla kullancagimiz objeler icin bir tane class olustururuz.
	// Bu class' da olusturulacak objelere ait tum ozellikler olur
	// Bu class direkt calistirilmayacagi icin main method olmasa da olur
	// (Kaliphane gibidir)
	
	//SORU........CONSTRUCTOR BU CLASS'DA NEREDE
	// Su anda bu class' da gorunur bir constructorr yoktur
	// Bir class olusturuldugunda Java bu class'dan obje uretilecegini bilir
	// class (kalip) olusturuldugunda object(para) olusturmamak mumkun degildir
	// Ve gorulmeyen DEFAULT CONSTRUCTOR'i class'a yerlestirir
	// default constructor parametresizdir dolayisiyla 
	// sadece hic bir ozelligi tanimlanamayan objeler uretir(tisort uret demek gibidir)
	// default constructor ile uretilen bir objenin tum ozellikleri sonradan tanimlanmalidir(kirmizi, kisa kollu.. tisort)
	
	// eger biz sonradan bir constructor yazarsak Java default constructor'i iptal eder
	
	// Bir constructor olusturalim
	// CarUret car1 = new CarUret(); > olusturulan constructor'u kullanmadir
	public CarUret (){ // constructor'u olusturmadir
		
	}
	// KURAL1 > Ismi class ile ayni olmalidir. Dolayisiyla byk harfle baslar
	// KURAL2 > Constructor return type'a sahip degildir
	// KURAL3 > Constructor isminden sonra mutlaka parantez olur() ama parametre opsiyoneldir
	// KURAL4 > Bir constructor olusturuldugunda kimlerin kullanacagini belirlemek icin ACCESS MODIFIER yazilir
	
	// METHOD ILE CONST FARKI >> const byk harfle baslar method kucuk
	// 						  >> const'da return type yok method'da var
	
	
	
	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;

	
	
	public void yakit(String yakit) { //method
		System.out.println("Araba yakit olarak "+ yakit + " kullanir");
		
	}
	
	public void vites(String vites) { //method
		System.out.println("Araba " + vites + " vitestir");
		
	}
}

package day35_inheritance;

public class Memur extends Personel{
	
	public int maas;

	public Memur() { // 3
		//super(); // 4 > parent class daki (personel) parametresiz const'a goturur
		System.out.println("Child class parametresiz constructor calisti"); // 5
	}
	
	
	public Memur(int maas) { // 7
		super(); // 8 >> personel classinda int parametreli cons bulamadigi icin parametresiz consu calistirdi(super constructor call)
				 // Eger super("Enis",6000) seklinde yazarsam > Personel parametreli const calisti yazdirirdi
				 // Eger super("Erdem") yapsaydik personel classinda sadece string parametreli bir const bulamadigi icin CTE verir
		System.out.println("Child class parametreli constructor calisti"); // 9

	}

	

	/* Inheritance'da constructor olusturdugumuzda Javanin otomatik olarak cons'a koydugu
	   super(); keyword onemlidir.
	   
	 * Parent child iliskisi varsa yani inheritance icinde calisiliyorsa super(); keyword'u
	   onemlidir. 
	   
	 * super() keyword constructorun ilk satirina yazilmak zorundadir this() gibi
	 
	 * Super keyword Default const gibidir. Biz gormesek de calisir, ancak yerine
	   baska bir keyword yazarsak etkisiz hale gelir
	  
	 * super constructor call denir.
	 *** Extend varsa yerine bir sey yazmadikca super() calisir.....***
	 
	 * default super varsa  parametresiz constructor olmasi lazim CTE vermemesi icin 
	 */
	
	
	/* Bir de this() const call vardir.
	 * 
	 * super() , parent classdan const cagirabiliyorken 
	 * this() yalnizca icinde bulundugu clasdan const cagirmak icin kullanilir. <Kendi claasinda yoksa parentten ister ? >
	 * 
	 */
	
	
	public static void main(String[] args) { //1
		
		Memur obj1 = new Memur(); // 2
		Memur obj2 = new Memur(2400); // 6
	}

}

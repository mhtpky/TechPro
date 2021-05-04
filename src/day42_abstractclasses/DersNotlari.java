package day42_abstractclasses;

public class DersNotlari {
	// Final static ve private methodlar override edilemez
	// Final class yaptigimizda inherit edilemez
	
	// FINAL > kelime
	// FINALLY > blok> try veya try-catch ile kullanilablr
	// FINALIZE > method > Garbage collector copleri toplamadan once bu methodla isaretler

	// Buyuk bir uygulama yapiliyorsa mutlaka ABSTRACT ve INTERFACE kullanilir
	
	
	/*   // ABSTRACT CLASSES (soyut > melek gibi ismi var cismi soyut )\\
	 
	 * Hayvanlar alemi/ omurgasizlar/kordalilar /omurgalilar / ilkel kordalilar > hepsi abstract olabilir.
	   Abstract olabilir olmak zorunda degildir.
	   omurgalilar altinda baliklar da absract olablr ama hamsi concrete olabr (elle tutulr somut)
	 
	 * Genellikle ortak ozellikleri olan nesneleri ortak bir cati altinda toplamak icin kullanilir 
	 
	 * Kendisinden olusmus bir obje OLAMAZ.Real bir eleman yoktur sadece ortak ozellikleri barindirir.
	 
	 * Tum child class値arda olmasini istedigimiz dinamik ozellikleri (methods)
		abstract class壇a abstract method olarak olustururuz.
	 
	 * Burada ki methodlarin body'si yoktur.
	 
   *** Abstract olmayan ( concrete >> somut ) tum child class値arin hepsi abstract method値ari override
	    etmek zorundadir. Boylece tum child class値ar ayni dinamik ozelliklere (methods) sahip olurlar
	    */
	
	/*
	   Kural 1)
	 * Concrete bir child class, parent段 olan abstract class値ardaki tum abstract
		method値ari implement etmelidir, diger turlu CTE olusur.
	
	   Kural 2)
	 * Abstract method値ari implement etmek icin oncelikle overriding yapilmalidir.

	   Kural 3)
	 * Abstract class, abstract olmayan (concrete) method値ara da sahip olabilir. Cocrete
		method値ar implement edilmek ZORUNDA DEGILDIR. Parent child iliskisi ile
		kullanilabilirler veya istenirse override edilebilirler
	 
	  	Kural 4)
	 * Abstract bir child class, parent段 olan abstract class値ardaki method値ari implement
		etmek ZORUNDA DEGILDIR. Parent child iliskisi ile tum method値ara ulasabilir.

	  	Kural 5)
	 * Abstract class値ar somutlastirilamaz (can not be instantiated) yani abstract class値arda
	  	obje olusturulamaz.

		Kural 6)
	 * Abstract class値ar private veya final olarak tanimlanamaz
	 */

	// Abstract bir method SADECE ABSTRACT BIR CLASS'DA OLUSTURULABILIR
	// Abstract classda hem abstract hem concrete method olabilir
}

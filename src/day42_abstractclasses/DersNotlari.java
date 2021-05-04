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
	 
	 * Tum child class�larda olmasini istedigimiz dinamik ozellikleri (methods)
		abstract class�da abstract method olarak olustururuz.
	 
	 * Burada ki methodlarin body'si yoktur.
	 
   *** Abstract olmayan ( concrete >> somut ) tum child class�larin hepsi abstract method�lari override
	    etmek zorundadir. Boylece tum child class�lar ayni dinamik ozelliklere (methods) sahip olurlar
	    */
	
	/*
	   Kural 1)
	 * Concrete bir child class, parent�i olan abstract class�lardaki tum abstract
		method�lari implement etmelidir, diger turlu CTE olusur.
	
	   Kural 2)
	 * Abstract method�lari implement etmek icin oncelikle overriding yapilmalidir.

	   Kural 3)
	 * Abstract class, abstract olmayan (concrete) method�lara da sahip olabilir. Cocrete
		method�lar implement edilmek ZORUNDA DEGILDIR. Parent child iliskisi ile
		kullanilabilirler veya istenirse override edilebilirler
	 
	  	Kural 4)
	 * Abstract bir child class, parent�i olan abstract class�lardaki method�lari implement
		etmek ZORUNDA DEGILDIR. Parent child iliskisi ile tum method�lara ulasabilir.

	  	Kural 5)
	 * Abstract class�lar somutlastirilamaz (can not be instantiated) yani abstract class�larda
	  	obje olusturulamaz.

		Kural 6)
	 * Abstract class�lar private veya final olarak tanimlanamaz
	 */

	// Abstract bir method SADECE ABSTRACT BIR CLASS'DA OLUSTURULABILIR
	// Abstract classda hem abstract hem concrete method olabilir
}

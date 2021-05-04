package day35_inheritance;

public class _GenelTekrar {

		// INHERITANCE, OOP concept'in onemli bir karakteridir.
		// Child class'in hic bir ekstra islem yapmadan 
		// parent class'larda ki class uyelerine ulasabilmesini saglar

	/*
	 1) Java'da classlar arasinda parent(Aile)-child(cocuk) relationship(iliski) vardir
	 2) Parent class'a 'super class' da denir
	 	Child class'a 'sub class' da denir
	 3) Ortak ozellikler parent class'a, specific ozellikler child class'a yazilir
	 4) Parent Child Relationship "Reusubility(tekrar kullanilabilirlik)", "Meintenance(tamir)"
	 	"less code" " well organization" acilarindan faydalidir
	 5) Child classlar parent'lardaki her variable ve metodlari kullanabilir ama 
	 	parent class child'dakileri kullanamaz
	 6) Java "MULTIPLE INHERITANCE(Cok ebeveynlik)" i DESTEKLEMEZ. Yani Java da 
	 	bir child'in birden fazla parent'i olamaz
	 7) Bir parent ve 1'den fazla child class ile olusturulan parent-child relationshipe
	 	"HIERARCHICAL INHERITANCE" denir
	 8) Child-Parent-Grandparent... seklinde olusturulan cok katli parent-child
	 	relationshipe MULTI-LEVEL INHERITANCE denir.
	 9) Bir parent ve 1 child'den olusan relationchipe "SINGLE INHERITANCE" DENIR
	 */
	
	
	
	
	// Parent class'da ki private class uyeleri inherit edilemez
	// Default olanlar ise sadece ayni package icinden inherit edilebilirler
	// Public ve protected icin sorunsuz calisir
	
	// Inheritance child(sub) class'dan parent(super) class'a dogru olur.
	// Child parent'in herseyini inherit edebilir ama parent child'dan inherit edilemez
	
	// Genel ozellikler parent class'da spesifik ozellikler child class'da olusturulur
	
	// Faydalari
	   // - Reusability
	   // - Kolay maintinance
	   // - Az kodla cok is yapma
	   // - Tekrarlari engelleme

}

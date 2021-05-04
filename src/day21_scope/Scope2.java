package day21_scope;

public class Scope2 {

	public static void main(String[] args) {
		
		// Static variable'lar icin instance' da oldugu gibi obje olusturmaya gerek yoktur
		// Baska bir Class'dan static variable'lara ulasmak istedigimizde
		// Ulasmak istedigimiz Class'in adi.static variable adi yazmamiz yeterlidir
		
		// Java Run Time programdir
		// Scope2 Class'i calistirildiginda Scope1 calismaz
		// Dolayisiyla sadece en basta olusturulan veya atanan degerler gecerli olur
		System.out.println(Scope1.okulId + " " + Scope1.okulAdi + " " + Scope1.acikMi); //1201 Yildiz Koleji false

		
		Scope1.okulAdi = "Mehmet Koleji";
		System.out.println(Scope1.okulAdi); // Mehmet Koleji
		
		Scope1.staticMethod();
		System.out.println(Scope1.okulId); // 1203
		System.out.println(Scope1.okulAdi); // Mehmet Koleji
	}

}

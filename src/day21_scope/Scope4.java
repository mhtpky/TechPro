package day21_scope;

public class Scope4 {

	public static void main(String[] args) {
		
		// LOCAL VARIABLE
		
		int sayi=10;
		// KURAL1 > Bir method icinde olusturulan variable, sadece o method icinde kullanilabilir
		// System.out.println(isim); >> CTE verir
		
		int sayi2; 
		// KURAL2 > bir local variable deger atanmadan da olusturulabilir
		// System.out.println(sayi2);  >> Ancak ilk deger atamasi yapilmayan variable'lar kullanilamaz
		// sayi2++; >> Ilk deger atamadigimiz icin artirma ya da azaltma yapamayiz
		// Java deger atamasi olmadan local variable olusturulmasina izin verir, ilerde deger atanacak diye bekler
	
		sayi2= 15; // olusturulan ayri satirda(11.satir), deger atamasi ayri satirda(16.satirda) yapilabilir
				// tanimlamaya(13.satir) declaration, ilk deger atamaya da(19.satir) initialize denir
		
		// KURAL3 > Birden fazla method'un oldugu Class'larda  her method'da kullanmamiz gereken
		// ortak variable'lar varsa class level'da variable olusturmaliyim.
		// ortak variable class'in yapisina bagli olarak instance veya static olabilir
	} 
	
	public static void staticMethod() {
		
		String isim = "Hasan";
		// System.out.println(sayi); >>Kural1'e main method icinde olusturulan variable'lar da dahildir
	}
	
	public void method() {
		
		boolean isTrue= true;
		// System.out.println(sayi);  >> bu kural static olan veya olmayan tum methodlar icin gecerlidir
	}

}

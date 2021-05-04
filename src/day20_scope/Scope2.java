package day20_scope;

public class Scope2 {

	public static void main(String[] args) {
		// Farkli class'lardan da Scope1 class'ina da object olusturarak ulasabiliriz
		
		Scope1 obj4 = new Scope1();
		System.out.println(obj4.isim);
		System.out.println(obj4.soyisim);
		
		
		obj4.isim = "Omer";
		obj4.soyisim = "Kaya";
		System.out.println(obj4.isim + " " + obj4.soyisim);

	}

}

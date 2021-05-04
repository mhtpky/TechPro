package day34_oop_inheritance;

public class EncapsulationRunner {

	public static void main(String[] args) {

		Encapsulation obj1 = new Encapsulation();
		System.out.println(obj1.getOkulIsmi());
		System.out.println(obj1.getOkulHesapNo());
		//boolean olan variable’larin getter metod isimleri “ is ” ile
		System.out.println(obj1.isOkulAcikMi());

		obj1.setOkulIsmi("Mehmet Koleji");
		System.out.println(obj1.getOkulIsmi());

		Encapsulation obj2 = new Encapsulation();
		System.out.println(obj2.getOkulIsmi());

		/*
		 * Tum variable'lar private ve sadece getter() methodlari olusturdum. 
		 * Bu tarz bir class'da datalar sadece okunabilir ama degistirilemez.
		 * String'lerde degistirilemez yani immutable'dir . 
		 * Bu tarz class'lara immutable class denir,
		 * yani Setter'i OLMAYAN classlara denir.
		 * 
		 * Encapsule edilen bir classda sadece getter kullanilip
		 *  hic setter method kullanilmadiysa o zaman immutable olmus olur
		 */
	}

}

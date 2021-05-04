package day29_passbyvalueimmutable;

import java.util.ArrayList;
import java.util.List;

public class C3_PassByValue03 {

	public static void main(String[] args) {
		/*
		 * Soru3 : Bir list olusturalim. Eleman olarak 10,11,12 ekleyelim. Iki method
		 * olusturup list elemanlarini artirmayi deneyelim - 
		 * - 1. Method’da elemanlari for each loop kullanarak artirin 
		 * - 2. Method’da elemanlari set method’u kullanarak artirin 
		 * - Method’lari arka arkaya cagirip artislarin kalici olup
		 * olmadiklarini kontrol edelim.
		 */

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(12);
		System.out.println(list); // [10, 11, 12]
		
		degistirFor(list);
		System.out.println("1.method call'dan sonra : "+ list); // [10, 11, 12]
		
	   degistirSet(list);
	   System.out.println("Set ile degistirdigimiz liste main method'un icinde : "+ list); // [13, 14, 15]
	   
	   //*************************************************************************//
	   // JAVA PASSBYVALUE KULLANIR. ANCAK LIST'DE KI SET METHODU ISTISNAI OLARAK //
	   // METHOD'UN ICINDE YAPILAN DEGISIKLIKLERI DE KALICI HALE GETIRIR.         //
	   //*************************************************************************//
	   // pbv, bir method cagirildigi zaman methoda, olusan clone value gider
	   // pbr, ise method call yapildiginda methoda, orjinal variable gider
	   // java pbv'dur bunun istisnasi ise list'deki set methodu istisnadir, 
	   // method icinde yapilsa bile degisiklikleri kalici olarak yapar. (edited) 
	}

	
	public static void degistirSet(List<Integer> list) {
		for (int i = 0; i < list.size() ; i++) {
			list.set(i, list.get(i)+3); // i. index de ki sayiyi > 3 ekle
		}
		System.out.println("Set ile degistirdigimiz liste method'un icinde : "+ list); // [13, 14, 15]
	}

	
	public static void degistirFor(List<Integer> list) {
		
		// for each ile listeyi guncellemiyoruz sadece her bir elemani tek tek cagirip 3 fazlasini yazdiracagiz
		for (Integer each : list) { // list'e git her bir integer'i al getir 
			each+=3;
			System.out.print(each+" "); //13 14 15 
		}
		
		System.out.println();
		System.out.println(list); //[10, 11, 12]
		// for each loop ile elemanlari tek tek alip yazdirmak listenin kendisini degistirmez

	}

}

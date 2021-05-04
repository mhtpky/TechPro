package day46_collections;

import java.util.HashSet;
import java.util.Set;

public class C1_Set01 {

	// SET interface'dir. o sebepten constructor olusturamayiz
	// HashSet / LinkedHashSet/ TreeSet >> biri ile constructor olusturulur
	// HashSet null'a izin verir. Her objenin hash kod karsiligi vardir 
	// null'in da bardir. Ikinci bir null'a izin vermez
	
	public static void main(String[] args) {

		Set<String> set1 = new HashSet<>();
		set1.add("F");
		set1.add("B");
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("A");
		set1.add("B");
		set1.add("Y");
		set1.add("D");
		System.out.println(set1); // [A, B, C, D, F, Y]
		
		System.out.println(set1.hashCode()); //425
		set1.add("M");
		set1.add("E");
		System.out.println(set1); // [A, B, C, D, E, F, Y, M]
		// Set'de onemli olan ozellik No-duplication(tekrarsiz) ve 
		// elemanin kumede var olup olmamasidir
		// Siralama set icin onemli degildir
		// Set icin elemanlari girdigimiz sirada verir veya 
		// elemanlari naturel siralama ile verir gibi bir CUMLE KULLANAMAYIZ
		
		System.out.println(set1.hashCode()); // 571
		// Collections'da hashCode() methodu o collections icinde ki tum
		// elemanlarin hash code'larinin toplamini verir.

	}

}

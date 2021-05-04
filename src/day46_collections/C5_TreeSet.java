package day46_collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C5_TreeSet {

	public static void main(String[] args) {
		// TreeSet tekrarli eleman kabul etmez cunku Set'tir
		// Setlerin en yavasidir bu yuzden az kullanilir
		// HashSet de TreeSet'e donusturulebilir,
		// LinkedHashSet de TreeSet'e donusturulebilir
		// Ekleme sirasina gore degil Naturel Order'a gore siralama yapar
		// Tree > dogal sirali Set>no-doublication
		
		Set<String> set1 = new TreeSet<>();
		
		System.out.println(System.currentTimeMillis());
		for (int i = 0; i < 10000 ; i++) {
			set1.add("" + i);
		}
		System.out.println(System.currentTimeMillis());

		System.out.println("=========================");
		
		Set <String> set2 = new HashSet<>();
		System.out.println(System.currentTimeMillis());
		for (int i = 0; i < 10000 ; i++) {
			set2.add("" + i);
		}
		//TreeSet<String> set3 = new TreeSet <>(set2); // set2 yi siralamak icin TreeSet set3 olusturduk
		System.out.println(System.currentTimeMillis());

	}

}

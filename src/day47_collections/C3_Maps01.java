package day47_collections;

import java.util.HashMap;

public class C3_Maps01 {

	public static void main(String[] args) {
		
		/*
		1) HashMap synchronized degildir. Thread-safe degildir. Hizli olmasi senkronize olamamasini saglar
		2) HashTable synchronized’dir. Thread-safe’dir ve thread’ler tarafindan ortak kullanilabilir
		3) TreeMap synchronized degildir. Thread-safe degildir
		
		Maps key – value pairs kullanir. ( anahtar –deger(ler) ). 
		Key’ler unique(benzersiz) olmalidir.(TC kimlik no gibi)
		
		 */
		
		HashMap <Integer, String> objeMap = new HashMap<>();
		objeMap.put(101 , "Ali, Can, Java" );
		objeMap.put(102 , "Veli, Yan, Java" );
		objeMap.put(103 , "Ali, Yan, C#" );
		
		System.out.println(objeMap); // {101=Ali, Can, Java, 102=Veli, Yan, Java, 103=Ali, Yan, C#}
		// = gorursek bilmeliyiz ki map kullanilmis
		
		
		
	}

}

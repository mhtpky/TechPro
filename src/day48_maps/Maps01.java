package day48_maps;

import java.util.HashMap;
import java.util.Map;

public class Maps01 {
	// LinkedList ,Queue kpseli parantez icinde yazdirirken
	// Map kivircik parantez icinde yazdirir

	public static void main(String[] args) {

		Map<Integer, String> map1 = new HashMap<>();
		HashMap<Integer, String> map2 = new HashMap<>();

		map1.put(101, "Ali, Can, Java");
		map1.put(102, "Veli, Yan, Java");
		map1.put(103, "Ali, Yan, C#");
		System.out.println(map1); // {101=Ali, Can, Java, 102=Veli, Yan, Java, 103=Ali, Yan, C#}

		map2.put(101, "Vehri, Bas, Java");
		map2.put(102, "Esra, Coban, SQL");
		map2.put(104, "Omer, Ari, SQL");
		System.out.println(map2); // {101=Vehri, Bas, Java, 102=Esra, Coban, SQL, 104=Omer, Ari, SQL}
		
		
		map1.putAll(map2); // map1'e map2'yi ekle
		System.out.println(map1); // {101=Vehri, Bas, Java, 102=Esra, Coban, SQL, 103=Ali, Yan, C#, 104=Omer, Ari, SQL}
		// keyler ayni oldugu icin guncelleme(updating) yapti ve 101in entry'si olarak sonradan eklemek istedigimizi ekledi
		
		// Map'e yeni bir  Entry eklemek istedigimizde, Java key'e bakar. Cunku key UNIQE'dir
		// Ilk map'de eklemek istedigimiz key varsa o zaman bu key'e ait value eklenen yeni value ile update olur
		// Eklemek istedigimiz key yok ise sona ekleme yapar
		
		map1.putIfAbsent(102, "Ahmet, Demir, Java"); //  Yok ise ekle. Eski map'imde bu key varsa update etme.
		System.out.println(map1); // {101=Vehri, Bas, Java, 102=Esra, Coban, SQL, 103=Ali, Yan, C#, 104=Omer, Ari, SQL}
		
		map1.putIfAbsent(100, "Ahmet, Demir, Java"); // key=100 olmadigi icin ekleme yapar
		System.out.println(map1); // {100=Ahmet, Demir, Java, 101=Vehri, Bas, Java, 102=Esra, Coban, SQL, 103=Ali, Yan, C#, 104=Omer, Ari, SQL}

		System.out.println(map1.containsKey(101)); // true
		System.out.println(map1.containsValue("Java")); // false
		System.out.println(map1.containsValue("Vehri, Bas, Java")); // true
		// Aranan degere tam olarak esit olan bir valur varsa true dondurur
		// Value icinde gecen kelime veya String'leri bulmaz
		

	
		
		
	}
}

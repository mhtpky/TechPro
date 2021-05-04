package day44_Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator01 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		System.out.println(list); // [A, B, C, D]
		
		// Her elemana B harfini ekleyelim
		
		for (String each : list) {
			each +="B";
			System.out.print(each + " "); // AB BB CB DB 
		}
		System.out.println();
		System.out.println(list); // [A, B, C, D]
		
		// Collections'da her yapi index'i desteklemez.
		// Ornegin Set'de index olmaz.
		
		// Index olmayinca mecburen tum elemanlara ulasmak icin 
		// For-each Loop kullanilir
		// For-each ile de update veya delete yapamayiz
		// Islem loop'un icinde kalir.
		
		// Bunun icin Java ITERATOR INTERFACE'ini olusturmustur
		
		Iterator it1= list.iterator(); // Hangi obje uzerinde iterate(yineleme) edeceksek iterator'i onun uzerinde olusturuyoruz
	
		// Iterator 4 tane method'a sahiptir. 
        // 1) next() bir sonrakine gecer,
        // 2) hasNext() booleandir bir sonraki var mi diye sorar,
        // 3) remove() siler
        // 4) forEachRemaining()
		
		// Listede ki tum elemanlari iterator kullanarak silelim 
		// Iterator index yapisini desteklemediginden for loop kullanamayiz
		// Iterator'da while loop kullanilir
		
		while(it1.hasNext()) {// it1 icin daha eleman varsa calismya devam et
			
			it1.next();
			it1.remove();
		}
		System.out.println(list); // []
		System.out.println(list.size()); // 0
		
		
	}

}

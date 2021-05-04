package day44_Iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator04 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// Iterator'u kullanarak listenin elemanlarini 
		// sondan basa dogru yazdirin 
		
		List<Integer> sayiListesi = new ArrayList<>();
		sayiListesi.add(2);
		sayiListesi.add(13);
		sayiListesi.add(56);
		sayiListesi.add(23);
		sayiListesi.add(45);
		sayiListesi.add(14);
		sayiListesi.add(40);
		
		System.out.println(sayiListesi); // [2, 13, 56, 23, 45, 14, 40]
		
		ListIterator li1 = sayiListesi.listIterator();
		
		while(li1.hasNext()) { // Imleci sona goturmek icin bu donguyu olusturduk
			li1.next();
		}
		
		/*while(li1.hasPrevious()) {
			System.out.print(li1.previous()+" "); // 40 14 45 23 56 13 2 
		}*/
		while(li1.hasPrevious()) {
			int temp = (int) li1.previous();
			System.out.print(temp + " ");
			
		}
		
		System.out.println();
		System.out.println(sayiListesi); //[2, 13, 56, 23, 45, 14, 40]
	
	}

}

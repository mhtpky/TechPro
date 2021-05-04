package day47_collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C1_Queue01 {
	// Queue bir interface'dir dolayisiyla obje uretemeyiz
	// Child classi olan PriorityQueue ve LinkedList Constructor
	// Secimine gore olusturdugumuz Queue'nun davranislari degisir.
	
	
	
	// Queue da ilk elemani silmeden bize donduren method var midir?
	// Vardir ama su an ismini hatirlayamadim denebilr interwiev 'de
	
	public static void main(String[] args) {

		Queue<String> k1 = new PriorityQueue<>(); // Bizim istedigimz sekilde bir siralama olsun istiyorsak PriorityQueue cons ile yapariz
		k1.add("M");
		k1.add("E");
		k1.add("H");
		k1.add("T");
		System.out.println(k1); // [E, M, H, T]
		// Queue (kuyruk) yapisi geregi insertion order'a gore siralama yapmasi beklenir
		// Ancak constructor olarak PriorityQueue sectigimiz icin Java tarafindan belirlenen
		// Priority'e gore siralama yapar

		// Biz de istersek priority kuralini tanimlayabiliriz. O zaman bizim istedigimize gore siralar
		
		
		Queue<String> k2 = new LinkedList<>(); // Ekleme siramiza gore olustursun istersek Queue objesini LinkedList cons ile olustururuz
		k2.add("M");
		k2.add("E");
		k2.add("H");
		k2.add("T");
		System.out.println(k2); // [M, E, H, T]
		// Ayni elemanlarla fakat LinkedList constructor'' kullanarak olusturdugumuz 
		// Queue ise beklenenlere uygun olarak ekleme sirasina gore yazdirir
		
		// Queue'nun yapisi geregi FIFO(First in First out) kurali gecerlidir
		
		
		k2.offer("A"); // add gibi calisir hep sona ekler( LinkedListe gore dusunursek )
		System.out.println(k2); // [M, E, H, T, A]
		
		System.out.println(k2.peek()); // M > Silmeden ilk elemani bize dondurur
		
		k2.remove();
		System.out.println(k2); //[E, H, T, A] > ilk elemani siler
		
		k2.remove("A");
		System.out.println(k2); // [E, H, T]
		System.out.println(k2.remove("E")); // true
		
		System.out.println(k2); // [H, T]
		
		
		k2.poll();
		System.out.println(k2); // [T] > Ilk  elemani siler
		
		
		System.out.println(k2.element()); // T silmeden ilk elemani bize getirir
		
		k2.remove(); // Bu satirda son eleman olan T  de silindi 
		// Artik Queue bos
		System.out.println(k2.isEmpty()); // true
		
		k2.poll(); // bos bir queue'da kullanilirsa exception vermez, null dondurur
		
		// k2.remove(); // NoSuchElementException 
		// Bos bir Queue'dan remove ile eleman silmek istersek Exception firlatir
		
		
		
	}

}

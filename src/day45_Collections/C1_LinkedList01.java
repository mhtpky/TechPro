package day45_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C1_LinkedList01 {

	public static void main(String[] args) {
		// linked bagli demektir
		// linked list'de tum elemanlar tren gibi birbirine baglidir
		// Her linkedList head ile baslar.Head'de data yoktur ve sadece adres icerir.
		// Head sonrasinda birbirine bagli elemanlar vardir.Eleman(node) adres(data) ve value(data) icerir.
		// (adres+value==>node)
		// Tum elemanlar pointer ve adressler kullanilarak birbirine baglidir
		// Arka planda Java adresler uzerinden islem yaparken bize value yu dondurur
		// Array den daha dinamiktirler. Insert(ekle) ve delete(sil) islemlerinde basarilidirlar
		
		// Collections'da obje olustururken 
		// olusturmak istedigimiz collection'un class mi yoksa interfacce'mi olduguna bakmaliyiz
		// Eger olusturmak istedigimiz collection Interface ise data turu olarak o Interface'i,
		// constructor olarak ise uygun bir class secmeliyiz
		// Simdiye kadar List(Imterface) olusturuken constructor olarak ArrayList() seciyorduk
		
		// Son eleman tail olarak adlandirilir ve pointer'i null'i gosterir
		// Datasi olmayan eleman yoktur diyemeyiz. Head'in datasi yoktur
		// insertion order(ekleme sirasi) a gore elemanlari siralar
		// Ara indexlere eleman eklenebilir .add(1,"C") ile..
		
		
		List<String> list = new ArrayList<>();
		list.add("X");
		list.add("Y"); // [X, Y]
		
		LinkedList <String> ll1 = new LinkedList<>(); // LinkedList classdir o sebepten obje olusturabildik 
		
		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1); //[A, B]
		
		
		ll1.add(1, "C");
		System.out.println(ll1); //[A, C, B]
		
		ll1.addAll(list);
		System.out.println(ll1); // [A, C, B, X, Y]
		
		ll1.addAll(2,list);
		System.out.println(ll1); // [A, C, X, Y, B, X, Y]
		
		ll1.addLast("K");
		System.out.println(ll1);// [A, C, X, Y, B, X, Y, K]
		
		// LinkList List ve Queue interface'lerine implement ile child oldugundan 
		// her iki interface'de k itum methodlari override etmek zorundadir.
		// Islev olarak ayni isi yapan addLast() queue'dan ve add() ise List'den inherit edilmistir
		
		// Ben bir linkedList olusturmak istiyorum ama sadece List ozelliklerini tasisin
		 List <String> linkList = new LinkedList<>();
		 linkList.add("Sadece listten gelen ozellikler var");
		 
		 // Ben bir linkedList olusturmak istiyorum ama sadece Queue ozelliklerini tasisin
		 Queue <String> queueList = new LinkedList<>();
		 queueList.add("Sadece queue'den gelen ozellikler var");

	}

}

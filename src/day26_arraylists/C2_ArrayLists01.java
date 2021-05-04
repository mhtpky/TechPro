package day26_arraylists;

import java.util.ArrayList;
import java.util.List;

public class C2_ArrayLists01 {

	public static void main(String[] args) {
		// ArrayList >> lenght'i esnek olan bir Arraydir.
		// Bir Array'in uzunlugunu degistirmek istedigimizde,
		// Array'den bir eleman silmek istedigimizde,
		// yeni bir Array olusturmaya gerek olmadan ArrayList ile yapabiliriz
		
		// ArrayList bir objedir. Dolayisiyla yeni bir tane olusturmak icin 
		// new keyword kullanmaliyiz
		
		// 1. YOL
		ArrayList<String> list = new ArrayList<String>(); //constructor oldugu icin normal parantez koymak gerekir
		
		// 2.YOL
		ArrayList<String> list2 = new ArrayList<> ();
		
		// 3.YOL >> En cok bu kullanilir
		List<String> list3 = new ArrayList<>();

		// NOT : Eger constructor olarak List<>() kullanilirsa CTE verir
		// List<>() constructor olarak kullanilamaz
		// List<String> list4 = new List<String>(); >> CTE

		// Olusturdugumuz class isimleri Java'da kullanilan obje isimleri ile ayni OLMAMALIDIR
		
		// List'e eleman ekleme
		// List olustururken otomatik olarak eleman ekleme ozelligi yoktur
		// Elemanlarin tek tek eklenmesi gerekir.
		
		list3.add("Ali");
		list3.add("Veli");
		list3.add("Ayse");
		
		//List nasil yazdirilir
		System.out.println(list3); //[Ali. Veli, Ayse]

		list3.add(1,"Can"); // 1. indekse istenen degeri ekler
		System.out.println(list3); //[Ali, Can. Veli, Ayse]
	
		list3.add(1,"Fatma");
		System.out.println(list3); //[Ali, Fatma, Can. Veli, Ayse]

		// Soru 6) Verilen bir Array’den istenen degere esit olan
		// elamanlari kaldirip, kalanlari yeni bir
		// Array olarak yazdiran bir method yaziniz
		// ORN>> int arr[] = {2,3,5,3,6,4,3,6,7}; >> {2,5,6,4,6,7} yapiniz

		int arr[] = {2,3,5,3,6,4,3,6,7};
		int sayi = 5;
		
		List<Integer> istenenList = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
            if (arr[i] !=sayi) {
                istenenList.add(arr[i]);
            }
        }
        
        System.out.println(istenenList);

	}

}

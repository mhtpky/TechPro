package day31_varargsstringbuilder;

import java.util.ArrayList;
import java.util.List;

public class C5_Varargs04 {

	public static void main(String[] args) {
	 List<Integer> list = new ArrayList<>();
	 list.add(10);
	 list.add(10);	

	 // toplam(list); varags esnek oldugu icin list'e benzese de list degildir
	 
	 int arr[] = {15,20,25};
	 toplam(arr); // varargs array olarak calisir ve argument olarak array yollanabilir
	 
	 // Kullanicidan deger akarak varargs calistirmak istiyorsak 
	 // girilen degerleri bir array'e kaydetmeliyiz
	 // Bunun icin kullanicidan aldigimiz degerleri 
	 // esnek oldugu icin bir list'e koyariz
	 // sonra list'i arraye ceviririz
	
	}

	public static void toplam(int... var) { 
		
		int toplam = 0;
		for (int each : var) { // var'a git her bir inti bana getir
			toplam += each;
		}
		System.out.println(toplam);

	}

}

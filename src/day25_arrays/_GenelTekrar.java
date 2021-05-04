package day25_arrays;

import java.util.Arrays;

public class _GenelTekrar {
	public static void main(String[] args) {
		
	
	// Array(dizi) : Java'da birden fazla variable store etmek icin kullanilan objelerden biridir
	// Array olusturulurken 2 seyi declare etmeliyiz
		// 1) Data Type(Bir array icinde sadece ayni data tipinden elemanlar olabilir)
		// 2) Uzunluk(Uzunluk array'in icerisine konulacak max eleman sayisini belirtir ve bundan fazlasini koymak istersek RTE verir)
	
	int arr[] = {10,23,54}; // length=3
	String isimler[] = new String[4]; // length=4 olan bos bir array olusturur
	
	// Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir(depolanabilir)
	// Mesela isimler array'inin icinde isim degerleri degil isimlerin referanslari olur
	
	// Array'in elemanlarina ulasma ve update etme
	System.out.println(isimler[1]);
	isimler[2] = "Boss";
	isimler[0] = "Elveda";
	
	// Array'in tum elemanlarini yazdiralim
	System.out.println(isimler); // referansi yazdirir
	System.out.println(Arrays.toString(isimler)); //[Elveda, null, Boss, null]
	System.out.println(Arrays.toString(arr)); //[10, 23, 54]
	
	// Method kullanmadan tum elemanlari yazdiralim
	// Bunun icin loop kullanmamiz lazim
	for(int i=0 ; i< isimler.length ; i++) {
		System.out.print(isimler[i]+" "); //Elveda null Boss null 
	}System.out.println();
	
	//Array'in elemanlarini nasil siralayabiliriz
	isimler[1] = "Oguzhan";
	isimler[3] = "Bilal";
	Arrays.sort(isimler);
	System.out.println(Arrays.toString(isimler)); //[Bilal, Boss, Elveda, Oguzhan]
	
	}	
}

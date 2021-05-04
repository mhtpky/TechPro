package day24_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {

		int sayi = 10;
		int sayi2 = 20;
		int sayi3 = 30;
		String isim = "Ali";
		
		
	// Java'da birden fazla elemani koyabileceginiz(store) objeler vardir
	// Bugun bunlardan ilkini ogrenecegiz
	// ARRAYS > Birden fazla variable depolamak icin kullanilan objectlerdir(non=-primitive data tipidir)
	// 1) Array'lerde sadece primitive datalar veya non-primitive datalara ait referanslar depolanabilir
	// 2) Arrays icindeki tum variable'lar ayni data tipinde olmalidir
	// 3) Bir array olusturmadan once o Array'in icine kac variable koyacagimiza karar vermeliyiz
	// 4) Bir Array icine koyabilecegimiz variable sayisina o Array'in "length"i denir.
	// O Array icine length'den fazla variable koyamayiz
		
		
		int arr[] = {10,20,30}; // int[] arr > seklinde de kullanilabilir
								// Bu ornekte Arrays elemanlarini direkt yazdigmz icin uzunlk belirtmeye ihtiyac kalmadi
								// Bu kullanimda max eleman sayisi(length)yazdigimiz eleman sayisidir.
		
		System.out.println(arr); //Array bir objedir/
								// Eger direkt olarak array'i yazdirmak isterseniz Java referansi yazdirir
		System.out.println(Arrays.toString(arr)); // [10, 20, 30]
		
		String takim[] = new String[3]; // Java String data turunde 3 elemanli bir Array olusturdu
										// [null, null, null]
		System.out.println(Arrays.toString(takim));
		
		takim[0] ="Omer";
		System.out.println(Arrays.toString(takim)); // [Omer, Null, Null]
		takim[2] = "Erdem";
		takim[1] = "Enis";
		System.out.println(Arrays.toString(takim)); // [Omer, Enis, Erdem]

		//takim[3] = "Mehmet";// Java Run Time programdir, dolayisiyla array program calistirilinca
							// olusturulur. 42.satirda syntax(yazim sekli) olarak hata olmadigindan 
							// CTE olmaz. length = 3 olabilir dedik bu da 2. indexe denk gelir. 
							// Prog calistiginda 3 index olmadigi icin RTE verir
		
		// Array'deki bir elemani update etme(guncelleme)
		takim[1] = "Mesut";
		System.out.println(Arrays.toString(takim)); // [Omer, Mesut, Erdem]
		
		
		// Bir Array'in uzunlugunu nasil bulabiliriz?
		System.out.println(takim.length); // 3
										  // String'deki length() iken Array'de () yoktur
		
		// Array'deki son elemani Mehmet yapin
		takim[takim.length-1] = "Mehmet";
		System.out.println(Arrays.toString(takim));//[Omer, Mesut, Mehmet]

		// Array'in eleman sayisi tek ise ortada ki elemani degistirebiliriz.Halit yapalim
		if(takim.length%2==1) {
			int ortaIndex=(takim.length-1)/2;
			takim[ortaIndex]="Halit";
		}
		System.out.println(Arrays.toString(takim));
	}

}

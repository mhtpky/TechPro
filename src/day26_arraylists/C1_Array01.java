package day26_arraylists;

import java.util.Arrays;

public class C1_Array01 {
	/*
	 * ArrayList ve array Arasında Seçim: 
	 * Programcı, ne zaman ArrayList ve ne zaman array kullanması gerektiği konusunda 
	 * ikileme düşebilir. Eğer, depoya konulacak öğe sayısı belirli ve o sayı sık sık 
	 * değişmeyecekse array seçimi uygun olur. Ama öğe sayısı baştan bilinemiyor ya da 
	 * o sayı sık sık değişiyorsa ArrayList doğru bir seçimdir. Tabii, buna ek olarak 
	 * şunu söylemeliyiz: ArrayList nesnelerin depolanması içindir. İlkel veri tipleri 
	 * depolamak için array seçilmesi uygun olur. Bütün bunların ötesinde ArrayList 
	 * sınıfı List arayüzünün metotlarını kullanma yeteneğine sahiptir; dolayısıyla 
	 * array yapısına oranla programcıya daha çok kolaylık sağlar.
	 */

	public static void main(String[] args) {
		// Soru 6) Verilen bir Array’den istenen degere esit olan
		// elamanlari kaldirip, kalanlari yeni bir
		// Array olarak yazdiran bir method yaziniz
		// ORN>> int arr[] = {2,3,5,3,6,4,3,6,7}; >> {2,5,6,4,6,7} yapiniz

		int arr[] = { 2, 3, 5, 3, 6, 4, 3, 6, 7 };
		int sayi = 3;

		// 1.ADIM >> arr icinde kaldirmam istenen sayi kac tane var, bulmam gerekiyor
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == sayi) {
				count++;
			}
		}

		// 2.ADIM >> Array'in uzunlugunu degistiremeyecegimiz icin yeni array
		// olusturalim
		int arr2[] = new int[arr.length - count];

		// 3.ADIM >> arr Array'inden elemanlari tek tek alip
		// istenen sayiya esit degilse arr2'ye ekleyecegim
		int temp = 0; // bununla yeni array'in indekslerini komtrol edecegiz
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != sayi) {
				arr2[temp] = arr[i];
				temp++;
			}
		}
		System.out.println(Arrays.toString(arr2));

	}

}

package day26_arraylists;

import java.util.Arrays;

public class C1_Array01 {
	/*
	 * ArrayList ve array Aras�nda Se�im: 
	 * Programc�, ne zaman ArrayList ve ne zaman array kullanmas� gerekti�i konusunda 
	 * ikileme d��ebilir. E�er, depoya konulacak ��e say�s� belirli ve o say� s�k s�k 
	 * de�i�meyecekse array se�imi uygun olur. Ama ��e say�s� ba�tan bilinemiyor ya da 
	 * o say� s�k s�k de�i�iyorsa ArrayList do�ru bir se�imdir. Tabii, buna ek olarak 
	 * �unu s�ylemeliyiz: ArrayList nesnelerin depolanmas� i�indir. �lkel veri tipleri 
	 * depolamak i�in array se�ilmesi uygun olur. B�t�n bunlar�n �tesinde ArrayList 
	 * s�n�f� List aray�z�n�n metotlar�n� kullanma yetene�ine sahiptir; dolay�s�yla 
	 * array yap�s�na oranla programc�ya daha �ok kolayl�k sa�lar.
	 */

	public static void main(String[] args) {
		// Soru 6) Verilen bir Array�den istenen degere esit olan
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

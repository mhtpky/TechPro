package day25_arrays;

import java.util.Arrays;


public class Arrays01 {

	public static void main(String[] args) {
		// Verilen bir array'de bir elemanin var olup olmadigini nasil kontrol ederiz?
		
		int arr[] = {10,25,3,16,75};
		
		int sayi = 16;
		
		boolean flag = false;
		
		for(int i=0; i< arr.length; i++) {
			if(arr[i]== sayi) {
				flag=true;
			}
		}
		if(flag) {
			System.out.println("array sorulan elemani iceriyor");
		}else {
			System.out.println("array sorulan elemani icermiyor");
		}
		
		// Arrays classindan method kullanarak yapalim
		// Ilk once siralama yapmaliyiz
		
		Arrays.sort(arr); // Siralamayi yaptik [3, 10, 16, 25, 75]
		System.out.println(Arrays.binarySearch(arr, sayi)); // sonuc olarak aranan sayinin indexini doner
		System.out.println(Arrays.binarySearch(arr, 10)); // 1
		System.out.println(Arrays.binarySearch(arr, 28)); //-5 > - olmasi sayinin olmadigini,5 sayisi da eger sayi olsaydi 5.sirada olurdu demektir 
		System.out.println(Arrays.binarySearch(arr, 5)); //-2 
		System.out.println();
		//binary search sonuc olarak aradigimiz eleman varsa indeksini verir
		// aradigimiz eleman yoksa - isareti ve kacinci eleman olacakti onu verir
		
		int arr2[] = {12,15,25,14,3,12,65};
		
		Arrays.sort(arr2); // [3,12,12,14,15,25,35]
		System.out.println(Arrays.binarySearch(arr2, 14)); //3
		System.out.println(Arrays.binarySearch(arr2, 20)); //-6
		System.out.println(Arrays.binarySearch(arr2, 12)); //1
		System.out.println(Arrays.binarySearch(arr2, 2)); //-1
		
		//Array nasil string'e cevrilir
		
		String arrayString =Arrays.toString(arr2);
		System.out.println(arrayString); //[3, 12, 12, 14, 15, 25, 65]
		System.out.println(arrayString.substring(5));// 2, 12, 14, 15, 25, 65] > basta ki [ dahil tum array'i stringe cevirir
		
	}

}

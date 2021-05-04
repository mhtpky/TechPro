package day24_arrays;

import java.util.Arrays;

public class Arrays05 {

	public static void main(String[] args) {
		// Karisik sirali verilen bir array'i 
		// kucukten buyuge sirali olarak yazdiriniz
		
		int arr[] = {25,17,6,78,45,69,1};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr)); //[1, 6, 17, 25, 45, 69, 78]
		
		
		
		// Ayni array'i buyukten kucuge nasil yazdirabiliriz ?
		for(int i =arr.length-1 ; i>=0;i--) {
			System.out.print(arr[i]+ " "); // 78 69 45 25 17 6 1 
		}
		System.out.println();
		
		
		
		// Ayni array'i buyukten kucuge nasil siralayabiliriz ?
		int arrTers[] = new int[arr.length]; // ilk array'in uzunluguna esit yeni bir array olusturdum
		
		for(int i = 0; i< arrTers.length; i++) {
			arrTers[i] = arr[arr.length-1-i];
		}
		
		System.out.println(Arrays.toString(arrTers)); // [78, 69, 45, 25, 17, 6, 1]

	}

}

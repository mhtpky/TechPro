package day25_arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// Iki array'in esit oldugunu kontrol etme
		
		int arr1[]= {10,25,5,20};
		int arr2[]= {25,10,20,5};
		
		
		System.out.println(Arrays.equals(arr1, arr2)); // false
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(Arrays.equals(arr1, arr2)); // true
		
		// Iki array'in birbirine esit olmasi icin uzunluklari, icinde ki tum elemanlar,
		// ve esit elemanlarin indexleri esit olmalidir

		
		

	}

}

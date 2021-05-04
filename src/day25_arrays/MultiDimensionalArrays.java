package day25_arrays;

import java.util.Arrays;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		/* 1) Ic ice array olusturdugumuzda disarida ki ana array'a OUTER ARRAY
		 *    icerde ki kucuk array'lere ise INNER ARRAY denir
		 * 
		 * 2) Icerde ki array'lerin boyutlari birbirinden farkli ise 
		 *    Array'e ancak tum elemanlari yazarak declare edebiliriz
		 *    
		 * 3) Multi dimensional array'de bir elemanin indeksi icin en distaki array haric,
		 *    elemana kadar ic ice olan tum arraylerin indekslerini yazmak gerekir
		 */
		

		int arr[][] = {{1,3,5}, {3,5}, {5,9,11,3}}; //2 katli bir arraydir
		
		// 11'i indeks ile ifade etmek istersek >> arr[[2][2]]
		
		// eger Array'i uzunlukla declare etmek istersek inner array uzunluklari esit olmali
		
		int arr2[][] = new int[3][2];
		// [3] > ilk yazilan sayi, outer array icinde kac tane inner array oldugunu ifade eder
		// [2] > her bir inner array'in uzunlugu
		
		System.out.println(Arrays.toString(arr2));
		
		// Multi dimensional array'leri yazdirmak icin toString methodu kullanilamaz
		// Cunku toString methodu outer arrayi stringe cevirir
		// Outer arrayin icinde inner arrayler oldugundan toString methodunda 
		// inner arraylerin referans degerleri yazdirilir
		System.out.println(Arrays.deepToString(arr2)); 
		
		
		
	}

}

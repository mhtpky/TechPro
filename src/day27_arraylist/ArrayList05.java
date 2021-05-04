package day27_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayList05 {

	public static void main(String[] args) {
		// Verilen bir Array'i list'e nasil cevirebiliriz

		String arr[] = { "Ali", "Veli" };
		List<String> listArr = Arrays.asList(arr);
		System.out.println(listArr); // [Ali, Veli]

		
		Integer arr1[] = { 1, 2, 3 };
		List <Integer> list2 = Arrays.asList(arr1);
		System.out.println(list2); // [1, 2, 3]
		
		// Bazen cok fazla elemani olan bir liste olusturmamiz gerekir.
		// Bu durumda liste elemanlarini tek tek eklemek yerine 
		// Elemanlari bir array'a ekler sonra da Array'i list'e cevirebiliriz
		// Ornek >> Bir web sitesinde ki tum urunleri bir listeye eklemek istedigimizde
		
		// Ancak bu methodla Array'dan cevirdigimiz list esnek olmaz
		// (array'in ozelliklerini tasir) >> mesela add(), remove(),clear() gibi uzunlugu etkileyen methodlar kullanilamaz 
		// Java bu degisimde ki Array ve List'i senkronize eder, 
		// Birinde yaptigimiz degisiklik otomatik olarak digerini de update eder
		
		
		// arr1 array ve list2 listesi senkron calisir, birinde yaptigimiz degisiklik digerine de islenir
		arr1[1] = 5;
		System.out.println(Arrays.toString(arr1)); // [1, 5, 3]
		System.out.println("list2 : " + list2);// [1, 5, 3]
		
		list2.set(2, 13);
		System.out.println("list2 : " + list2);// [1, 5, 13]
		System.out.println("Array : " + Arrays.toString(arr1)); // [1, 5, 13]

	}

}

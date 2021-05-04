
package day46_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C2_HashSet01 {

	public static void main(String[] args) {
		// Kumeye benzetebiliriz. Siralama ile alakali bir sey diyemeyiz
		// Verilen bir Array'de ki tekrarli elemanlari silip 
		// uniqu elemanlrdan olusan bir Array'e ceviren
		// bir method yaziniz

		// set'de index olmadigi icin for loop kullanilmaz
		// TreeSet'e cevirilebilir
		
		int arr [] = {2,3,4,3,5,3,6,4,7,4,8,5};
	
		int tekrarsizArray[] = tekrarlariSil(arr);
		
		
		System.out.println("Main method icinde Array olarak : "+Arrays.toString(tekrarsizArray));
	}
	public static int[] tekrarlariSil(int arr[]) {
		
		Set <Integer> set1 = new HashSet<>(); // set olusturduk
		
		for (Integer each : arr) { // arrayde ki her bir elemani set'e ekledik ve tekrarlardan kurtulduk
			set1.add(each);
		}
		
		System.out.println("Set olarak method icinde " +set1);
		
		int tekrarsizArray[] = new int[set1.size()]; // set'in size'ini alip bu buyuklukte bir Array olusturduk
		
		int index =0; /// array indexe ihtiyac duydugu icin local variable olusturduk
		for (int each : set1) { // set'de ki elemanlari array'e ekledik
			tekrarsizArray[index]=each;
			index++;
		}
		return tekrarsizArray;
	}

}

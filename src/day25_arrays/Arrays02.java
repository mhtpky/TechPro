package day25_arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		// Verilen bir String'i array'E nasil ceviririz
		// Verilen bir cumlede kac kelime oldugunu bulunuz
		// Verilen cumlede her kelimenin ilk harfini buyuk yapiniz
		
		String str = "Herkes Java'yi tanisa severdi";
				// Bu stringi kelimelere ayiralim
				// Split methodu
		String arr[] = str.split(" ");
		System.out.println(Arrays.toString(arr));//[Herkes, Java'yi, tanisa, severdi]
		
		String arr2[]=str.split("Java");
		System.out.println(Arrays.toString(arr2)); //[Herkes , 'yi tanisa severdi]
		
		String arr3[]=str.split("a");
		System.out.println(Arrays.toString(arr3)); //[Herkes J, v, 'yi t, nis,  severdi]

		String arr4[]=str.split("");
		System.out.println(Arrays.toString(arr4)); //[H, e, r, k, e, s,  , J, a, v, a, ', y, i,  , t, a, n, i, s, a,  , s, e, v, e, r, d, i]

		
		
		
	}

}

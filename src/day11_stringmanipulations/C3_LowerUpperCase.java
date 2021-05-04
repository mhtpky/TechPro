package day11_stringmanipulations;

import java.util.Locale;

public class C3_LowerUpperCase {

	public static void main(String[] args) {
		// 	str.toLowerCase() verilen String'in tamamini kucuk harfe cevirir
		// 	str.toUpperCase() verilen String'in tamamini buyuk harfe cevirir

		String str = "Techproeducation";
		System.out.println(str.toLowerCase()); //techproeducation
		System.out.println(str.toUpperCase()); //TECHPROEDUCATION
		
	    str = str.toUpperCase(); // Bu satirdan sonra kalici olarak 
								 // str buyuk harflerden olusan bir String oldu
		
		System.out.println(str); //TECHPROEDUCATION
		
		System.out.println(str.toLowerCase(Locale.forLanguageTag("tr"))); //techproeducatýon
	}

}

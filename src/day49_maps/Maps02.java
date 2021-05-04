package day49_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Maps02 {

	public static void main(String[] args) {
		// Verilen bir String’deki harfleri ve harflerin 
		// kacar kez kullanildigini return
		// eden bir method yaziniz
		// OR: input : Helloooo output : H=1, E=1, L=2, O=3
	
		// 1) Methoda ne gonderecegim > String
		// 2) Method ne return edecek > map donecek (key: String, value:Integer)
	
		String input = "Hellooo";
		
		Map<String,Integer> methoddanGelen = harfSayisiBul(input);
		System.out.println(methoddanGelen);
		
		// System.out.println(harfSayisiBul(input)); // 20+21 satirlar bu islemi yapar
		// buyuk bir application yapiyorsak 20+21 satirda ki gibi yapmam gerekir
	
	}

	public static Map<String, Integer> harfSayisiBul(String input) {

		String harfler[] = input.split(""); // Stringimi arraye cevirdim 
		System.out.println(Arrays.toString(harfler)); // [H, e, l, l, o, o, o]
		
		Map<String,Integer> harfKullanimSayisi = new HashMap<>(); // bos bir map olusturdum
		
		for (String each : harfler) { 
			
			if(!harfKullanimSayisi.containsKey(each)) {
				harfKullanimSayisi.put(each, 1);
				
			} else {
				harfKullanimSayisi.put(each, harfKullanimSayisi.get(each)+1); //  harfKullanimSayisi.get(each) > map'in value'sunda kac tane varsa onu dondurecek
			}
		}
		
		return harfKullanimSayisi;
	}

}

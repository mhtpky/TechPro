package day49_maps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map04_VeriTabani {

	/*
	 * Bir csv file’i okuyup icerigi map’e ceviren bir method yaziniz.
	  
	 * csv ==> 	isim,Ali 
	  			Id,101 
	  			Adres, Ankara
	  
	 * map ==> {isim=Ali, Id=101, Adres=Ankara}
	  
	 * CSV Edit Resurrector
	 * Eclipse Search CSV
	 */
	
	// Bir .csv uzantili dosya olusturduk
	// csv nin ozelligi virgullerle saga dogru gider
	
	public static void main(String[] args) {

		String dosyaYolu = "‪C:\\Users\\HP\\Downloads\\VeriTabani.csv";

		Map<String, String> veriMap = veriTabaniAl(dosyaYolu);
		System.out.println(veriMap);
	}

	public static Map<String, String> veriTabaniAl(String dosyaYolu) {

		Map<String, String> eklenecekMap = new HashMap<>(); // sonucu dondurebilmek icin method olusturduk

		try {
			BufferedReader br = new BufferedReader(new FileReader(dosyaYolu));  
			// BufferedReader > dosya okuyabilmemiz icin gerekli classlardan bir tanesi
			// BufferReader calismasi icin dosyaYolu dosyamizi okumasi icin bir de FileReader okuyucusu yaptik
			String satir = br.readLine(); // satiri oku

			while (satir != null) { // Satir null olmadigi muddetce loop'u calistir
				
				String keyValueArr[] = satir.split(","); // [isim ,Ali] > stringi array yaptik
				eklenecekMap.put(keyValueArr[0], keyValueArr[1]); // keyValueArr arrayini mape ekledim > 0.indexi key, 1.indexi value yap> {isim=Ali}
				satir = br.readLine(); // Bir sonra ki line'i okur next() methodu gibi 
				// satir => Id, 101 oldu bu satirda 
			}

		} catch (IOException e) {

			e.printStackTrace(); // detayli hata raporu verir
		}

		return eklenecekMap;
	}

}

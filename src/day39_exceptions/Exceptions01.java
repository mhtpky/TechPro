package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions01 {

	public static void main(String[] args) {
		// Java'ya bir dosyayi okumasini veya dosyaya yazmasini soyledigimizde
		// Java "Ya dosyayi bulamazsam" der ve bizden cozum uretmemizi bekler.
		// Dosya bulma ile ilgili exception turu > FileNotFoundException dir
		// Java kodu yazar yazmaz burada ki olasi problemi gorur ve CTE verir
		// Kodumuzu yazdigimiz anda ortaya cikan bu tur exceptionlara 
		// Checked(kontrol edilebilir) Exceptions diyoruz
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Desktop\\techpro\\winter2021turkish\\src\\day39_exceptions\\File");
		} catch (FileNotFoundException e) {
			
			//e.printStackTrace(); // tum hata aciklamalarini yazdirir ama kodumuz bloke olmaz
			System.out.println(e.getMessage()); //  Daha az hata aciklamasi yazdirir
		}
		System.out.println("Kod bloke olmamis");

	}

}

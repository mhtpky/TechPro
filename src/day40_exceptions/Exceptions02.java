package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\HP\\Desktop\\techpro\\winter2021turkish\\src\\day39_exceptions\\File");

		// INTERVIEW
		// try-catch blogu exception ile handle etmekte kullanilir
		// throws keyword'u ise sadece declaration'dir.
		// Dolayisiyla throws kullanilan bir methodda exception olusursa 
		// KOD BLOKE OLUR
		
		// throws'un amaci : Kodum dogru benim sorunum yok sen hata verme bana yoluna Java kardes bak demek icindir.
		
		
		int k = 0;  

			while ((k = fis.read()) != -1) { 
											
				System.out.print((char) k); 
			}
			
			// Eger birden fazla exception icin throws keywordu kullanacaksak
			// Yazacagimiz exception'larin arasinda ki iliski ve siralama onemli olur
			// Eger yazdigimiz exceptionlar arasinda parent-child iliskisi varsa
			// Once child exception yazilmalidir aksi takdirde child exception erisilemez olur
			
			
			// Eger yazacaklarimiz arasinda parent-child iliskisi varsa
			// Istersek sadece parent'i(IOException) yazmamiz da yeterli olur
		
			
			
	}

}

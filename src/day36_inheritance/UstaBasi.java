package day36_inheritance;

public class UstaBasi extends Isci{

	public String bolum= "Takimhane";
	public int sorOldIsciSay=20;
	
	public static void main(String[] args) {
		
		UstaBasi ub1 = new UstaBasi();
		// Objeyi torun classinda olusturunca 3 class'a da ulasabiliyoruz
		
		System.out.println(ub1.bolum); // Takimhane
		System.out.println(ub1.sorOldIsciSay);// 20
		System.out.println(ub1.saatUcreti);// 10 
		System.out.println(ub1.isim); // Mehmet
		
		Isci ub2 = new UstaBasi(); // UstaBasi ub2 = new UstaBasi();
		// ustabasi bir iscidir o yuzden bu sekilde de yazabiliriz
		// List <String> list = new ArrayList,
		// Object str = new String("Hasan");   de yaptigimiz gibi
	    // Bunu bazen kapsam genisletmek amacli yapariz 
		// isci sinifinin diger altsiniflarina ulasmak icin kullanilir
		
		
		// UstaBasi constructoru degismiyor 
		// sadece data turu Isci ve ya Personel ihtiyaca gore degisebilir
		
		// Extends ile birbirine bagli olan classlarda IS-A relation olan
		// Data turleri istege bagli olarak kullanilabilir
		// Daha genis Data Turu yazmanin avantaji 
		// >> Kapsamin Daha Genis olmasidir
		// Daha genis Data Turu yazmanin dezavantaji ise 
		// >> Data turu olarak sectigimiz class ve parent(larina) ait datalara ulasabiliriz
		System.out.println(ub2.departman); //Isci classindan alir
		System.out.println(ub2.izindeMi); // Personel classindan alir
		
		Personel ub3 = new UstaBasi (); 
		System.err.println(ub3.id);	// sadece personel classinin datalarina ulasabilirim
		
		}

}

package day32_stringbuilder;

public class C1_StringBuilder01 {

	public static void main(String[] args) {
		// STRINGBUILDER METHODLARI
		
		
		StringBuilder sb1 = new StringBuilder("Rumeysa"); 
		System.out.println(sb1); // Rumeysa
		
		sb1.append(" ").append("Cetinturk"); // SB nin sonuna ekleme yapar
		System.out.println(sb1);//Rumeysa Cetinturk
		//SB de concat methodu yoktur
		//Birlesrtirmek istedigimz kelimeyi  parantez icinde yapabiliriz
		// ("Cetinturk" + " " + "Java")
		
		String cumle = "Javayi cok sever";
		sb1.append(cumle, 6, 10); // cumlenin 6. indexinden 10. indeksine kadar SB nin sonuna ekle (inclusive, exclusive)
		System.out.println(sb1); // Rumeysa Cetinturk cok
		
		
		// Bize bilgi veren methodlari sadece yazdirabiliriz
		// charAt,length,capacity.. ayri bir satirda olusturulup altta syso yapilamaz

		System.out.println(sb1.length()); // 21 > uzunluk verir
		System.out.println(sb1.capacity()); // 23 (7+16) > kapasite verir
		System.out.println(sb1.charAt(1)); // u > yazdigimiz indexin karakter bilgisini verir
		
		sb1.delete(17, 21); // secili olan indexlerin arasini siler(inclusive, exclusive)
		System.out.println(sb1); //Rumeysa Cetinturk
		
		sb1.deleteCharAt(16);// secili olan indexi siler
		System.out.println(sb1);//Rumeysa Cetintur
		
		String isim = "Rumeysa Cetintur";
		System.out.println(sb1.equals(isim)); // false > String ve SB birbirinden farkli objelerdir.
											 // Data turleri farkli oldugu icin kiyaslanmasi mumkun degildir
		
		StringBuilder sb2 = new StringBuilder("Rumeysa Cetintur"); 
		System.out.println(sb1.equals(sb2)); // false > SB'de equals methodu String den farkli calisir
											// Ancak ayni obje ile kiyaslandiginda true verir
											// String'de ki == gibi calisir (hem kendi degeri hem ref esit olmali)
		
		System.out.println(sb1.indexOf("Cetin")); //8 // cetin kacinci indextedir
		System.out.println(sb1.indexOf("e", 6)); //9 > 6.indexten sonra e kacinci indexte bulur
		System.out.println(sb1.indexOf("Kazim")); // -1 > aradigimz kelime SB de olmadigi icin -1 dondurdu
		
		sb1.insert(7, " "); // 7.indexten itibaren istenen stringi ekler
		System.out.println(sb1); //Rumeysa  Cetintur
		
		cumle = "Merhaba Dunya";
		sb1.insert(0, cumle, 0, 8); // sb1.insert(index, str, offset, len)
									// 0: SB'a hangi indexten itibaren eklenecek
									// cumle : Hangi stringden eklenecek
									// 0: Cumlenin hangi indeksinden baslanacak
									// 8: Bitis indexi
		sb1.insert(25, cumle, 7, 13);
		System.out.println(sb1); //Merhaba Rumeysa  Cetintur Dunya
		
		System.out.println(sb1.lastIndexOf("t")); //22 > t'nin en son kullanildigi index
		System.out.println(sb1.lastIndexOf("a", 22)); // 14 > 22. indexten once ki son a
		
		sb1.replace(8, 16, "Seher"); // SB nin baslangic ve bitis indexleri arasinda ki kismi 
									// v=verilen String ile degistirilir
		System.out.println(sb1);
		
		sb1.reverse(); // SB yi tersine cevirir
		System.out.println(sb1); // aynuD rutniteC reheS abahreM
		sb1.reverse();
		
		sb1.setCharAt(10, 'k'); // 10.indexi degistirdi k yapti
		System.out.println(sb1); //Merhaba Seker Cetintur Dunya

		
		System.out.println(sb1.subSequence(8, 13)); // Seker SBnin istedigimiz indexler 
													// arasinda ki bolumunu verir
		
		System.out.println(sb1.substring(8,13)); //// Seker
		
		StringBuilder sb3 = new StringBuilder("Java cok guzel");
		StringBuilder sb4 = new StringBuilder("Java cok guzel");
		
		System.out.println(sb3.equals(sb4)); // false
		System.out.println(sb3.toString().equals(sb4.toString())); // true
		//sb3.toString(); // SB' yi stringe cevirir 
		
		sb3.toString().concat(" Insanin sevdikce sevesi geliyor"); // String class'ina ait methodlar 
																 // kullanilinca kalici degsim olmaz
		System.out.println(sb3);
		//toString() methodunu kullaninca SB stringe donusmus oldu
		// dolayisiyla tum String methodlari kullanilabilir
		System.out.println(sb3.toString().concat(" Insanin sevdikce sevesi geliyor"));
		// Java cok guzel insanin sevdikce sevesi geliyor
		
		System.out.println(sb1.length()); //27
		System.out.println(sb1.capacity()); //48
		
		sb1.trimToSize(); // SB icin hazirlanan kapasitede ki fazlaliklari siler
						// length ile kapasiyeti esit duruma getirir
		System.out.println(sb1.length()); // 28
		System.out.println(sb1.capacity()); // 28
		
		System.out.println(sb3.compareTo(sb4)); // tum karakterleri siradan kontrol ederek gider
												// Esitligini karsilastirir (Esit ise 0)
												// esit degil ise farkli olan ilk endekslerin aralarinda ki 
												// ASCII degerlerinin farkini verir
	}

}

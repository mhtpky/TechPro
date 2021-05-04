package day40_exceptions;

public class DersNotlari {
	// throw 1 exception firlatmak icin
	// sadece 1 tane exception throw etmek icin kullanilir
	
	/*
	1- Aleni sekilde exception throw eder.Throw declare etmiyor
	2- throw bir tane exception firlatmak icin kullanilir
	3- throw method icinde kullanilir
	4- Syntac olarak throw kelimesinden sonra instance variable kullanilir
		throw new exceptionismi
	 */
	
	
	 /*
	1- Throws ise bir veya daha fazla exc.'i declera etmek icindir. "," ile ayrilarak yazilabilir.
	2- Throws keyword ise method signature'inda kullanilir.
	3- throws'dan sonra sadece exception isimleri yazilir
	  */
	
	/*
     * -Finally blogu try-catch blogu ile veya sadece try blogu ile calisabilir. 
     * -Try blogu sadece catch ile mi calisir ? Hayir, try blogundan sonra 
     * catch block veya blocklari , veya finally ile calisabilir.
     * 
     * -Finally block her durumda calisir.
     * -Neden kullaniriz ? Sadece yazi yazmak icin degil cloud veya database ile conection'i 
     * bitirme veya uzerinde calisilan dosyayi kapatma gibi islemler icin kullanilir.
     * -Finally block catch blogu olmadan sadece try ile de kullabilir.
     * -Bu durumda catch blogu olmadigindan Java throws exception ardindan finally ile istedigimiz islemi yapar.
     * 
     */
	
	/*
	   // catch blok uyari sistemidir. try kisminda bir sorunla karsilasirsam ne yapacagimi bana anlatir
	   // try calisirsa catch calismaz ama finally her durumda calisir
	   // exception'u try catch ile surrond etmemizin anlami hatayla karsilasirsan 
	   // hatayi bana soyle ama calismaya devam et demektr (elektrik kesilirse jeneratoru calistir)
	   // catch olmazsa kod calismaya devam etmez ama
	   // Finally blok karsilasilan bir probleme karsi calismaya devam eder sadece kendi blogunu calistirir
	   // Finally'nin kari ongorulemeyen problemlerde calismaya devam etmeyi saglar
	   
	   
	   // SLAYT SORU
	     * try blogu s String'ine t eklemeye calisir. sadece t oldu (hiclige ekledi).
         * try calistigi icin catch calismaz o yuzden "c" eklemedik String'imize.
         * Finally her durumda calisacagi icin "f" ekleyecektir. String'imiz ta oldu.
         * a bloglar disinda oldugu icin gene calisacak String'e ekleyecek ve tfa olur cevabim.
         */
	 
	
	/*
	 *
	 */
}





 
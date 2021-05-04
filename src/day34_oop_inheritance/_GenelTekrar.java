package day34_oop_inheritance;

public class _GenelTekrar {
	/* OOP ihtiyacimiz olan Class uyelerini bir kere olusturup, ihtiyacimiz olan tum class'lardan
	 * Obje araciligiyla kullanmaya ve objeleri kullanarak projemizi olusturmaya denir
	
	 * Access Modifier'i public olan class uyelerine extra hic bir islem yapmadan obje ureterek her yerden ulasabiliriz
	
		// ENCAPSULATION(DATA HIDING) \\
	 * Eger olusturdugumz class uyeleri bizim icin hassas bilgiler iceriyorsa, datalari korumak icin 
	 * Access Modifire'i PRIVATE yapmaliyiz.
	 * Olusturdugumuz ve private yapark gizledigimiz class uyelerini istedigimiz olcude 
	 * diger classlarin kullanimina acabiliriz.
	 * 
	 * Bunun icin Java'da getter() ve setter() method'larini kullaniriz.
     * -Gizledigimiz datalarin sadece okunmasini ama obje uzerinden bile olsa deger atanamamasini
     * (Okul Ismi,Okul adresi vb.) istiyorsak GETTER(); methodunu kullanmaliyiz.
     * -Gizledigimiz datalarin ilk atanan degerlerini gorunemesin ama objeler uzerinden yeni deger atanarak
     * kullanilabilsin(TC NO,Banka hesap no) istiyorsak SETTER(); methodunu kullanmaliyiz.
     * 
     * Encapsulation olustururken yazilan getter ve setter methodlarinin access modifier'i public olmalidir
     * Encapsulation olustururken yazilan getter methodunun okunmasini istedigimz method ile ayni return type icermesi gerekmektedir
     * Encapsulation olustururken yazilan setter methodunun return type'i void olmalidir
     */
	
	/*  ENCAPSULATION FAYDALARI 
	 		1. Esneklik(Flexibility) > Bir degiskene atanan degerin setter methodu ile istenildigi gibi degistirilebilmesidir
	 		2. Reusubility > getter ve setter methodlari bir kere olurturulup tum classlardan istendigi kadar kullanilablr
	 		3. Istediginz datayi okunablr( getter() olustur) istediginiz datayi okunamaz(getter() olusturma) hale getirebilirsinz
	 		4. Istediginz datayi degistirileblr(setter() olustur), istediginizi degistirilemez(setter() olusturma) yapabilirsinz
	 		5. Kullanicinin kullandigi sistem arkasinda ki karmasik yapiyi kullaniciya gostermez. 
	 		Boylece kullanici yapmak istediklerini daha rahat yapar
	 		

	// Bir classda 
	   a)tum variable'lar "private" ise ve 
	   b)tum getter() ve 
	   c)tum setter()'lar olusturulmus ise
	   bu class "FULLY ENCAPSULATED" olarak adlandirilir
	   
	// getter() ve setter() methodlara ayni zamanda "JAVA BEANS" da denir
	
	// Static variable'lar encapsulated yapilamazlar(gokte ki ay gibidir umuma acik)
	   yalnizca instance variable'lar encapsulated yapilabilirler
	   
	// Eger encapsulated datalar icin sadece getter methodlari olusturusaniz class 
	   "Immutable class(degistirilemez)" olmus demektir
	   
	// Eger encapsulated datalarin update edilmesi istenmiyorsa setter method olusturulmamalidir
	
	// Eger encapsulated datalarin okunmasi istenmiyorsa getter method olusturulmamalidir

	 */
		
}
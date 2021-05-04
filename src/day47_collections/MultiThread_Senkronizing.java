package day47_collections;

public class MultiThread_Senkronizing {
	/*
	* Multi Thread CPU' nun max kullanimi icin bir programin iki veya daha fazla bolumunun ayni anda 
	  yurutulmesine izin veren bir Java ozelligidir
	
	* Boyle bir programin her bir parcasi bir is parcacigi (THREAD) olarak adlandirilir
	
	* Threads iki mekanizma kullanılarak oluşturulabilir:
	1. Thread class’ina extend edilerek
	2. 2. Çalıştırılabilir Interface’in implement edilmesi ile 
	*/
	
	
	// Youtube'a saniyede milyonlarca request gelmektedir. 
	// Sirani bekle onun sarklisi bitince seninkini calacagim demiyor
	// Tum programlama dilleri ve tum islemcilerde hatta tum IT sektorunde 
	// Multi Threading (Coklu Islem) diye bir kavram vardir.
	// Ayni zamanda birden fazla islem yapma yontemidir
	// 4,16 cekirdekli islemci, 4+4sanal islemci
	
	// Islemci ile cozerken islemciyi 4 e bolerek yapilacak 4 islemi ayni anda yapmayi sgalar
	// 10 sn lik 4 islem tek tek yapilsa 40 saniye surecekken 4e bolununce toplamda 12 saniyede bitebilr
	
	// Kodla cozmeye calisirsak 4 kod blogu olusturup 4 unu de ayni zamanda calistiralim
	// Java da mumkun degil gibi gorunuyor ama MULTITHREADING ILE BU MUMKUNDUR. Ileride gorecegiz
	// 4 kod blogu ayni anda calisirsa yukarida ki gibi bir zaman tasarrufu saglanabilr
	
	/* Kulaga mantikli gelse de DEZAVANTAJI da vardir
	 * A=10 thread1 =(A+5)  	1>2>3 = 270 
	 * B=15 thread2 =(B+3)		3>2>1 = 150
	 * 		thread3 > C= A*B	2>3>1 = 180
	 * 
	 * Multi Thread ayni variable veya ayni method ile ilgili oldugunda sonuclar
	 * islem sirasina gore degisebilir. Bu da BELIRSIZLIK getiri.
	 * Java da belirsizlik olamaz kesinlikle cozmek ister.
	 * Boyke olunca isin icine SENKRONIZATION girer
	 * 
	 * Senkronization> aksama misafir var yemek yapacagiz 
	 * corba icin yaklasik 45 dk
	 * salata yaklasik 15 dk
	 * ana yemek yaklasik 1 saat
	 * sofra hazirlama yaklasik 15 dk 
	 *  Menuyu hazirlamak icin 2sa 15 dk ihtiyac mi vardir? 
	 *  Hayir daha kisadir ama ne kadar hizli olacagi bizim senkronization kabiliyetimize kalmistir.
	 *  Bir isi yaparken digerini de yapabiliriz corba kaynarken sofra hazirlama gibi
	 *  1 saatten kisa da olamaz cunku ana yemek tek basina 1 saatten once hazir olmaz
	 *  1 saat ile 2sa 15 dk arasinda hazirliklar bitebilr
	 *  
	 *  Ayni anda kitap okuyup telefona bakip kahve icip yazi yazamayiz
	 *  Cok iyi bir senkronize oldu diyelm karsida ki konusurken kahve icti bir yandan gozu kitapta idi....
	 *  
	 *  Peki Java bunu nasil handle eder ?
	 *  4 thread in 4 u de bagimsiz ise Java hepsini ayni anda calistirip isi yapar
	 *  1' den fazla thread ayni variable veya methodu kullaniyorsa da 
	 *  >>	Java variable veya methoda bir kilit mekanizmasi kurar. 
	 *  >>	Ilk geleni alir ve bitene kadar digerlerini bekletir
	 *  >>	Sonra ikinci sonra ucuncu sonra da dorduncuyu alir
	 *  Bir ocakta hem corba hem yemek yapamayiz sirayla yapmak gerekir
	 */
	
	
	/*Java, senkronize bloklar kullanarak thread oluşturmayi ve 
	  threads’in görevlerini senkronize bir sekilde yapmasini sağlar.
	  
	 *Java'da senkronize bloklar, synchronize keyword ile işaretlenir.
	 */

	
	
	/*
	 *  Java da multi thread ve senkronization ikisi de mumkundur
	 *  MULTI THREAD  ayni anda birden fazla thread'in calismasini amaclarken 
	 *  SENKRONIZATION calisan birden fazla thread'in birbiri ile uyumlu calisip 
	 *  istenen yere dogru varmasini saglasr
	 *  
	 *  Threading olmadan synchronizing dogru calisamaz, 
	 *  synchronizing olmadan threading calismasinin bir amaci yoktur.
	 */
}

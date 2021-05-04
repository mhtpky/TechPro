package day43_interface;

public class DersNotlari {
		// Interface bir class degildir. Arayuzdur
		// Icinde mutlaka override edecegimiz methodlar olmalidir
	
		// Java'da interface olusturmak istiyorsak bastan o sekilde olusturmaliyiz
		// Bir class sonradan bazi keyword'ler yazilarak interface YAPILAMAZ
		
		// Interface bir cesit to do list'tir
		// Nasil yapilacagina degil ne yapilacagina odaklanir
		
		// Birden fazla parent'a inherit edemeyiz ama 
		// 1 den fazla interface'i inherit edebiliriz
		
		// Bir class 4 farkli yere inherit edemez 
		// Ama bir class istedigimiz kadar interface'e IMPLEMENTS ile baglanabilir
		// (clas>clas => extends / clas>interface => implements / interface>interface => extends)
	
		// Birden fazla interface'i implements ile inherit ettigimizde ayni isimde variable
		// veya methodlarla karsilasabiliriz. 
		// Methodlarda override yapabiliriz ama 
		// Variable'larda karisiklik olmamasi icin 
		// istedigimiz variable ismini interface ismi ile birlikte yazmamiz gerekir
		// syso(interfaceismi.variable)
	
		// Signature ayni return type farkli methodlari ayni classda inherit edemeyiz CTE verir
	
		// Yazsak da yazmasak da interface icinde ki variable'lar public,static ve final olur
		// Interface icinde ki variable'lara MUTLAKA INITIALIZE etmek zorundayiz. 
		// Yapmazsak CTE verir

	/* 
	 *** Interface icinde abstract method'lar ve 
		 OZEL concrete method'lar olabilir
	   
	 *** Bir abstract method'un body'si olmadigindan o methodun 
	     istenen dinamik ozelligi nasil gerceklestirecegini bilmemiz mumkun degildir.
	     Sadece ne yapacagini biliriz
		 	
	 *** Interface de sadece ABSTRACT, PUBLIC method'lar olur
	     Bu iki keyword'u yazsak da yazmasak da Java tum methodlari bu sekilde kabul eder
*/
	

/*	  ///////////////////////////////////////////////////////////////////
      /// ABSTRACT - INTERFACE FARKLARI \\
      / 
      /* ABSTRACT classdir
      /* Abstract ve concrete methodlar konabilir
      /* Kismi olarak abstraction saglar
      /* Birden fazla abstract class'a direkt child olunamaz
      /	 Coklu inheritance desteklemez
      /* Hiz acisindan avantajlidir
      /* Icinde ki tum nesnelerin " public" olmasi zorunlu degildir
      /* Soyut olmayan methodlar static olarak tanimlanabilr
      /* Constractor'a sahiptir
      /
      /* INTERFACE Class degildir 
      /* Sadece abstract methodlar konablir
      /* Tam abstraction(soyutluk) saglar
      /* Bir class'dan istedgimiz kadar interface'i inherit edebiliriz
      /  Coklu inheritance'a uygundur
      /* Abstract classa gore daha yavastir
      /* Icinde ki tum nesnelerin " public" olmasi gerekir
      /* Methodlar static olamaz
      /* Class olmadiklari icin constructor'lari da yoktur
	  ////////////////////////////////////////////////////////////////////// 
		 
		
 */

	/*
    - Interface'lerin simgesinin sag ust kosesine "I" harfi cikar ayirt edilebilmesi icin.
    - Interface bir class degildir . Interface INTERFACE'dir.
    - Interface icinde sadece kendisinden tureyen siniflarin icini doldurmak zorunda oldugu,
    body'si olmayan method'larin olusturuldugu bir yapidir.
    - Kisacasi kendisini inherit eden class'lar icin yerine getirmeleri gereken methodlari belirten
    "tum alanlari doldurulmak zorunda olan bir sablon" gibidir.
    - Interface'ler somutlastirilamaz(can not be instantiated) yani Interface'de obje OLUSTURULAMAZ.
    - Interface bir cesit to do list'tir. Concrete class'lari interface'deki tum methodlari implement etmek zorunda birakir.
    Nasil yapilacagina degil ne yapilacagina odaklanir.
    - Bir class birden fazla class'a extend edilemez ama birden fazla interface'e implement edilebilir.
     NOT : Abstract class'lar interface'deki abstract methodlari implement etmek zorunda degildir.
    - Optional bazi method'lar koymak istersek, en uste concrete bir parent koyariz.
    - Bir class 4 farkli class'a inherit edemez AMA bir class istedigimiz kadar INTERFACE'e implements ile baglanabilir.
    - Birden fazla class'i parents olarak kabul edemeyiz fazla birden fazla Interface'i parent olarak kabul edebiliriz.
    
    
    
      Interface'lar icin Inheritance Kurallari :
      
      1) Interface'lerde inheritance yapmak icin implements keyword'u kullanilir.
      Class extends Class || Class implements Interface || Interface extends Interface
      
      2) Bir class birden fazla Interface'e implements ile baglanabilir
      public class Arabam impelents ElektrikMotor, OtomatikVites, Seda { } 
      Arabam -> Class
      ElektrikMotor, OtomatikVites, Seda -> Interface
      
      3) Birden fazla Interface'i implements ile inherit ettigimizde ayni isimde variable veya method'larla karsilasabiliriz.
      Bu durumda Java ne yapacagini bilmek isteyeceginden istedigimiz variable ismini interface ismi ile birlikte yazariz.
      Method'lar mecburen override yapilacagi icin hangi interface'den alindiginin hicbir onemi yoktur.
      
      4) Ayni isme fakat farkli return type'a sahip method'lari olan Interface'leri ayni class'dan inherit edemeyiz. 
      Signature ayni , return type farkli ise (ikiside interface olmak sarti ile) inherit edemeyiz.
      
    */



}

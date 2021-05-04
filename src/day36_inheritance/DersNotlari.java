package day36_inheritance;

public class DersNotlari {

	/*
	 * INTERVIEW SORUSU 
	 * Java nasil bir dildir ? OOP concept bir dildir
	 
	 * OOP concept ne demektir ?
	 * Bir classda urettigimiz variable ve methodlari farkli
	 * farkli classlardan objeler araciligila kullanabiliriz 
	 * 
	 * OOP concepti kullanmak icin 2 yol vardir 
	 * 1 - encapsulation (gizlemek icin) 
	 * 2 - inheritance
	 */

	
	/*
	 * "super" keyword parent class'dan variable cagirmak icin kullanilir. 
	 * "this" keyword icinde bulunanan class'dan variable cagirmak icin kullanilir. -
	 * 
	 * Esasinda "this" keyword parent class'dan variable cagirmak icin de
	 * kullanilabilir; fakat tavsiye edilmez. 
	 * Cunku, child ve parent class'larda ayni isimli iki variable varsa, 
	 * this parent class'dan variable cagiramaz oncelik child classindir.
	 * 
	 * super() ve this() cons. cagirmak icin kullanilirlar ve cons.'in ilk
	 * satirinda olmalidir. 
	 * Bu durumda bir cons.'da ikisinin birden olmasi mumkun degildir. 
	 * 
	 * super. ve this. variable cagirmak icin kullanilirlar. Ilk satirda
	 * olma sarti olmadigi icin ikisi birlikte kullanilabilirler. 
	 * super. parent'e this. childda yoksa parent'a gider
	 */
	
	/*
     * 
     * 1) Inheritance’in avantajlari nelerdir ?
     *   Reusability, Maintenance, Less Code.
     *   
     * 2) Bir Class’a Parent Class olusturmak icin Syntax nedir?
     *   public class ChildClassIsmi extends ParentClassIsmi
     *   
     * 3) Hangi access modifier’lar inherit edilebilir ?
     *   public ve protected olanlar heryerden, default olanlar ayni paketten inherit edilebilir.
     *   
     * 4) super() ile this()’in farki nedir?
     *   super() parent class’dan, this() ise icinde bulunulan class’dan constructor cagirmak icin kullanilir
     *   
     * 5) super() ile super.’nin farki nedir?
     *   super() parent class’dan constructor, super. ise variable veya method cagirmak icin kullanilir
     *   
     * 6) this() ile this.’nin farki nedir?
     *   this() constructor, this. ise class variable veya method’u cagirmak icin kullanilir
     *   
     * 7) super. ile this.’nin farki nedir?
     *   super parent class’dan variable veya method cagirmak icin kullanilir, 
     *   this. ise icinde bulunulan class’da class level variable veya method’lari cagirmak icin kullanilir.
     *   this. ile parent class’dan da variable veya method cagrilabilir ancak ayni isimde bir
     *   variable/method hem icinde bulunulan class’da hem de parent class’da olursa this parent class’da
     *   olani degil icinde bulunulan class’dakini cagirir.
     *   Emin olmak icin parent class icin super kullaniriz.
     *   
     * 8) super() ve this() bulunduklari constructor’da ilk sirada olmalidir. (True) 
     * 
     * 9) super() ve this() bir constructor’da sadece 1 kere kullanilabilir. (True)
     * 
     * 10) super() ve this() birlikte ayni constructor’da kullanilabilir.(False) Cunku ikisi de ilk satirda olmasi lazim birisi varsa digeri olamaz
     */
}

/* Method Signature > method ismi ve parametrelerden olusur
	Signature degistirmek icin 
	1. Isim ayni kalsa da Parametre sayisi degistirmek signaturu degistirir
	2. Farkli data turune shp parametrelerin yerleri degistirildiginde signature degisir
	3. Ismi degistirmek de signature degistirir ama o zaman overloading olmaz
*/


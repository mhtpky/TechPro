package day37_overriding;

public class DersNotlari {

	 /* OVERLOADING > Ayni isimde ama farkli method signature'larina sahip methodlar
	   
	  * Inheritance'da data turu olarak class ismi kullanimi 
		// Bir class'da obje uretirken data turu olarak class'in kendisini 
		// veya parent(larini) kullanabiliriz
		// Olusturdugumuz obje ile variable kullanmamiz gerekirse,
		// hangi degeri alacagini anlamamiz icin once data turu olan class'a gideriz
		// orada aradigimiz variable varsa kullaniriz. yoksa parent(lar)ina bakariz
		// Yukari dogru giderken ilk buldugumuz degeri kullaniriz
		
	  */
	
	/* OVERRIDING 
	1)Parent class'da varolan bir methodu method signature’ini degistirmeden ,
	method body’sini degistirerek kullanmaya Method Overriding denir.
	2)Overriding kullanarak, child class’in parent class’daki methodu kendine
	uyarlayarak (implement) kullanmasini saglamis oluruz.
	3)Overriding yapildiginda parent class’daki methoda Overridden Method ,
	child class’daki methoda Overriding Method denir.

	 FAYDALARI
	 Overriding parent class’daki genel method’u degistirmeden child class’in
	kendine uygun method uretmesini saglar
	
	Ornegimizde
	isci maasi hesaplanirken genel bir formul varken, child class
	olan Ustabasi ve GeciciIsci Class’lari kendilerine uygun maas hesaplama
	method’larina sahiptirler.
	
	KURALLARI
	1) Method Signature’i (name and ayni olmalidir.
	
	2) Child class’daki method’un (overriding method) Access Modifier’i parent
	class’daki method’un (overridden) modifier’indan daha dar olamaz.
	// ACCESS MODIFIER
	// Child Parent'i sýnýrlandýramaz yani 
	// Overriding methodun Access Modifier'i overrriden methodun 
	// Access Modifier'indan daha dar olamaz. esit ya da daha genis olablr
	
	3) Overriding method covariant return type kullanmalidir.
	// RETURN TYPE
	// Overridden method'un return type'i primitive veya void ise
	// overriding methoddun return type da ayni olmalidir
	// Eger return type primitive degilse
	// (Overriding method'un return type'i) IS-A (Overridden method'un return type'i) olmalidir
	
	4) private, static and final method’lar overriding yapilamazlar.
		5 ve 6 sonra aciklanacak
	5) Child class’daki method (overriding method), parent class’daki method’un
	(overridden method) compile tim edip etmedigine bakmaksizin compile time
	exception throw edebilir.
	Fakat child class’daki method (overriding method), parent class’daki
	method’dan (overridden method) daha bir run time exception throw edemez.
	6) Eger abstract olmayan bir class abstract class ’a extend ediyorsa veya bir
	interface’i implement ediyorsa abstract method’larin tamami override edilmelidir.
	 */
}

		// Eger variable'a ulasmak istersek Data Type'a bakiyoruz fakat method'a gidiyorsak constructor'a bakariz. 
		// (Override durumlari icin hatirlatma)

	/* POLYMORPHISM = Overloading + Overriding
	 * Cok sekillilik demektir.  INTERWIEV sorusu
	 */

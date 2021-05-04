package day37_overriding;

public class GeciciIsci extends Isci{

		public String calistigiBolum = "Yemekhane";
	
	public static void main(String[] args) {
		
		// OVERRIDING
		// Bir child class'da parent classdan miras alinan methodu
		// degistirmeye overriding denir
		// Ayni method ayni isimle tekrar olusturulur
		
		GeciciIsci gi1 = new GeciciIsci();
		System.out.println(gi1.maasHesapla()); // 2400
		gi1.mesai();	
	}
	// overriding yapmak icin parent classdaki method signature'i
	// ile child class'da bir method olusturulur
	// Signature ayni oldugundan sadece body degisir
	// Boylece parent class'daki method child class icin gecersiz hale gelir
	// farkli bir isim yapsam override yapmazsam parent sinifindan metod ve gecici siniftan
	// metod gozukur, birisi degistirebilir, yanlislikla isciye saat ucretini 15 ile carpabilir
	// boyle yaparak parent class daki metodu gecersiz kilarak onun kullanimini burada engelliyoruz
	
	// Annotation yok 
	public int maasHesapla() { //isci(parent) classda ki methodu gecersiz kildik(overriding) burda degistirdigimiz icin 
		
		return 30*8*10;
	}
	
	@Override // annotation(aciklama dipnote) denir
	public void mesai() {
		//super.mesai();
		System.out.println("Gecici isciler haftada 25 saat calisir");
	}

	// annotation : aciklama dipnote
	// Java 31.satirda > kodu inceleyenler icin bir aciklama getiriyor
	
	// Annotation olmasi ile olmamasi arasinda ki fark
	// annotation sadece bir aciklama degildir
	// override yaptigimiz methodu surekli kontrol eder ve parent class'daki
	// overridden method signature 'i degistirilirse(or:parametre eklenirse) CTE verir
	
	// Eger override edilen parent class'daki method(overriden-gecersiz kilinan)'un de
	// calismasini istiyorsak overriding methoda 
	// super.overridenMethodIsmi yazariz
	// Eger overriding method'un ilk satirina super. yazilmazsa 
	// overridden method calismaz (consteructor'dan farklidir)
	
	// ACCESS MODIFIER
	// Child Parent'i sýnýrlandýramaz yani 
	// Overriding methodun Access Modifier'i overrriden methodun 
	// Access Modifier'indan daha dar olamaz. esit ya da daha genis olablr
	
	// RETURN TYPE
	// Overridden method'un return type'i primitive veya void ise
	// overriding methoddun return type da ayni olmalidir
	// Eger return type primitive degilse
	// (Overriding method'un return type'i) IS-A (Overridden method'un return type'i) olmalidir
}

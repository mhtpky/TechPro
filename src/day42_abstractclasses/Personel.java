package day42_abstractclasses;

public abstract class Personel {

	// Bir class'i abstract yapmak icin class keyword'unden once 
	// abstract yazmak yeterlidir.
	
	// abstract bir class'in icinde variabla olabilir mi ?
	// olabilir
	public String isim = "Erdem";
	
	// variable'lar abstract olur mu?
	// OLMAZ... 
	// public abstract int sayi=10; >> Illegal modifier for the field sayi; only public, protected, private, static, final, transient & volatile are permitted

	// Abstract class'in tum concrete child'lari abstract class'daki tum 
	// dinamik ozellikleri yani methodlari override etmek zorundadir

	// Bir method abstract olur mu ve nasil yapilir?
	// OLABILIR.... Ama body'si olamaz
	public abstract void maasHesapla();
	public abstract void mesaiBilgisi();
	
	// Bir abstract class'da concrete method yazilabilir mi?
	// Bir abstract class da abstract ve consrete methodlar olabilir
	// concrete child class'lar abstract methodlari OVERRIDE ETMEK ZORUNDADIR
	// concrete methodlari override etmek istege baglidir
	public void ozelSigorta() {
		System.out.println("Bu personel ozel sigorta kapsamindadir");
	}




}

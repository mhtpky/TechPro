package day42_abstractclasses;

public class Isci extends Personel{

	public static void main(String[] args) {
		Isci isci1 = new Isci();
		isci1.maasHesapla(); // Isciler icin maas 5000 TL
		isci1.mesaiBilgisi();// Isciler gunluk 8 saat calisir
		isci1.isim="Enis";   // abstract parent classda ki variable'lari istersem kullanabilirim 
		System.out.println(isci1.isim); // Enis
		isci1.ozelSigorta();// Bu personel ozel sigorta kapsamindadir
							// abstract parent class'daki concrete methodu istersem kullanabilirim
							// Bu methodu override etmedik ama parent-child iliskisi ile kullanabildik
	}

	@Override
	public void maasHesapla() {
		// Parent class'daki abstract methodu implement(uyarlama) etti
		// 1- Sen abstract bir class'i parent edindiysen mutlaka orada ki 
		//		abstract methodu implement etmelisin
		// 2- Parent class'daki method'da body olmadigi icin onu kullanmanin anlami yok 
		// 		Biz child class'da body olan methodu(concrete) kullanip islem yapmaliyiz
	
		System.out.println("Isciler icin maas 5000 TL");
	
	}
	
	@Override
	public void mesaiBilgisi() {
		System.out.println("Isciler gunluk 8 saat calisir");
		
	}

}

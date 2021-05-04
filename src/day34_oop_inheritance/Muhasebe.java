package day34_oop_inheritance;

public class Muhasebe extends Personel {
	// Muhasebe class'inin personel class'inin child classi oldugunu
	// declare etmek icin class ismine extends keyword ile
	// parent classi yazariz >> public class Muhasebe extends Personel {
	
	public int saatUcreti;
	public String statu;
	public int maas;
	
	public int maasHesapla () {
		
		maas=30*8*saatUcreti;
		
		return maas;
	}
}

package day42_abstractclasses;

public class IdariPersonel extends Personel{
	// Extends Personel yazarak abstract personele concrete bir child olusturdum 
	// ve Java CTE verdi. 
	// Cozum olarak urettigi 2 ihtimal var;
	// 1- Unimplemented(uyarlanmamis) methodlari uyarla ya da 
	// 2- Personel class'indan abstract kelimesini kaldir
	// Bu class'in calisabilmesi icin 2 islemden birini yapmak zorundayiz
	public static void main(String[] args) {
		

	}
	// Concrate bir class'da abstract bir method olabilir mi ?
	// Abstract bir method SADECE ABSTRACT BIR CLASS'DA OLUSTURULABILIR
	// public abstract void surekliCalisma();
	// The abstract method surekliCalisma in type IdariPersonel 
	// can only be defined by an abstract class
	
	
	@Override
	public void maasHesapla() {
		System.out.println("Idari personel maasi 4000 TL");
		
	}

	@Override
	public void mesaiBilgisi() {
		// TODO Auto-generated method stub
		
	}

}

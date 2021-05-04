package day42_abstractclasses;

public class IdariPersonelChildClass extends IdariPersonel {
	// Burada tekrar implement yapmaya gerek yoktur
	// IdariPersonel classinin child'i oldugu icin ve parent classi 
	// implement yaptigindan torunda gerek kalmamistr
	// Zaten bu class'in kullanacagi method parentinda override edilmisti
	// ve ihtiyaci oldugunda obj ile oradan alip kullanabilecektr
	public static void main(String[] args) {
		
		IdariPersonelChildClass obj1 = new IdariPersonelChildClass();
		obj1.maasHesapla(); // Idari personel maasi 4000 TL

	}

}

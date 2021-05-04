package day33_oop_encapsulation;

public class Encapsulation03 {

	public static void main(String[] args) {
		// Encapsulation02 Class'inda ki class member'a ulasmaya calisalim
		Encapsulation02 obj1 = new Encapsulation02();


		// Biz erisim yetkisini 2 ye ayiriyoruz
		  // 1- Okuyabilme >> get()
		  // 2- Degistirip kullanabilme >> set()

		System.out.println(obj1.sayi); //100
		
		// obj1.getOkulIsmi()="Mehmet Koleji"; >> get oldugu icin degistiremeyiz sadece okuyabiliriz
		System.out.println(obj1.getOkulIsmi()); //Yildiz Koleji
		
		//System.out.println(obj1.setHesapNo()); >> set old icin bir deger vermeden calismaz
		obj1.setHesapNo(546789); // 546789

		// Bir Class içinde class member oluşturuken bunu diğer class'lar ile
		// ne oranda paylaşacağımıza karar veririz
		// 1- Herkes okuyabilsin ve obje üzerinden değer atayıp kullanabilsin ==> public
		// 2- Herkes okuyabilsin ama kimse obje izerinden de olsa değiştiremesin Private ==> Public get();
		// 3- ilk atadigim degeri kimse goremesin Private ==> Public set ()
	
	}

}

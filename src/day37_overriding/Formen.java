package day37_overriding;

public class Formen extends Isci{
	
		public String sorumluOlBolum = "bakim";
		public String isim="Emrullah";
		
	public static void main(String[] args) {
		
		// Inheritance'da data turu olarak class ismi kullanimi 
		// Bir class'da obje uretirken data turu olarak class'in kendisini 
		// veya parent(larini) kullanabiliriz
		// Olusturdugumuz obje ile variable kullanmamiz gerekirse,
		// hangi degeri alacagini anlamamiz icin once data turu olan class'a gideriz
		// orada aradigimiz variable varsa kullaniriz. yoksa parent(lar)ina bakariz
		// Yukari dogru giderken ilk buldugumuz degeri kullaniriz
		
		Formen fr1 = new Formen();
		// fr1 objesini kullanarak hangi class'larin variable'larini gorebilirim
		// formen, isci ve personel
		fr1.sorumluOlBolum="Marangozhane"; // formen classi
		fr1.maas = 10000; // isci claasi
		System.out.println(fr1.isim + " " + fr1.sorumluOlBolum+" "+ fr1.maas);
		//Emrullah Marangozhane 10000
		
		Isci fr2 = new Formen();
		// fr2 objesini kullanarak hangi class'larin variable'larini gorebilirim
		// isci ve personel
		fr2.bolum= "Kaynak Atolyesi";
		//fr2.isim="Yakup";
		System.out.println(fr2.isim + " " + fr2.bolum +" "+ fr2.maas);
		//Mesut Kaynak Atolyesi 5000
		
		Personel fr3 = new Formen();
		System.out.println(fr3.isim); // Emre
	}

}

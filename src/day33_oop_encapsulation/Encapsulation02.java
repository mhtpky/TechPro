package day33_oop_encapsulation;

public class Encapsulation02 {
	// Eger ulasmak istedigim Class uyeleri (class member) -variable ve methodlar-
	// Public degilse baska package'lerden ulasmak icin extra islem yapmamiz gerekir
			
	// Yapabilecegimiz islerlerden 1. ENCAPSULATION (Data Hiding - Data Saklama)
	// Bu class'da kimseyle paylasmak istemedigimiz variable ve methodlar olusturalim
	
	// Private yapinca guvenlik konusunu halletmis olduk
	// Ancak class uyelerinin private olmasi OOP consept'e aykiridir
	
	// Encapsulation class'imizda olusturdugumuz class uyelerine
	// Kimlerin ne oranda ulasabilecegini belirlemek icin yapilir
	
	private String okulIsmi = "Yildiz Koleji";
	// Okul isminin baska class'lardan okunmasini ama deger atanamamaisini istiyorsak 
	// getter() methodu olusturuyoruz
	
	public int sayi=100;
	private String tcNo = "12345678901";
	private int hesapNo = 55554321;
	// Obje olusturularak deger atanip kullanilmasini istedgimiz ama
	// Ilk atadigimiz degerin grunmemesini istiyorsak setter() methodu kullaniriz
	

	public static void main(String[] args) {
		
		

	}
	// Source > Generate Getter and Setter > girerek istedigimz ayarlari yapabiliriz
	private void denemeMethod() {
		System.out.println("Deneme method'u calisti");
	}

	public String getOkulIsmi() {
		return okulIsmi;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public void setHesapNo(int hesapNo) {
		this.hesapNo = hesapNo;
		System.out.println(hesapNo);
	}
}

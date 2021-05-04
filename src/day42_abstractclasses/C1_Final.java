package day42_abstractclasses;

public class C1_Final {
	
	final static int SAYI=10;
	// instance bir variable'i final ve static yaparsaniz Java onu bold yapar
	// Biz de onu BUYUK HARFLE yazariz 
	
	String isim;
	// Instance variable'lara ilk deger atamasi yapmak zorunda degiliz
	// Deger atamadigimizda Java data turune gore default bir deger atar
	
	// final String soyisim;
	// final variable'larin degeri sonradan degistirilemeyecegi icin
	// Ilk atama yapilmadan olusturulmasina Java izin vermez
	
	public static void main(String[] args) {

		System.out.println(SAYI);
	}

	public void deneme() {
		System.out.println("Deneme yapiyoruz");
	}
	
	public final void deneme2() {
		System.out.println("Deneme yapiyoruz2");

	}
	
	
	
	
	
	
	
	
	
	
	
}

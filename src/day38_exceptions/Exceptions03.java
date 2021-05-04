package day38_exceptions;

public class Exceptions03 {

	public static void main(String[] args) {
		// try-catch blogunda ki e nin gorevi
		
		int sayi1 = 10;
		int sayi2 = 0;
		
		Exceptions01 exp = new Exceptions01();
		// Esitligin solunda ki Exceptions01 hem Class Adi hem de exp objesi icin Data Turu 
		
		try {
		System.out.println(sayi1/sayi2);
		} catch (ArithmeticException e){ // int a, String str,Object obj gibi..
		// ArithmeticException Java'da bir class ve e objesi icin data turudur
		// e ise ArithmeticException classindan olusturdugumuz objenin adidir
		// o zaman ismi e olmak zorunda degildir ama genel kullanim bu sekildedir
			
			System.out.println("Sayiyi sifira bolemezsin "); // bizim kullaniciya vermek istegimiz msj
			System.out.println(e); //java.lang.ArithmeticException: / by zero
		// Bu durumda hem Java'ya sorunu yazmasi icin firsat vermis 
		// Hem de application'i bloke etmemis oluruz
			
			System.out.println(e.getMessage()); // / by zero
			
			e.printStackTrace(); /* java.lang.ArithmeticException: / by zero
									at day38_exceptions.Exceptions03.main(Exceptions03.java:15) */
				
		}
		System.out.println("Kod bloke olmamiiiisss");
	}

}

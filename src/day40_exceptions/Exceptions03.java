package day40_exceptions;

public class Exceptions03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,4,7,8};
		
		try {
			System.out.println(arr[20]);
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Ne olursa olsun bu satir yazilsin");
		}
		System.out.println("Kod bloke olmamis"); // catch blogunu yoruma alirsak bu satir calismaz
		// catch blok uyari sistemidir. try kisminda bir sorunla karsilasirsam ne yapacagimi bana anlatir
		// 
		
		
		// Finally blogu try-catch blogu ile veya sadece try blogu ile calisabilir
		// Yani try blogu tek basina calismaz
		// Try blogu catch ile veya finally ile calisabilir
		
		// Finally blok her durumda calisir
		// Finally blogu catch ile ongordugum bir sorun oldugunda calistigi gibi 
		// ongoremedigim bir exception olustugunda da calisir
	}

}

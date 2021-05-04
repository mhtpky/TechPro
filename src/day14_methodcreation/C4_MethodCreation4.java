package day14_methodcreation;

public class C4_MethodCreation4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		toplama(60 , 50 );
		toplama(60.2 , 50.5);
		toplama(60.2 , 50); //double method sonucu
		toplama ('a' , 'b'); // char method sonucu
		toplama("ali" , "veli");// String method sonucu
		
	}

	public static void toplama(int sayi1 , int sayi2) {
		System.out.println("integer method sonucu : " + (sayi1+sayi2));
	}
	
	public static void toplama(double sayi1 , double sayi2) {
		System.out.println("double method sonucu : " + (sayi1+sayi2));
	}
	
	public static void toplama(int sayi1 , double sayi2) {
		System.out.println("integer ve double method sonucu : " + (sayi1+sayi2));
	}
	
	public static void toplama(char char1 , char char2) {
		System.out.println("char method sonucu : " + (char1+char2));
	}
	
	public static void toplama(String str1 , String str2) {
		System.out.println("String method sonucu : " + (str1+str2));
	}
	
	
}

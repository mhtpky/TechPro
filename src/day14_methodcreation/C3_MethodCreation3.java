package day14_methodcreation;

public class C3_MethodCreation3 {

	public static void main(String[] args) {
		// Verilen 3 double sayinin ortalamasini alan bir method yazin
		// main method icinde cagirarak methodu calistirin 
		
		ortalama (80 , 60 , 54);
		ortalama (50 , 40);
		
		
	}

	public static void ortalama(double sayi1, double sayi2, double sayi3) {
		
		System.out.println("Girdiginiz uc sayinin ortalamasi : " + (sayi1+sayi2+sayi3)/3);
	}
	
	public static void ortalama(double sayi1, double sayi2) {
		
		
		System.out.println("girdiginiz iki sayinin ortalamasi : " + (sayi1+sayi2)/2);
		
			
		}
		
	
	
}

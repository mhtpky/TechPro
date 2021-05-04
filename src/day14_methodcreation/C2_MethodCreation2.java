package day14_methodcreation;

public class C2_MethodCreation2 {

	public static void main(String[] args) {
		
	// Bir method'u calistirmak icin main method'un icinden cagirmamiz gerekir
	// Bir method'u cagirmak icin ise METHOD ADI'ni ve 
	// parametrelere uygun ARGUMENT'leri yazmaliyiz
		
		ortalama(85.2 , 90.3); // method call > method cagirma
	
	
	} 

	// Bir method olusturmak istedigimiz de class' in icinde ama 
	// main method'un disinda bir alanda olusturmaliyiz
	// Genel kullanim method'larin main method'dan sonra yazilmasidir
	
	public static void ortalama(double sayi1, double sayi2) {
		
		
	System.out.println("girdiginiz iki sayinin ortalamasi : " + (sayi1+sayi2)/2);
	// Bir method'u olusturmak o method'u calistirmak icin yeterli degildir.
	// Olusturulan method main method icinden cagirilinca calisir
	
		
	}
	
}

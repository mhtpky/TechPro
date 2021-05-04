package day04_matematikselislemler_modulus;

public class C2_ModulusOperatoru {

	public static void main(String[] args) {
		//modulus operatoru bolme isleminde kalani verir
		
		//15 tek mi cift mi? 15/2 kalan=1 ise tektir
		//25 3 e bolunur mu? 25/3 kalan=1 kalan 0 olmadigi muddetce bolunmez diyecegiz.
		//herhangi bir sayinin 7 ile bolunebildigini kontrol etmek icin modulus islemi kullaniriz.
		
		
		int kalan = 15 % 4; 
		System.out.println(kalan); // 3
		
		System.out.println(26 % 8); // 2
		
		
		//856 sayisinin birler basamagi kactir ? =>6
		int sayi = 856;
		int birlerBasamagi = sayi % 10;
		System.out.println("Sayinin birler basamagi :" + birlerBasamagi);
		
		//856 sayisinin onlar basamagi kactir ? => 5
		//Bunun icin buldugum birler basamagindan kurtulmam gerekir
		//Birler basamagindan kurtulmak icin ise sayiyi 10 a boluyorum 
		
		
		sayi /= 10;
		System.out.println("on'a bolundukten sonra sayinin degeri : "+ sayi);
		
		int onlarBasamagi = sayi % 10;
		System.out.println("Onlar basamagi = " + onlarBasamagi);
		
		//856 sayisinin yuzler basamagini bulmak icin bir kez daha ayni islmei yapiyorm
		
		sayi /= 10;
		System.out.println("2.defa 10'a bolundukten sonra = " + sayi);
		
		int yuzlerBasamagi = sayi;
		System.out.println("Yuzler Basamagi = " + yuzlerBasamagi);
		
	}
}

package day31_varargsstringbuilder;

public class C7_StringBuilder02 {

	public static void main(String[] args) {
	
		// Eger bir SB'i uzunluk belirterek olusturduysak , 
		// o kapasitede bir alana olusturur ve o kapasiteyi doldurana kadar , 
		// oraya yazi yazmaya devam eder
		
        // Kapasiteden fazla yazi yazmak istedigimiz zaman 
		// orantisiz sekilde arttirmaya devam eder
		
		// mesela bu ornekte default capasity 16, 
		// 5 de biz ekledik/ ama 9 tanesini kullandik/ geriye 12 kaliyor
		
		StringBuilder sb = new StringBuilder(5);
		System.out.println(sb.length()); // 0
		System.out.println(sb.capacity()); // 5
		
		sb.append("Kemal");
		System.out.println(sb.length()); // 5
		System.out.println(sb.capacity());// 5
		
		sb.append(" Can");
		System.out.println(sb.length()); // 9
		System.out.println(sb.capacity()); // 12 

		// capacity hafiza yonetimi icin cok onemlidir
		// kod yazilirken sabit uzunluk veya max uzunluk belli ise 
		// 3. method ile olusturarak HAFIZA KULLANIMINI optimize edebiliriz
	}

}

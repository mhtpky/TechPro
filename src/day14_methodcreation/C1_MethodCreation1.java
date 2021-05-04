package day14_methodcreation;

public class C1_MethodCreation1 {

	public static void main(String[] args) {

		String str = "Javacok guzel";
		
		// 1) Java method'larin sadece ismini degil, isim + parametre'lere bakar.
		// Sadece parametre sayisi degil, parametrelerin data tiplerine de bakar
		
		str.endsWith("el"); // Bu method'un gorevi gidip kelimenin son kismini kontrol etmek
						    // Bu methodu kullanmak icin bu method'un kontrol ettikten sonra 
		                    // Bana rapor olarak ne getirdigini bilmem lazim (true/false)
		
		// 2) Bir method olusturdugumuzda method'un ne yapacagina
		// Ve gorevi gorevi yaptiktan sonra bana ne dondurecegine bastan karar vermeliyiz
		
		// 3) Bir method olusturulurken " str.indexOf(String str, int fromIndex) " de oldugu gibi 
		// Disaridan kabul edecegi parametreleri ve bu parametrelerin data tiplerini 
		// Deklare etmeliyiz (beyan etmeliyiz)
		
		// Method'u calistirmak istedigimizde (Method'u cagirmak) 
		// Parametre olarak declare edilen data tiplerine uygun degerler girmeliyiz
		// Girilen bu degerlere ARGUMENT denir.
		
		str.indexOf("va", 1); //str.indexOf(str, fromIndex)
		
		
		
		
		
	}

}

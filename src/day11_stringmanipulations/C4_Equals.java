package day11_stringmanipulations;

public class C4_Equals {
	public static void main(String[] args) {
		// str.equals(str2) >> str ve str2 yi karsilastirir ve String olarak esit olup olmadiklarina bakar
		// Sonuc olarak True veya False dondurur.
		
		// Bazi methodlarin yaptiklari islem ile dondurdukleri sonuc farkli olabilir
		// Bir methoda git ali ismindeki elementi sil deriz, 
		// O da gidip aliyi bulup siler
		
		String str = "Ali can";
		String str2 = "Ali Can";
		
		//str ile str2'nin esit olup olmadigini yazdiriniz
		// // esit veya esit degil yazdirin
		
		System.out.println(str.equals(str2)); // false 
		
		System.out.println(str.equals(str2) ? "Esit" : "Esit degil");
		
		// Java'da String'ler CASE SENSITIVE'dir(Buyuk kucuk harf duyarlidir)
		// Bir harf bile farkli olsa Stringler esit olmaz
	}
}

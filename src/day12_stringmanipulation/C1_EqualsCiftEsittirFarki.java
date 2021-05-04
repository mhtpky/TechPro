package day12_stringmanipulation;

public class C1_EqualsCiftEsittirFarki {

	public static void main(String[] args) {
		// 
		
		String str1 = "Ali Can";
		String str2 = str1+ ""; // Ali Can
		
		System.out.println(str1==str2);
		// == Stringlerin hem degerlerine hem de adreslerine bakar
		//Bu ornekte str1+"" yazdigimizda concatenation yapildigi icin 
		//Java yeni bir obje olusturur ve islemin sonucunu yeni obje'nin icine koyar
		//str1 ve str2 'yi == ile karsilastirirsak 
		//degerleri ayni fakat adresleri farkli oldugu icin false doner
		
		System.out.println(str1.equals(str2));
		// equals() methodu sadece String'lerin degerlerini karsilastirir
		// Bu ornekte str1 ile str2 nin degerlerini AYNI oldugu icin true dondurur.
		
		String str3 = "Ali Can";
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
		

	}

}

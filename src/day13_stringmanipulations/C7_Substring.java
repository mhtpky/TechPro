package day13_stringmanipulations;

public class C7_Substring {
	
	public static void main(String[] args) {
		
		String str = "Her ders Java gibi olsa";
		
		
		System.out.println(str.substring(10)); // 10.index dahil (inclusive) sonuna kadar tum String
		System.out.println(str.substring(str.length()-10)); // son 10 harfi yazdirin
		
		System.out.println(str.substring(0,10)); // substring (0,10) yazildiginda
												// 0 inclusixe , 10 exclusive
		
		// 11.ci karakterden sonuna kadar olan stringi yazdiralim
		System.out.println(str.substring(10));
		
		System.out.println();
		
		// str' nin ilk 10 karakteri * ile gizleyin, geriye kalanlar normal yazilsin 
		System.out.println("**********" + str.substring(10));
		
		//2.yontem
		System.out.println(str.substring(0,10).replaceAll("\\D","*") +
				str.substring(10));
		
		//3.yontem
		System.out.println(str.replace(str.substring(0, 10) , "**********"));
		
		//4.yontem
		String str3 = str.substring(0, 10); //str'nin ilk 10 harfini aldik
		str3 = str3.replaceAll("\\W", "a");
		System.out.println(str3.replaceAll("\\w", "*")+str.substring(10));
		
		
		
		
		
		System.out.println(str.substring(10 , 10)); // Baslangis index'i olur der,
													// Bitis index'i olmaz der
													// Java son soyleneni yapar
		
		//System.out.println(str.substring(8 , 7)); // RTE
		
		System.out.println(str.substring(22)); // length()-1 > son karakter a
	
		System.out.println(str.substring(23)); // length() > bos
		
		//System.out.println(str.substring(24)); // length()' den buyuk sayi yazarsak RTE


	}
}

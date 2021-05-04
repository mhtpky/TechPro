package day31_varargsstringbuilder;

public class C6_StringBuilder01 {

	public static void main(String[] args) {
		/*
        * StringBuilder mutable(degisebilir) String elde etmemize olanak tanir . 
        * Cunku String normalde Immutable(Degistirilemez)'di.
        * Boylece hafizada her seferinde yeni bir alan acilmadan 
        * var olan alan uzerinde degisiklik yapilabilir . Bu da SB sinifini hafiza
        * kullanimi olarak String sinifinin onune gecirir.
        * SB thread-safe degildir. Yani synchronized degildir. 
        * Thread'li bir ilsem kullanilacaksa SB kullanilmasi guvenli degildir.
        */

		StringBuilder sb1 = new StringBuilder(); // Java bos bir SB olusturur
		System.out.println("sb1 : "+sb1);
		
		StringBuilder sb2 = new StringBuilder("Mehtap"); 
		System.out.println("sb2 : "+sb2);
		
		StringBuilder sb3 = new StringBuilder(10); // 10 karakter kapasitesi oloan bir SB verir
		System.out.println("sb3 : "+sb3);
		
		sb1.append(" Kaya"); // mutable oldugu icin kullandigimz method sonucu SB'miz kalici olarak degisir
		System.out.println("sb1 append : " + sb1);
		
		sb2.append(" Kaya");
		System.out.println("sb2 append : " + sb2);
		
		sb3.append(" Kaya");
		System.out.println("sb3 append : " + sb3);
		
		
	}

}

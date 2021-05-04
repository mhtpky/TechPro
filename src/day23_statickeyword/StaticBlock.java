package day23_statickeyword;

public class StaticBlock { // INTERVIEW'DE SORULUR >static block nedir ne icin kullanilir

	static String isim;
	// Static block'lar static variable'lara deger atamak icin kullanilir (initialize)
	// Static block class calistirildiginda ilk once calisir (main method'dan bile once gelir)
	// Static block constructor'lardan,tum method'lardan ve main method'dan once calisir
	// Eger 1'den fazla static block varsa yukaridan asagiya sira ile calisir.Main methoddan sonra bile yazilsa once calisir.
	
	static { //kod blogu olusturmus olduk {} ile
		isim="Mehtap";
		System.out.println(isim);
	}
	
	public static void main(String[] args) {
		
		isim="Enis";
		System.out.println(isim);
	}

	static {
		System.out.println("2.static block calisti");
	}
}

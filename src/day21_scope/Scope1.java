package day21_scope;

public class Scope1 {
	
	static int okulId = 1201;
	static String okulAdi = "Yildiz Koleji";
	static boolean acikMi;
	
	
	// static variable'lar class level'da olusturuldugu icin class'in her yerinden kullanilabilirler
	// instance variable'lar static olmayan method'larda direkt kullanilabiliyorken;
	// static method'larda object olusturulurken kullanilabiliyordu
	// static variable'lar ise hem, static hem static olmayan method'larn direkt kullanilabilirler

	public static void main(String[] args) {
		
		System.out.println(okulId + " " + okulAdi + " " + acikMi); //1201 Yildiz Koleji false
		okulId = 1202;
		acikMi=true;
		
		staticMethod();
		
		System.out.println(okulId + " " + okulAdi + " " + acikMi); //1203 Yildiz Koleji true
	}
	
	
	public static void staticMethod() {
		
		System.out.println(okulId + " " + okulAdi + " " + acikMi); //1202 Yildiz Koleji true
		okulId=1203;
	
	}

	
	public void method() { //main methoddan cagirilmadigi icin bu class calistirildiginda bu method CALISMAZ
		okulId= 1205;
	}
	
	
}

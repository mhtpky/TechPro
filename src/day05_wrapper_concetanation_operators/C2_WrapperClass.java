package day05_wrapper_concetanation_operators;

public class C2_WrapperClass {

	public static void main(String[] args) {
		//Javada 2 tur data tipi vardir
		//1.Primitive(sadece value icerir)
		//2.Non-primitive(value ve method icerir)
		
		
		String isim = "mehtap";
		System.out.println(isim.toUpperCase()); //stringe(nonpri) bir method atamis olduk(toUpperCase)
		
		//WRAPPER CLASS : Java'nin primitive data turleri ile bazi methodlari
		//				kullanabilmemiz icin olusturdugu Classlardir.
		
		// boolean, char, byte, short,int, long, float, double
		
		// byte sayi = 10;
		Byte sayi2 = 11; // Ismen primitive data turu ile ayni olan non-primitive datalara WRAPPER denir
		
		System.out.println(sayi2);
		
		Byte byteMinSayi = Byte.MIN_VALUE;
		System.out.println(byteMinSayi);
		
		Byte byteMaxSayi = Byte.MAX_VALUE;
		System.out.println(byteMaxSayi);
		
		//variable olusturmadan direkt olarak shortun en kucuk ve en buyuk degerlerini yazdiralim
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		//Integer veri tipinin Wrapper Class'i Integer'dir
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		//Boolean, Character, Byte, Short, Integer, Long, Float, Double
		
		
	}

}

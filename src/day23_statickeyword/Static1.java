package day23_statickeyword;

public class Static1 {
	// static variable'lar olusturulan tum objeler icin gecerlidir(okul adi gibi)
	// Mesela bir class'da 1 instance, 1 de static variable olsun

	static String isim = "Mehtap"; // static(okul adi)
	int yas = 31; // instance(ogretmen adi)
	
	// static class'a bagli
	// instance ise objeye baglidir
	// st2.isim= erdem yaptigimizda static oldugu icin tum classda artik isim erdem olur(30.satir)
	// yasi 5 yapsakda st1 yas=4 ve objeye bagimli oldugu icin 4 olarak devam eder (31.sati)
	

	public static void main(String[] args) {
		
		Static1 st1 = new Static1();
		Static1 st2 = new Static1();
		Static1 st3 = new Static1();
		
		st1.isim = "Enis";
		st1.yas = 4;
		System.out.println(st1.isim + " " + st1.yas); //Enis 4
		
		
		st2.isim = "Erdem";
		st2.yas = 5;
		System.out.println(st2.isim + " " + st2.yas); //Erdem 5
		System.out.println(st1.isim + " " + st1.yas); //Erdem 4


		st3.isim = "Omer";
		st3.yas = 32;
		System.out.println(st3.isim + " " + st3.yas); //Omer 32
		System.out.println(st2.isim + " " + st2.yas); //Omer 5
		System.out.println(st1.isim + " " + st1.yas); //Omer 4
		
		
		
		
		
	}

}

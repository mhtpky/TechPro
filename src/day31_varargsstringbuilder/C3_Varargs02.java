package day31_varargsstringbuilder;

public class C3_Varargs02 {

	public static void main(String[] args) {
		// Istedigimiz kadar sayi girdigimizde tum sayilari toplayan bir method yazalim
		// Var > variety(cesitlilik) , args>arguments
		
		toplam (2,5);
		toplam (5,10,15);
		toplam (4,5,9,7);
		toplam (5,6,8,10,45,78,-12);

	}

	public static void toplam(int... var) { // data turunden sonra yazdigimiz 3 nokta(...) varargs kullanacagimiz anlamina gelyor.
										  // var > varargs'a verdigimiz isimdir. degistirilebilir
		int toplam=0;
		for (int j : var) { // var'a git her bir inti bana getir
			toplam+=j;
		}
		System.out.println("toplam = " + toplam);
		
	}

}

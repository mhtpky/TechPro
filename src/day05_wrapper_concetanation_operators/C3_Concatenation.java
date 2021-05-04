package day05_wrapper_concetanation_operators;

public class C3_Concatenation {

	public static void main(String[] args) {
		// Concatenation (Birlestirme): Java'da birden fazla String'i 
		// + isareti ile toplarsaniz, Java bu stringleri yanyana yazar
		
		String str1 = "Java";
		String str2 = "Guzeldir";
		
		System.out.println(str1+str2); //JavaGuzeldir
		//eger arada bosluk birakmak istersek 
		System.out.println(str1+" "+str2); //Java Guzeldir

		
		//GuzeldirJava
		System.out.println(str2+str1);
		
		int sayi1=5;
		int sayi2=4;
		//verilen degiskenleri kullanarak consolda 9 yazdirin
		System.out.println(sayi1+sayi2);
		
		System.out.println(sayi1 + sayi2 + str1 + str2); //9JavaGuzeldir
		System.out.println(str1 + str2 + sayi1 + sayi2); //JavaGuzeldir54
		
		//JavaGuzeldir1 yazdiralim
		System.out.println(str1+str2+(sayi1-sayi2));
		
		//verilen degiskenlerle "9 Java Guzeldir"
		System.out.println(sayi1+sayi2+' '+str1+str2); //41JavaGuzeldir 
		//eger matematiksel bir islemde char kullanirsanz 
		//Java char karakterinin ASCII degerini isleme katar
		
		System.out.println((sayi1+sayi2)+" "+str1+str2);
		
		System.out.println(sayi1+sayi2+str1+' ' +str2);//9Java Guzeldir
		
		System.out.println(str1+str2+sayi1*sayi2);  //JavaGuzeldir20
		
		// SON TEKRAR
		/* KURAL1 = Eger toplanan degerlerden bir tanesi bile String ise Java toplama degil
		*	 		Concantenation(birlestirme)
		* KURAL2 = Eger toplanan degerlerin ikisi de matematiksel islemse Java toplar
		* KURAL3 = Eger sayi ve String degiskenler birlikte kullanilacaksa oncelikler
		* 			belirlenip o islemler icin parantez kullanilabilir
		* KURAL4 = Matematiksel bir islemde char degisken kullanilirsa, Java char'in ASCII 
		* 			degerini isleme alir
		* KURAL5 = Char bir degisken ile String bir degisken toplanirsa
		* 			Concatenation olur */
		
	}

}

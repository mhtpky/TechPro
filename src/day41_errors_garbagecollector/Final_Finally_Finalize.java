package day41_errors_garbagecollector;

/*
INTERVIEW QUESTION: "final", "finally " ve "finalize " nedir?
- Final keyword, finally kod blogu, finalize ise method’dur.

- Finally kod blogu try veya try-catch bloklari ile kullanilir. Try-catch’in sonucu ne
olursa olsun calisir. Genellikle database veya cloud ile connection’in
sonlandirilmasi, calisilan file’in kapanmasi gibi islemler yapar.

- Finalize garbage collector kullanilmayan objeleri destroy etmeden once kullanilir

- Final variable -> Degeri degistirilmeyecek (constact) variable'lar icin kullanilir,
 mutlaka deger atanmalidir, isimleri buyuk harfle yazilir (optional)
 
 - Final Methods -> Override edilemeyecek method
 
 - Final Classes -> Inherit edilemeyecek class

*/
public class Final_Finally_Finalize {

	final static int SAYI2 = 20; // final ve static oldugunda ismi byk harfle yazilir
	
	public static void main(String[] args) {

		final int sayi =10;
		
		// sayi+=2; >> final olarak tanimlanan variable'a yeni deger atanamaz
	}

}

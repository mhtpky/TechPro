package day31_varargsstringbuilder;

public class C4_Varargs03 {

	public static void main(String[] args) {
		// verilen integer'lardan ilki haric tum sayilari toplayin ve 
		// buldugunuz toplam ile ilk sayiyi carpip sonucu yazdirin
		
		toplam (2,5);
		toplam (5,10,15);
		toplam (4,5,9,7);
		toplam (5,6,8,10,45,78,-12);
	}

	public static void toplam(int sayi, int... var) { 
		
		System.out.println("varargs'a dahil olmayan argument = "+ sayi );
		
		int toplam =0;
		for (int each : var) {
			toplam+=each;
		}
		
		System.out.println(sayi*toplam);
				
		/* 
	     * - Varargs tek method’a istediðimiz kadar parametre yollayarak sonuç almamizi saðlar. Yani parametre sayýmiz deðiþken ancak method’un 
	     * yapacaðý iþ sabitse Varargs kullanarak tek method’la kodumuzu yazabiliriz.
	     * - Varargs ozellik olarak list gibi calisir (uzunlugu esnektir) fakat varargs’in arka planinda Java Array ile calisir.(List olarak degil)
         * - Varargs’i declare etmek icin data type’dan sonra ... kullaniriz. (int... sayi vb..)
         * - Bir method’da varargs disinda parametre varsa varargs parametre olarak en sona yazilmalidir.(aksidurumda varargs nerede duracagini bilemez)
         * - Bir method’da sadece 1 varargs kullanilabilir
         */
	}

}

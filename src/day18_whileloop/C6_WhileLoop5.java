package day18_whileloop;

public class C6_WhileLoop5 {

	public static void main(String[] args) {
		// Verilen sayinin asal olup olmadigini bulan bir program yaziniz
		// Asal sayi : 1 ve kendisinden baska boleni olmayan sayilardir
		
		int sayi= 11;
		String flag= "Asal"; // bizim istedigimiz sartin gerceklesip gerceklesmedigini kontrol eder/ var ya da yok 
		int bolen = 2;
		
		while (bolen<sayi) {
			if(sayi%bolen==0) {
				flag = "Asal sayi degildir" ;
			}
			bolen ++;
		}
		System.out.println(flag);
	}

}

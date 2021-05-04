package day19_dowhileloop;

import java.util.Scanner;

public class S2 {

	public static void main(String[] args) {
		// Kullanicidan bir cumle alin
		// While loop kullanarak Cumlede buyuk harf var mi yok mu yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle = scan.nextLine();

		String flag = "Buyuk harf yok";
		int index = 0;

		while (index < cumle.length()) {
			if (cumle.charAt(index) >= 'A' && cumle.charAt(index) <= 'Z') {
				flag = "Buyuk harf var";
			}
			index++;
		}
		System.out.println(flag);
	}

}

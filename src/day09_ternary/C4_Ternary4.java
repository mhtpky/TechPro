package day09_ternary;

import java.util.Scanner;

public class C4_Ternary4 {

	public static void main(String[] args) {
		// Soru2) Kullanicidan bir sayi aliniz
		// sayinin tek veya cift oldugunu yzdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz");
		int x = scan.nextInt();
		
		String y = (x%2==0 ? "cift sayi" : "tek sayi");
		System.out.println(y);

		
		//girilen sayinin mutlak degerini yazdiriniz
		System.out.println("|x|= " +(x>0 ?  x :  -x));
		
		
		scan.close();

	}

}

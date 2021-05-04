package day12_stringmanipulation;

import java.util.Scanner;

public class C5_LastIndexOf {

	public static void main(String[] args) {
		// Kullanicidan bir cumle alin
		// Asagida ki 3 durumdan uygun olani yazdirin
		// 1- Cumle Java icermiyor
		// 2- Cumle 1 tane java iceriyor
		// 3- Cumlede birden fazla java var

		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir cumle yaziniz");
		String cumle =  scan.nextLine().toLowerCase();
		
		int ilkJava = cumle.indexOf("java"); // ya -1 ya da ilk java'nin index'ini verir
		int sonJava = cumle.lastIndexOf("java"); //ya -1 ya da son java'nin index'ini verir
				
		if (ilkJava == -1) {
			System.out.println("Cumle java icermiyor");
		} else if (ilkJava == sonJava) {
			System.out.println("Cumle 1 tane java iceriyor");
		} else {
			System.out.println("Cumlede birden fazla java var");
		}
		scan.close();
	}

}

package day19_dowhileloop;

import java.util.Scanner;

public class C1_Count {

	public static void main(String[] args) {
		// Kullanicidan bir cumle ve bir harf isteyiniz
		// While Loop kullanarak cumlede istenen harf kac kez kullanilmis bulunuz
		// Program Case Sensitive olsun
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen bir cumle giriniz ");
		String cumle= scan.nextLine();
		
		System.out.println("Lutfen saymak istediginiz harfi giriniz");
		String harf= scan.next().substring(0,1); // String olarak ilk harfi alin 

		int count = 0;
		int index = 0;
		while (index <= cumle.length()-1) {
			if(cumle.substring(index, index+1).equals(harf)) {
				count++;
			}
			index++;
		}
		System.out.println("Cumlede " + harf + " harfi " + count + " defa kullanilmis");
		scan.close();
	}

}

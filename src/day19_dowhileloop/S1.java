package day19_dowhileloop;

import java.util.Scanner;

public class S1 {

	public static void main(String[] args) {
		// Kullanicidan bir cumle ve bir harf isteyiniz
		// While Loop kullanarak cumlede istenen harf kac kez kullanilmis bulunuz
		// Program Case Sensitive olsun
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle = scan.nextLine();
		System.out.println("Lutfen bir harf giriniz");
		String harf = scan.next();
		
		int count=0;
		int index=0;
		
		while(index < cumle.length()) {
			if(cumle.substring(index,index+1).equals(harf)) {
				count++;
			}index++;
		}System.out.println("Girdiginiz cumlede "+ harf + " harfi "+  count +" tane vardir");
		scan.close();
	}

}

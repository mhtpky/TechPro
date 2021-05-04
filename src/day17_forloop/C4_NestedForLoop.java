package day17_forloop;

import java.util.Scanner;

public class C4_NestedForLoop {

	public static void main(String[] args) {
		/* Kullanicidan pozitif bir rakam girmesini isteyin ve
		 * girilen rakama gore asagida ki sekli cizdirin
		    
		    *
		    * *
		    * * * 
		    * * * *
		 
		 */
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir rakam giriniz");
		int rakam = scan.nextInt();
				
		
		for(int i = 1 ; i <= rakam ; i++) {
			System.out.println("");
			for(int j= 0 ; j < i ; j++) {
				System.out.print("* ");
			}
		}
scan.close();
	}

}

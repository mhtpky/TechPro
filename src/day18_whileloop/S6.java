package day18_whileloop;

import java.util.Scanner;

public class S6 {

	public static void main(String[] args) {
		// Verilen sayinin asal olup olmadigini bulan bir program yaziniz
		// Asal sayi : 1 ve kendisinden baska boleni olmayan sayilardir

		
		 
		  int sayi = 23;
		  int bolen =2;
		  String flag= "Sayi asaldir";
		  
		  while(bolen<sayi) {
			  if(sayi%bolen==0) {
				  flag = "Asal sayi degildir" ;
			  }bolen++;
			  
		  }System.out.println(flag);
		
		 
		 

	}

}

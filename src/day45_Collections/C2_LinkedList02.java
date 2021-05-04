package day45_Collections;

import java.util.LinkedList;

public class C2_LinkedList02 {

	public static void main(String[] args) {
		
		LinkedList<Object> ll1 = new LinkedList<>();
		// Collections'da esitigin sol tarafinda <> icinde data turu yazilmasa
		// veya Data turu olarak object yazilsa Collections calisir
		// Ama boyle bir kullnimda surekli casting yapildigi icin 
		// zaman ve hafiza acisindan verimli degildir
		
		System.out.println(System.currentTimeMillis()); // obj olusturmaya gerek kalmadan sistemden milisaniyeyi aliyor
		for(int i = 0 ; i <10000; i++) {
			ll1.add("A"+i); // concatination
			ll1.add(20+i); // toplama
			ll1.add('C'+i);// ASCII degerleri ile islem yapacak
			//System.out.println(ll1); // [A, 20, C]
		}
		System.out.println(System.currentTimeMillis()); 
		
		System.out.println("===========");
		
		LinkedList ll2 = new LinkedList();
		System.out.println(System.currentTimeMillis()); 
		for(int i = 0 ; i <10000 ; i++) {
		ll2.add("B"+i);
		ll2.add(25+i);
		ll2.add('K'+i);
		//System.out.println(ll2); // [B, 25, K]
		}
		System.out.println(System.currentTimeMillis()); 

		System.out.println("===========");
		
		LinkedList<Integer> ll3 = new LinkedList<>();
		System.out.println(System.currentTimeMillis()); 
		for(int i = 0 ; i <10000 ; i++) {
		ll3.add(10+i);
		ll3.add(20+i);
		ll3.add(30+i);
		//System.out.println(ll3); // [D, 25, Z]
	}
		System.out.println(System.currentTimeMillis()); 

		//En hizlisi ll3 dur. Cunku hic casting yapmiyor
	}

}

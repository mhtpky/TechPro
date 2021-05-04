package day32_stringbuilder;

import java.time.LocalTime;

public class C2_StringBuilder02 {

	public static void main(String[] args) {
		// 10000 kere donecek bir loop yazalim
		// Loop'da String ve StringBuilder kullanip
		// Oncesinde ve sonrasinda zaman alalim 
		// Hizlarini karsilastiralim 
	/*	StringBuilder sb6 = new StringBuilder(5 + 7 + "Java" + 4 + 5);

		String isim="Mesut";

		sb6.append(isim, 2, 4);

		sb6.delete(4, 6);

		System.out.println(sb6); */
		
		
		String str ="";
		StringBuilder sb=new StringBuilder("");
		
		LocalTime lt1= LocalTime.now();
		System.out.println(lt1);

		for(int i = 0; i <10000; i++) {
			str+=i;
		}
		LocalTime lt2= LocalTime.now();
		System.out.println(lt2);
		
		
		
		LocalTime lt3= LocalTime.now();
		System.out.println(lt3);

		for(int i = 0; i <10000; i++) {
			sb.append(i);
		}
		LocalTime lt4= LocalTime.now();
		System.out.println(lt4);
		
		// String StringBuilder'a gore cok daha yavas calisir
	}

}

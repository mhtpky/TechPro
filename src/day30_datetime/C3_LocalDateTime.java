package day30_datetime;

import java.time.LocalDateTime;

public class C3_LocalDateTime {

	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt); // 2021-03-19T22:06:05.155256400
		
		System.out.println(ldt.toString()); // 2021-03-19T22:06:05.155256400
											// String methodlari ile islem yapmak istersek stringe cevirebilmek icin kullanilir
		String time = ldt.toString(); // Bu satirdan sonra artik string manipulation yapabilirim
		
		System.out.println(time.startsWith("2021")); // true
	}
}

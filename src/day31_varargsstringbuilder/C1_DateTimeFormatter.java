package day31_varargsstringbuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C1_DateTimeFormatter {

	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now(); // 2021-03-20T16:14:12.467578900
		System.out.println(ldt);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy/MMMM/dd hh:mm");
		/*
		 yy : yilin son 2 rakamini 
		 yyy : yilin tamamini verir
		 M : Ay sirasini verir (mart icin > 3)
		 MM : Ay sirasini verir(mart icin > 03)
		 MMM : Ay isminin ilk 3 harfini verir (Bilgisayarinizin diline gore)
		 MMMM: Ay isminin tamamini verir (Bilgisayarinizin diline gore)
		 HH:mm > 24 saatlik sisteme gore
		 hh:mm > 12 saatlik sisteme gore 
		 
		 */
		System.out.println(dtf.format(ldt)); // 21/Mart/20 04:14
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MMM/dd ");
		System.out.println(dtf2.format(ldt)); // 21/Mar/20 
		
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("HH:mm");
		System.out.println(dtf3.format(ldt)); // 16:22 >> 24 saatlik sisteme gore
		
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("hh:mm ");
		System.out.println(dtf4.format(ldt)); // 04:22 >> 12 saatlik PM AM sisteme gore
		
		
		LocalDate dogumTarihi = LocalDate.of(1990, 9, 26);
		LocalDate bugun = LocalDate.now();
		
		Period benimYasim = Period.between(bugun, dogumTarihi);
		System.out.println(benimYasim); // P-30Y-5M-24D
		
		int yas = Period.between(bugun, dogumTarihi).getYears();
		System.out.println(yas); // -30
	}

}

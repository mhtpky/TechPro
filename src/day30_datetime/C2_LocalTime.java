package day30_datetime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C2_LocalTime {
	
	public static void main(String[] args) {
        // Java'da saat ile islem yapmak icin
        // LOcalTime Class'indan bir obje kullaniriz
		
		LocalTime saat = LocalTime.now();
		System.out.println(saat);

		for (int i = 0; i < 1000000; i++) {
			i+=1;
		}
	
		LocalTime saat2 = LocalTime.now();
		System.out.println(saat2);
		System.out.println(saat);
		
		System.out.println(saat.plusHours(15));
		
		System.out.println(saat.getSecond()); // 31
		System.out.println(saat.minusSeconds(156454)); // 156454 saniye once saat >> 02:28:36.824554500
		
		System.out.println(saat.now(ZoneId.of("Japan")));
		System.out.println(saat.now(ZoneId.of("Turkey")));

	}
}

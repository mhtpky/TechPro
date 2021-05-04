package day41_errors_garbagecollector;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollector{
/*
	* Garbage Collector : Garbage Collecto heap alaninda calisan ve 
	* heap alaninda new operatoru vb. methodlarla olusturulan ve referansi olmayan
    * nesneleri heap alanindan temizleyen mekanizmanin adidir. 
    * Garbage Collector islimini 3 adimda tamamlar.
    * 1) Isaretle : Kullanilan ve kullanilmayan nesneler isaretlenir.
    * 2) Silme : Referans olmayan nesneleri heap alanindan temizler.
    * 3) Sıkıştırma ve Silme : Silme islemine ek olarak daha buyuk 
    * nesnelere bos alan olusturmak icin kalan nesneleri bir araya getirir.
    *
	*/
	
	public static void main(String[] args) {
		String str = "";
		for (int i = 0; i < 1000; i++) {
			str += i;
			
			// Bu kod calistiginda kac tane obje olusur? >> 1001
			// Ilk basta 1 tane olusturduk > String str = "";
			// Sonra her dongude str'a concatination yapilacak
			// ama String class'i immutable oldugu icin her yeni degeri koymak icin 
			// yeni bir String objesi olusturulur ve eski objeden pointer silinir
			
			// Dolayisiyla loop bittiginde str icin 1 tane pointer'in isaret ettigi obje,
			// 1000 tane de hicbir pointer'in isaret etmedigi obje heap memoryde bulunur
			
			List<Integer> list = new ArrayList<>();
			// Bu satir Java'ya yeni bir obje olusturmasini soyluyor
			// Java yeni obje icin yer var mi diye heap memoryi kontrol eder ve 
			// memory kritik seviyedeyse GARBAGE COLLECTOR'u devreye sokar
			
			// GARBAGE COLLECTOR finalize() methodunu calistirir
			// finalize methodu silinecek objeleri isaretler ve
			// sonra Garbage collector finalized olan objeleri siler.
			
			/*Garbage Collector surekli memory’i kontrol eder. Silinmesi gereken herhangi bir data varsa
			  memory’i temiz tutmak icin o data’yi siler. Ama data’yi silmeden once “finalize” eder.
			  finalize etmek icin finalize() method’unu kullanir. Bu method’un ne zaman calisacagina Java karar verir.
			  Siz kod yazarken isterseniz finalize() methodunu cagirabilirsiniz ama siz cagirsaniz da
			  ne zaman calisacagina Java karar verir.*/
		}
	}
}

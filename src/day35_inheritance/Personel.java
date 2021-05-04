package day35_inheritance;

public class Personel {

		public String isim;
		public int sayi;
		
		public Personel() { // parametresiz bir constructor olusturdum >> source > generate constructor using fields
			// super();
		
			/* Javadan yardim alaral bir constructor olusturdugumuzda,
			 * Java constructor'un ilk satirina super(); keyword'unu ekler
			 * Eger icinde oldugumuz class bir child class degilse super(); keywordu silinebilir
			 * Bugune kadar olusturdugumuz constlarda super(); keywordunu kullanmadik
			   ancak bizim classlarimiz child class olmadigindan sorun olmadi 
			 */
			System.out.println("Personel parametresiz const calisti");
		
		
		}

		public Personel(String isim, int sayi) { //parametreli bir constructor olusturdum >> source > generate constructor using fields
			// super();
			System.out.println("Personel parametreli const calisti");

		}
		
		

		/* Her class default constructor'a sahiptir
		 * Default constructor'un parametresi yoktur
		 * Biz parametreli veya parametresiz bir cons olusturdugumuzda default const silinir
		 * Eger biz sadece 1 tane parametreli cons olusturursak 
		   Java default olani sildigi icin parametresiz constructor kalmaz
		 * Dolayisiyla parametreli bir cons olusturdugumuzda mutlaka 
		   default yerine de 1 parametresiz cons olusturmaliyiz
		   
		 */
	}



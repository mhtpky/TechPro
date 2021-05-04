package day23_statickeyword;

public class _GenelTekrar {
	/* CONSTRUCTOR : Java' da object uretmek icin kullnilir
	 * Tanimlamalarda ozel bir method diye gecse de 
	 * yapisi method'a benzemekle beraber methoddan farklidir
	 * 
	 * METHOD ile CONSTRUCTOR FARKI
	 * 1) Method'lar kucuk harfle baslarken constructor Class ismi ile baslar yani buyuk harfle
	 * 2) Constructor'larin return type'i yoktur
	 * 
	 * OLUSTURULMASI
	 * Class ismi ve (parametreler) {Body} seklindedir
	 * >>Parametre olmasi istege baglidir
	 * >>Body icinde hic birsey olmasa da constructor olabilir
	 * >>Access Modifier(public) yazilmalidir. 
	 * Eger biz yazmazsak access modifier default olarak tanimlanir(Package icinden ulasilabilir)
	 * default olursa > package / Protected olursa > package ve child classlar/ public> herkes
	 * >>Constructor ismi class ismi ile ayni olmak zorunda oldugu icin birden fazla constructor 
	 * olusturmak icin overloading yapmaliyiz(isim ayni signature farkli) 
	 * 
	 * Java'da bir class olusturuldugunda Java o class'dan obje uretebilmemiz icin 
	 * gorunmeyen fakat class'in arka planinda calisan bir constructor olusturur.
	 * Bu constructora DEFAULT CONSTRUCTOR denir ve parametresi yoktur.
	 * Biz parametreli veya parametresiz herhangi bir constructor olusturdugumuzda 
	 * Java default olani yokeder. Bu durumda programimizi sorunsuz calismasi icin 
	 * Default constructor yerine parametresiz bir constructor olusturmamiz gerekir
	 * 
	 * Parametresiz bir constructor ile object uretirsek objenin degerleri 
	 * instance veya static olarak olusturulan variable'larin ilk degerlerine esit olur
	 * Eger biz objenin degerlerini degistirmek istersek tum variable'lar icin deger atamsi yapmaliyim
	 * 
	 * Object uretirken degerleri de kendimiz vermek istersek parametreli constructor kullanmam gerekir.
	 * Parametreli constructor objeye bizim verdigimiz argumentleri atamak icin yeterli degildir.
	 * Argumentleri objeye atayabilmek icin constructor body'si icinde 
	 * 		this.instanceVarIsmi = parametreIsmi ;  seklinde deger atamasi yapmak gerekir
	 * 
	 * NOT : this ile deger atamasi yapilmayan parametler icin hicbir islem yapilamaz
	 * 
	 */
	
	String name;
	int age;
	String phone;
	
	_GenelTekrar () {
		
	}
	
	_GenelTekrar (String name, int age, String phone) {
		this.phone= phone;
		this.name= name;
	}
	
	public static void main (String[] args) {
		_GenelTekrar obj1 = new _GenelTekrar();
		_GenelTekrar obj2 = new _GenelTekrar("John",25,"029-998877");
		
		System.out.println(obj2.name + " , " + obj2.age + " , "+ obj2.phone);
	}
	
	
	
}

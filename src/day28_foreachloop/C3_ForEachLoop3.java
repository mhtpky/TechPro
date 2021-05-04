package day28_foreachloop;

import java.util.ArrayList;
import java.util.List;

public class C3_ForEachLoop3 {

	public static void main(String[] args) {  // 1
		// Verilen bir array'de ki tumelemanlari bir lsteye aktaran bir method yaziniz
		
		String arr[] = {"Ali" ,"Veli", "Ayse", "Fatma"}; // 2
		
		List<String> list = listeyeCevir(arr); // 3 // 8  // ismi list olan string bir liste olusturacagim
											              // method call > methoda array gonderecegiz o yuzden argument olarak arr yazmaliyiz
		
		list.add(0, "Bu is bu kadar"); // 9
		System.out.println(list); // 10  [Bu is bu kadar, Ali, Veli, Ayse, Fatma]
		
		list.remove(1); // Ali'yi siler // 11
		System.out.println(list);// 12 [Bu is bu kadar, Veli, Ayse, Fatma]

	}
	
	public static List<String> listeyeCevir(String[] arr) {// 4 // static yapmamizin sebebi mainden cagirabilmek icin
															    // List<String>  return type > bu method stringlerden olusan bir liste döndürecek demektir
															    // listeyeCevir method ismi
															    // (String[] arr) parametre > array aldigini burdan anliyoruz
		List<String> geciciList = new ArrayList<>();// 5 // olusturdugumuz listler local oldugu icin her methoda ozgu olusturmamiz gerekir
														 // bu methodda ki gecici listemizi olusturmus olduk	
		
		for (String each : arr) { // 6 // array'de ki her bir stringi almak icin for each yaptik ve listeye ekledik
			
			geciciList.add(each);
		}
		
		
		return geciciList; // 7 
	}

}

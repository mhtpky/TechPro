package day13_stringmanipulations;

public class C4_IsEmpty {

	public static void main(String[] args) {
		// 

		String str = "Her gun Java olsun ";

		System.out.println(str.isEmpty()); //false
		
		String str2 = "";
		System.out.println(str2.isEmpty()); //true
		
		
		String str3=null; // NULL BIR DEGER DEGILDIR
						  // sadece str3'un  hic bir seye esit olmadigini gosteren POINTER'dir
		System.out.println(str3.isEmpty()); //RTE -> str null'a esit olablr ama string methodlari ile yazilinca RTE verir
	
	

	}

}

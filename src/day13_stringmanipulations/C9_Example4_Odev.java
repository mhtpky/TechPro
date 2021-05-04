package day13_stringmanipulations;

public class C9_Example4_Odev {

	public static void main(String[] args) {
		/* Soru
		1 String methodlarini kullanarak Java ogrenmek 123 Cok guzel@ i “Java
		ogrenmek cok guzel sekline getirin
		*/
		
		String str = "Java ogrenmek 123 Cok guzel@";
		
		String str2= str.replaceAll("D", "");
		System.out.println(str2);
				
	}

}

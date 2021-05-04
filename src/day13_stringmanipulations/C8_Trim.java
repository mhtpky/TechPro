package day13_stringmanipulations;

public class C8_Trim {

	public static void main(String[] args) {
		// trim >> Kesmek demektir String'in basinda ve sonunda var olan bosluklari temizler
		
		String str = " Java ogrenmek cok guzel.   ";
		
		System.out.println(str); //   Java ogrenmek cok guzel.
		System.out.println(str.length()); //28
		System.out.println(str.trim());//Java ogrenmek cok guzel.
		System.out.println(str.trim().length()); //24
	}

}

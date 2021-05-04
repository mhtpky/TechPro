package day13_stringmanipulations;

public class C3_StartsWith {

	public static void main(String[] args) {
		// Parametre String olmalidir
		// Parametre kelime olmalidir
		// Belirli karakterden sonrasi olabilir
		
		String str = "Her gun Java olsun ";
		
		System.out.println(str.startsWith("H")); //true
		System.out.println(str.startsWith("Her")); //true
		System.out.println(str.startsWith("g",4)); //true
		System.out.println(str.startsWith("Java",7)); // false
		
		

	}

}

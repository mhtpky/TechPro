package day10_switchcase;

public class C7_StringManipulation1 {

	public static void main(String[] args) {
		// StringManipulation >> Stringi degistirme donusturme demektir
		// String non-primitive data turundendir
		// Non= primitive data tipleri value ile birlikte methodlara sahiptirler
		// Methodlari kullanarak stringi degistirmeye StringManipulation  denir

		String str = "Hello World";
		System.out.println(str.toUpperCase()); //HELLO WORLD
		
		System.out.println(str); //Hello World >> ust satirda atama yapilmadigi icin burada ilk halini yazdirir
		
		String str2 = str.toUpperCase();
		System.out.println(str); //Hello World
		System.out.println(str2);//HELLO WORLD
		
	
		
	}

}

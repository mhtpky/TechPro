package day29_passbyvalueimmutable;

public class C7_Immutable04 {

	public static void main(String[] args) {

		// SLAYT ORNEK
		 
		String a = "";
        a+=2; // 2
        a+='c'; // 2c
        a+=false; // 2cfalse
        
        if (a=="2cfalse") {  // >> false verir
            System.out.println("==");  
        }
        if (a.equals("2cfalse")) { // >> true verir o yuzden ekranda equals yazdirir.
            System.out.println("equals");
        }
        
        // Burada atama oldugu icin her bir atamada yeni obje olusturur.
	}

}

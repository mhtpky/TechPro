package day05_wrapper_concetanation_operators;

public class C5_ConditionalOperators {

	public static void main(String[] args) {
		// AND &&, OR ||
		// && operatoru mukemmelliyetcidir hepsi yalnizca dogru ise TRUE yazdirir
		// || operatoru optimisttir. Verilen karsilastirmalardn biri bile dogru ise TRUE yazdirir
		
		
		boolean isTrue = 5>4 && 7-3 > 0 ;  // && ile baglanan ifadelerin hepsi true ise sonuc TRUE dur
		     								// bir tanesi bile false ise sonuc FALSE olur
		System.out.println(isTrue);
		
		
		int x = 10 ;
		int y = 5 ;
		
		System.out.println(x/y==2 && x*y>20 && x-y>0); // true
		
		System.out.println(x+y<0 && x-y>0 ); // false
		

		System.out.println(x<y || x+y<0 || x*y>0); // true
		
	}

}

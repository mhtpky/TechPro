package day03_scanner_increment_decrement;
public class C7_PreIncrementPostIncrement {
    public static void main(String[] args) {
    	
    	// Sadece ++ ya da -- seklinde yapilan islem icin gecerlidir.
    	// 1 artirma ya da  1 eksiltme islemlerinde uygulanabilir.
    	
    	//--num => once eksiltme islemini yapar sonra icinde bulundugu islemi yazdirir.(statement)
    	//num-- => once once yazdirir sonra islemi yapar.
        
        int num = 20 ;
        
        num++; // num=21
        System.out.println(num); // 21
        
        System.out.println(num++); // 21 once yazdiriyor sonra artiriyor
        
        System.out.println(num); // 22
        
        
        System.out.println(++num); // 23
        
        System.out.println(num); // 23
        
        
    }
}

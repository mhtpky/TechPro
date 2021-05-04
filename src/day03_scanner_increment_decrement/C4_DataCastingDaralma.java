package day03_scanner_increment_decrement;
public class C4_DataCastingDaralma {
    public static void main(String[] args) {
        // double bir degisken olusturalim ve bunu int ve sonra da byte'a cevirin
        // Bu isleme Explicit Narrowing denir.
    	
        double numDouble=129.56;
        
        int numInt = (int) numDouble;
        // double'dan integer'a gecerken eger sayida ondalikli bolum varsa
        // Java ondalikli bolumu siler (yok sayar)
        
        System.out.println("integer degisken degeri : " + numInt);
        
        byte numByte= (byte) numInt;
        // daha dar (narrow) bir data tipine cevirirken eger data tipinin sinirindan buyukse saymaya 
        // negatif en kucuk sayidan devam eder, istenen sayiya gelinceye kadar 
        // tekrar tekrar en kucuk negatif sayiya gider
        // burada int -128 ile 127 arasindadir 0dan 127 ye geldkten sonra geriye 2 basamak daha saymak gerekir
        // 127 den -128 e geri doner saymaya devam ederiz 0 a kadar. 
        
        System.out.println("byte degisken degeri : " + numByte);
    }
}

package day23_statickeyword;

public class MyConstructor {
	/* CONSTRUCTOR CALLBir constructor'un icinden baska bir constructor'i cagirmak icin this(); kullanilir
	 * KURAL1 > This() icinde oldugu constructor'in ilk satirinda yazilmalidir
	 * KURAL2 > 1. kuraldan dolayi bir constructor icine sadece bir tane this(); yazilabilir */
	    
	    int x =3;
	    int y =5;
	    
	    MyConstructor () {
	        x+=1; // 4
	        System.out.println("-x"+x);  // 5 > -x4
	    }
	    
	    MyConstructor (int i) {
	        this(); // 3 > Parametresiz const cagiriliyor
	        
	        this.y=i; // 6
	        x+=y;  // 7 > 4+3=7
	        System.out.println("-x"+x); // 8 > -x7
	        }
	    
	    MyConstructor (int i, int i2) {
	        this(3); // 2
	        
	        this.x-=4; // 8 > 7-4=3
	        System.out.println("-x"+x); // 9 > -x3
	    }
	    public static void main(String[] args) {
	    	MyConstructor mc1 = new MyConstructor (4,3); // 1
	    }
	    // Bir const calistigi zaman degisen deger ayni ile devam eder
	    // 7. adimda x=3 olarak degil 5.adimda degistigi icin 4 olarak kullanilir
	    // ikinci bir const olusturms olsaydik xi 3 olarak alarak baslayacaktik isleme
	}
	
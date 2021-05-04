package day36_inheritance;
//soru3
	class Okul { 
	    public void getDetails() { // const degil methoddur 
	        System.out.println("Derived class "); // 8 // 10
	    }   
	    }
	public class Test03 extends Okul {
	    public Test03() { // 3
	    				 // 4 default super()
	    				// 5 const olmadigi icin default cons calisir icinde birsey olmadigi icin console da bir sey yazdirmaz
	        System.out.println("Test class "); // 6
	        super.getDetails(); // 7 > super. > parent classdan variable veya method cagirir
	    }
	    
	    public static void main(String[] args) { //1
	       Test03 obj = new Test03(); // 2
	        obj.getDetails(); // 9 > test03 classda getDetails methodu var mi yok
	        				// parent class da var mi var > ordan cagirir ve calistirir
	    }
	}


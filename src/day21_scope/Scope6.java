package day21_scope;

public class Scope6 {
	public int num1;  //instance // access modifier public olunca her yerden ulasilabilir
	String name = "Ali"; //instance // access modifier yazilmadigi icin default access modifier gecerlidir
						// default access modifier sadece ayni package'dan ulasilabilir
	
	
	public static void main(String args){ 
	  add();
	 // product (5); >> static olmayan bir method static olan main method icerisinden cagirilamaz
	}
	
	
	public static void add(){
	// num1 ++; >> static olmayan(instance) num1, static bir method icinden obje olusturulmadan kullanilamaz 
	int num2 = 6;  //local variable
	char letter;  //local variable
	System.out.println("Do addition ");
	}
	
	
	public void product(int num3){
	name = "Veli";
	// num2++; >> num2 add method icinde olusturulmus local variable'dir
	System.out.println(num3 * num3);
	}
	}



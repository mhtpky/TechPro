package day23_statickeyword;

public class Static2 {

	static int count = 0; // variable static oldugu icin hem static hem static olmayan methodlar dogrudan kullanabilir
						// instance variable olsa idi sadece static olmayanlar kullanabilirdi. 
						// staticlerde kullanabilmek icin object olusturmak gerekirdi
	
	public void increment() { //static olmayan method>> main method'dan cagiramayiz obje olmadan
		count++;  // static variable old icin object olmadan cagirabildik
	}
	
	public static void main(String[] args) {
		
		Static2 obj1 = new Static2();
		
		Static2 obj2 = new Static2();
		
		obj1.increment();
		
		obj2.increment();
		
		System.out.println("Obj1 count is = "+ obj1.count);
		System.out.println("Obj2 count is = "+ obj2.count);
		
	}

}

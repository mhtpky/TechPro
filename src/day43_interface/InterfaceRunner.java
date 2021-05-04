package day43_interface;

public class InterfaceRunner implements Interface02{

	public static void main(String[] args) {
		
		// static olarak tanimlamis bir variable veya method 
		// baska class'dan classIsmi.methodIsmi seklinde cagirilabilir

		Interface02.deneme2();
		
		
		// Default keyword'u ile olusurturdugumuz method ise 
		// object uzerinden cagirilabilir
		
		InterfaceRunner obj1 = new InterfaceRunner();
		obj1.deneme();
		
		
	}

}

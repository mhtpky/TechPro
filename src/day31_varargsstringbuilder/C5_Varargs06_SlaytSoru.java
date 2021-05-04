package day31_varargsstringbuilder;

public class C5_Varargs06_SlaytSoru {
	
	public static void main(String[] args) {
		new C5_Varargs06_SlaytSoru().Go(1, "Hello");
		new C5_Varargs06_SlaytSoru().Go(2, "Hello", "Hi");
	}

	public void Go(int x, String... y) {
		System.out.print(y[y.length - x] + " ");
		
		
		 
	}

}

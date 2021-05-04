package day31_varargsstringbuilder;

public class C5_Varargs05_SlaytSoru {
	public static void main(String[] args) {
        // Asagidaki Varargs methodlarýndan Hangileri Çalýþýr.
    
        // A, B, E, G Çalýþýr.
        // C, D, F Çalýþmaz.
    
    }
    
    public void moreA(int... nums) {                    // A Çalýþýr
    }
    
    public void moreB(String values, int... nums) {     // B Çalýþýr
    }
    /*
    public void moreC(int... nums, String values) {     // C Çalýþmaz (The variable argument type int of the method moreC must be the last parameter)
    }
    
    public void moreD(String... values, int... nums) {  // D Çalýþmaz (The variable argument type String of the method moreD must be the last parameter)
    }
    */
    public void moreE(String[] values, int... nums) {   // E Çalýþýr
    }
    /*
    public void moreF(String... values, int[] nums) {   // F Çalýþmaz (The variable argument type String of the method moreF must be the last parameter)
    }
    */
    public void moreG(String[] values, int[] nums) {    // G Çalýþýr
    }
}
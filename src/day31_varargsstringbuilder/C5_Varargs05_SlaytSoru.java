package day31_varargsstringbuilder;

public class C5_Varargs05_SlaytSoru {
	public static void main(String[] args) {
        // Asagidaki Varargs methodlar�ndan Hangileri �al���r.
    
        // A, B, E, G �al���r.
        // C, D, F �al��maz.
    
    }
    
    public void moreA(int... nums) {                    // A �al���r
    }
    
    public void moreB(String values, int... nums) {     // B �al���r
    }
    /*
    public void moreC(int... nums, String values) {     // C �al��maz (The variable argument type int of the method moreC must be the last parameter)
    }
    
    public void moreD(String... values, int... nums) {  // D �al��maz (The variable argument type String of the method moreD must be the last parameter)
    }
    */
    public void moreE(String[] values, int... nums) {   // E �al���r
    }
    /*
    public void moreF(String... values, int[] nums) {   // F �al��maz (The variable argument type String of the method moreF must be the last parameter)
    }
    */
    public void moreG(String[] values, int[] nums) {    // G �al���r
    }
}
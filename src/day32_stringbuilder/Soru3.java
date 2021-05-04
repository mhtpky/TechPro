package day32_stringbuilder;

public class Soru3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Soru3
        String numbers = "012345678";
        System.out.println(numbers.substring(1,3));         // 12
        System.out.println(numbers.substring(7,7));         // null
        System.out.println(numbers.substring(7));           // 78
	}

}

package day40_exceptions;

public class Soru03 {

	public static void main(String[] args) { // 1

		System.out.print(exceptions()); // 2
	}

	@SuppressWarnings({ "finally", "null" })
	public static String exceptions() { // 3
		String result = ""; // 4
		String v = null; // 5
		try {
			try {
				result = result + "a"; // 6
				v.length(); // 7 >>NullPointerException > burdan sonra try calismaz
				result = result + "b";
			} catch (NullPointerException e) { // 8
				result = result + "c"; // 9 > ac
			} finally {
				result = result + "d"; // 10 acd
				throw new Exception(); // 11 > Exception firlat
			}
		} catch (Exception e) { // 12 > exception firlattigi icin bu blok calisti
			result = result + "e"; // 13 > acde
		}
		return result; // result'a döndür
	}
}

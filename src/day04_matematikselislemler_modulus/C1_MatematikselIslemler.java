package day04_matematikselislemler_modulus;

public class C1_MatematikselIslemler {

	public static void main(String[] args) {

		int num1= 38 / 2 * (4 + 3) * 2;//19*7*2=266
		System.out.println(num1);
		
		int num2= 8 + 2 * (14 - 6 / 2) - 12; //8+2*11-12= 8+22-12= 18
		System.out.println(num2);
		
		int num3=10;
		
		double num4 = num1 * num2 / num3; //266 *18 / 10 = 478.8
		// sonuc 478.8 olmasina ragmen islem yapilan sayilar int oldugu icin Java sonucu int olarak hesaplar
		// sonra bu sonucu num4 e assign eder(atar) 
		System.out.println(num4);
		
		double num5=24.56;
		double num6=14.2;
		double num7=num5/num6;
		
		System.out.println(num7); //1.7295774647887323
		
		System.out.println(num5 / num3); // 24.56/10 =2.456
		
		double num8 = (double) num1 * num2 / num3; 
		System.out.println(num8);

	}

}

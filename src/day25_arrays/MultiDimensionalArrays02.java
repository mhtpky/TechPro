package day25_arrays;

public class MultiDimensionalArrays02 {

	public static void main(String[] args) {
		// Verilen 2 katli bir array'in tum elemanlarinin toplamini bulalim

		int arr[][] = { { 1, 2, 3 }, { 5, 8 }, { 9, 6, 5, 1 } };
		/*
		 * arr[0][0] = 1 // i = 0 olunca burasi 
		 * arr[0][1] = 2 
		 * arr[0][2] = 3
		 * 
		 * arr[1][0] = 5 // i = 1 olunca burasi 
		 * arr[1][1] = 8
		 * 
		 * arr[2][0] = 9 // i = 2 olunca burasi 
		 * arr[2][1] = 6 
		 * arr[2][2] = 5 
		 * arr[2][3] = 1
		 */
		
		int toplam = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				toplam+=arr[i][j];
			}
		}
		System.out.println(toplam);

		/*
		 * String s="Hello";
		 * 
		 * String t= new String(s);
		 * 
		 * if ("Hello".equals(s)) System.out.println("one");
		 * 
		 * if(t==s)System.out.println("two");
		 * 
		 * if(t.equals(s)) System.out.println("three");
		 * 
		 * if("Hello"==s)System.out.println("four");
		 * 
		 * if("Hello"==t)System.out.println("four");
		 */

	}

}
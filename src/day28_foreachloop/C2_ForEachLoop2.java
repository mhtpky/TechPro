package day28_foreachloop;

public class C2_ForEachLoop2 {

	public static void main(String[] args) {
		// Bir integer Array olusturunuz ve bu array'de ki 
		// tum sayilarin carpimini for each loop kullanarak bulunuz
		
		int arr[]= {1,2,1,2,4,3,1,2};
		int carpim=1;
		
		for (int each : arr) {
				carpim*=each;	
		}
		System.out.println("array'in tum elemanlarinin carpimi :" + carpim );

	}

}

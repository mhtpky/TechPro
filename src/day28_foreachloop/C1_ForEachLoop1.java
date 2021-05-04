package day28_foreachloop;

public class C1_ForEachLoop1 {

	public static void main(String[] args) {
		// Bir array'in tum elemanlarini for loop ile yazdiralim
		// Tum elemanlar deyince for each aklimiza gelmelidir
		
		
		int arr[] = {2,4,6,8,10,12};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
			System.out.println();
			
			// for loop yazmamizin amaci Array'in TUM ELEMANLARI uzerinden islem yapmak ise 
			// for each loop daha kolay for yazmamizi saglar
			
			// each ==> her bir demektir.  
			// for each loop ==> Array'e git istedigim bir toplulukta ki her bir elemani teker teker bana getirir.
			// for each loop'da baslangic degeri YOKTUR. Bitis degeri YOKTUR.. Index YOKTUR
			
			for (int each : arr) { //Sinifa git(arr) her bir ogrenciyi(int) al gel diyoruz
				System.out.print(each + " ");
			}

	}

}

package day23_statickeyword;

public class Static3 {

	int x;
	static int y;
	
	Static3(int i) {
		x+=i; // 2.SATIR >> x=0+2=2 // 5.SATIR >> X=0+3=3
		y+=i; // 3.SATIR >> y=0+2=2 // 6.SATIR >> Y=2+3=5
	}
	
	
	public static void main(String[] args) {
	
		new Static3 (2); //1.SATIR
		
		Static3 dnm = new Static3(3); //4.SATIR
		
		System.out.println(dnm.x + "," + dnm.y); // 3 , 5 

	}

}

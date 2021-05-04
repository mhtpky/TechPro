package day36_inheritance;

public class Okull {
	
	protected int num1=10;
	public String name = "Ali";
	private int num2=11;
	
	public Okull () {
		
		System.out.println("Parent class cons");
	}
	
	public int getNum2() {
		return num2;
	}
	
	public void setNum2(int num2) {
		this.num2=num2;
	}
}



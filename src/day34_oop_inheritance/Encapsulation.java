package day34_oop_inheritance;

public class Encapsulation {

	// INTERVIEW SORULUR > getter setter yazinz	
	
	private String okulIsmi = "Yildiz Koleji";
	private int okulHesapNo = 12345;
	private boolean okulAcikMi = true;
	
	public String getOkulIsmi() {
		return okulIsmi;
	}
	
	public int getOkulHesapNo() {
		return okulHesapNo;
	}
	
	public boolean isOkulAcikMi () { // boolean olan variable’larin getter metod isimleri “ is ” ile
		return okulAcikMi;
	}
	
	public void setOkulIsmi(String okulIsmi) {
		this.okulIsmi=okulIsmi;
	}
	
	public void setOkulHesapNo(int okulHesapNo) {
		this.okulHesapNo=okulHesapNo;
	}
	
	public void setOkulAcikMi (boolean okulAcikMi) {
		this.okulAcikMi=okulAcikMi;
	}
	
}

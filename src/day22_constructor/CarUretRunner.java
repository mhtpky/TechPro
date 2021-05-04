package day22_constructor;

public class CarUretRunner { // Bu class CarUret class'indan OBJE URETIR. 
							 // Runner genel kullanilan bir isimdr

	public static void main(String[] args) {
		
		CarUret car1 = new CarUret(); //CarUret classindan car1 adinda bir obje olusturduk
		car1.marka = "Toyota";
		car1.model = "Corolla";
		car1.yil = 2010;
		car1.kazasiVarMi = true;
		
		System.out.println(car1.marka + " "+ car1.model+ " "+car1.yil + " " + car1.kazasiVarMi);
		car1.yakit("Benzin");
		car1.vites("duz");
	}

}

package day43_interface;

public interface Interface01 {

	public void motor(); // Interface icinde abstract method'lar ve 
						 // OZEL concrete method'lar olabilir
	// Bu method bize sunu anlatir
	// Beni inherit eden her concrete classin dinamik motor ozelligi olmalidir
	
	void vites(); // Beni inherit eden her concrete classin dinamik vites ozelligi olmalidir
	
	abstract void kasa(); // Beni inherit eden her concrete classin dinamik kasa ozelligi olmalidir
	
	String ISIM = "Mustafa"; // Java isim kelimesini italik ve bold yapti
							 // Demek ki tum variable'lar final ve statik'tir

	
	}

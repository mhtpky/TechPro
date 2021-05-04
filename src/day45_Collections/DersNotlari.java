package day45_Collections;

public class DersNotlari {
	/*
	 * COLLESTIONS'da 3 Temel yapimiz vardir. 
	 * 1) LIST
	 * 
	 * 2) QUEUE : Elemanlari siraya sokar. Siz Queue'ya bir eleman eklediniz diyelim
	 * ikinci eleman koymak isterseniz onu 1'in arkasina koyar, hepsini bir siraya
	 * sokar (Yemekhane sirasi gibi/Eczane gibi) . 
	 * Bir elemani cikarmak isterseniz ortada ki elemanlari cikaramazsiniz sadece 
	 * ilk elemani cikarabilirsiniz. Buna FIFO denir yani First In First Out .
	 * 
	 * 3) SET : Matematikdeki kume gibidir. Var olmayan elemana eklersiniz fakat
	 * olan eleman yine ekleyemezsiniz (Tekrarli elemanlar) Yani set dendigi zaman
	 * tekrarli eleman olmayacak. Set'te index yapisi ve siralama yoktur.
	 * 
	 * - Her bir temel yapi bazi ozellikleri alabilir.
	 * 
	 * Bunlar disinda da onemli ozellikleri vardir :
	 * 
	 * 1) Linked : Birbirine bagli demektir. Bir tane elemanimiz olsun, ikinci bir
	 * eleman ekledigimizde onu 1.elemana baglar, ucuncu bir eleman eklemek istersek
	 * onu 2'e bagliyor. Araya elemanlar ekleyebiliriz sagindaki ve solundaki
	 * elemana baglanir. Siralama her an degisebilir. Yeni elemani sona ekler.
	 * Herhangi bir elemani silebiliriz.
	 * 
	 * 2) Hash : Her eleman olmasi gereken yerdedir. (Kitaplik gibi dusunulebilir)
	 * Biraz farkli bir yapidadir,
	 * Tarih kitabi tarih bolumunde, Edebiyat kitabi kendi bolumunde
	 * HashSet /  HashMap
	 * 
	 * 3) Tree : Dogal sirali demektir. {3, 6} diye kumem olsun . Bu kumeye 7'yi
	 * eklemek istersem java onu siralamaya gore koyar. {3,6,7} yapar . 5 eklemek
	 * istedigim zaman {3,5,6,7} . Negatif tarafi yavastir cunku her elemani kontrol
	 * eder ve ona gore sayiyi koyar, burda yorar.
	 * 
	 * 4) Queue (ozellik olarak da soyleyebilirim)
	 */
}

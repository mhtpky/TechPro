package day44_Iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator02 {

	// ListIterator Iterator'den daha fazla methoda sahiptir
	// Iterator'den en buyuk farki onun aksine 
	// listenin sonundan basina dogru hareket edebiliyor olmasidir
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		System.out.println(list); // [A, B, C, D]
		
		
		// Her elemana B harfini ekleyelim
		
		
		ListIterator li1 = list.listIterator();
		
		while(li1.hasNext()) {
			
			String temp = (String) li1.next();
			li1.set(temp+"B");
		}
		System.out.println(list);
	}

}

package day47_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C2_Deque {

	public static void main(String[] args) {
		// De >> Double Ended (Cift tarafli-iki sonlu demektir)
		// Deque bir interfacedir

		Deque<String> dk1 = new LinkedList<>();
		dk1.addFirst("C");
		dk1.add("M");
		dk1.add("A");
		dk1.addLast("L");
		System.out.println(dk1); // [C, M, A, L]

		System.out.println(dk1.getFirst()); // C silme yapmadan ilk elemani getirir
		System.out.println(dk1.getLast()); // L silme yapmadan son elemani getirir

		System.out.println(dk1.pop()); // C ilk elemani siler ve bize dondurur
		System.out.println(dk1);

		dk1.push("Y"); // En basa ekle
		System.out.println(dk1); // [Y, M, A, L] > 
	}

}

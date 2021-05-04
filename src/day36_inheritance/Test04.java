package day36_inheritance;

// 4.soru 
class Person {
	public Person() { // 5
		System.out.println("Person Constructor"); // 6
	}

	public void talk() {
		System.out.println("First Program");
	}
}

class Student extends Person {
	public void talk() { // 8
		System.out.println("Second Program"); // 9
	}
}

public class Test04 {
	public static void main(String[] args) { // 1
		Student p = new Student(); // 2 > student const gorunmuyor yani
									// 3 > default olarak vardir
									// 4 > default student cons un
		p.talk(); // 7 >classimda talk methodu var mi var
					// olmasaydi Parent classa(Person) gidecekti
	}
}

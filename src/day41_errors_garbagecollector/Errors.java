package day41_errors_garbagecollector;

public class Errors {

	public static void main(String[] args) {

		// System.out.println(20 / 0); // RTE degil RunTimeException

		// String str = "asd; // CTE'dir. Cunku cift tirnagi tamamlamadikca kod calismaz
		// Bu tur yazimdan kaynaklanan hatalar kolayca duzeltilebilir

		// Java'da Error dendiginde onune gecılemeyen kod ile çözülemeyen
		// sistemden kaynakli buyuk hatalar kastedilir

		// Error'ler unchecked'dir ve Java bunlari ongoremez
		// Ancak gerceklestiginde kodun calismasi durdurulur

		
		// CALISTIRMAA \\
		String str = "";
		for (int i = 0; i < 10000000; i++) {
			str += i;

		}
	}
}

package day40_exceptions;

		// Kendimiz exception olusturalim // 

public class InvalidEmailIdCheckedException extends Exception{

	private static final long serialVersionUID = 1L; 
	// Java exception';arin tekrarsiz olmasini saglmak icin her exception'a unique bir kod verir.

	InvalidEmailIdCheckedException(String message) {
		super(message);
	}
}

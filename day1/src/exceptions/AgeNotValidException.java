package exceptions;

public class AgeNotValidException extends RuntimeException {

	public AgeNotValidException() {

	}

	public AgeNotValidException(String message) {
		super(message);
	}

}

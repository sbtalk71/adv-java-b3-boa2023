package exceptions;

public class AgeValidator {

	public String validateAge(int age) {
		try {
			if (age >= 18 && age < 60) {
				return "Valid age";
			} else {
				throw new AgeNotValidException("Invalid age. Not Allowed");
			}
		} catch (AgeNotValidException e) {
			
			throw new RuntimeException(e.getMessage());
		}

	}
}

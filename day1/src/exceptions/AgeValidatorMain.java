package exceptions;

public class AgeValidatorMain {

	public static void main(String[] args) {

		AgeValidator va = new AgeValidator();

		try {
			System.out.println(va.validateAge(16));
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		System.out.println("See You next time...");

	}

}

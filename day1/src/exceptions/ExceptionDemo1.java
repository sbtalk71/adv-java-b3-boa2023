package exceptions;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 10;
			double result = a / b;

			String[] names = new String[5];

			System.out.println(names[0].length());

			System.out.println("No Exceptions...");
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (NullPointerException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Finally executes..");
		}

		System.out.println("Normal execution flow resumed...");

	}

}

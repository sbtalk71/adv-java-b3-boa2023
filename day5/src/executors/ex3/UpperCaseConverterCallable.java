package executors.ex3;

import java.util.concurrent.Callable;

public class UpperCaseConverterCallable implements Callable<String> {

	private String item;

	public UpperCaseConverterCallable(String item) {
		this.item = item;
	}

	@Override
	public String call() throws Exception {
		String message = "";
		try {
			message = item.toUpperCase();
			Thread.sleep(10000);
			System.out.println(Thread.currentThread().getName()+"produced : "+message);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return message;
	}

}

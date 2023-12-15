package executors.ex3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class UpperCaseExecutorMain {

	public static void main(String[] args) throws Exception {

		ExecutorService es = Executors.newCachedThreadPool();

		Future<String> futureResult = es.submit(new UpperCaseConverterCallable("apple"));

		System.out.println("Call made");

		int count = 0;
		while (!futureResult.isDone()) {
			if (count == 3) {
				futureResult.cancel(true);
				System.out.println("Task cancelled..");
			}

			System.out.println("Waiting for result");
			Thread.sleep(2000);
			count++;
		}

		System.out.println(futureResult.get());

		es.shutdown();

	}

}

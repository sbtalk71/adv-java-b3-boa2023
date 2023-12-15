package executors.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

public class UpperCaseExecutorMain2 {

	public static void main(String[] args) throws Exception {

		ThreadPoolExecutor es = (ThreadPoolExecutor) Executors.newCachedThreadPool();

		List<UpperCaseConverterCallable> taskList = new ArrayList<UpperCaseConverterCallable>();

		String[] fruits = { "apple", "banana", "orange", "guava", "pear" };

		for (int i = 0; i < 5; i++) {
			taskList.add(new UpperCaseConverterCallable(fruits[i]));
		}

		//List<Future<String>> resultList = es.invokeAll(taskList);
		
		List<Future<String>> resultList = es.invokeAll(taskList);

//		do {
//			System.out.println("Processing..");
//			Thread.sleep(1000);
//		} while (es.getCompletedTaskCount() < resultList.size());

		
		for (Future<String> result : resultList) {
			System.out.println(result.get());
		}
		es.shutdown();

	}

}

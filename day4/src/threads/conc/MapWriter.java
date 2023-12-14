package threads.conc;

import java.util.Map;

public class MapWriter implements Runnable {

	private Map<String, String> dataMap;

	public MapWriter(Map<String, String> dataMap) {
		this.dataMap = dataMap;
	}

	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		try {

			for (int i = 0; i < 100; i++) {
				dataMap.put(threadName + i, threadName + i);
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}

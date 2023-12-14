package threads.pc;

public class SharedData {

	private int data = 0;

	private boolean valueSet = false;

	public synchronized void put(int data) {

		if (valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("put : " + data);
		this.data = data;
		valueSet = true;
		notifyAll();
	}

	public synchronized void get() {

		if (!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Got : " + this.data);
		this.valueSet = false;
		notifyAll();
	}
}

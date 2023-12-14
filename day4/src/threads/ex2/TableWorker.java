package threads.ex2;

public class TableWorker implements Runnable {

	private TableGenerator tableGenerator;
	private int num;

	public TableWorker(TableGenerator tableGenerator, int num) {
		this.tableGenerator = tableGenerator;
		this.num = num;
	}

	@Override
	public void run() {
		tableGenerator.printTable(num);

	}
}

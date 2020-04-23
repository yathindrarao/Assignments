package javaFirstEclipse;

public class MultiplicationTable {

	private int table;

	public MultiplicationTable(int table) {
		this.table = table;
	}

	void print() {
		for (int i = 1; i <= 10; i++)
			System.out.printf("%d * %d = %d", 5, i, 5 * i).println();

	}

	int print(int table) {
		for (int i = 1; i <= 10; i++)
			System.out.printf("%d * %d = %d", this.table, i, table * i).println();
		return 0;
	}

}

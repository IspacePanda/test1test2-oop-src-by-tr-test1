package by.epam.tr.test1;

public class Test1 {
	private int a;
	private int b;

	public void print() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

	public void changesInVariables(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int sum() {
		int sum = a + b;
		return sum;
	}

	public int large() {
		int max = Math.max(a, b);
		return max;
	}

}

package by.epam.tr.test1;

public class Main {
	public static void main(String[] args) {
		Test1 Test1 = new Test1();

		Test1.changesInVariables(14, 6);
		Test1.print();
		System.out.println("sum = " + Test1.sum());
		System.out.println("large = " + Test1.large());
	}

}
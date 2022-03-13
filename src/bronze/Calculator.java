package bronze;

public class Calculator {

	int beforeTaxex(int price) {
		return (int)(price* 1.08);
	}

	double beforeTaxex(int price, int i) {
		return (int)price* 1.08;
	}

	public static void main(String[] args) {
		int p = 40;
		Calculator calculator = new Calculator();
		System.out.println(calculator.beforeTaxex(p));
	}

}

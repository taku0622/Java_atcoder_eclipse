package bronze;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int n = ClassA.getNumber();
		System.out.println(n);
	}

}

class ClassA {
	private static int number = 0;

	public static int getNumber() {
		return number;
	}
}

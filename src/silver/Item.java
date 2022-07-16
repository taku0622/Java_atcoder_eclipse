package silver;

public class Item {
	public Item() {
		System.out.println("hello");
		this(0, 0);	// コンパイルエラーになる
	}
	public Item(int a, int b) {
		System.out.println(a + b);
	}
}

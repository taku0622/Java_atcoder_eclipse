package silver;

public abstract class AbstractSample {
	public void sample() {
		System.out.println("A");
		test();
		System.out.println("C");
	}
	protected void test() {
		System.out.println("A~");
	}
}

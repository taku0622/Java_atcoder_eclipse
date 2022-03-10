package bronze;

public class SubClass extends SuperClass {
	private int a;
	private int b;

	public SubClass(int a) {
		// super();
		this.a = a;
	}

	public SubClass(int a, int b) {
		this(a);
		this.b = b;
	}

	public static void main(String[] args) {
		SubClass subClass = new SubClass(2, 3);
		System.out.println(subClass.num + ":" + subClass.a + ":" + subClass.b);
	}

}
class SuperClass {
	protected int num;
//	public SuperClass() {
//		this.num = 1;
//	}
	public SuperClass(int num) {
		this.num = num;
	}
}

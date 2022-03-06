package bronze;

public class Sample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SubClass subClass = new SubClass();
		subClass.test();
	}

}

class SuperClass {
	public SuperClass(String val) {
		System.out.println(val);
	}
}

class SubClass extends SuperClass {
	public SubClass(String val) {
		super(val);
	}

	public void test() {
		System.out.println("test");
	}
}
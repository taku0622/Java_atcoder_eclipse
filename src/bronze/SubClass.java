package bronze;

public class SubClass extends SuperClass {
	public void print() {
		System.out.println("Sub");
	}
	public static void main(String[] args) {
		SuperClass superClass = new SuperClass();
		superClass.print();
//		SubClass subClass = (SubClass) superClass;
//		subClass.print();
	}

}
class SuperClass {
	int a = 1;
	double b = 2.0;
	int i = (int)b;
	public void print() {
		System.out.println("super");
		System.out.println(i);
	}
}

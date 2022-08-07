package silver;

public class Main{

	public static void main(String[] args) {
		AClass a = new AClass();
		AClass b = new BClass();
		System.out.println(a.val);
		System.out.println(b.val);
		a.print();
		b.print();
	}

}

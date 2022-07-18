package silver;

public class BClass extends AClass{
	void sample() {
		Number n = 1.0;
		double d = n; //コンパイルエラー　
		System.out.println("sample");
	}
}

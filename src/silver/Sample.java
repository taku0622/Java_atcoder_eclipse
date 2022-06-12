package silver;

public class Sample {

	public static void main(String[] args) {
//		int a = 267;
//
//		int b = 0413;
//
//		int c = 0x10B;
//
//		int d = 0b100001011;
//
////		int e = 0827;
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);

		String string = "abcde";
		System.out.println(string.indexOf('c'));	// 2
		System.out.println(string.indexOf("cd"));	// 2
		System.out.println(string.indexOf("cdf"));	// -1
	}

}

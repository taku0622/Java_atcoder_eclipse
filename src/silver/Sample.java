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

//		String string = "abcde";
//		System.out.println(string.indexOf('c'));	// 2
//		System.out.println(string.indexOf('f'));	// -1
//		System.out.println(string.indexOf("cd"));	// 2
//		System.out.println(string.indexOf("cdf"));	// -1

//		String string = "aaaa";
//		System.out.println(string.replace("aa", "b"));;

//		String string = "hello, ".concat("Java!");
//		System.out.println(string);
//		String string = null;
//		string += "null";
//		System.out.println(string);
//		int a = 10;
//		int b = a++ + a + a-- - a-- + ++a; 	// b = 10 + 11 + 11 - 11 + 11
//		System.out.println(b);				// 32
//
//		for (int i = 0; i < 3; i++, period()) {
//			System.out.print(i);
//		}
//		String[][] array = {{"A","B","C"}};
//		for(Object object : array) {
//			System.out.println(object);
//		}
//		int num = 10;
//		do {
//			num++;
//		} while (++num < 10);
//		System.out.println(num);

		int total = 0;
		a: for (int i = 0; i < 5; i++) {
			b: for (int j = 0; j < 5; j++) {
				if (i % 2 == 0) continue a;
				if (3 < j) break b;
				total += j;
				}
			}
		System.out.println(total);
	}
	private static void period() {
		System.out.print(",");
	}
}

package silver;

public class Sample implements Interface {

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

//		int total = 0;
//		a: for (int i = 0; i < 5; i++) {
//			b: for (int j = 0; j < 5; j++) {
//				if (i % 2 == 0) continue a;
//				if (3 < j) break b;
//				total += j;
//				}
//			}
//		System.out.println(total);
//
//		int[] a;		// 1次元配列
//		int b[];		// 1次元配列
//		int[][] c;		// 3次元配列
//		int d[][];		// 2次元配列
//		int[] e[];		// 2次元配列
//		int[][] f[];	// 3次元配列
//		String st = null;
//		String[] array = {null,"B","C","D"};
//		for(String string : array) {
//			System.out.println(string);
//		}
//		System.out.println(st);
//		int[] arrayA = {1,2,3};
//		int[] arrayB = arrayA.clone();
//		System.out.println(arrayA == arrayB);
//		System.out.println(arrayA.equals(arrayB));
//		System.out.println("arrayA= {" + arrayA[0] +","+ arrayA[1] +","+ arrayA[2] +"}");
//		System.out.println("arrayB= {" + arrayB[0] +","+ arrayB[1] +","+ arrayB[2] +"}");
//		Item aItem = new Item();
//		Item bItem = new Item();
//		aItem.name = "apple";
//		aItem.price = 200;
//		bItem.name = "banana";
//		bItem.price = 100;
//		aItem = bItem;
//		System.out.println(aItem.toString());
//		System.out.println(bItem.toString());
//		Object aObject = new Object();
//		Object bObject = new Object();
//		Object cObject = aObject;
//		aObject = null;
//		bObject = null;
//		// more code この時点でbObjectがガベージコレクションの対象になる。
//		String aString = new String("aaa");
//		String bString = new String("bbb");
//		String cString = aString;
//		aString = null;
//		bString = null;
//		System.out.println(aString);
//		System.out.println(bString);
//		System.out.println(cString);
//		period(9,3,4,5,6,7);
//		System.out.println(-1);
//		Sample s = new Sample();
//		System.out.println(s.calc(0, 0));
//		Item item = new Item();
//		Item item = new Item(10);
//		modify(item.num);
//		modify(item);
//		System.out.println(item.num);
//		Sample sample = new Sample();
//		sample.hello();
//		AClass a = new AClass();
//		AClass b = new BClass();
//		System.out.println(a.val);
//		System.out.println(b.val);
//		a.print();
//		b.print();
//		AClass b = new BClass();
//		b.sample();  // コンパイルエラー　Aクラスには存在しないメソッド
//		BClass b = new BClass();
//		b.name = "b";
//		System.out.println(b.getName());
//		AClass b = new BClass();
//		AbstractSample s = new ConcreteSample();
//		s.sample();
//		int result = sample();
//		System.out.println(result);
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("A");
//		list.add("B");
//		list.add("C");
//		list.add("D");
//		list.add("E");
//		for(String string : list) {
//			if("C".equals(string)) {
//				list.remove(string);
//			}
//		}
//		list.remove("A");
//		System.out.println(list);
//		SubSample subSample = new SubSample();
//		SampleS sampleS = new SampleS();
//		subSample = (SubSample)sampleS;
//		subSample.test();
//		sampleS.test();
//		String string = "abcd ef gh";
//		String string2 = string.substring(8);
//		System.out.println(string2);
		String array[][] = new String[2][2];
		array[0][0] = "a";
		array[0][1] = "b";
		array[1][0] = "c";
		array[1][1] = "d";
		for(int i=0;i<2;i++) {
			for(int j=0;j<i;j++) {
				System.out.println(array[i][j]);
			}
		}
	}
	private static void modify(int num) {
		num*=2;
	}

	private static void period(int... num) {
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i] + ",");
		}
	}
	private static void method(int num) {
		if(num < 0) return;
		System.out.println("A");
	}
	private double calc(int a,double b) {
		return a + b;
	}
	private double calc(double a,int b) {
		return a + b;
	}
	private static int sample() {
		int val = 0;
		try {
			String[] array = {"A","B","C"};
			System.out.println(array[3]);
		} catch (RuntimeException e) {
			val = 20;
			return val;
		} finally {
			val += 10;
		}
		return val;
	}
}

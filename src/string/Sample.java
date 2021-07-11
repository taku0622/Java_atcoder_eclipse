package string;

public class Sample {

	public static void main(String[] args) {
		// 文字列の長さ
		String str1 = "こんにちは";
		System.out.println(str1.length());	// 5

		// 文字列切り取り
		String str2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(str2.substring(3,8));	// DEFGH
		System.out.println(str2.substring(5));	// FGHIJKLMNOPQRSTUVWXYZ

		// 辞書順
		String str3A = "apple";
		String str3B = "orange";
		System.out.println(str3A.compareTo(str3B));	// -14(負の値を返す)
		System.out.println(str3A.compareTo(str3A));	// 0(同等)
		System.out.println(str3B.compareTo(str3A));	// 14(正の値を返す)

		// 文字サイズ
		String str4 = "Apple";
		System.out.println(str4.toUpperCase());	// APPLE
		System.out.println(str4.toLowerCase());	// apple

		// 無駄なスペースを削除
		String str5 = "     Hello, World!               ";
		System.out.println(str5.trim());
		// (Hello, World!)スペースが消えている

		// 文字列→配列
		String str6 = "one, two, three";
		String[] arr1 = str6.split(", ");
		for(String s:arr1) {
			System.out.println(s);
		}
	}

}

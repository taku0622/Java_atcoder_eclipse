package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ABC234_A {

	public static void main(String[] args) {
		String str1;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		int a = Integer.parseInt(str1);
		weirdFunction(a);
	}
	private static void weirdFunction(int a) {
		int ans = f(f(f(a)+a)+f(f(a)));
		System.out.println(ans);
	}
	private static int f(int a) {
		return a * a + 2 * a + 3;
	}
}

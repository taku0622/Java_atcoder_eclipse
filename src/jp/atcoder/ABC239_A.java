package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ABC239_A {

	public static void main(String[] args) {
		String str1;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		double a = Double.parseDouble(str1);
		horizon(a);

	}
	private static void horizon(double a) {
		double ans = Math.sqrt(a*(12800000+a));
 		System.out.println(ans);
	}
}

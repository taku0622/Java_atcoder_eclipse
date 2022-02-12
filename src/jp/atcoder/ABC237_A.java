package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ABC237_A {

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
		notOverflow(a);

	}
	private static void notOverflow(double a) {
		double border = Math.pow(2,31);
		String ans = (Math.abs(a) < border) || (-border == a) ? "Yes" : "No";
 		System.out.println(ans);
	}
}

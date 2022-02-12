package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ABC238_A {

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
		exponentialOrQuadratic(a);

	}
	private static void exponentialOrQuadratic(double a) {
		double e = Math.pow(2,a);
		double b = Math.pow(a,2);
		String ans = e > b ? "Yes" : "No";
 		System.out.println(ans);
	}
}

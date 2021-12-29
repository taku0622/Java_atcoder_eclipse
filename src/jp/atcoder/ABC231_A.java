package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ABC231_A {

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
		aWaterPressure(a);
	}
	private static void aWaterPressure(int a) {
		double ans = a / 100.0;
		System.out.println(ans);
	}
}

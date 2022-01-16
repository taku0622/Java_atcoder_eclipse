package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ABC235_A {

	public static void main(String[] args) {
		String str1;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		rotate(str1);
	}
	private static void rotate(String abc) {
		String[] arr = abc.split("");
		String a = arr[0];
		String b = arr[1];
		String c = arr[2];
		int ans = Integer.parseInt(a+b+c) +
				Integer.parseInt(b+c+a) +
				Integer.parseInt(c+a+b);
		System.out.println(ans);
	}
}

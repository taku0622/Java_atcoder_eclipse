package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ABC232_A {

	public static void main(String[] args) {
		String str1;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		qQsolver(str1);
	}
	private static void qQsolver(String str1) {
		String[] arr = str1.split("");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[2]);
		System.out.println(a * b);
	}
}

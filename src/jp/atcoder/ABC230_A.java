package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ABC230_A {

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
		atCoderQuiz3(a);
	}
	private static void atCoderQuiz3(int a) {
		if(a > 41) { a++; }
		System.out.println("AGC" + String.format("%03d", a));
	}
}

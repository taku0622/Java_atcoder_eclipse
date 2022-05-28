package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ABC252_A {

	public static void main(String[] args) {
		String str1;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		int i = Integer.parseInt(str1);
		ASCIIcode(i);
	}
	private static void ASCIIcode(int i) {
		char c = (char)i;
		System.out.println(c);
	}
}

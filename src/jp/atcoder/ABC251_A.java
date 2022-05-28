package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ABC251_A {

	public static void main(String[] args) {
		String str1;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		char[] ca = str1.toCharArray();
		sixCharacters(ca);
	}
	private static void sixCharacters(char[] ca) {
		String ans = "";
		int length = 6;
		int count = 0;
		for(int i=0;i<length;i++) {
			if (count == ca.length) count=0;
			ans += ca[count];
			count++;
		}
		System.out.println(ans);
	}
}

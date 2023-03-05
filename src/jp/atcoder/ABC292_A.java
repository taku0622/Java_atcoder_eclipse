package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC292_A {

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
		ArrayList<Character> cl = new ArrayList<Character>();
		for(char c:ca) {
			cl.add(c);
		}
		aCamelCase(cl);
	}
	private static void aCamelCase(ArrayList<Character> cl) {
		String ans = "";
		for(char c:cl) ans += Character.toUpperCase(c);
		System.out.println(ans);
	}
}

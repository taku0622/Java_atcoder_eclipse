package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ABC240_A {

	public static void main(String[] args) {
		String str1;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		String[] sa = str1.split(" ");
		int a = Integer.parseInt(sa[0]);
		int b = Integer.parseInt(sa[1]);
		edgeChecker(a,b);

	}
	private static void edgeChecker(int a, int b) {
		int abs = Math.abs(a - b);
		String ans = (abs == 1 || abs == 9) ? "Yes" : "No";
 		System.out.println(ans);
	}
}

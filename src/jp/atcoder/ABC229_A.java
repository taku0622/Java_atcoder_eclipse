package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ABC229_A {

	public static void main(String[] args) {
		String str1;
		String str2;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
			str2 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		String[] sa1 = str1.split("");
		String[] sa2 = str2.split("");
		firstGrid(sa1,sa2);
	}
	private static void firstGrid(String[] a, String[] b) {
		String ans = ((!a[0].equals(a[1]) && !b[0].equals(b[1])) && (!a[0].equals(b[0]) && !a[1].equals(b[1]))) ? "No" : "Yes";
		System.out.println(ans);
	}

}

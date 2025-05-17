package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC402_A {

	public static void main(String[] args) {
		String str1;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			str1 = br.readLine();
		}catch (Exception e) {
			System.out.println("Input Error!!");
			return;
		}
		String[] sa = str1.split("");
		ArrayList<String> sl = new ArrayList<String>();
		for(String s:sa) {
			sl.add(s);
		}
		aCBC(sl);
	}
	private static void aCBC(ArrayList<String> sl) {
		String ans = "";
		for(int i = 0; i < sl.size(); i++) {
			char[] c = sl.get(i).toCharArray();
			if(c[0] >= 'A' && c[0] <= 'Z') {
				ans += c[0];
			}
		}
		System.out.println(ans);
	}
}

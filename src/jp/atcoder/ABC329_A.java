package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC329_A {

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
		aSpread(sl);
	}
	private static void  aSpread(ArrayList<String> sl) {
		String ans = "";
		for(String s:sl) {
			ans += s + " ";
		}
		System.out.println(ans);
	}
}
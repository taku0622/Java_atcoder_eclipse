package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC315_A {

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
		aTcdr(sl);
	}
	private static void  aTcdr(ArrayList<String> sl) {
		String ans = "";
		for(String s:sl) {
			switch (s) {
			case "a":
			case "i":
			case "u":
			case "e":
			case "o":
				break;
			default:
				ans += s;
				break;
			}
		}
		System.out.println(ans);
	}
}
package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC394_A {

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
		ArrayList<String> sl = new ArrayList<String>();
		for(String s:sa) {
			sl.add(s);
		}
		a22222(sl);
	}
	private static void a22222(ArrayList<String> sl) {
		String v = sl.get(0);
		String[] va = v.split("");
		String ans = "";
		for(int i = 0; i < v.length(); i++) {
			if(va[i].equals("2")) {
				ans += "2";
			}
		}
		System.out.println(ans);
	}
}

package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC374_A {

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
		aTakahashisan2(sl);
	}
	private static void aTakahashisan2(ArrayList<String> sl) {
//		System.out.println(sl);
		int size = sl.size();
		String ans = sl.get(size-1).equals("n") &&
				sl.get(size-2).equals("a") &&
				sl.get(size-3).equals("s") ? "Yes" : "No";
		System.out.println(ans);
	}
}

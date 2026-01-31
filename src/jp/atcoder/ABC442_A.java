package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC442_A {

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
		aCount(sl);
	}
	private static void aCount(ArrayList<String> sl) {
		int ans = 0;
		for(int i = 0;i < sl.size();i++) {
			if(sl.get(i).equals("i") || sl.get(i).equals("j")) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}

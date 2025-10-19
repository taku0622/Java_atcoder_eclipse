package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC427_A {

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
		aABCtoAC(sl);
	}
	private static void aABCtoAC(ArrayList<String> sl) {
		int n = (sl.size() + 1) / 2;
		String ans = "";
		for(int i=0;i < sl.size(); i++) {
			if(i == n - 1) {
				continue;
			}else {
				ans += sl.get(i);
			}
		}
		System.out.println(ans);
	}
}

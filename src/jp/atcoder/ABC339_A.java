package jp.atcoder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ABC339_A {

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
		aTLD(sl);
	}
	private static void  aTLD(ArrayList<String> sl) {
		String ans = "";
		for(int i=sl.size()-1;i>-1;i--) {
			if(sl.get(i).equals(".")) break;
			ans += sl.get(i);
		}
		StringBuilder stringBuilder = new StringBuilder(ans);
		ans = stringBuilder.reverse().toString();
		System.out.println(ans);
	}
}